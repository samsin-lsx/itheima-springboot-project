package com.itheima.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootHelloModuleApplication {

    public static void main(String[] args) {
        // 启动SpringBoot应用返回Spring的IOC容器对象
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootHelloModuleApplication.class, args);
        // 获取redisBean对象
        /*Object redisTemplate = context.getBean("redisTemplate");
        System.out.println(redisTemplate);*/

        // 需求：当导入Jedis坐标后，再创建User的Bean对象，如没导入则不创建。
        Object user = context.getBean("user");
        System.out.println(user);
    }

}
