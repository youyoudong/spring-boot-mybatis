package com.wangz.springBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangz on 2017/10/9.
 */

@RestController
public class TestController {

    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }
}
