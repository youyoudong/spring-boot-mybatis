package com.wangz.springBoot.controller;

import com.wangz.springBoot.bean.User;
import com.wangz.springBoot.dao.UserDao;
import com.wangz.springBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @RequestMapping("/insertUser")
    public Map<String, Object> insertUser(@RequestBody Map<String, Object> params){
        Map<String, Object> resultMap = new HashMap<String, Object>();
        String name = (String) params.get("name");
        User user = new User();
        user.setName(name);
        int result = userService.insert(user);
        if (result != 0){
            resultMap.put("flag", true);
        }else{
            resultMap.put("flag", false);
        }
        return resultMap;
    }

}
