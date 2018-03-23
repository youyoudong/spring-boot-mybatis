package com.wangz.springBoot.controller;

import com.wangz.springBoot.bean.OperateType;
import com.wangz.springBoot.service.OperateTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 操作日志Controller
 */
@RestController
@RequestMapping("/OperateType")
public class OperateTypeController {

    @Autowired
    private OperateTypeService otService;

    @RequestMapping("/findAllWithDelete")
    public List<OperateType> findAllWithDelete(){
        List<OperateType> otList = new ArrayList<OperateType>();
        otList = otService.findAllWithDelete();
        return otList;
    }

    @RequestMapping("/findAll")
    public List<OperateType> findAll(){
        List<OperateType> otList = new ArrayList<OperateType>();
        otList = otService.findAll();
        return otList;
    }
}
