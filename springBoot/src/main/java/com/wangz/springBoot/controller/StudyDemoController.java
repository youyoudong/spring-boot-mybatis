package com.wangz.springBoot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.wangz.springBoot.mode.StudyDemoResponseModel;

/**
 * Created by wangz on 2017/10/9.
 */

@RestController
@RequestMapping("/studyDemo")
public class StudyDemoController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    /*****************************
     * test study
     ******************************************/
    @RequestMapping("/test3")
    public ModelAndView test3() {
        ModelAndView vm = new ModelAndView();
        vm.setViewName("test3");
        vm.addObject("abc", "def");
        return vm;
    }

    /**
     * 浏览器访问 http://localhost:8080/studyDemo/test4
     * 结果：{"name":"hahaha","age":15,"source":{"yunwen":89,"shuxue":92,"like":"wan"}}
     * 
     * @param name
     * @return
     */
    @RequestMapping("/test4")
    public StudyDemoResponseModel test4(
            @RequestParam(name = "name", required = false, defaultValue = "hahaha") String name) {
        StudyDemoResponseModel vm = new StudyDemoResponseModel();
        vm.setName(name);
        vm.setAge(15);
        Map<String, Object> map = new HashMap<>();
        map.put("yunwen", 89);
        map.put("shuxue", 92);
        map.put("like", "wan");
        vm.setSource(map);
        return vm;
    }

    /*****************************
     * test study
     ******************************************/

}
