package cn.gl.day16.list;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        //创建栈对象
        Stack<String> s=new Stack<>();
        //入栈
        s.push("a");
        s.push("g");
        s.push("ak");
        s.push("ra");

        //出栈--但是不删除
        //输出的是栈顶元素
        //System.out.println(s.peek());

        //出栈---删除
        //输出的是栈顶元素并且删除元素
        //System.out.println(s.pop());

        //从栈顶往下依次查找是否有相等的元素
        //返回的是从1开始计数的位置值
        System.out.println(s.search("g"));

        //保证输出还是和存放顺序一致
        System.out.println(s);
    }
}
