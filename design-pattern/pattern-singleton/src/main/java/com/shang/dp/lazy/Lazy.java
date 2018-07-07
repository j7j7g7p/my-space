package com.shang.dp.lazy;

/**
 * 双重检查的类加载机制
 */
public class Lazy {
    private static volatile Lazy lazy;

    private Lazy(){

    }

    public static Lazy getInstance(){
        if (lazy== null){
            synchronized (Lazy.class){
                if (lazy ==null){
                    lazy = new Lazy();
                }
            }
        }
        return lazy;
    }
}
