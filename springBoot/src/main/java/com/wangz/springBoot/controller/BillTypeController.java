package com.wangz.springBoot.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wangz.springBoot.bean.BillType;
import com.wangz.springBoot.bean.OperateType;
import com.wangz.springBoot.bean.User;
import com.wangz.springBoot.service.BillTypeService;
import com.wangz.springBoot.service.OperateTypeService;
import com.wangz.springBoot.service.UserService;
import com.wangz.springBoot.util.TableEnum;
import com.wangz.springBoot.util.TypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * 账单分类Controller
 * Created by wangz on 2017/10/17.
 */
@RestController
@RequestMapping("/billType")
public class BillTypeController {

    @Autowired
    private BillTypeService billTypeService;
    @Autowired
    private OperateTypeService operateTypeService;
    @Autowired
    private UserService userService;

    /**
     * 插入单条记录
     * @param params
     * @return
     */
    @RequestMapping("/insert")
    public Map<String, Object> insertBillType(@RequestBody Map<String, Object> params){

        Map<String, Object> resultMap = new HashMap<String, Object>();
        String name = params.get("name") != null ? (String) params.get("name") : "";
        String parentId = params.get("parentId") != null ? (String) params.get("parentId") : "";
        String userId = params.get("userId") != null ? (String) params.get("userId") : "";

        if (name != "" && parentId != "" && userId != "") {
            resultMap.put("flag", false);
            resultMap.put("message", "params is null");
        }else {
            User user = userService.getUserById(userId);
            if (user != null){
                BillType bt = new BillType();
                bt.setName(name);
                bt.setParentId(parentId);
                try {
                    billTypeService.insertBillType(bt);
                    String tableName = TableEnum.BILLTYPE.getKey().toString();
                    String typeId = String.valueOf(TypeEnum.ADD.getKey());
                    String typeName = TypeEnum.ADD.getValue().toString();
                    operateTypeService.insertOperateType(user, tableName, typeId, typeName);
                    resultMap.put("flag", true);
                    resultMap.put("message", "success");
                }catch (RuntimeException e){
                    resultMap.put("flag", false);
                    resultMap.put("message", "error");
                }
            } else {
                resultMap.put("flag", false);
                resultMap.put("message", "user is null");
            }
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
        String userId = params.get("userId") != null ? (String) params.get("userId") : "";

        if (name != "" && userId != null){
            User user = userService.getUserById(userId);
            if (user != null){
                int result = this.billTypeService.selectBillTypeByName(name);
                if (result == 0){
                    String tableName = TableEnum.BILLTYPE.getKey().toString();
                    String typeId = String.valueOf(TypeEnum.SELECT.getKey());
                    String typeName = TypeEnum.SELECT.getValue().toString();
                    operateTypeService.insertOperateType(user, tableName, typeId, typeName);
                    resultMap.put("flag", true);
                    resultMap.put("message", "this name can be use");
                } else {
                    resultMap.put("flag", false);
                    resultMap.put("message", "this name is existed");
                }
            } else {
                resultMap.put("flag", false);
                resultMap.put("message", "user is null");
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
    public Map<String, Object> selectAllParentBillType(@RequestBody Map<String, Object> params){

        Map<String, Object> resultMap = new HashMap<String, Object>();
        String userId = params.get("userId") != null ? (String) params.get("userId") : "";

        if (userId != null){
            User user = userService.getUserById(userId);
            if (user != null){
                List<BillType> list = this.billTypeService.selectAllParentBillType();
                String tableName = TableEnum.BILLTYPE.getKey().toString();
                String typeId = String.valueOf(TypeEnum.SELECT.getKey());
                String typeName = TypeEnum.SELECT.getValue().toString();
                operateTypeService.insertOperateType(user, tableName, typeId, typeName);
                resultMap.put("flag", true);
                resultMap.put("list", list);
            } else {
                resultMap.put("flag", false);
                resultMap.put("message", "user is null");
            }
        } else {
            resultMap.put("flag", false);
            resultMap.put("message", "params is null");
        }

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
        String userId = params.get("userId") != null ? (String) params.get("userId") : "";

        if (parentId != "" && userId != ""){
            User user = userService.getUserById(userId);
            if (user != null){
                List<BillType> list = this.billTypeService.selectAllChildBillType(parentId);
                String tableName = TableEnum.BILLTYPE.getKey().toString();
                String typeId = String.valueOf(TypeEnum.SELECT.getKey());
                String typeName = TypeEnum.SELECT.getValue().toString();
                operateTypeService.insertOperateType(user, tableName, typeId, typeName);
                resultMap.put("flag", true);
                resultMap.put("list", list);
            } else {
                resultMap.put("flag", false);
                resultMap.put("message", "user is null");
            }
        } else {
            resultMap.put("flag", false);
            resultMap.put("message", "params is null");
        }

        return resultMap;
    }

    /**
     * 修改账单分类名称
     * @param params
     * @return
     */
    @RequestMapping("/updateBillType")
    public Map<String, Object> updateBillType(@RequestBody Map<String, Object> params){

        Map<String, Object> resultMap = new HashMap<String, Object>();
        String id = params.get("id") != null ? (String) params.get("id") : "";
        String name = params.get("name") != null ? (String) params.get("name") : "";
        String userId = params.get("userId") != null ? (String) params.get("userId") : "";

        if (id != "" && name != "" && userId != "") {
            User user = userService.getUserById(userId);
            if (user != null){
                BillType billType = new BillType();
                billType.setId(id);
                billType.setName(name);
                this.billTypeService.updateBillType(billType);
                String tableName = TableEnum.BILLTYPE.getKey().toString();
                String typeId = String.valueOf(TypeEnum.UPDATE.getKey());
                String typeName = TypeEnum.UPDATE.getValue().toString();
                operateTypeService.insertOperateType(user, tableName, typeId, typeName);
                resultMap.put("flag", true);
                resultMap.put("message", "success");
            } else {
                resultMap.put("flag", false);
                resultMap.put("message", "user is null");
            }
        } else {
            resultMap.put("flag", false);
            resultMap.put("message", "params is null");
        }

        return resultMap;
    }

    @RequestMapping("/getPageList")
    public Map<String, Object> getPageList(@RequestBody Map<String, Object> params){

        Map<String, Object> resultMap = new HashMap<String, Object>();
        int pageNum = params.get("pageNum") != null ? (int) params.get("pageNum") : 1;
        int pageSize = params.get("pageSize") != null ? (int) params.get("pageSize") : 20;

        Page page = PageHelper.startPage(pageNum, pageSize, true);
        List<BillType> list = this.billTypeService.getPageList();
        resultMap.put("pageNum", pageNum);
        resultMap.put("total", page.getTotal());
        resultMap.put("list", list);

        return resultMap;
    }

}
