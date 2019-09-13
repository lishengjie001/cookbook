package com.example.cookbook.modules.mapper;

import com.example.cookbook.Bean.CookUserBean;

import com.example.cookbook.modules.model.entity.CbCookbook;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface CookBookMapper {
    List<CookUserBean> selectAll();

    List<CbCookbook> search(String name);
}
