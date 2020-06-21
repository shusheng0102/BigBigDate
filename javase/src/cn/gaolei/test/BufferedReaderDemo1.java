package cn.gaolei.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 冷夜雨花未眠
 * @create 2020/3/24 0024-23:57
 *
 * 缓冲区
 */
public class BufferedReaderDemo1 {
    public static void main(String[] args) throws IOException {
        //创建对象---由文件字符输入流的对象构建出来的
        //BufferedReader给FileReader提供了缓冲区
        BufferedReader br=new BufferedReader(new FileReader("D:\\abc\\abc.txt"));
        //读取一行，返回的是一行的内容转成字符串

        /*String s1=br.readLine();
        String s2=br.readLine();
        String s3=br.readLine();
        System.out.println(br.readLine());*/    //这里的结果是null

        //如果返回的结果是null表示已经读取完成
        //转成循环
        String str=null;
        while ((str=br.readLine())!=null){
            System.out.println(str);
        }
    }
}
