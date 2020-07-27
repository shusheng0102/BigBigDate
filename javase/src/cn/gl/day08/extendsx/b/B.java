package cn.gl.day08.extendsx.b;


import cn.gl.day08.extendsx.a.A;

public class B extends A {
    public static void main(String[] args) {
        //调用A类中的m方法
       /* A a=new A();
        //a对象在B类中，m方法在A类里
        //此时两者的位置关系其他类位置
        //protected修饰的m方法不能在这个被访问
        a.m();*/

        //创建了A类子类B的对象
        B b=new B();
        //protected修饰的m方法能在这个被访问(有父子关系)
        b.m();
    }
}


class C extends A {
    void n(){
       C c=new C();
       c.m();
       B b=new B();
       //如果父子类是其他类位置关系，父类含有protected修饰的信息
        //要保证子类的对象只能在本类中才能调用父类信息
       //b.m();
    }
}
