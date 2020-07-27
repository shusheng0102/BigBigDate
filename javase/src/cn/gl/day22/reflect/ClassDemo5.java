package cn.gl.day22.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassDemo5 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //
        Class<String> clz=String.class;
        //获取指定的方法
        //指定方法名以及方法参数类型
        Method m =clz.getDeclaredMethod("charAt",int.class);
        //对象
        String str="wsdcghwhd";
        //调用方法执行
        //str.charAt(3)
        System.out.println(m.invoke(str,3));
    }
}
