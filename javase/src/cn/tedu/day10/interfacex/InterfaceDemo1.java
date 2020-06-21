package cn.tedu.day10.interfacex;

import org.omg.CORBA.Object;

public class InterfaceDemo1 {
    public static void main(String[] args) {
        //接口名调用属性i---i是被static修饰
        //System.out.println(Shape.i=2);//值不能代表表面被final修饰
    }
}

//接口---用interface来表示---接口不是类
//接口与接口之间是通过extends表示的关联关系---继承
//接口与接口之间是多继承 ---为了获取更多的抽象方法
interface Shape extends Cloneable, Object {
    //默认是被public、final、static共同修饰
    public final static int i=1;
    //默认被public、abstract共同修饰
    public abstract void m();
    //public Shape(){}不能定义构造方法
    //全部都是抽象方法---用于重写
    public abstract double getGirth();
    public abstract double getArea();
}

//通过Implements来表示接口与类之间的关系---实现
//类与接口是---多实现---为了重写更多的抽象方法---提供更多的功能
//普通类实现接口需要重写所有的抽象方法
//如果不想都成重写就变成抽象类
abstract class Rectangle extends InterfaceDemo1 implements Shape,Cloneable{
    //普通类实现了接口中的抽象方法
    /*@Override
    public double getGirth() {
        return 0;
    }*/
    //快捷键---ctrl+alt+l---格式化
    @Override
    public double getArea() {
        return 0;
    }
}
