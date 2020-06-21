package cn.tedu.day22.reflect;

import java.lang.reflect.Field;

public class ClassDemo4 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //获取字节码对象
        Class<String> clz=String.class;
        //获取指定的属性---hash被pivate修饰
        Field f =clz.getDeclaredField("hash");
        //暴力破解
        f.setAccessible(true);

        //字符串对象
        String s="abc";
        System.out.println(s.hashCode());
        //改变获取的属性值
        //第一个参数代表要去改变哪个对象的属性
        //第二个参数确定具体改变对象的属性值
        f.set(s,3);
        System.out.println(s.hashCode());
        //获取属性值
        System.out.println(f.get(s));

    }
}
