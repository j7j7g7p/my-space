package com.shang.dp.func;

import com.shang.dp.Audi;
import com.shang.dp.Car;
import com.shang.dp.Porsche;

public class FactoryPorsche implements Factory {
    @Override
    public Car getCar() {
        return new Porsche();
    }
}
