package cn.gl.day13.baozhuang;

public class BZDemo3 {
    public static void main(String[] args) {
        //把字符串转成包装类
        //NumberFormatException--数字格式异常
        //字符串中开头可以含有+和-
        //除了+和-，数字字符，其他的任意字符都不能写入
        //Integer in=new Integer("0x123");

        //提供大量的静态方法---把字符串转成相应的基本类型，包装类型
        int in=Integer.parseInt("345");
        double d=Double.parseDouble("3.45");

        System.out.println(in);
    }
}
