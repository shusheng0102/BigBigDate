package cn.tedu.day14.exception;

public class ExceptionDemo7 {

    public static void main(String[] args) {
        System.out.println(m());
    }

    public static Person m(){
        Person p1=new Person();
        p1.name="lili";
        p1.age=10;
        p1.gender='女';
        try{
            //代码执行到这一行把内容进行挂起
            //return p1(地址值)
            //当finally块执行结束p1指向的堆内存的元素也改变了
            //返回的就是tom
           return p1;
        }finally {
            //就把p1地址值指向的堆内存元素改变了
            p1.name="tom";
            p1.age=20;
            p1.gender='男';
        }
    }
}


class Person{
    String name;
    int age;
    char gender;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
