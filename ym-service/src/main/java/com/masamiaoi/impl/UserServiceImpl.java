package com.masamiaoi.impl;

import com.masamiaoi.UserService;
import com.masamiaoi.dao.UserDao;
import com.masamiaoi.dao.UserMapper;
import com.masamiaoi.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: MASAMIAOI
 * @description: 用户实现
 * @date: 2023/3/30 15:47
 * @version: 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 用户 mapper
     */
    @Autowired
    private UserMapper userMapper;

    /**
     * 查询用户
     */
    public List<User> query() {
        return userDao.query();
    }


    /**
     * 查询用户集合
     */
    public List<User> queryList() {
        return userMapper.selectList(null);
    }
}
