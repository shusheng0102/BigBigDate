package cn.gl.day19.io.memory;

import java.io.IOException;
import java.io.StringWriter;

public class StringWriterDemo {

    public static void main(String[] args) throws IOException {
        //创建对象---没有指定位置的构造方法---往内存里写
        StringWriter sw=new StringWriter();
        //写数据
        sw.write("anc");//往内存里写
        //关流
        sw.close();

    }
}
