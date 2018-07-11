package com.shang.dp.proxy;

import com.shang.dp.proxy.cglib.CglibPerformanceManager;
import com.shang.dp.proxy.cglib.CglibTXManager;
import com.shang.dp.proxy.jdk.UserService;

public class TestCglib {
    public static void main(String[] args) throws Exception {
        UserService userService = (UserService) new CglibPerformanceManager().getInstance(UserService.class);
        System.out.println(userService.getClass());

        userService = (UserService) new CglibTXManager().getInstance(userService.getClass());
        userService.doService();

    }
}
