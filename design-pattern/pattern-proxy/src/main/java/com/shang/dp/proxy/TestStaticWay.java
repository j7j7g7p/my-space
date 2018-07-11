package com.shang.dp.proxy;

import com.shang.dp.proxy.staticway.Proxy;
import com.shang.dp.proxy.staticway.Singer;

/**
 * 代理类被代理类具有相同的能力（实现相同接口），但是各自专注自己的事情。
 */
public class TestStaticWay {
    public static void main(String[] args) {
        Singer singer = new Singer();
        Proxy proxy = new Proxy(singer);
        proxy.doAction();
    }
}
