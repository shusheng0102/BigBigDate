package cn.tedu.day09.text;

public class ShapeText {

    public static void main(String[] args) {
        //获取图形的周长和面积
        Shape s1=new Rectangle(4,5);//向上造型
        System.out.println(s1.getGirth());
        System.out.println(s1.getArea());
    }

}


//代表图形的类
class Shape{
    //属性---长和宽
    private double x;
    private double y;
    //右击选中Generate...   选中getter and setter
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

    //有参构造---给属性赋值
    public Shape(double x,double y){
        this.x=x;
        this.y=y;
    }

    //求周长
    public double getGirth(){
        return 0.0;//不知道子类是具体什么图形
    }
    //求面积
    public double getArea(){
        return 0.0;//不知道子类是具体什么图形
    }
}

//代表矩形类
class Rectangle extends Shape {
    //有参构造
    public Rectangle(double x, double y) {
        super(x, y);//调用父类有参构造
    }

    //求周长和面积
    //对父类的周长和面积的方法进行重写
    //ctrl+o---展示出可以重写父类的所有方法
    //@...   注解  给计算机看的注释
    //@Override表示下面的方法一定是重写方法
    @Override
    public double getGirth() {
        return 2*(getX()+getY());//求矩形的周长
    }

    @Override
    public double getArea() {
        return getX()*getY();//求矩形面积
    }
}


//表示正方形
class Square extends Rectangle {
    //有参构造x
    public Square(double x) {
        super(x, x);
    }
}


//表示圆形
class Circle extends Shape {

    public Circle(double r) {
        super(r, r);
    }

    @Override
    public double getGirth() {
        return 2*3.14*getX();
    }

    @Override
    public double getArea() {
        return 3.14*getX()*getX();
    }
}

















