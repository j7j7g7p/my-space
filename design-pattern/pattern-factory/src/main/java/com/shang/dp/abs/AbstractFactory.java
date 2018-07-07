package com.shang.dp.abs;

import com.shang.dp.Audi;
import com.shang.dp.Car;
import com.shang.dp.Porsche;
import com.shang.dp.Volkswagen;

public class AbstractFactory {

    //Here is common method for factory to create Car
    public static void commonMethod(){

    }

    /**
     * Audi
     */
    public Car getAudi(){
        return new Audi();
    }

    /**
     * Porsche
     */
    public Car getPorsche(){
        return new Porsche();
    }

    /**
     * Volkswagen
     */
    public Car getVolkswagen(){
        return new Volkswagen();
    }

}
