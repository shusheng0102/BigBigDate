package cn.tedu.day16.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorText {
    public static void main(String[] args) {
        //创建Vector对象
        Vector<String> v=new Vector<>();
        //添加元素
        v.add("abc");
        v.add("c");
        v.add("ac");
        v.add("abc2");

        //调用elements()返回Enumeration
        //返回Enumeration时=是最古老的迭代器
        Enumeration<String> e =v.elements();
        //通过循环来实现迭代器遍历
        while(e.hasMoreElements()){//判断下一个是否还有元素
            //获取下一个元素
            String s=e.nextElement();
            System.out.println(s);
        }
    }
}
