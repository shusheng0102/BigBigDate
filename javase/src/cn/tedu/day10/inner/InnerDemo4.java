package cn.tedu.day10.inner;

public class InnerDemo4 {
    //如果匿名内部类在成员位置就按成员内部类使用
    B b=new B(){};
    public static void main(String[] args) {
        //{}---匿名内部类
        //匿名内部类在继承类/实现接口并进行重写
        //类/接口可以被继承或者实现就能具有匿名内部类的形式
        //如果匿名内部类出现的位置在方法内就和方法内部类使用一致
        //c就是匿名内部类的对象
        C c=new C() {
            int i=1;//属性
            @Override
            public void m() {

            }
        };

        //普通类具有匿名内部类的形式
        B b=new B(){};//{}---匿名内部类

        //接口具有匿名内部类的形式
        A a=new A() {//{}--匿名内部类
        };
    }
}

interface A{}

class B{}

//
abstract class C{
    public abstract void m();//抽象方法
    public void  n(){}//实体方法
}
