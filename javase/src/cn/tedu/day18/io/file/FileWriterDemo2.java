package cn.tedu.day18.io.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {
    public static void main(String[] args) {
        //2.为了能让流对象在finally块使用在外部声明赋值为null
        FileWriter writer=null;
        try {
            //流对象真正的初始化在try块里
             writer=new FileWriter("D:\\1.txt");//创建对象有可能抛出异常
             writer.write("123");//写数据也有可能抛出异常
            //5.如果关流操作失败的时间在自动冲刷之前就可能会导致数据丢失
            //需要手动冲刷
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //1.不管对象是否创建成功都要关流
            //3.如果流对象初始化成功才去关流---判断是否为null
            if(writer!=null)
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                //4.无论关流成功还是失败都要置流对象的值为null
                //代码执行到此流对象肯定不为null
                writer=null;
            }
        }
    }
}
