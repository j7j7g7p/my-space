package com.shang.dp.func;

public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new FactoryAudi();
        System.out.println(factory.getCar());

        factory = new FactoryPorsche();
        System.out.println(factory.getCar());
    }
}
