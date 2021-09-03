package com.javato.cold;

import java.util.Scanner;

/**
 * 作者：刘剑锋 isKarl@126.com
 **/
public class FengJieZhi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int n=scanner.nextInt();
        int k=2;
        System.out.print(n+"=");
        while (k<=n){
            if (k==n){
                System.out.println(n);
                break;
            }else if (n%k==0){
                System.out.print(k+"*");
                n=n/k;
            }else {
                k++;
            }
        }
    }
}
