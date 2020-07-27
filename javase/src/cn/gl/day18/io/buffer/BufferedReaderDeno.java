package cn.gl.day18.io.buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDeno {

    public static void main(String[] args) throws IOException {
        //创建对象---由文件字符输入流的对象构建出来的
        //BufferedReader给FileReader提供了缓冲区
        BufferedReader br=new BufferedReader
                (new FileReader("D:\\abc.txt"));
        //读取一行，返回的是一行的内容转成字符串
       /* String s=br.readLine();
        String str=br.readLine();
        //如果返回的结果是null表示已经读取完成
        System.out.println(br.readLine());
        System.out.println(s);
        System.out.println(str);*/
       //转成循环
        String str=null;
        while ((str=br.readLine())!=null){
            System.out.println(str);
        }
    }
}
