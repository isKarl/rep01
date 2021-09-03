package com.javato.cold;

import java.util.Scanner;

/**
 * 作者：刘剑锋 isKarl@126.com
 **/
public class Lianxi7 {
    public static void main(String[] args) {
        int num=0;//数字
        int ABC=0;//英语
        int blank=0;//空格
        int other=0;//其他
        char[] ch=null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一行内容：");
        String s = scanner.nextLine();
        ch = s.toCharArray();
        for (int i=0;i<ch.length;i++){
            if (ch[i]>='0'&&ch[i]<='9'){
                num++;
            }else if ((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z')){
                ABC++;
            }else if (ch[i]==' '){
                blank++;
            }else{
                other++;
            }

        }
        System.out.println("数字有"+num+"个");
        System.out.println("英文有"+ABC+"个");
        System.out.println("空格有"+blank+"个");
        System.out.println("其他有"+other+"个");
    }
}
