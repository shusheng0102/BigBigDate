package cn.gl.day15.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //创建集合列表对象
        List<String> list=new ArrayList<>(0);//实现类
        //往集合列表添加元素
        list.add("ac");
        list.add("abc");
        list.add("ghj");
        list.add("123");
        list.add("123");
        list.add(null);
        //插入
        /*list.add(0,"www");//从0开始
        list.add(6,"qqq");*///插入的下标和元素个数一致---添加

        //删除集合元素---根据元素进行删除
      /*  list.remove("123");
        //如果要删除的元素不存在就跳过不执行
        list.remove("jjj");*/
        //根据下标进行删除
        //如果下标不存在---报错提示下标越界
        //list.remove(5);

        //清空集合元素
       // list.clear();

        //判断是否包含此元素
        //System.out.println(list.contains("123"));

        //根据下标获取集合元素
        //System.out.println(list.get(0));

        //返回的就是元素在集合中第一次出现的下标值
        //System.out.println(list.indexOf("123"));

        //判断集合是否为空---集合元素个数是否为0
        //System.out.println(list.isEmpty());

        //替换
        /*list.remove(0);
        list.add(0,"abc");*/
        //list.set(0,"abc");

        //返回元素个数
        //System.out.println(list.size());

        //截取子列表
        //左包右不包
        //System.out.println(list.subList(0,3));

        //把集合元素转成一个数组
        //Object[] os=list.toArray();
        String[] ss=list.toArray(new String[3]);//字符串的数组对象
       /* for(Object i:os){
            String s=(String)i;//把Object类型转成字符串类型
            System.out.println(s);
        }*/
        //输出
        System.out.println(list);

    }
}
