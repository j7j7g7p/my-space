package com.shang.dp;

public class Test {
    public static void main(String[] args) {
        try {
            WuKong wuKong = new WuKong();
            WuKong clone = (WuKong)wuKong.clone();
            System.out.println(clone == wuKong);
            System.out.println(clone.bang == wuKong.bang);
        }catch (Exception e){

        }
    }
}
