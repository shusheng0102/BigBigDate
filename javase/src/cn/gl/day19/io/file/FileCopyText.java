package cn.gl.day19.io.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyText {
    public static void main(String[] args) throws IOException {
        long start=System.currentTimeMillis();
        //创建文件字节输入流对象
        FileInputStream fis=new FileInputStream
                ("D:\\梦想啊.mp4");
        //创建文件字节输出流
        FileOutputStream   fos=new FileOutputStream
                ("D:\\abc\\梦想啊.mp4");

        //自建缓冲区
        //给定自建缓冲区长度---1.传输的次数、2.数组创建的空间
        byte[] bs=new byte[1024*1024];//100M
        int len=-1;
        while((len=fis.read(bs))!=-1){
            //往外写出
            fos.write(bs,0,len);
        }

        //关流
        fis.close();
        fos.close();
        long end=System.currentTimeMillis();
        //耗费的时间
        System.out.println(end-start);

    }
}
