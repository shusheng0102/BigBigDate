package cn.tedu.day19.io.transfor;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        //创建转换流对象
        //通过字节输入流对象构建出的转换流对象
        //先通过字节输入流从文件中读入数据---字节形式
        InputStreamReader isr=new InputStreamReader
                (new FileInputStream("D:\\1.txt"));
        //自建缓冲区
        //要把读取的数据存放到字符数组中---字符形式的数据才能去存储
        //读取是以字节形式读取，存放是以字符形式存放
        //一定存在字节转字符的过程---字节流转换成字符流
        char[] cs=new char[4];
        int len=-1;
        while((len=isr.read(cs))!=-1){
            System.out.println(new String(cs,0,len));
        }
    }
}
