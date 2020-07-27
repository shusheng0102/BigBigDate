package cn.gl.day19.io.system;

import java.util.Scanner;

/**
 * 系统流3个---底层都是字节流
 */
public class SystemDemo {
    public static void main(String[] args) {
        //out类型是字节输出流---字节输出流的对象
        //输出的颜色是黑色
        System.out.println("HelloWorld");
        //in类型是字节输入流---字节输入流的对象
        new Scanner(System.in);
        //err类型字节输出流---字节输出流的对象
        //输出的颜色是红色
        System.err.println("HelloWorld");

        //线程-----因为有线程的参与
        for(int i=0;i<10;i++){
            System.out.println("a");
            System.err.println("a");
        }
    }
}
