package com.itheima.springboot;

import com.itheima.springboot.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 测试类如果与启动类是同一包下，则@SpringBootTest无需指定启动类
 */
@SpringBootTest
public class SpringbootHelloModuleApplicationTests {
    @Autowired
    private UserService userService;
//    @Autowired
//    private UserMapper userMapper;

    @Test
    public void testFindAllUser() {
//        List<User> allUser = this.userMapper.findAllUser();
//        System.out.println(allUser);
    }

    @Test
    void testAddUser() {
        this.userService.addUser();
    }

}
