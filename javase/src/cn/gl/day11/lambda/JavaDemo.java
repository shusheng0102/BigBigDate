package cn.gl.day11.lambda;

public class JavaDemo {
    public static void main(String[] args) {
        //c就是匿名内部类的对象
       /* Calc c=new Calc() {
            @Override
            public int sum(int m, int n) {
                return m+n;
            }
        };*/

        //Lambda表达式
        //lambda表达式用于重写方法
        //Calc c=(int m,int n)->{return m+n;};
        //如果重写方法的方法体只有一句话就可以省略{}以及return
        //Calc c=(int m,int n)->m+n;
        //从接口中就能解析出参数列表的数据类型，从前推导出后面的数据类型
        //接口名 对象名称=(接口方法的参数列表)->{重写抽象方法}
        // 使用Lambda表达式的前提是接口只有一个抽象方法
        Calc c=(m, n)->m+n;
        System.out.println(c.sum(4,5));
    }
}


//代表计算器
//函数式接口---只有一个抽象方法
//面向函数式编程
@FunctionalInterface
interface Calc{
    //求和
    int sum(int m, int n);//抽象方法
}

//把A类对象创建出来调用重写的sum方法用于求和
class A implements Calc {

    @Override
    public int sum(int m, int n) {
        return m+n;
    }
}
