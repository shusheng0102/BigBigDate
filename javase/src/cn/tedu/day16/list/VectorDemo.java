package cn.tedu.day16.list;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        //创建Vector对象
        //自增量表示的是指定每次扩容增加的量
        Vector<String> v=new Vector<>(10,5);
        //
        for (int i=0;i<16;i++){
            v.add("a");
        }
        //容量
        System.out.println(v.capacity());

    }
}
