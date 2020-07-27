package cn.gl.day11.object;

public class ObjectDemo5 {
    public static void main(String[] args) {
        //创建对象
        Person p1=new Person();
        p1.name=null;
        p1.age=10;
        p1.gender='女';
        Person p2=new Person();
        p2.name=new String("lili");
        p2.age=10;
        p2.gender='女';
        //Object类里的equals方法判断的是两个对象的地址值是否相等
        //如果只是按照Object里默认的equals方法只能比较对象的地址值这样比不全面
        //所有需要重写Object里的equals方法
        System.out.println(p1.equals(p2));


    }
}

//表示人的类
class Person{
    //属性
    String name;
    int age;
    char gender;

    //重写Object里的equals方法
    @Override
    public boolean equals(Object obj) {
       //1.判断前后两个对象的地址值是否相等
        if(this==obj){//this---指代当前类的对象
                      //this代表的是哪个对象调用equals
            return true;
        }

       //2.判断参数是否为null
       if(obj==null){//表面参数对象没有对应的内存空间
           return false;
       }

      //3.判断前后两个对象的类型是否一致
      if(this.getClass()!=obj.getClass()){
          return false;
      }

      //obj对象调用不到Person类里的属性转型成Person类
        Person p=(Person) obj;

      //4.比较属性值是否相等
      //比较age值
        if (this.age != p.age) {//前后两个对象的age值
            return false;
        }
        //age值一致比较gender值
        if (this.gender != p.gender) {//前后两个对象的gender值
            return false;
        }

        //age值一致，gender值一致比较name值
        //this.name是一个字符串（String类）对象
        //调用的equals是String类里重写的方法---先比较地址值，再比较内容
        //this.name的值为null，用null值调用方法---没有指向任何内存空间还要去调用内存上的方法
        if(this.name==p.name||this.name!=null&&this.name.equals(p.name)){
            return true;
        }
        //只有name值不相等的情况
        return false;

    }
}
