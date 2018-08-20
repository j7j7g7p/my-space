package com.example.demo;

/**
 * @Author: Luo ShangLin
 * @Date: 2018/8/9 16:50
 * @Package: test
 * @Service: service provided
 * @Describe: service description
 */
public class Good {
    private int id;
    private String name;
    private String price;

    public Good(int id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Good{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", price='" + price + '\'' +
                        '}';
    }
}
