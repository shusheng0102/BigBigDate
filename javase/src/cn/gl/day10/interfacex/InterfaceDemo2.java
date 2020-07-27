package cn.gl.day10.interfacex;

public class InterfaceDemo2 {
    public static void main(String[] args) {
        //向上造型
        B b=new C();
        //向下造型---为了调用子类独有方法
        //编译和运行都没问题
        //编译时期java会检测两个对象的声明类是否具有继承关系
        //如果具有继承关系编译通过
        //b对象的声明类是B类，c对象的声明类是C类具有继承关系编译通过
        //运行时期java会检测两个对象的实际创建类是否是同一个类
        //如果是同一个类就运行通过
        //b对象的实际创建类是C类，c对象的实际创建类就是C类，是同一个类就运行同通过
        C c=(C)b;
        //ClassCastException---类型转换异常
        //运行报错
        //b对象的实际创建类是C类，d对象的实际创建类是D类不是同一个类运行报错
        //D d=(D)b;
        //编译报错
        //c对象的声明类C类，d1对象的声明类是D类没有继承关系就编译报错
        //D d1=(D)c;

        //类与类是单继承形成数状结构---可以快速检测两个类是否具有继承关系
        //在两个类对象之间类型转换时才在编译时期有检测
        //接口与接口之间是多继承形成网状结构---不能快速检测两个接口之间的关系
        //java就规定其他类型的对象转成接口类型时就编译不检测运行检测是否具有实现关系
        A a=(A)b;
        A a1=(A)c;
        //
        System.out.println("over");
    }
}

interface A{}

class B{}

class C extends B {}

class D extends B {}
