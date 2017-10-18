package com.wangz.springBoot.controller;

import com.wangz.springBoot.bean.BillType;
import com.wangz.springBoot.service.BillTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
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

    /**
     * 查询账单分类名称是否存在
     * @param params
     * @return
     */
    @RequestMapping("/selectBillTypeByName")
    public Map<String, Object> selectBillTypeByName(@RequestBody Map<String, Object> params){

        Map<String, Object> resultMap = new HashMap<String, Object>();
        String name = params.get("name") != null ? (String) params.get("name") : "";

        if (name != ""){
            int result = this.billTypeService.selectBillTypeByName(name);
            if (result == 0){
                resultMap.put("flag", true);
                resultMap.put("message", "this name can be use");
            } else {
                resultMap.put("flag", false);
                resultMap.put("message", "this name is existed");
            }
        } else {
            resultMap.put("flag", false);
            resultMap.put("message", "params is null");
        }

        return resultMap;
    }

    /**
     * 查询所有一级账单分类
     * @return
     */
    @RequestMapping("/selectAllParentBillType")
    public Map<String, Object> selectAllParentBillType(){

        Map<String, Object> resultMap = new HashMap<String, Object>();

        List<BillType> list = this.billTypeService.selectAllParentBillType();
        resultMap.put("list", list);

        return resultMap;
    }

    /**
     * 查询一级账单分类下的所有二级账单分类
     * @param params
     * @return
     */
    @RequestMapping("/selectAllChildBillType")
    public Map<String, Object> selectAllChildBillType(@RequestBody Map<String, Object> params){

        Map<String, Object> resultMap = new HashMap<String, Object>();
        String parentId = params.get("parentId") != null ? (String) params.get("parentId") : "";

        if (parentId != ""){
            List<BillType> list = this.billTypeService.selectAllChildBillType(parentId);
            resultMap.put("flag", true);
            resultMap.put("list", list);
        } else {
            resultMap.put("flag", false);
            resultMap.put("message", "params is null");
        }

        return resultMap;
    }

}
