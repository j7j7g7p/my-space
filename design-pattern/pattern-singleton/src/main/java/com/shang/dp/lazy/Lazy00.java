package com.shang.dp.lazy;

/**
 * 双重检查的类加载机制
 */
public class Lazy00 {
    private static volatile Lazy00 lazy;

    private Lazy00(){

    }

    public static Lazy00 getInstance(){
        if (lazy ==null){
            lazy = new Lazy00();
        }
        return lazy;
    }
}
