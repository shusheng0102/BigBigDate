package cn.tedu.day19.io.memory;

import java.io.IOException;
import java.io.StringReader;

public class StringReaderDemo {
    public static void main(String[] args) throws IOException {
        //
        String s="abc";
        //创建对象
        StringReader sr=new StringReader(s);
        //读取是内存中的‘a’
        System.out.println(sr.read());


//        ByteArrayInputStream
//        ByteArrayOutputStream
    }

}
