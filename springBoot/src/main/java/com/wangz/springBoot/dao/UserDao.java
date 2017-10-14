package com.wangz.springBoot.dao;

import com.wangz.springBoot.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by wangz on 2017/10/14.
 */
@Mapper
public interface UserDao {

    List<User> getAll();
}
