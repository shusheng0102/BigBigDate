package cn.tedu.day16.list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        //创建ArrayList的对象
        ArrayList<String> list=new ArrayList<>();


        //添加元素
        list.add("1");
        list.add("13");
        list.add("41");
        list.add("71");

        //调用iterator方法
        //返回迭代器
        Iterator<String> in =list.iterator();
        //通过循环实现迭代遍历
        while (in.hasNext()){//判断是否还有其他元素
            //获取下一个元素
            String s=in.next();
            //依次把原集合里的元素进行删除
            //通过改变标记值在最后进行比较时就会自动把false对应的元素进行删除
            //in.remove();
            //因为之后要比较标记值，如果不符就会报错
            //不符---直接删除原集合的元素，但是标记值还是true
            list.remove(s);
            System.out.println(s);
        }
        System.out.println(list);
    }
}
