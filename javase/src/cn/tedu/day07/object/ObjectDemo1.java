package cn.tedu.day07.object;

public class ObjectDemo1 {
    //快捷键:f2快速定位代码中错误代码
    public static void main(String[] args) {
        //创建Person类的对象
        //Person类的对象是p对象P
        //new用于开辟新的堆空间
        //Person()---调用构造方法
        //构造方法就是在构建对象
        Person p=new Person(4);//在调用有参构造
        //给对象的属性赋予值
        //.代表"的"的意思
        p.name="lili";
        p.gender='女';

        /*//基本类型数据传的是值的拷贝
        m(p.age);
        n(p);*/
        //输出对象的属性值
        System.out.println(p.name+","+p.gender+","+p.age);
    }
    //静态方法
    public static void m(int i){
        i++;
    }
    public static void n(Person p){//表示形参要接受一个Person类的对象
        p.age=10;//找到原堆内存并改变了值
    }
}


//代表人的类
class Person{
    //特征---属性(代表类的一部分信息)
    //变量在类内方法外
    String name;//static修饰属性---静态属性
    int age;//非静态属性
    char gender;

    //如果一个类中没有手动定义一个构造方法，那么在底层JVM会默认创建一个无参构造
    //如果一个类中定义了任意形式的构造方法底层都不会再创建无参构造
    //构造方法:1、没有返回值类型表示  2、与类同名
    //public Person(){}

    //定义有参构造
    //支持重载
    public Person(int age){//方法遵循就近原则
        //=左边的age是非静态的属性
        //应该通过对象调用这个age
        //Person p=new Person(6);//构造方法本来就是用于构建对象
        //this---代表的就是当前类的对象
        this.age=age;//在给对象属性初始化
    }
    //允许普通方法与类同名
   //public void Person(){}
    //行为---方法
    //非静态方法
    public void eat(){
        System.out.println(name+"在吃饭...");
    }
    public void sleep(){
        System.out.println(name+"在睡觉...");
    }
}
