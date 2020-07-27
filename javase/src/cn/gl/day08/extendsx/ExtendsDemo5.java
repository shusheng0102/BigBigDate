package cn.gl.day08.extendsx;

public class ExtendsDemo5 {
    public static void main(String[] args) {
        //创建子类对象
        new EB();//EB b1=new EB();等效
       // new EB().b//EB b2=new EB();
    }
}

class EA{
    //属性---属于对象级别
    //属性和构造代码块谁在前谁先执行
    EC c=new EC();//成员变量给值
    //int a=1;//成员变量给值
    {
        System.out.println("EA 1");
    }

    public EA(){
        System.out.println("EA 2");
    }


}

class EB extends EA {

    {
        System.out.println("EB 1");
    }

    public EB(){
        System.out.println("EB 2");
    }
}

class EC{
    public EC(){
        System.out.println("EC");
    }
}
