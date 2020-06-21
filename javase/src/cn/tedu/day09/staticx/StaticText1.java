package cn.tedu.day09.staticx;

public class StaticText1 {
    public static void main(String[] args) {
        //java在程序执行时分成类级别和对象级别
        //每个级别都是先父后子
        new ST2();
        new ST2();
    }
}


class ST1{
    //静态属性
    static ST3 st3=new ST3();//只加载一次---只创建一个ST3对象
    static {
        System.out.println("ST1 a");
    }
    {
        System.out.println("ST1 b");
    }
    public ST1(){
        System.out.println("ST1 c");
    }
}

class ST2 extends ST1 {
    static {
        System.out.println("ST2 a");
    }
    {
        System.out.println("ST2 b");
    }
    public ST2(){
        System.out.println("ST2 c");
    }
}

class ST3{
    public ST3(){
        System.out.println("ST3");
    }
}

class ST4 extends ST3 {
    public ST4(){
        System.out.println("ST4");
    }
}



