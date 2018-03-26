package com.wangz.springBoot.service;

import com.wangz.springBoot.bean.WishList;
import com.wangz.springBoot.dao.WishListDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * WishList Service
 * @author wangz
 */
@Service
public class WishListService {

    @Autowired
    private WishListDao wishListDao;

    /**
     * 新增WishList
     * @param wishList
     * @return result 0 or 1
     */
    public int insertWishList(WishList wishList){
        String id = UUID.randomUUID().toString().replaceAll("-", "");
        Date date = new Date();
        wishList.setId(id);
        wishList.setCreateTime(date);
        return wishListDao.insertWishList(wishList);
    }
}
