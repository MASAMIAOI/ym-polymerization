package com.masamiaoi.dao;

import com.masamiaoi.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建UserDao类（此处只是演示创建多模块，所以没有连接数据库）;
 *
 * @author masamiaoi
 */
@Repository
public class UserDao {

    public List<User> query() {

        List<User> list = new ArrayList<>();
        User user = new User();
        user.setId(100L);
        user.setName("admin");
        user.setEmail("admin");
        list.add(user);
        return list;
    }
}
