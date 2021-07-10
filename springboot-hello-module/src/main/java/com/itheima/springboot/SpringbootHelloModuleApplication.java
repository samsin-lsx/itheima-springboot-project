package com.itheima.springboot;

import com.itheima.config.MyImportBeanDefinitionRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//知识1：@EnalbeXxx开头的注解使用
//@ComponentScan("com.itheima.config") //不推荐，太麻烦
//@Import(MemberConfig.class) //不推荐，不太方便使用
//@EnableMember // 推荐，最佳实践

//知识2：@Import四种导入
//@Import(Member.class) // （1）导入方式
//@Import(MemberConfig.class) // （2）导入配置类方式
//@Import(MyImportSelector.class) // （3）导入ImportSelector实现类
@Import(MyImportBeanDefinitionRegister.class) // （4）导入ImportBeanDefinitionRegistrar实现类
public class SpringbootHelloModuleApplication {

    public static void main(String[] args) {
        // 启动SpringBoot应用返回Spring的IOC容器对象
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootHelloModuleApplication.class, args);
        // 获取redisBean对象
        /*Object redisTemplate = context.getBean("redisTemplate");
        System.out.println(redisTemplate);*/

        // 需求：当导入Jedis坐标后，再创建User的Bean对象，如没导入则不创建。
        // 需求：同时导入两个坐标后，再创建Bean对象，缺少一个则不创建。
        /*Object user = context.getBean("user");
        System.out.println(user);*/

        /*Object member = context.getBean("member"); // 根据名称获取Bean
        System.out.println(member);*/
        /*Member member = context.getBean(Member.class); // 根据类型获取bean
        System.out.println(member);
        Customer customer = context.getBean(Customer.class);
        System.out.println(customer);*/
        Object member = context.getBean("member");
        System.out.println(member);
    }

}
