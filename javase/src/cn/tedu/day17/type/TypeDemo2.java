package cn.tedu.day17.type;

import java.util.ArrayList;
import java.util.List;

public class TypeDemo2 {

    public static void main(String[] args) {
        //创建集合对象
        List<Integer> list1=new ArrayList<>();
        //添加元素
        list1.add(1);
        list1.add(4);
        list1.add(7);
        list1.add(2);
        List<Double> list2=new ArrayList<>();
        //添加元素
        list2.add(1.0);
        list2.add(1.4);
        list2.add(0.7);
        list2.add(1.2);
        List<String> list3=new ArrayList<>();
        //添加元素
        list3.add("a");

        //List<Number> list=new ArrayList<Double>();
        //        //java泛型没有向上造型
        m(list1);
        m(list2);
//        m(list3);
    }
    //只接受数字类型的元素
    //<? extends Number>---可以传入Number类及其子类
    //<? extends 类/接口>---可以传入本类及其子类或者接口及其实现类
    //泛型的上限
   public static void m(List<? extends Number> list){//默认接受Object类型
        for (Object i:list){
            System.out.println(i);
        }

   }



   //定义以String为下限
    //泛型下限
    public static void n(List<? super String> list){

    }




}
