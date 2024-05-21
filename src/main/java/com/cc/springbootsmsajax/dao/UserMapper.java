package com.cc.springbootsmsajax.dao;

import com.cc.springbootsmsajax.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/12/5
 * Time: 17:48
 * Description:
 */
@Repository
public interface UserMapper {

    User queryCheck(User user);

    List<User> queryUsers(String name, Integer role);

    Integer delete(Integer id);

    Integer insert(User user);

    User queryById(Integer id);

    Integer update(User user);

}
