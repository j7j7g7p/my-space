package com.shang.dp.simple;

import com.shang.dp.Car;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Car car = simpleFactory.getCar("Audi");
        System.out.println(car);
        car = simpleFactory.getCar("Porsche");
        System.out.println(car);
    }
}
