package com.itheima.springboot.mapper;

import com.itheima.springboot.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 说明：用户数据层，通过xml方式实现
 * @author：李尚兴
 * @date：2021-07-09 7:52
 * @version：1.0
 */
@Repository
@Mapper
public interface UserDAOMapper {
    List<User> findAll();
}
