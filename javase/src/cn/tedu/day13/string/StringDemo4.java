package cn.tedu.day13.string;

public class StringDemo4 {
    public static void main(String[] args) {
        /*//
        String str1="abc";
        //str1=str1.intern();//false---没有改变
        String str2=new String("abc");
        //str2=str2.intern();//true  把堆内存的指向转到常量池
        System.out.println(str1==str2);*/

        //
        String str="";//空串
        String s=new String();//空串---有内存空间没有元素值
        //NullPointerException---用null去调用方法或者属性
        //null是指没有任何引用指向内存空间
        String string=null;
        //判断字符串内容是否为空
        System.out.println(string.isEmpty());
    }
}
