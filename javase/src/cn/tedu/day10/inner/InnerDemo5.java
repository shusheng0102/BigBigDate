package cn.tedu.day10.inner;

public class InnerDemo5 {
    //默认被static修饰
    interface IDemo2{}
    public static void main(String[] args) {
        System.out.println(ODemo.IDemo1.j);
    }
}


interface ODemo{
    //接口内部定义一个类
    //默认被static修饰
     class IDemo{
         static int i=1;
    }
    //内部接口
    //默认被static修饰
    interface IDemo1{
         static int j=2;
    }
}