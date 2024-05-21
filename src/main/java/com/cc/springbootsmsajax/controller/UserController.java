package com.cc.springbootsmsajax.controller;

import com.cc.springbootsmsajax.pojo.User;
import com.cc.springbootsmsajax.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/12/5
 * Time: 17:45
 * Description:
 */
// 前后端分离
/*
前端使用Ajax请求(需要跨域：后台设置允许跨域)
前端工程：SpringBoot-sms-Ajax
 */
// 跨域：url格式：协议://子域名.主域名.com:端口/
//          如：https://www.baidu.com:port/
/*
1、跨域：当一个请求url的协议、域名/主机和端口三者中有任意一个与当前页面的url不同称为跨域
2、原因：出于浏览器的同源策略(一种约定，浏览器最核心的安全功能)，web是建立在同源策略基础上的
   同源：指同一个域：两个页面具有相同的协议(protocol)、域名/主机(host/ip)和端口(port)
 */
// 解决跨域问题

// 后台设置允许跨域

// 方式1：在每个方法中添加Header
//  方法参数：HttpServletResponse response
//  response.setHeader("Access-Control-Allow-Origin","*");
// 方式2：使用@CrossOrigin注解
@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // 登录
    @RequestMapping("/login.do")
    public Object login(User user){
        User checkedUser = userService.check(user);
        if (checkedUser != null){
            return checkedUser;
        }
        return "用户名或密码不正确!";
    }

    // 查询
    @RequestMapping("/getUsers.do")
    public Object getUsers(String name, Integer role){
        return userService.findUsers(name, role);
    }

    // 添加
    @RequestMapping("/add.do")
    public Object add(User user){
        System.out.println(user);
        return userService.addUser(user);
    }

}
