package cn.gaolei.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 冷夜雨花未眠
 * @create 2020/3/23 0023-23:16
 *
 * txt文件的复制
 */
public class CopyText0<main> {
    public static void main(String[] args) {
        FileReader read=null;
        FileWriter writer=null;
        try {
            //对象初始化
                //获取数据
            read=new FileReader("D:\\1.txt");
                //存储数据
            writer=new FileWriter("D:\\abc\\2.txt");//abc的路径要自建
            //自建数据
            char[] cs=new char[1024*1024];
            int len=-1;
            while ((len=read.read(cs))!=-1){
                writer.write(new String(cs),0,len);
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (writer!=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    writer=null;
                }
            }
            if (read!=null){
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
