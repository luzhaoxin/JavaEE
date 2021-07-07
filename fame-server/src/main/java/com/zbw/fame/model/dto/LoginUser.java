package com.zbw.fame.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class LoginUser {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 账号
     */
    private String username;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户显示名称
     */
    private String screenName;

    /**
     * 最后登陆时间
     */
    private Date logged;
}
