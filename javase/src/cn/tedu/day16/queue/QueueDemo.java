package cn.tedu.day16.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        //创建队列对象
        Queue<String> q=new LinkedList<>();
        //获取队头元素
        //如果队列没有元素---NoSuchElementException
        //System.out.println(q.element());
        //获取队头元素---队列没有元素时返回null
        System.out.println(q.peek());
    }
}
