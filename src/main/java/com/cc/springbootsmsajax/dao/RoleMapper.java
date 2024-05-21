package com.cc.springbootsmsajax.dao;

import com.cc.springbootsmsajax.pojo.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/12/6
 * Time: 11:01
 * Description:
 */
@Repository
public interface RoleMapper {

    List<Role> queryAll();

}
