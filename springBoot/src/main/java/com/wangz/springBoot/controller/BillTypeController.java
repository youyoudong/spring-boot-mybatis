package com.wangz.springBoot.controller;

import com.wangz.springBoot.bean.BillType;
import com.wangz.springBoot.service.BillTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 账单分类Controller
 * Created by wangz on 2017/10/17.
 */
@RestController
@RequestMapping("/billType")
public class BillTypeController {

    @Autowired
    private BillTypeService billTypeService;

    /**
     * 插入单条记录
     * @param params
     * @return
     */
    @RequestMapping("/insert")
    public Map<String, Object> insertBillType(@RequestBody Map<String, Object> params){
        Map<String, Object> resultMap = new HashMap<String, Object>();
        String name = (String) params.get("name");
        String parentId = (String) params.get("parentId");
        BillType bt = new BillType();
        bt.setName(name);
        bt.setParentId(parentId);
        try {
            billTypeService.insertBillType(bt);
            resultMap.put("flag", true);
        }catch (RuntimeException e){
            resultMap.put("flag", false);
        }
        return resultMap;
    }
}
