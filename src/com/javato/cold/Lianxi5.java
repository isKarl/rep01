package com.javato.cold;

import java.util.Scanner;

/**
 * 作者：刘剑锋 isKarl@126.com
 **/
public class Lianxi5 {
    public static void main(String[] args) {
        int x;
        char grade;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的成绩");
        x = scanner.nextInt();
        grade= x>=90?'A':x>=60?'B':'C';
        System.out.println("你的成绩等级为:"+grade);
    }
}
