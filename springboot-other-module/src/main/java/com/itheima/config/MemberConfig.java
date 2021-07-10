package com.itheima.config;

import com.itheima.bean.Customer;
import com.itheima.bean.Member;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 * @Auther: Administrator
 * @Date: 2021/7/10 23:43
 * @Version: 1.0
 */
@Configuration
public class MemberConfig {
    @Bean
    public Member member() {
        return new Member();
    }

    @Bean
    public Customer customer() {
        return new Customer();
    }
}
