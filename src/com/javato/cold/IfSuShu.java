package com.javato.cold;

/**
 * 作者：刘剑锋 isKarl@126.com
 **/
public class IfSuShu {
    public static void main(String[] args) {
        int count=0;//计算素数总数
        for (int i=1;i<=100;i+=1){
            Boolean b=false;
            for (int j=2;j<=Math.sqrt(i);j++){
                if (i%j==0){
                    //能被整除则不是素数
                    b=false;
                    break;
                }else {
                    b=true;
                }
            }
            if (b||i==3||i==2){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("所有素数个数之和为："+count);
    }
}
