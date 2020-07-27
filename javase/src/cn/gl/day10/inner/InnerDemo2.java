package cn.gl.day10.inner;

public class InnerDemo2 {
    public static void main(String[] args) {
        //创建成员内部类对象
        //Outer2.inner2代表就是内部类的类型
        //new Outer2().new inner2()外部类调用属性（内部类---对象）
        Outer2.inner2 in2=new Outer2().new inner2();
    }
}


//外部类
class Outer2{
    //属性
    static int i=1;

    //成员内部类
    //可以定义所有非静态的属性和方法以及静态常量
    //可以被四种访问权限修饰符以及final、abstract修饰
    //可以获取外部类的所有属性和方法
    class inner2 extends Object implements Cloneable{
        final static int j=2;
        public void n(){
            System.out.println(i);//静态和非静态都可以拿到
        }
    }
    //方法
    public void m(){}
}

