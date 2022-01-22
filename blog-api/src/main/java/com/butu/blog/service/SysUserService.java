package com.butu.blog.service;

import com.butu.blog.dao.pojo.SysUser;

/**
 * Copyright (C), 2017-2022, 不秃
 *
 * @author BUTUbird
 * Date: 2022/1/23 22:34
 * FileName: SysUserService
 */
public interface SysUserService {
    /**
     * 查找用户id
     * @param id
     * @return
     */
    SysUser findUserById(Long id);
}
