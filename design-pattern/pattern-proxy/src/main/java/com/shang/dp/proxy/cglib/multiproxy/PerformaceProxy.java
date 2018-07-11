package com.shang.dp.proxy.cglib.multiproxy;

public class PerformaceProxy implements Proxy {
    @Override
    public void doProxy(ProxyManager chain) throws Throwable {
        long t1 = System.currentTimeMillis();
        System.out.println("begin:"+t1);
        chain.doProxy(chain);
        long t2 = System.currentTimeMillis();
        System.out.println("end:"+t2);
        System.out.println("time:"+(t2-t1));
    }

}
