package com.javato.cold;



import java.util.Scanner;

/**
 * 作者：刘剑锋 isKarl@126.com
 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
 * /**在循环中，只要除数不等于0，用较大数除以较小的数，将小的一个数作为下一轮循环的大数，
 * 取得的余数作为下一轮循环的较小的数，如此循环直到较小的数的值为0，
 * 返回较大的数，此数即为最大公约数，最小公倍数为两数之积除以最大公约数。* /
 **/
public class LianXi6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int m = scanner.nextInt();
        System.out.println("请再输入一个正整数：");
        int n = scanner.nextInt();
        int max;
        int min;
         max=test(n,m);
         min=m*n/max;
         System.out.println("最大公约数为："+max);
         System.out.println("最小公约数为："+min);



    }
    public static int test(int n,int m){
        int t;
        if (n>m){
            t=n;
            n=m;
            m=t;
        }
        while (n!=0){
            if (m==n){
                return m;
            }else {
                int k=m%n;//余数
                m=n;//小的数为大的数
                n=k;//余数为小的数
            }
        }
        return m;
    }
}
