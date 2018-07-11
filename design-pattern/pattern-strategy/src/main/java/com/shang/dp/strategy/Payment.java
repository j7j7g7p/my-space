package com.shang.dp.strategy;

public interface Payment {
    PayState pay(double mount);
}
