package com.wangz.springBoot.controller;

import com.wangz.springBoot.bean.User;
import com.wangz.springBoot.bean.WishList;
import com.wangz.springBoot.service.OperateTypeService;
import com.wangz.springBoot.service.UserService;
import com.wangz.springBoot.service.WishListService;
import com.wangz.springBoot.util.TableEnum;
import com.wangz.springBoot.util.TypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * WishList相关Controller
 * @author wangz
 */
@RestController
@RequestMapping("/WishList")
public class WishListController {

    @Autowired
    private WishListService wishListService;

    @Autowired
    private UserService userService;

    @Autowired
    private OperateTypeService operateTypeService;

    @RequestMapping("/insertWishList")
    public Map<String, Object> insertWishList(@RequestBody Map<String, Object> params){
        Map<String, Object> resultMap = new HashMap<String, Object>();

        String name = params.get("name") != null ? (String) params.get("name") : "";
        String source = params.get("source") != null ? (String) params.get("source") : "";
        double createPrice = params.get("createPrice") != null ? (double) params.get("createPrice") : 0.00;
        int status = params.get("status") != null ? (int) params.get("status") : 0;
        int isDelete = params.get("isDelete") != null ? (int) params.get("isDelete") : 0;
        String userId = params.get("userId") != null ? (String) params.get("userId") : "";

        if(userId != null && userId != ""){
            User user = userService.getUserById(userId);
            if(user != null){
                WishList wishList = new WishList();
                wishList.setName(name);
                wishList.setSource(source);
                wishList.setCreatePrice(createPrice);
                wishList.setStatus(status);
                wishList.setIsDelete(isDelete);
                wishList.setUserId(userId);
                int count = wishListService.insertWishList(wishList);
                if (count > 0){
                    String tableName = TableEnum.WISHlIST.getKey().toString();
                    String typeId = String.valueOf(TypeEnum.ADD.getKey());
                    String typeName = TypeEnum.ADD.getValue().toString();
                    operateTypeService.insertOperateType(user, tableName, typeId, typeName);
                    resultMap.put("flag", true);
                    resultMap.put("message", "insert success");
                }else {
                    resultMap.put("flag", false);
                    resultMap.put("message", "insert failed");
                }
            }else{
                resultMap.put("flag", false);
                resultMap.put("message", "user is null");
            }
        }else{
            resultMap.put("flag", false);
            resultMap.put("message", "params is null");
        }


        return resultMap;
    }
}
