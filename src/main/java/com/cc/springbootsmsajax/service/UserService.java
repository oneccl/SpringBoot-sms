package com.cc.springbootsmsajax.service;

import com.cc.springbootsmsajax.dao.UserMapper;
import com.cc.springbootsmsajax.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/12/5
 * Time: 20:14
 * Description:
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User check(User user){
        return userMapper.queryCheck(user);
    }

    public List<User> findUsers(String name, Integer role){
        return userMapper.queryUsers(name,role);
    }

    public Boolean addUser(User user){
        return userMapper.insert(user) > 0;
    }

    public Boolean delUser(Integer id){
        return userMapper.delete(id) > 0;
    }

}
