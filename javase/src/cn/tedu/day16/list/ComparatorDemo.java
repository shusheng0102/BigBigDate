package cn.tedu.day16.list;

import java.util.ArrayList;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        //创建列表对象
        List<String> list=new ArrayList<>();
        //添加元素
        list.add("a1");
        list.add("sdhfv13");
        list.add("41");
        list.add("xcv71");

        //调用sort方法返回比较器
        //Comparator比较器
        /*list.sort(new Comparator<String>() {
            //重写compare方法---指定比较器的规则
            //如果在比较器中指定了规则比较器就会把所有的集合元素依次进行比较
            //比较元素首字母升序
            @Override
            public int compare(String o1, String o2) {
                //比较元素的首字母
                //如果返回的是正数表示前面的比后面大
                //如果返回的是负数表面前面比后面的小
                return o1.charAt(0)-o2.charAt(0);
            }
        });*/
        //Lambda表达式
        list.sort((str1,str2)->str1.charAt(0)-str2.charAt(0));
        //
        System.out.println(list);
    }
}
