package com.itheima.springboot.controller;

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
    @RequestMapping("/hello")
    public String hello() {
        return "【应用构建】世界，你好！这就是SpringBoot应用。";
    }
}