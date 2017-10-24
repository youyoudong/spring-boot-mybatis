package com.wangz.springBoot.dao;

import com.wangz.springBoot.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户DAO
 * Created by wangz on 2017/10/14.
 */
@Mapper
public interface UserDao {

    /**
     * 获取所有user
     * @return
     */
    List<User> getAll();

    /**
     * 插入user信息
     * @param user
     * @return
     */
    int insert(User user);

    /**
     * 根据id获取user
     * @param id
     * @return
     */
    User getUserById(String id);
}
