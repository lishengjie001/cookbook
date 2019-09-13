package com.example.cookbook.modules.service;

import com.example.cookbook.Bean.CookUserBean;
import com.example.cookbook.modules.model.entity.CbCookbook;


import java.util.List;


public interface CookBookService {

    List<CookUserBean> selectAll();


    List<CbCookbook> search(String name);
}
