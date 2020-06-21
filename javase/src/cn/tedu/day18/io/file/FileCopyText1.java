package cn.tedu.day18.io.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyText1 {

    public static void main(String[] args) {
        //在try块外声明文件字符流对象
        FileReader read=null;
        FileWriter writer=null;
        try{
            //进行对象的初始化
            //指明从哪获取数据
            read=new FileReader("D:\\1.txt");
            //指明往哪存储数据
            writer=new FileWriter("D:\\abc\\2.txt");

            //自建缓冲区
            char[] cs=new char[1024*1024];
            int len=-1;//用于接受获取的字符个数
            while ((len=read.read(cs))!=-1){//如果返回值是-1循环结束
                //往外写出数据
                writer.write(new String(cs,0,len));
                //冲刷
                writer.flush();
            }
        }catch (IOException e){

        }finally {
            //判断字符输出流对象是否为null
            if(writer!=null)
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    writer=null;
                }

            //判断字符输入流对象是否为null
            if(read!=null) {
                try {
                    read.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    read=null;
                }
            }
        }
    }
}
