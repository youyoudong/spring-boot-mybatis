package com.wangz.springBoot.service;

import com.wangz.springBoot.bean.User;
import com.wangz.springBoot.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * 用户
 * Created by wangz on 2017/10/14.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 获取所有USER
     * @return
     */
    public List<User> getAll(){
        return userDao.getAll();
    }

    /**
     * 插入User信息
     * @param user
     * @return
     */
    public int insert(User user){
        String id = UUID.randomUUID().toString().replaceAll("-", "");
        user.setId(id);
        return userDao.insert(user);
    }

    /**
     * 根据id获取user
     * @param id
     * @return
     */
    public User getUserById(String id){
        return userDao.getUserById(id);
    }
}
