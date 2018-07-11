package com.shang.dp.proxy.cglib;

import com.shang.dp.proxy.jdk.BaseService;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibPerformanceManager implements MethodInterceptor {
    public Object getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("method:"+method.getName());
        long t1 = System.currentTimeMillis();
        System.out.println("开始执行："+t1);
        methodProxy.invokeSuper(o,objects);
        long t2 = System.currentTimeMillis();
        System.out.println("执行结束："+t2);
        System.out.println("执行时间："+(t2-t1));
        return o;
    }
}
