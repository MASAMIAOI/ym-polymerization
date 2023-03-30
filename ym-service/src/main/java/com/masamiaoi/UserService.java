package com.masamiaoi;

import com.masamiaoi.domain.User;

import java.util.List;

/**
 * @author: MASAMIAOI
 * @description: 用户实现
 * @date: 2023/3/30 15:47
 * @version: 1.0.0
 */
public interface UserService {

    /**
     * 查询
     */
    List<User> query();

    /**
     * 查询全部
     */
    List<User> queryList();
}
