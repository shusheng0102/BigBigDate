package cn.gl.day09.finalx;

public class FinalDemo2 {
}


class FDemo{
    //成员变量在创建对象后就可能使用
    //final int i;//成员变量
    //静态常量
    static final int i;
    //保证在类加载完成之前给值
    static {
        i=7;
    }
//    //保证在对象创建之前给值
//    {
//        i=1;
//    }
//    public FDemo(){
//       //i=2;
//    }
}
