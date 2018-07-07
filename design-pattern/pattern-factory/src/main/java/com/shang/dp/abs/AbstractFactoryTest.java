package com.shang.dp.abs;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactoryImpl factory = new AbstractFactoryImpl();
        System.out.println(factory.getAudi());
    }
}
