package com.shang.dp.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TXManager implements InvocationHandler {
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
        System.out.println("开启事务。。");
        try{
            method.invoke(this.target,args);
            System.out.println("提交事务。。");
        }catch (Exception e){
            System.out.println("异常：事务回滚。。");
        }
        return proxy;
    }
}
