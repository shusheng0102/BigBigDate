package cn.gl.day10.inner;

public class InnerDemo3 {
    public static void main(String[] args) {
        //创建静态内部类对象
        //new Outer3.Inner3()   外部类直接点出内部类
        Outer3.Inner3 in3=new Outer3.Inner3();
    }
}


//外部类
class Outer3{
    //属性
    static int k=1;
    //静态内部类
    //可以定义所有的属性和方法以及静态常量
    //可以被继承与实现
    //可以被访问权限修饰符以及final、abstract修饰
    //只能拿到外部类的静态属性和方法
    static class Inner3 extends Object implements Cloneable{
        final static int i=10;
        public void n(){
            System.out.println(k);
        }
    }
    //方法
    public void m(){}
}
