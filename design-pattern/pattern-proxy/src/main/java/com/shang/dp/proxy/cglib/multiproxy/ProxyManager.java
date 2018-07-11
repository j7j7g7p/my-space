package com.shang.dp.proxy.cglib.multiproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;
import java.util.List;

public class ProxyManager implements Proxy,MethodInterceptor {
    private Enhancer enhancer;
    private int cursor = 0;
    private List<Proxy> proxies;

    private Object o;
    private Object[] objects;
    private MethodProxy methodProxy;
    private Method method;
    public Object getInstance(Class<?> clazz){
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public ProxyManager(List<Proxy> proxies) {
        this.proxies = proxies;
        enhancer = new Enhancer();
    }

    @Override
    public void doProxy(ProxyManager chain) throws Throwable {
        if (cursor == proxies.size()){
            methodProxy.invokeSuper(o,objects);
        }else{
            proxies.get(cursor++).doProxy(this);
        }
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        this.o = o;
        this.objects = objects;
        this.method = method;
        this.methodProxy = methodProxy;
        System.out.println("开始执行代理。。。");
        doProxy(this);
        System.out.println("执行代理结束。。。");
        return o;
    }
}
