package com.shang.dp.strategy;

import com.shang.dp.strategy.payment.AlipayPayment;
import com.shang.dp.strategy.payment.WechatPayment;

public enum PaytType {
    $01(1,new AlipayPayment()),
    $02(2,new WechatPayment());
    private int type;
    private Payment payment;
    public static int ALIPAY_PAYMENT = 1;
    public static int WECHAT_PAYMENT = 2;

    public int getType() {
        return type;
    }

    public Payment getPayment() {
        return payment;
    }

    PaytType(int type, Payment payment) {
                this.type = type;
                this.payment = payment;
    }

    public static Payment getPayment(int code) throws Exception {
        PaytType[] paytTypes = PaytType.values();
        for (PaytType paytype:paytTypes) {
            if (code==paytype.getType()){
                return paytype.getPayment();
            }
        }
        throw  new Exception("请选择正确的支付方式");
    }
}
