package com.example.cookbook.modules.model.entity;

import lombok.Data;

@Data
public class CbUser {

    private Integer id;//自增id
    private String uid;//用户唯一id
    private String nickname;//昵称
    private String pwd;//密码
    private Integer gerder;//性别；0女，1男
    private String openid;
    private String avatar;//头像
    private String add_date;//加入日期

}
