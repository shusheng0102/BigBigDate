package cn.tedu.day07.object;

public class ObjectDemo2 {
    public static void main(String[] args) {
        //创建Baby类对象
        Baby b=new Baby();
        System.out.println(b.name+","+b.age);
    }
}


//代表婴儿的类
class Baby{
    //属性
    String name;
    int age;
    char gender;

    //构造代码块
    //可以对属进行初始化
    //在调用任意形式的构造方法时都会先执行构造代码块
    {
        this.name="lili";
        this.age=1;
        System.out.println("构造代码块");
    }

    //无参构造
    public Baby(){
        /*this.name="lili";
        this.age=1;*/
        System.out.println("无参构造");
    }

    //有参构造
    public Baby(String name){
        //属性初始化
        //this.name=name;
//        this.name="lili";
//        this.age=1;
    }

    //有参构造
    public Baby(String name,int age){
       /* this.name=name;
        this.age=age;*/
//        this.name="lili";
//        this.age=1;
    }

    //方法---行为
    public void cry(){
        System.out.println(name+"就在嗷嗷嗷的哭...");
    }
}

