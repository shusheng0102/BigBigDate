package cn.tedu.day19.io.system;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //
        Scanner s1=new Scanner(System.in);
        System.out.println(s1.nextInt());
       /* //关流
        //报错---因为in对象底层是静态的对所有的Scanner对象都共享
        //当前面的in对象关流时，后面的都是关流就获取不了数据
        //系统流不能关流---静态的是共享的*/
        //s1.close();
        Scanner s2=new Scanner(System.in);
        System.out.println(s2.next());
        //s2.close();

    }
}
