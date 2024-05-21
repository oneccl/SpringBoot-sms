package com.cc.springbootsmsajax;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cc.springbootsmsajax.dao")
public class SpringBootSmsAjaxApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSmsAjaxApplication.class, args);
    }

}
