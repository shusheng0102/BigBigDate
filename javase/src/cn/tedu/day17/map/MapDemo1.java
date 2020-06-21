package cn.tedu.day17.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {

    public static void main(String[] args) {
        //创建映射对象
        Map<String,Integer> m=new HashMap<>();

        //添加元素
        //键不能重复，键不能保证存放的顺序---键是由HashMap来进行存储的
        m.put("小椅子",198);
        m.put("小李子",190);
        m.put("小张三",180);
        m.put("小亮子",199);
        m.put("小梅子",191);
        m.put("小黑子",180);//允许值重复
        //如果键出现重复会把键舍弃掉，值会进行覆盖

        m.put("小李子",200);
        //m.put(null,null);
        //是否包含的键或者值
        System.out.println(m.containsKey("123"));
        System.out.println(m.containsValue(200));

        //把映射中的所有键值对放到Set集合中---映射的键不能重复
        Set<Map.Entry<String,Integer>> s=m.entrySet();

        //把映射中所有的键放到Set集合中
        Set<String> s1=m.keySet();

        //根据相应的键返回对应的值
        //如果键不存在，返回的结果就是null
        System.out.println(m.get("莉莉"));    //但是不能反推



        //根据键删除键值对
        //如果键不存在就不删除
        m.remove("小梅子");
        //根据键值对进行删除
        //如果键值对不存在就不会删除
        m.remove("小黑子",190);
        System.out.println(m);
    }
}
