package com.shang.dp.proxy.staticway;

/**
 * 经纪人类
 */
public class Proxy implements Action {
    private Action singer;

    public Proxy(Action singer) {
        this.singer = singer;
    }

    @Override
    public void doAction() {
        JieHuo();
        xuanChuan();
        singer.doAction();
        shouWei();
    }

    public void JieHuo(){
        System.out.println("经纪人接活，签合同....");
    }

    public void xuanChuan(){
        System.out.println("经纪人营销，宣传....");
    }

    public void shouWei(){
        System.out.println("经纪人收钱....");
    }
}
