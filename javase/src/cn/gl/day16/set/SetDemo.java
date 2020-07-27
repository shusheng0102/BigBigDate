package cn.gl.day16.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        //创建Set集合对象
        Set<String> set=new HashSet<>();
        //添加元素
        set.add("wer");
        set.add("45r");
        set.add("w89r");
        set.add("wersr5");
        set.add("wefgwer");
        set.add("79wer");
        set.add("09wer");
        set.add("7wer");
        //添加重复元素
        set.add("wer");

        //不保证存放的顺序
        System.out.println(set);

    }
}
