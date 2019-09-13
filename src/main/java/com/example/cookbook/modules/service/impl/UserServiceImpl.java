package com.example.cookbook.modules.service.impl;


import com.example.cookbook.modules.mapper.UserMapper;
import com.example.cookbook.modules.service.UserService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


}
