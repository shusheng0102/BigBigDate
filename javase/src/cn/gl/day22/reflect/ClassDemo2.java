package cn.gl.day22.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassDemo2 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //String的字节码对象
        Class<String> clz=String.class;
        //字节码通过调用newInstance()生成实例对象
        //newInstance()没有参数调用无参构造创建的实例对象
        //String s=clz.newInstance();

        //String str=new String("abc");
        //获取代表构造方法的类产生的对象
        Constructor<String> c =clz.getConstructor(String.class);
        //执行构造方法---给构造方法进行赋值---产生实例对象
        String s=c.newInstance("abc");


        //通过反射调用Integer类里的有参构造生成实例对象
        //1获取Integer的字节码对象
        Class<Integer> clz1=Integer.class;
        //2.通过字节码对象获取类里的有参构造
        Constructor<Integer> c1=clz1.getConstructor(int.class);
        //3.执行有参构造---赋值--实例对象
        Integer in=c1.newInstance(123);
        System.out.println(in);
    }
}
