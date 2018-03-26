package com.wangz.springBoot.dao;

import com.wangz.springBoot.bean.WishList;
import org.apache.ibatis.annotations.Mapper;

/**
 * WishList Dao
 * @author wangz
 */
@Mapper
public interface WishListDao {

    /**
     * 新增
     * @param wishList
     * @return 0 or 1
     */
    int insertWishList(WishList wishList);
}
