package com.example.demo;

import java.io.Serializable;

/**
 * @Author: Luo ShangLin
 * @Date: 2018/8/9 16:21
 * @Package: test
 * @Service: service provided
 * @Describe: service description
 */
public class Product implements Serializable{
    private String name;
    private String price;

    public Product(String name, String price) {
        this.name = name;
        this.price = price;
    }

}
