package cn.tedu.day19.io.print;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //创建打印流的对象---把要打印的信息放到一个输出流中
        PrintStream ps=new PrintStream("D:\\2.txt");
        //打印信息---到一个文件中
        ps.print("abc");
        ps.print(2);//没有换行
        //换行---在信息打印之后换行
        ps.println("123");
        //关流
        ps.close();

    }
}
