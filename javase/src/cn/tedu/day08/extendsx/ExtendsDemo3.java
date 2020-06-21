package cn.tedu.day08.extendsx;

public class ExtendsDemo3 {
}


class EDemo{
    //private修饰的方法是私有方法，对子类不可见
   private void m(){}
   //void n(){}//父类对子类可见方法
}

class EDemo1 extends EDemo {
    //父类含有对应的不可见方法，那么子类可以随意定义方法
    int m(){
        return 1;
    }
    //子类对父类可见方法进行重写
    //要遵守重写原则---如下的重写出错了
    //int n(){return 1;}

}