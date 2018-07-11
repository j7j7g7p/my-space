package com.shang.dp.proxy;

import com.shang.dp.proxy.jdk.BaseService;
import com.shang.dp.proxy.jdk.PerformanceManager;
import com.shang.dp.proxy.jdk.TXManager;
import com.shang.dp.proxy.jdk.UserService;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;

public class TestJDK {
    public static void main(String[] args) throws Exception {
        BaseService userService = (BaseService) new TXManager().getInstance(new UserService());
        System.out.println(userService.getClass());
//        userService.doService();

        userService = (BaseService) new PerformanceManager().getInstance(userService);
        System.out.println(userService.getClass());
        userService.doService();
        //原理：
        //1、拿到被代理对象的引用，并且获取到它的所有的接口，反射获取
        //2、JDK Proxy类重新生成一个新的类、同时新的类要实现被代理类所有实现的所有的接口
        //3、动态生成Java代码，把新加的业务逻辑方法由一定的逻辑代码去调用（在代码中体现）
        //4、编译新生成的Java代码.class
        //5、再重新加载到JVM中运行
        //以上这个过程就叫字节码重组

        //JDK中有个规范，只要要是$开头的一般都是自动生成的
        //通过反编译工具可以查看源代码
        byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{UserService.class});
        FileOutputStream os = new FileOutputStream(System.getProperty("user.dir")+ File.separator+"pattern-proxy"+File.separator+"$Proxy0.class");
        System.out.println(System.getProperty("user.dir")+ File.separator+"pattern-proxy"+File.separator+"$Proxy0.class");//user.dir指定了当前的路径
        //G:\my-space\design-pattern\pattern-proxy\$Proxy0.class
        os.write(bytes);
        os.close();


    }
}
