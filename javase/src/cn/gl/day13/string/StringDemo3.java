package cn.gl.day13.string;

public class StringDemo3 {
    public static void main(String[] args) {
        /*String str="abc";
        String s=new String("abc");
        //String对Object里的hashcode方法进行重写
        //如果长度大于0最后的哈希码值就和字符串的里的内容（顺序）
        System.out.println(str.hashCode());
        System.out.println(s.hashCode());*/


        //
        String str1="wdvbfgvbfmvbf";
        String str2="vf";
        //返回子串第一个字符在原串的第一次出现的下标
        //如果没有找到就返回-1
        System.out.println(str1.indexOf(str2));
        //从指定的下标(包含)开始往后从查找返回第一个出现的下标值
        System.out.println(str1.indexOf(str2,3));


    }
}








