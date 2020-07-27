package cn.gl.day08.duotai;

public class DTDemo {
    public static void main(String[] args) {
        /*//告诉别人想养宠物
        //声明---Pet类型的对象p
        Pet p;
        //养具体的宠物
        //初始化---给值
        p=new Dog();*/

        //想养一个宠物，这个宠物是狗
        //如果左边类型是声明类型---父类  右边是实际创建对象类---子类
        //向上造型  p就是向上造型的对象
        Pet p=new Dog();
        //调用方法
        //方法的执行看子类
        p.eat();
        //调用的是父类方法子类没有重写只执行父类的方法
        p.sleep();
        //乐意调用哪些方法看父类
        //p.bark();


       //证明向上造型是运行时多态
       m(new Cat());
       m(new Dog());
}
    //接受宠物类对象
    public static void m(Pet p){//=new Cat()  =new Dog();
        p.eat();//只有等到运行时期才能确定具体是哪个子类对象才能知道调用哪个子类的方法
    }
}


//代表宠物的类
class Pet{
    //方法
    public void eat(){
        System.out.println("在吃东西...");
    }
    public void sleep(){
        System.out.println("在睡觉...");
    }
}

//代表狗的类
class Dog extends Pet {
    //对父类的eat方法进行重写
    public void eat(){
        System.out.println("在呼呼呼的吃...");
    }
    public void bark(){
        System.out.println("在汪汪汪的叫...");
    }
}

//代表猫的类
class Cat extends Pet {
    //对父类的eat方法进行重写
    public void eat(){
        System.out.println("在优雅的吃...");
    }
    public void 磨爪子(){
        System.out.println("在咔哧咔哧的磨...");
    }
}

