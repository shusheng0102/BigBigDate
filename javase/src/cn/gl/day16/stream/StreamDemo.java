package cn.gl.day16.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        //创建集合对象
        List<String> list=new ArrayList<>();

        //添加元素
        list.add("C");
        list.add("JAVA");
        list.add("C++");
        list.add("C#");
        list.add("Python");
        list.add("PHP");
        list.add("GO");
        //输出以C开头的元素
        /*for(String l:list){
            //判断是否以C开头
            if(l.startsWith("C")){
                System.out.println(l);
            }
        }*/

        //调用Stream方法返回时操作集合的流式结构---Stream
        Stream<String> s =list.stream();
        //
        /*s.filter(new Predicate<String>() {
            //筛选的规则
            @Override
            public boolean test(String s) {
                return s.startsWith("C");
            }
        }).forEach(new Consumer<String>() {
            //把筛选之后的元素进行输出
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        //通过Lambda表达式来实现---输出以C开头的元素接着进行排序转小写
        s.filter(str1->str1.startsWith("C")).
                sorted((s1,s2)->s2.compareTo(s1)).//排序
                map(ss->ss.toLowerCase())//转小写
                .forEach(str2-> System.out.println(str2));//输出

    }
}
