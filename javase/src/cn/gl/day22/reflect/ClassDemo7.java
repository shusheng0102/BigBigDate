package cn.gl.day22.reflect;

import java.lang.reflect.Method;

public class ClassDemo7 {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<String> clz=String.class;
        //获取指定方法
        Method m =clz.getDeclaredMethod
                ("getBytes",
                        int.class,int.class,byte[].class,int.class);
        //获取参数类型
        Class[] cs=m.getParameterTypes();
        for(Class c:cs){
            System.out.println(c);
        }
    }
}
