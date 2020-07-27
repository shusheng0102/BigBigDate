package cn.gl.day18.io.file;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建文件字符输出流对象
        //创建一个空文件，如果之前已经有了内容就覆盖
        FileOutputStream fos=new FileOutputStream("D:\\abc.txt");

        //写出数据
        //没有缓冲区
        fos.write("123".getBytes());

        //关流
        fos.close();
    }
}
