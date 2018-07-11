package com.shang.dp.proxy.cglib.multiproxy;

public class MonitorProxy implements Proxy {
    @Override
    public void doProxy(ProxyManager chain) throws Throwable {
        System.out.println("MonitorProxy begin...");
        chain.doProxy(chain);
        System.out.println("MonitorProxy end...");
    }

}
