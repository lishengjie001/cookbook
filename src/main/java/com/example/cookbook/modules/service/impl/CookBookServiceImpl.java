package com.example.cookbook.modules.service.impl;


import com.example.cookbook.Bean.CookUserBean;
import com.example.cookbook.modules.mapper.CookBookMapper;
import com.example.cookbook.modules.model.entity.CbCookbook;
import com.example.cookbook.modules.service.CookBookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CookBookServiceImpl  implements CookBookService {

    @Autowired
    private CookBookMapper cookBookMapper;


    @Override
    public List<CookUserBean> selectAll() {
        return cookBookMapper.selectAll();
    }

    @Override
    public  List<CbCookbook> search (String name){
        return cookBookMapper.search(name);
    }
}
