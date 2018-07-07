package com.shang.dp.lazy;

/**
 * 基于类加载机制的静态内部类加载单例模式
 */
public class Lazy01 {

    private Lazy01(){

    }

    private static class Lazy01Holder{
        private static final Lazy01 LAZY = new Lazy01();
    }

    public static Lazy01 getInstance(){
        return Lazy01Holder.LAZY;
    }
}
