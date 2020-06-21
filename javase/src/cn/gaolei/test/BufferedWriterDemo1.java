package cn.gaolei.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 冷夜雨花未眠
 * @create 2020/3/25 0025-0:24
 */
public class BufferedWriterDemo1 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\abc\\124.txt"));
        //写出数据
        bw.write("asd");
        //换行
            /*
            Windows换行  \r\n回车换行
            Linux换行   \n换行
            不管是什么操作系统调用下面的方法一定换行
            */
        bw.newLine();
        bw.write("asd123");
        bw.newLine();
        bw.write("asd4324");
        bw.close();
    }
}
