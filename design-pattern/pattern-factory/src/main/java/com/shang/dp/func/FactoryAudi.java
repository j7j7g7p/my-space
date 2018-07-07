package com.shang.dp.func;

import com.shang.dp.Audi;
import com.shang.dp.Car;

public class FactoryAudi implements Factory {
    @Override
    public Car getCar() {
        return new Audi();
    }
}
