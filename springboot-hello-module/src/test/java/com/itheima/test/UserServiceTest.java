package com.itheima.test;

import com.itheima.springboot.SpringbootHelloModuleApplication;
import com.itheima.springboot.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * UserService测试类，此时测试类与启动类不在同一包下，需要指定启动类
 * @author 李尚兴
 * @version 1.0
 * @create 2021/7/8 21:16
 */
@SpringBootTest(classes = SpringbootHelloModuleApplication.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testAddUser() {
        this.userService.addUser();
    }
}
