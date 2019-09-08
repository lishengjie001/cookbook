package com.example.springtestdemo.modules.service.impl;


import com.example.springtestdemo.modules.mapper.UserMapper;
import com.example.springtestdemo.modules.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


}
