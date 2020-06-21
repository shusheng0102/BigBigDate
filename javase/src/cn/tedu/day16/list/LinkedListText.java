package cn.tedu.day16.list;

import java.util.LinkedList;

//通过链表实现栈结构
//栈结构---先进后出
public class LinkedListText {
    public static void main(String[] args) {
        LinkedListStack list=new LinkedListStack();
        list.add("a");
        list.add("ab");
        list.add("ah");
        list.add("am");
        System.out.println(list);
    }
}


//表示实现的类
class LinkedListStack{
    //属性---LinkedList的对象
    private LinkedList<String> list=new LinkedList<>();

    //添加元素
    //保证最后一个存放的元素在链表的第一个
    public void add(String str){
        //把每次存放的元素都放到第一个节点中
        list.addFirst(str);
    }

    //获取元素
    public String get(){
        //判断链表中是否具有节点
        if(list.size()<=0)
            throw new IllegalArgumentException("size:"+list.size());
        //返回链表第一个节点
        return list.get(0);
    }

    //获取元素并删除
    public String getDel(){
        //获取元素
        String s=get();
        //删除第一个节点
        //删除最后存放的元素
        list.remove(0);
        //返回获取的元素
        return s;
    }

    public String toString(){
        return list.toString();
    }
}
