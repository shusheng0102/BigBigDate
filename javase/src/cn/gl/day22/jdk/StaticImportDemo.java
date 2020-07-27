package cn.gl.day22.jdk;
//静态导入
//import static java.lang.Math.abs;
//*是通配符，默认匹配Math类下的所有静态信息

import static java.lang.Math.abs;
import static java.lang.Math.random;

public class StaticImportDemo {

    public static void main(String[] args) {
        //
        System.out.println(Math.round(3.4));
        //静态导入的信息可以直接使用
        System.out.println(abs(-1));
        System.out.println(random());
    }
}
