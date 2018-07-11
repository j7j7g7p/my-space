package com.shang.dp.proxy.cglib.multiproxy;

public interface Proxy {
    void doProxy(ProxyManager chain) throws Throwable;
}
