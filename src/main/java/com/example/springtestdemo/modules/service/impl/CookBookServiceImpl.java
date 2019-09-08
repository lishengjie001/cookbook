package com.example.springtestdemo.modules.service.impl;


import com.example.springtestdemo.modules.mapper.CookBookMapper;
import com.example.springtestdemo.Bean.CookUserBean;
import com.example.springtestdemo.modules.service.CookBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CookBookServiceImpl  implements CookBookService{

    @Autowired
    private CookBookMapper cookBookMapper;


    @Override
    public List<CookUserBean> selectAll() {
        return cookBookMapper.selectAll();
    }
}
