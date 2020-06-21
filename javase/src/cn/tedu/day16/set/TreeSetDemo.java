package cn.tedu.day16.set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        /*List<String> list=new ArrayList<>();
        //添加元素
        list.add("anc");
        list.add("ouw");
        list.add("b");
        list.add("abc");
        //输出的是存放元素的顺序
        System.out.println(list);*/

        //
       /* TreeSet<String> set=new TreeSet<>();
        set.add("anc");
        set.add("ouw");
        set.add("b");
        set.add("abc");*/

         //创建TreeSet对象
        TreeSet<Person> t=new TreeSet<>();
        //添加元素
        t.add(new Person("张飞",30,32));
        t.add(new Person("刘备",35,59));
        t.add(new Person("关羽",33,89));
        t.add(new Person("诸葛亮",28,120));
        t.add(new Person("赵云",25,100));

        //把集合里的元素转成数组
        Person[] ps=t.toArray(new Person[0]);
        //遍历数组
        //System.out.println(Arrays.toString(ps));
        for(Person i:ps){
            System.out.println(i);
        }
    }
}


//实现Comparable接口
class Person implements Comparable<Person>{
    //属性
    String name;
    int age;
    int score;
    public Person(String name,int age,int score){
        this.name=name;
        this.age=age;
        this.score=score;
    }
    //重写compareTo方法---指定排序规则
    @Override
    public int compareTo(Person o) {
        //对分数进行排序
        //返回值是正数说明前面的比后面的大
        //返回值是负数说明前面比后面小
        return this.score-o.score;//前面对象的分数和后面对象的分数之差
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}




