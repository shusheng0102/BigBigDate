package cn.gl.day09.finalx;

public class FinalDemo3 {
}


class FDemo1{
    //最终方法可以重载
    public final void m(){}
    public final void m(int x){}
}

class FDemo2 extends FDemo1 {
    //public final void m(){}//不能重写
}