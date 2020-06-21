package cn.tedu.day19.io.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 从控制台获取一行数据---已经学习的流 系统流 字节流 转换流 字符流 缓存流
 */
public class ReadLineText {
    public static void main(String[] args) throws IOException {
        //获取一行---BufferedReader
        //BufferedReader构造方法需要Reader类型的对象---FileReader对象-字符流
        //从控制台获取数据---System.in---字节流
        //需要把字节流转成字符流
        BufferedReader br=new BufferedReader
                (new InputStreamReader(System.in));
        String s=br.readLine();
        System.out.println(s);
    }
}
