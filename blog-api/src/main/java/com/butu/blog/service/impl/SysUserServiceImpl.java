package com.butu.blog.service.impl;

import com.butu.blog.dao.mapper.SysUserMapper;
import com.butu.blog.dao.pojo.SysUser;
import com.butu.blog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Copyright (C), 2017-2022, 不秃
 *
 * @author BUTUbird
 * Date: 2022/1/23 22:36
 * FileName: SysUserServiceImpl
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findUserById(Long id) {
        SysUser sysUser = sysUserMapper.selectById(id);
        if (sysUser == null){
            sysUser = new SysUser();
            sysUser.setNickname("BUTU");
        }
        return sysUser;
    }
}
