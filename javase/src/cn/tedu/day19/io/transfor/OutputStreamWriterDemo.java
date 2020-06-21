package cn.tedu.day19.io.transfor;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        //创建转换流的对象
        //转换流对象是由字节输出流对象来构建的
        //要往外写出字符串---需要用字符流来接
        //底层真正写出数据的是字节输出流
        //把字符流转成了字节流
        OutputStreamWriter osw=new OutputStreamWriter
                (new FileOutputStream("D:\\1.txt"));
        //写出数据---写出内容没有转成字节形式---用字符流来接
        osw.write("abc");
        //关流
        osw.close();
    }
}
