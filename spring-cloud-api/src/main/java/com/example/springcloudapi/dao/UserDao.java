/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.example.springcloudapi.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springcloudapi.entity.UserEntity;
import com.example.springcloudcommon.common.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 *
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface UserDao extends BaseDao<UserEntity>, BaseMapper<UserEntity> {
    UserEntity getUserByMobile(String mobile);

    UserEntity getUserByUserId(Long userId);
}
