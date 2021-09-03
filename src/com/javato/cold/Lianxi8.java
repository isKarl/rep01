package com.javato.cold;

import java.util.Scanner;

/**
 * 作者：刘剑锋 isKarl@126.com
 **/
public class Lianxi8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入a的值：");
        int a = scanner.nextInt();
        System.out.println("请输入计算的项数：");
        int n = scanner.nextInt();
        int b=0;
        int sum=0;
        int i=0;
        while (i<n){
            b=b+a;
            sum=b+sum;
            a=a*10;
            i++;
        }
        System.out.println(sum);
    }
}
