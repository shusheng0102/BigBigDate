package cn.gl.day07.fengzhuang;

public class FZDemo {
    public static void main(String[] args) {
        //创建Teacher类对象
        Teacher t=new Teacher();
        //给对象的属性赋值
        t.name="lili";
        //t.age=-29;
        t.setAge(-10);
        t.gender='女';
        System.out.println(t.getAge());
    }
}


//表示老师的类
class Teacher{
    //属性
    String name;
    //private---修饰属性---私有化属性
    //对象在类的外边拿不到
    private int age;
    char gender;

    //定义出这个方法让对象调用---获取私有化属性值
    public int getAge(){
        //把私有化属性age的值进行返回
        return age;
    }
    //定义这个方法让对象调用---给私有化属性赋值
    public void setAge(int age){
        //判断参数是否是非负整数
        if(age<0)
            System.out.println("输入错误数据");
        else
            this.age=age;//给对象属性赋值
    }
    //方法外类内不能书写语句---流程控制语句都不行
   /* public Teacher(int age){
        //判断参数是否是非负整数
        if(age<0)
            System.out.println("输入错误数据");
        else
            this.age=age;//给对象属性赋值
    }*/

}
