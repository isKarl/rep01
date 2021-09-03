package com.javato.cold;

/**
 * 作者：刘剑锋 isKarl@126.com
 **/
public class FeiBoLaQi {
    public static void main(String[] args) {
        System.out.println("第1个月兔子对数："+1);
        System.out.println("第2个月兔子对数："+1);
        int f1=1, f2=1,f,M=24;
        for (int i=3;i<=M;i++){
            f=f2;
            f2=f1+f;
            f1=f;
            System.out.println("第"+i+"个月兔子对数："+f2);
        }
    }
}
