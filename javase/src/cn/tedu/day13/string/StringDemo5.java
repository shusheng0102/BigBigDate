package cn.tedu.day13.string;

import java.util.Arrays;

public class StringDemo5 {
    public static void main(String[] args) {
        //
        //String str="e";
        //[待匹配的内容]---匹配内容中的任意一个
        //[起始-结束]---匹配范围内的任意一个
        //System.out.println(str.matches("[a-z]"));//匹配小写英文字母任意一个
        //匹配数字0-9
        //\\d--字符串转义字符--\d--正则转义--d---[0-9]
        //"\t"  't'
        //matches方法主要的功能是根据正则提供的语法对字符串进行匹配
        //System.out.println(str.matches("\\d"));


        //
        /*String str="ehf5gvb456ie8h7rv";
        //把原串中所有和指定字符相等的字符替换成新的字符
        //System.out.println(str.replace('e','+'));
        //根据正则匹配到的信息进行替换
        System.out.println(str.replaceAll("e",""));*/




        //
        String str="78dfhv5sdhv69fvb5h77";
        //通过正则匹配的信息变成字符串的切割符
        //切割符在前面切出,空格，有几个就切出几个
        //切割符在末尾就随着切掉
        //切割符在中间有几个就切出几个
        String[] ss=str.split("\\d");
        //遍历
        System.out.println(Arrays.toString(ss));
    }
}
