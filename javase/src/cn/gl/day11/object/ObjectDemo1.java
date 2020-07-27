package cn.gl.day11.object;

public class ObjectDemo1 implements Cloneable {
    int i=1;
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建对象
        ObjectDemo1 od=new ObjectDemo1();
        //ObjectDemo1类默认继承Object类所以可以调用Object类里方法
        //CloneNotSupportedException---克隆不支持异常
        //实现Cloneable接口的类产生的对象才支持克隆
        //Cloneable接口仅仅只是标记实现的类的对象支持克隆
        ObjectDemo1 od1=(ObjectDemo1) od.clone();
        //
        System.out.println(od1.i);
        //前后地址值不一样
        //说明是把原对象的信息拷贝一份放到新的堆内存里
        System.out.println(od==od1);

    }
}

class ODemo{
    public void m(){
        ObjectDemo1 od=new ObjectDemo1();
        //protected修饰的信息如果在其他类位置且有继承关系那么子类对象一定要在本类中使用
        //od.clone();

        //向上造型的对象可以调用那些方法看父类
        //od1对象就是Obejct类的对象
        //就是在用Object对象调用Object类里protected修饰的信息
        //是在其他类位置且不是继承关系所有调不到
        Object od1=new ODemo();
        Object od2=new Object();
        //od1.clone();
        //od2.clone();//没有继承关系突破不了其他类位置
    }
}
