package cn.gl.day22.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassDemo3 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取String的字节码对象
        Class<String> clz=String.class;
//        //获取有参构造方法----参数填入是类型的字节码对象
//        Constructor<String> c =clz.getConstructor
//                (char[].class,boolean.class);

//        //可以获取指定的构造方法
//        Constructor<String> c=clz.getDeclaredConstructor
//                (char[].class,boolean.class);
//        //暴力破解
//        c.setAccessible(true);
//        //执行有参构造
//        String str=c.newInstance(new char[]{'1','2','5'},true);
//        System.out.println(str);

        //获取所有指定的构造方法放到一个数组中
        Constructor[] cs=clz.getDeclaredConstructors();
        //遍历数组·
        for(Constructor c:cs){
            System.out.println(c);
        }
    }
}
