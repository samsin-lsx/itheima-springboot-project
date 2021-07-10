package com.itheima.springboot.config;

import com.itheima.springboot.bean.User;
import com.itheima.springboot.condition.ConditionOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 说明：用户配置类
 * @author：李尚兴
 * @date：2021-07-09 8:27
 * @version：1.0
 */
@Configuration
public class UserConfig {
    @Bean
    //@Conditional(ClassCondition.class) // 此注解返回true则创建，否则不创建
    @ConditionOnClass({"cn.hutool.core.map.MapUtil", "redis.clients.jedis.Jedis"})
    public User user() {
        return new User();
    }
}
