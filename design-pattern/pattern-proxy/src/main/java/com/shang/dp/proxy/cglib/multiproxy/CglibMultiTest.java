package com.shang.dp.proxy.cglib.multiproxy;

import java.util.ArrayList;
import java.util.List;

public class CglibMultiTest {
    public static void main(String[] args) {
        List<Proxy> proxies = new ArrayList<>();
        proxies.add(new PerformaceProxy());
        proxies.add(new MonitorProxy());
        ProxyManager proxyChain = new ProxyManager(proxies);
        Target target = (Target)proxyChain.getInstance(Target.class);
        target.doSomething();
    }
}
