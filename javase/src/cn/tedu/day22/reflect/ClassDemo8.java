package cn.tedu.day22.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ClassDemo8 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //泛型规定元素类型是整型
        List<Integer> list=new ArrayList<>();
        //添加元素
        list.add(133);

        //获取字节码对象
        //泛型限定集合元素类型---编译时期
        //反射操作---运行时期
        Class<List> clz= (Class<List>) list.getClass();
        //获取指定方法
        Method m =clz.getDeclaredMethod("add",Object.class);
        //执行方法
        m.invoke(list,"abc");
        System.out.println(list);
    }
}
