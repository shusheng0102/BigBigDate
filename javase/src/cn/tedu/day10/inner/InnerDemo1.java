package cn.tedu.day10.inner;

public class InnerDemo1 {

    public static void main(String[] args) {
        //创建外部类对象
        Outer1 o1=new Outer1();
        o1.m();//调用的是方法内部类所在的方法
    }
}

//外部类
class Outer1{
    //属性
    int i=1;
    static int j=2;
    //方法
    public void m(){
        int x=100;
        x=10;//隐式常量---在代码底层自动添加final---jdk1.8开始的
             //显式常量---在JDK1.7极其以前需要手动添加final
        //方法内部类
        //只能定义非静态的属性和方法
        //可以进行继承和实现
        //没有访问权限修饰符但是可以被abstract和final分别修饰
        //内部类可以获取外部类所有的属性和方法
        class Inner1 extends Object implements Cloneable{
            final static int k=10;//定义静态常量
            public void n(){
                System.out.println(i);//外部类的属性
                System.out.println(j);//外部类的静态属性
                //System.out.println(x=3);方法内部类只能拿到当前方法的常量
            }
        }
        //在本方法中创建方法内部类的对象
        Inner1 in1=new Inner1();
        in1.n();

    }
}




