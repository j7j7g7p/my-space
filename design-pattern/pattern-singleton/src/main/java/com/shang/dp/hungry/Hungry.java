package com.shang.dp.hungry;

/**
 * 单例模式
 * 懒汉式加载
 */
//优点：无锁，线程安全，效率高，用户体验好
//缺点：类加载的时候就初始化，一定程度上占用内存
public class Hungry {
    private static final Hungry hungry = new Hungry();
    /**
     * 构造方法私有化
     */
    private Hungry(){

    }

    public static Hungry getInstance(){
        return  hungry;
    }

}
