package cn.gl.day09.staticx;

public class StaticDemo3 {
    public static void main(String[] args) {
       /* System.out.println(SA.i);//类名调用静态属性
        System.out.println(new SA().i);//对象调用*/

       //创建子类对象
        new SB();
        new SB();
    }
}

//
class SA{
    //静态属性
    static int i=1;
    //静态代码块---初始化静态属性---只加载一次
    static{
        i=10;
        System.out.println("静态代码块");
    }
    {
        System.out.println("父类构造代码块");
        i=100;//非静态直接调用静态信息
    }
    public SA(){
        System.out.println("父类构造方法");
    }
}

class SB extends SA {
    {
        System.out.println("子类构造代码块");
    }
    public SB(){
        System.out.println("子类构造方法");
    }
}
