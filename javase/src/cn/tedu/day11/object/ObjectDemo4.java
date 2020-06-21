package cn.tedu.day11.object;

public class ObjectDemo4 {
    public static void main(String[] args) {
       /* //创建对象
        ObjectDemo4 od=new ObjectDemo4();
        //Object类里的toString()用于拼接地址值最后把地址值拼接成字符串进行返回
        System.out.println(od.toString());
        //在底层会默认通过对象调用Object类里的toString()
        //最后输出的结果一致是因为println方法的重载,相当于调用不同的重载方法
        System.out.println(od);*/


       //
        Student s=new Student();
        s.name="lili";
        s.gender='女';
        s.age=10;
        //底层调用的是toString()---真正执行的是重写的方法
        System.out.println(s);

    }
}

class Student{
    //属性
    String name;
    int age;
    char gender;
    //java提供的自动生成toString()
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
    /* //重写Object的toString()
    //重写是为了直接输出对象时得到的是属性值
    @Override
    public String toString() {
        return name+","+age+","+gender;
    }*/
}
