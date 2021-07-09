package com.itheima.springboot;

import com.itheima.springboot.bean.User;
import com.itheima.springboot.mapper.UserDAOMapper;
import com.itheima.springboot.mapper.UserMapper;
import com.itheima.springboot.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * 测试类如果与启动类是同一包下，则@SpringBootTest无需指定启动类
 */
@SpringBootTest
public class SpringbootHelloModuleApplicationTests {
    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserDAOMapper userDAOMapper;

    @Test
    void testFindAll() {
        List<User> listUser = this.userDAOMapper.findAll();
        System.out.println(listUser);
    }

    @Test
    public void testFindAllUser() {
        List<User> allUser = this.userMapper.findAllUser();
        System.out.println(allUser);
    }

    @Test
    void testAddUser() {
        this.userService.addUser();
    }

}
