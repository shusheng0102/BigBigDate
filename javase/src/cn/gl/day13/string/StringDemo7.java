package cn.gl.day13.string;

public class StringDemo7 {
    public static void main(String[] args) {
        //把布尔值转成字符串
        //String s=String.valueOf(true);
        //把小数转成字符串
        /*String s=String.valueOf(4.5);
        System.out.println(s);*/

        //
        int[] arr={3,4,5};
        //底层依赖于String.valueOf()把整型数组的对象转成字符串对象---调用toString()
        //就是拼接地址值
        System.out.println(arr);
        char[] cs={'7','8','y'};
        //没有转成字符串没有调用toString(),会把内容打印输出
        //System.out.println(cs);
        //输出的是数组的地址值
        System.out.println(cs.toString());
    }
}









