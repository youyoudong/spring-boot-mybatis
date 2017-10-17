package com.wangz.springBoot.controller;

import com.wangz.springBoot.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 账单类Controller
 * Created by wangz on 2017/10/18.
 */
@RestController
@RequestMapping("/bill")
public class BillController {

    @Autowired
    private BillService billService;

    /**
     * 插入单条记录
     * @param params
     * @return
     */
    @RequestMapping("/insertBill")
    public Map<String, Object> insertBill(@RequestBody Map<String, Object> params){

        Map<String, Object> resultMap = new HashMap<String, Object>();

        int count = billService.insertBill(params);
        if (count != 0) {
            resultMap.put("flag", true);
        }else {
            resultMap.put("flag", false);
        }

        return resultMap;
    }
}
