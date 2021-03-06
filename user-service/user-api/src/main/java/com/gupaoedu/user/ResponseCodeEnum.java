package com.gupaoedu.user;

/**
 * @Author Luo Shanglin
 */
public enum ResponseCodeEnum {

    SUCCESS("000000","成功"),
    USERORPASSWORD_ERRROR("001001","用户名或密码不存在"),
    SYS_PARAM_NOT_RIGHT("001002","请求参数错误"),
    SYSTEM_BUSY("001099","系统繁忙，请稍候重试");

    private final String code;
    private final String msg;

    ResponseCodeEnum(String code,String msg){
        this.code = code;
        this.msg = msg;
    }
    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
