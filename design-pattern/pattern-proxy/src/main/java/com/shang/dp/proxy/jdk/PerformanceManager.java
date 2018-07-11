package com.shang.dp.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PerformanceManager implements InvocationHandler {
    private BaseService target;


    public Object getInstance(BaseService target) throws Exception{
        this.target = target;

        Class<?> clazz = target.getClass();

        //下半截，老师深入底层来给大家讲解字节码是如何重组的
        //用来生成一个新的对象（字节码重组来实现）
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long t1 = System.currentTimeMillis();
        System.out.println("开启执行："+t1);
        try{
            method.invoke(this.target,args);
        }catch (Exception e){

        }finally {
            long t2 = System.currentTimeMillis();
            System.out.println("执行结束："+t2);
            System.out.println("执行时间："+(t2-t1));
        }
        return proxy;
    }
}
