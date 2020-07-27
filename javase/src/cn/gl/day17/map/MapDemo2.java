package cn.gl.day17.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * hashmap的遍历
 */
public class MapDemo2 {

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

        //先把映射中所有的键存放到Set集合中
        Set<String> s =m.keySet();
        //增强for循环---迭代器
        for(String i:s){//i代表映射中的每个键
            //根据键获取值
            System.out.println(i+":"+m.get(i));
        }

        //Set<Map.Entry<String, Integer>> s1=m.entrySet();

    }
}
