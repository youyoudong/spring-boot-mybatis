package com.wangz.springBoot.controller;

import com.wangz.springBoot.bean.User;
import com.wangz.springBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户管理controller
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public Map<String, Object> login(@RequestBody Map<String, Object> params){
        Map<String, Object> resultMap = new HashMap<String, Object>();

        String name = params.get("name") != null ? (String) params.get("name") : "";
        String password = params.get("password") != null ? (String) params.get("password") : "";

        if(name != null && name != "" && password != null && password != ""){
            User user = null;
            user = this.userService.getUserByNameAndPwd(name, password);
            if (user != null){
                user.setPassword("");
                resultMap.put("flag", true);
                resultMap.put("loginUser", user);
            }else {
                resultMap.put("flag", false);
                resultMap.put("message", "no such user");
            }
        }else {
            resultMap.put("flag", false);
            resultMap.put("message", "params are null");
        }

        return resultMap;
    }
}
