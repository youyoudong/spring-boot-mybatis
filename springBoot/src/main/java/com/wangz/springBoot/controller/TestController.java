package com.wangz.springBoot.controller;

import com.wangz.springBoot.bean.User;
import com.wangz.springBoot.dao.UserDao;
import com.wangz.springBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wangz on 2017/10/9.
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }

    @RequestMapping("/getUser")
    public List<User> getAll(){
        return userService.getAll();
    }
}
