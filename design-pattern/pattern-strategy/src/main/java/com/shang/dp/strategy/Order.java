package com.shang.dp.strategy;

public class Order {
    public PayState pay(int typecode,double mount){
        return  PaytType.getPayment(typecode).pay(mount);
    }
}
