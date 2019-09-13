package com.example.cookbook.modules.model.entity;

import lombok.Data;

@Data
public class CbCookbook {
    private Integer id ;
    private String title;//菜谱标题
    private String synopsis;//菜谱简介
    private String cover_pic;//封面对应的id
    private String like_num;//点赞数量
    private String uploader;//上传人对应uid

}
