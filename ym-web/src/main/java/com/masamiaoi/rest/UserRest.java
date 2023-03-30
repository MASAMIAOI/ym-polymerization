package com.masamiaoi.rest;

import com.masamiaoi.UserService;
import com.masamiaoi.domain.User;
import com.masamiaoi.type.RestResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: MASAMIAOI
 * @description: 用户实现
 * @date: 2023/3/30 15:48
 * @version: 1.0.0
 */
@RestController
@RequestMapping(value = "/user")
public class UserRest {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public RestResultVo<List<User>> getList() {
        return RestResultVo.success(userService.query());
    }

    @GetMapping("/queryList")
    public RestResultVo<List<User>> queryList() {
        return RestResultVo.success(userService.queryList());
    }
}
