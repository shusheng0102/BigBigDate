package cn.tedu.day13.string;

import java.io.UnsupportedEncodingException;

public class StringDemo2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //
        String str="字符串";
        //默认平台码是按照GBK来进行编码（看软件是否指定了其他码表）
        //软件指定了编码为u8，字符串三个文字转成了9个字节
        byte[] bs=str.getBytes();
        //把9个字节按照每两个字节一组转成文字---字符串
        //出现4个半字的情况---前后使用的码表不一致造成的
        //String s=new String(bs,"GBK");
        //可以把字节数组的部分信息转成字符串
        String s=new String(bs,0,6);
        System.out.println(s);
        //
        System.out.println(bs.length);
    }
}
