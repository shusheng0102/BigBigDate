package cn.tedu.day08.extendsx;

public class ExtendsDemo4 {
    public static void main(String[] args) {
        //创建猪类对象
        Pig p=new Pig("lili");
        //p.eat();//调用的是子类的重写方法
    }
}


//表示动物的类
class Animal{

    //父类的构造方法
    public Animal(){
        System.out.println("父类无参构造方法");
    }
    public Animal(String name){
        System.out.println("父类有参构造方法");
    }
    //方法
    public void eat(){
        System.out.println("在吃东西...");
    }
    public void sleep(){
        System.out.println("在睡觉...");
    }
}

//表示猪的类
class Pig extends Animal {

    //父类构造方法优先于子类构造方法先执行
    //父类优先于子类存在
    //子类任意形式的构造方法都要默认先执行父类无参构造
    public Pig(){
        //如果子类任意形式的构造方法都没有手写调用父类构造方法
        //JVM就会默认在所有的子类构造方法前加上调用父类无参构造的语句
        //super语句---在子类的构造方法中用于调用父类构造方法
        super();//JVM会默认添加一个super语句无参---调用父类无参构造
        System.out.println("子类无参构造方法");
    }

    public Pig(String name){
        //super();//JVM会默认添加一个super语句无参---调用父类无参构造
        //调用父类的有参构造
        super("lili");
        System.out.println("子类有参构造方法");
    }


   //对父类的eat方法进行重写
   public  void eat(){
       System.out.println("在无忧无虑的吃...");
       System.out.println("吃了很多....");
       System.out.println("吃饱了...想睡觉");

       //sleep方法是一个非静态方法
       //在java中所有的非静态属性和方法都可以通过对象调用
       //this---代表当前类（子类）的对象---sleep方法是父类方法
       //super---代表的就是父类对象
       super.sleep();
   }


}

