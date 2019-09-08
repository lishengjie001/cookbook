package com.example.springtestdemo.modules.controller;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.springtestdemo.modules.model.entity.CbCookbook;
import com.example.springtestdemo.Bean.CookUserBean;
import com.example.springtestdemo.modules.service.impl.CookBookServiceImpl;
import com.example.springtestdemo.modules.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@Api(value = "菜谱操作",tags = "小程序")
@RestController
public class HelloController {


    @Autowired
    private UserServiceImpl userServiceimpl;

    @Autowired
    private CookBookServiceImpl cookBookService;

    @ApiOperation(value="首页展示",notes = "首页数据展示")
    @GetMapping("/getIndexData")
    public List<CookUserBean> getIndexData(){
        List<CookUserBean> cookbookList= cookBookService.selectAll();

        return cookbookList;
    }


    @ApiOperation(value="添加食谱",notes = "添加食谱")
    @PostMapping("/saveCookBook")
    public int saveCookBook(){
        return 0;
    }


    public JSONArray tojson(List<CbCookbook> cookbookList){
        JSONArray jsonArray= new JSONArray();
        if(cookbookList!=null&&cookbookList.size()>0){
            for(CbCookbook cbCookbook:cookbookList){
                JSONObject jsonObject= new JSONObject();
             //   jsonObject.put("username",cbCookbook.getCbUser().getNickname());
                jsonObject.put("likeNum",cbCookbook.getLike_num());
                jsonObject.put("pic",cbCookbook.getCover_pic());
                jsonArray.add(jsonObject);
            }
        }
    return jsonArray;
    }

}
