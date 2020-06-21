package cn.tedu.day17.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * hashmap的遍历
 */
public class MapDemo3 {
    public static void main(String[] args) {
        Map<String,Integer> m=new HashMap<>();

        //添加元素
        //键不能重复，键不能保证存放的顺序---键是由HashMap来进行存储的
        m.put("小椅子",198);
        m.put("小李子",190);
        m.put("小张三",180);
        m.put("小亮子",199);
        m.put("小梅子",191);
        m.put("小黑子",180);

        //先获取所有的键值对
        Set<Map.Entry<String,Integer>> s =m.entrySet();
        //遍历Set集合---增强for循环
        for(Map.Entry<String,Integer> i:s){//i代表每个键值对
            System.out.println(i.getKey()+":"+i.getValue());
        }

        //常用遍历
        for (Map.Entry<String,Integer> i:m.entrySet()){
            System.out.println(i.getKey()+":"+i.getValue());
        }

    }
}
