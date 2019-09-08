package com.example.springtestdemo.modules.mapper;


import com.example.springtestdemo.modules.model.entity.CbUser;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;

@Repository
public interface UserMapper extends BaseMapper<CbUser> {

}
