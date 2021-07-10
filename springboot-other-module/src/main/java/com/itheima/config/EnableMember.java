package com.itheima.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Auther: Administrator
 * @Date: 2021/7/11 00:07
 * @Version: 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MemberConfig.class)
public @interface EnableMember {
}
