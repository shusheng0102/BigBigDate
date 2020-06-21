package cn.tedu.day08.extendsx;

public class ExtendsDemo2 {

    public static void main(String[] args) {
        B b=new B();
        b.m();
    }
}


class A{
    private int a=2;//对象调用信息所在位置
}

class B extends A {
    public void m(){
        //创建A类对象
        //A a=new A();
        //a.a;
        //匿名对象
        //System.out.println(new A().a);//对象所在位置
    }
}
