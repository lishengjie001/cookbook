package com.example.cookbook.Bean;

import lombok.Data;

import java.io.Serializable;
@Data
public class CookUserBean implements Serializable{


    private Integer id ;
    private String title;//菜谱标题
    private String synopsis;//菜谱简介
    private String cover_pic;//封面对应的id
    private String like_num;//点赞数量
    private String uploader;//上传人对应uid
    private String nickname;
}
