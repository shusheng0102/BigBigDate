package cn.gl.day10.abstractx;

public class AbstractDemo {
    public static void main(String[] args) {
        //s是内部类的对象
        Shape s=new Shape(3,9) {
            @Override
            public double getGirth() {
                return 0;
            }
        };//匿名内部类
    }
}


//如果类中含有抽象方法这个类需要变成抽象类
abstract class Shape{
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Shape(double x,double y){
        this.x=x;
        this.y=y;
    }
    //方法没有方法体用abstract修饰时就变成了抽象方法
    //就是为了重写
    public abstract double getGirth();
    //普通方法---实体方法
    public double getArea(){
        return 0.0;
    }
}

//如果一个普通类继承了抽象类那么就要重写所有的抽象方法
//如果不想重写抽象类中所有的抽象方法就可以把这个普通类变成抽象类
abstract class Rectangle extends Shape {

    public Rectangle(double x, double y) {
        super(x, y);
        //    }
        //
        //    /*@Override
        //    public double getGirth() {
        //        return 2*(getX()+getY());
        //    }*/
        //    //块注释---ctrl+shift+?   取消再来一次
   /* @Override
    public double getArea() {
        return getX()*getY();
    }*/
    }
}

abstract class Square extends Rectangle {

    public Square(double x) {
        super(x, x);
    }
}

class Ciclr extends Shape {

    public Ciclr(double r) {
        super(r, r);
    }

    @Override
    public double getGirth() {
        return 2 * 3.14 * getX();
    }

    @Override
    public double getArea() {
        return 3.14 * getX() * getX();
    }
}








