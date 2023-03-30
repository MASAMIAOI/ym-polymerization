package com.masamiaoi.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.masamiaoi.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: MASAMIAOI
 * @description: 用户 mapper
 * @date: 2023/3/30 16:19
 * @version: 1.0.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
