package cn.tedu.day12.string;

import java.util.Arrays;

public class StringDemo3 {
    public static void main(String[] args) {
        //字符串对象
        String str="sadhgfcevy";
        //返回指定下表的字符
        //System.out.println(str.charAt(6));

        //遍历输出字符串的字符
        //length()---方法---返回字符串长度值
        /*for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }*/

        //字符串转成字符数组
        char[] cs=str.toCharArray();
        //字符数组转成字符串
        //String s=new String(cs);
        //把字符数组的部分信息转成字符串
        String s=new String(cs,2,3);
        System.out.println(s);
        //遍历字符数组
        System.out.println(Arrays.toString(cs));
    }
}
