package cn.tedu.day08.extendsx;

public class ExtendsDemo1 {
    public static void main(String[] args) {
        //创建医生类的对象
        //子类对象
        Doctor d=new Doctor();
        d.treat();//调用子类的方法
    }
}


//代表医疗人员类
//父类、超类
class 医疗人员{
    //属性
    String name;
    int age;
    char gender;
    //科室
    String dept;

    //方法
    public void treat(){
        System.out.println(this.name+"在治病救人...");
    }
}


//表示医生的类
//extends让医生类和医疗人员类产生关联关系---继承
//子类、派生类
class Doctor extends 医疗人员 {
    //医生治病救人的方式
    public void treat(){
        System.out.println(name+"拿着手术刀在治病救人...");
    }
}


//表示护士类
class Nurse extends 医疗人员 {
    //护士治病救人的方式
    public void treat(){
        System.out.println(name+"拿着针管在治病救人...");
    }
}












