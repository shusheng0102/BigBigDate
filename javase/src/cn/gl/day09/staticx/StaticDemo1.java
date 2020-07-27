package cn.gl.day09.staticx;

public class StaticDemo1 {
    static int a;
    //非静态方法
    public void m(){
        n();//非静态的属性和方法已经产生说明静态的信息一定已经产生了
        System.out.println(a);//调用的是静态属性
    }
    public static void n(){
        //m();//静态方法与类同级先于对象存在，调用不到还没产生的信息
        System.out.println(a);//静态方法调用静态属性
    }
    public static void main(String[] args) {
       //创建Person类对象
       Person p1=new Person();
       //给对象属性赋值
        p1.name="张三丰";
        p1.age=108;
        p1.gender='男';

        Person p2=new Person();
        p2.name="郭襄";
        p2.age=24;
        p2.gender='女';
        System.out.println(p1.toStrong());
        System.out.println(p2.toStrong());
    }
}


//表示人的类
class Person{
    //属性
    String name;
    int age;
    static char gender;
    //定义输出对象属性值的方法
    public String toStrong(){
        return name+","+age+","+gender;
    }
}
