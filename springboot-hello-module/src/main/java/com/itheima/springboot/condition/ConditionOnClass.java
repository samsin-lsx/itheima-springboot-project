package com.itheima.springboot.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * 自定义注解扩展检测生成字节码文件
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(ClassCondition.class) // 满足匹配条件
public @interface ConditionOnClass {
    String[] value();
}
