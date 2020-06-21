package cn.tedu.day18.io.file;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {
    public static void main(String[] args) throws IOException {
        //创建文件字符输入流对象
        FileReader read=new FileReader("D:\\1.txt");

        //自建缓冲区---数组
        //创建数组
        char[] cs=new char[4];
        //
        int len=-1;//代表的是用于接受每次返回的字符个数
        while((len=read.read(cs))!=-1){//按照字符数组进行读取，每次返回读取的字符个数
            System.out.print(new String(cs,0,len));//把存储读取内容的字符数组转成字符串
        }

    }
}
