package cn.tedu.day07.object;

public class ThisDemo {
    public static void main(String[] args) {
        //创建Student类对象
        Student s1=new Student();//调用无参构造
        Student s2=new Student("lili");

        //s1对象的地址值和无参构造里的this值一样
        //this指代成当前类创建出来的对象
        System.out.println("s1:"+s1);
        //s2对象的地址值和有参构造里的this值一样
        System.out.println("s2:"+s2);
        //对象调用方法
        //通过s1对象调用的方法
        //study方法里this的地址值就和s1地址值一样
        //this指代成当前类正在使用的对象
        s1.study();

    }
}


//代表学生的类
class Student{
    //属性
    String name;
    int age;
    char gender;
    //学号
    String no;

    //无参构造
    public Student(){
        //输出的是this对象地址值
        //System.out.println("this:"+this);
    }

    //有参构造
    public Student(String name){
        //对对象的属性进行初始化
        this.name=name;
        //输出的是this对象地址值
        //System.out.println("this:"+this);
    }
    //有参构造
    public Student(String name,int age){
        //不想出现下面重复代码而且需要正常的属性初始化
        //调用上面的构造方法---Student(String name)
        //Student(name);通过调用方法的格式调用不到构造方法
        //this语句---在构造方法中调用其他形式的构造方法
        //一定要放在首行
        this(name);//this(构造方法参数类的值)
        //this.name=name;
        this.age=age;
    }

    //行为---方法
    public void study(){
        //可以代表（指代）成当前类还没有创建的对象
        System.out.println(this.name+"在学习...");
        //输出的是this对象地址值
        System.out.println("this:"+this);
    }
}
