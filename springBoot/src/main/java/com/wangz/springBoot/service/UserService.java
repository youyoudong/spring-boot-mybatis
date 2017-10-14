package com.wangz.springBoot.service;

import com.wangz.springBoot.bean.User;
import com.wangz.springBoot.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangz on 2017/10/14.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getAll(){
        return userDao.getAll();
    }
}
