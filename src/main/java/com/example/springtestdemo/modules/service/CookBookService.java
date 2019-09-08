package com.example.springtestdemo.modules.service;

import com.example.springtestdemo.Bean.CookUserBean;


import java.util.List;


public interface CookBookService {

    List<CookUserBean> selectAll();
}
