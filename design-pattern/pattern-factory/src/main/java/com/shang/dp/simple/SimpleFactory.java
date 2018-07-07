package com.shang.dp.simple;

import com.shang.dp.Audi;
import com.shang.dp.Car;
import com.shang.dp.Porsche;
import com.shang.dp.Volkswagen;

public class SimpleFactory {
    public Car getCar(String name){
        if ("Audi".equals(name)){
            return new Audi();
        }else if ("Porsche".equals(name)){
            return  new Porsche();
        }else if ("Volkswagen".equals(name)){
            return  new Volkswagen();
        }else {
            System.out.println("没有这种车！");
            return null;
        }
    }
}
