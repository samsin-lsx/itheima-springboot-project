package com.itheima.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 说明：helloworld程序控制器
 * @author：李尚兴
 * @date：2021-06-22 18:14
 * @version：1.0
 */
@RestController
public class HelloController {
    @Value("${name}")
    private String name;

    @Value("${person.name}")
    private String personName;

    @Value("${person.age}")
    private int age;

    @Value("${address[0]}") // 获取数组
    private String address1;

    @Value("${msg1}")
    private String msg1;

    @Value("${msg2}")
    private String msg2;

    @Autowired
    private Environment environment;

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("【使用@Value获取文件内容】------------------------------------------");
        System.out.println("name = " + this.name);
        System.out.println("person.name = " + this.personName);
        System.out.println("person.age = " + this.age);
        System.out.println("address1 = " + address1);
        System.out.println("msg1 = " + msg1);
        System.out.println("msg2 = " + msg2);
        System.out.println("【使用Environment获取文件内容】------------------------------------------");
        System.out.println(environment);
        System.out.println(environment.getProperty("name"));
        System.out.println(environment.getProperty("person.age"));
        System.out.println(environment.getProperty("address[0]"));
        return "【springboot】应用构建成功，开始玩转SpringBoot学习。";
    }
}
