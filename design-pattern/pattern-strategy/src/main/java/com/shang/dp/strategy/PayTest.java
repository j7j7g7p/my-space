package com.shang.dp.strategy;

public class PayTest {
    public static void main(String[] args) {
        Order order = new Order();
        PayState pay = order.pay(PaytType.ALIPAY_PAYMENT, 2333.3);
        System.out.println(pay);
    }
}
