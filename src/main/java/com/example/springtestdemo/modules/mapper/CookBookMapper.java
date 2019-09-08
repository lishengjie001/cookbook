package com.example.springtestdemo.modules.mapper;

import com.example.springtestdemo.Bean.CookUserBean;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

@Repository
public interface CookBookMapper {
    List<CookUserBean> selectAll();
}
