package com.itheima.springboot.mapper;

import com.itheima.springboot.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户数据层
 * @author 李尚兴
 * @version 1.0
 * @create 2021/7/8 22:07
 */
@Repository
@Mapper
public interface UserMapper {
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAllUser();
}
