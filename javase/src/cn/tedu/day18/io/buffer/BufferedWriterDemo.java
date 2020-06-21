package cn.tedu.day18.io.buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

    public static void main(String[] args) throws IOException {
        //
        BufferedWriter bw=new BufferedWriter
                (new FileWriter("D:\\124.txt"));
        //写出数据
        bw.write("123");
        //换行
        //Windows换行  \r\n回车换行
        //Linux换行   \n换行
        //不管是什么操作系统调用下面的方法一定换行
        bw.newLine();
        bw.write("456");
        //关流
        bw.close();
    }
}
