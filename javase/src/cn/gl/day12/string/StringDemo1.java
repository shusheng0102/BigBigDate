package cn.gl.day12.string;

public class StringDemo1 {
    public static void main(String[] args) {
        //创建字符串对象
        //s1引用指向方法区常量池的"ab"
        String s1 = "ab";
        //s2引用指向堆内存
        String s2 = new String("ab");
        //在常量池中如果已经有字符串直接量，后面定义的字符串直接量如果和前面一致就共有一个
        //s3的引用直接指向s1的地址值
        String s3 = "ab";
        //如果=右边参与运算的数据都是直接量java在编译时期会进行优化
        //直接计算结果值再进行赋值---s4="ab";
        String s4 = "a" + "b";
        String s5 = "a";
        //s5=s5+"b";
        //s5=new StringBuilder(s5).append("b").toString();
        //s5引用指向堆内存
        s5 += "b";
        //
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s3);//true
        System.out.println(s1 == s4);//true
        System.out.println(s1 == s5);//false
        //s2和s5两个引用指向堆里不同区域
        System.out.println(s2 == s5);//false

    }
}
