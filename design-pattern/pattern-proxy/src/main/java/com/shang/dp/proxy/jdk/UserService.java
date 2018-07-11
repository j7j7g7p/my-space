package com.shang.dp.proxy.jdk;

public class UserService implements BaseService {
    @Override
    public void doService() {
        System.out.println("UserService doService...");
    }
}
