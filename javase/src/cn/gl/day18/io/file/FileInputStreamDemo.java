package cn.gl.day18.io.file;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建文件字节输入流对象
        FileInputStream fin=new FileInputStream("D:\\abc\\abc.txt");

      /*  //读取数据
        //返回的是字节对应字符的编码值
        System.out.println(fin.read());
        System.out.println(fin.read());
        System.out.println(fin.read());
        System.out.println(fin.read());
        //以-1结束
        System.out.println(fin.read());*/
        //自建缓冲区
        byte[] bs=new byte[38];
        int len=-1;
        while ((len=fin.read(bs))!=-1){//每次返回的是字节个数
            //保证前后编码一致
            System.out.println(new String(bs,0,len,"GBK"));
        }
    }
}
