package cn.gl.day19.junit;


import org.junit.Test;

public class JunitDemo {
    //单元测试
    //三无---没有参数、没有返回值、没有static修饰
    @Test
    public void sum(){//限定下面的方法
        System.out.println(1);
        n(1,2);
        //return 1;
    }

    public void n(int m,int n){
        System.out.println(m+n);
    }
}
