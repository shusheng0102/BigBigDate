package cn.gl.day17.type;

import java.util.ArrayList;
import java.util.List;

public class TypeDemo1 {

    public static void main(String[] args) {
        //创建集合对象---没有使用泛型
        List list=new ArrayList();
        //最常用---jdk1.7出现----三种方式都可以-----现在第一种最常用
        List<String> list1=new ArrayList();
        List<String> list2=new ArrayList<String>();
        List list3=new ArrayList<String>();

        /*//添加元素---Object
        list.add(1);
        list.add(true);
        list.add("abc");
        list.add(2.3);

        //获取元素
        for(Object i:list){
            //获取每个集合里的元素
            if(i instanceof Integer){
                Integer in =(Integer) i;
            }else if(i instanceof Boolean){
                Boolean b=(Boolean) i;
            }
        }*/
    }
}
