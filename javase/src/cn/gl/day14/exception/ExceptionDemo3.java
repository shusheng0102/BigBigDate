package cn.gl.day14.exception;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo3 {


}


class EDemo1{
    //方法的重载和异常没有关系
    public void m()throws IOException {}
    public void m(int i){}
}


class EDemo2 extends EDemo1 {
    //进行重写时子类重写方法抛出的编译时异常要是父类的编译时异常的子类或者本类
    //子类不能抛出比父类更大范围的异常
    @Override
    public void m()throws EOFException,FileNotFoundException,NullPointerException {}
}





