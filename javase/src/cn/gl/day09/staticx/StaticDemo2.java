package cn.gl.day09.staticx;

public class StaticDemo2 {
    public static void main(String[] args) {
        //创建向上造型
        SD s=new SD1();
        //重写是运行时多态的体现形式---针对的都是对象---对象级别
        //静态方法与类同级---类级别
        s.m();
    }
}


//
class SD{
    public static void m(){
        System.out.println("父类");
    }
    public void n(){}
}

class SD1 extends SD {
    //没有重写
    //@Override加入注解报错表面下面的方法不是重写方法
    public static void m(){
        System.out.println("子类");
    }
    @Override
    public void n(){}//就是一个重写方法
}