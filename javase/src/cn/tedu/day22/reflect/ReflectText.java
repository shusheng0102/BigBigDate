package cn.tedu.day22.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectText {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException {
        //创建Person对象
        Person p1=new Person("lili");
        //p1.setName("lili");
        p1.setAge(20);
        //调用克隆方法返回克隆对象
        Person p2=(Person) clone(p1);
        System.out.println(p2.getName()+","+p2.getAge());
    }

    //实现克隆方法
    /*public static Object clone(Object obj) throws IllegalAccessException, InstantiationException {
        //1.获取字节码对象
        Class<Object> clz= (Class<Object>) obj.getClass();
        //2.生成实例对象---克隆对象
        //改善前
        Object o=clz.newInstance();
        //3.获取原对象所有的属性值
        Field[] fs =clz.getDeclaredFields();
        //4.把原对象的属性值赋值给实例对象
        for(Field f:fs){
            //暴力破解
            f.setAccessible(true);
            //获取原对象所有的属性值
            Object value=f.get(obj);
            //把获取的到的属性值赋值给实例对象
            f.set(o,value);
        }
        //返回实例对象---克隆对象
        return o;
    }*/
    public static Object clone(Object obj) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        //1.获取字节码对象
        Class<Object> clz= (Class<Object>) obj.getClass();
        //2.生成实例对象---克隆对象
        //改善后
        //获取构造方法--保证一定能拿到一个构造方法
        //获取的就是数组的第一个元素
        Constructor<Object> c=
                (Constructor<Object>) clz.getDeclaredConstructors()[0];
        //获取构造方法上所有参数类型
        Class[] cs=c.getParameterTypes();
        //用于存储初始值数组
        Object[] os=new Object[cs.length];
        //遍历数组，依次判断参数类型再进行赋值
        for(int i=0;i<cs.length;i++){
            //判断参数类型
            if(cs[i].isPrimitive()){//判断是否是基本类型
                if(cs[i]==boolean.class){
                    os[i]=false;
                }else if(cs[i]==char.class){
                    os[i]='\u0000';
                }else {
                    os[i]=0;//剩下的其他基本类型都可以接受0
                }
            }else{//引用类型
                os[i]=null;
            }
        }
        //执行构造方法---把存储初始值的数组传入到newInstance
        Object o=c.newInstance(os);

        //3.获取原对象所有的属性值
        Field[] fs =clz.getDeclaredFields();
        //4.把原对象的属性值赋值给实例对象
        for(Field f:fs){
            //暴力破解
            f.setAccessible(true);
            //获取原对象所有的属性值
            Object value=f.get(obj);
            //把获取的到的属性值赋值给实例对象
            f.set(o,value);
        }
        //返回实例对象---克隆对象
        return o;
    }
}


class Person{
    private String name;
    private int age;
    //有参构造---没有提供无参
    public Person(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


