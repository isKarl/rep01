package com.javato.cold;

/**
 * 作者：刘剑锋 isKarl@126.com
 **/
public class ShuiXianHua {
    public static void main(String[] args) {
        for (int m=101;m<1000;m++) {
            int b1 = m / 100;
            int b2 = m/10 % 10;
            int b3 = m % 10;
            int y = b1 * b1 * b1 + b2 * b2 * b2 + b3 * b3 * b3;
            if (y == m) {
                System.out.println("这个数为水仙花数：" + m);
            }
        }
    }
}
