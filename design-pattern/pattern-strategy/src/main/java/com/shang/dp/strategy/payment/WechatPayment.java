package com.shang.dp.strategy.payment;

import com.shang.dp.strategy.PayState;
import com.shang.dp.strategy.Payment;

public class WechatPayment implements Payment {
    
    @Override
    public PayState pay(double mount) {
        System.out.println("微信支付成功。。。");
        return new PayState(200,"Success","支付金额："+mount+",支付成功");
    }
}
