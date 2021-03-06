package com.gupaoedu.user.dto;

import com.gupaoedu.user.abs.AbstractResponse;

import java.io.Serializable;


/**
 * 数据传对象-登录响应对象
 */
public class UserLoginResponse extends AbstractResponse {
    private static final long serialVersionUID = -4339900472381840119L;

    private Integer uid;
    private String avatar;
    private String mobile;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
