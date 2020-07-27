package cn.gl.day22.jdk;

public class EnumDemo {
    public static void main(String[] args) {
        //外界获取对象
        Season s= Season.spring;
        //Season.autumn=null;//外界不能随意的改变对象的值

        switch (s){//表达式支持枚举类型
            case spring:
                System.out.println("踏青");
                break;
            case summer:
                System.out.println("钓鱼");
                break;
            case autumn:
                System.out.println("扫落叶");
                break;
            case winter:
                System.out.println("吃火锅");
                break;
            default:
                System.out.println("睡觉...");
        }
    }
}


//枚举类
enum Season{
    //列举的值（枚举常量）一定要在枚举类的首行
    //spring等效public final static Season spring=new Season();
    spring{//枚举类对象需要对抽象方法进行重写
           //是通过匿名内部类来进行重写的
        @Override
        public void play() {
            System.out.println("放风筝");
        }
    },summer(10) {//通过有参构造创建对象
        @Override
        public void play() {
            System.out.println("游泳");
        }
    },autumn {
        @Override
        public void play() {
            System.out.println("爬山");
        }
    },winter {
        @Override
        public void play() {
            System.out.println("打雪仗");
        }
    };
    int age;//属性
    public void m(){}//方法
    //构造方法---私有化
    private Season(){}
    private Season(int age){
        this.age=age;
    }
    //可以定义抽象方法但是需要枚举类变成抽象或者枚举常量需要重写抽象方法
    public abstract void play();
}




//代表季节类---可以提供对象但是外部不能随意创建
/*class Season{
    //构造方法私有化
    private Season(){}
    //自己创建对象往外提供
    public final static Season spring=new Season();
    public final static Season summer=new Season();
    public final static Season autumn=new Season();
    public final static Season winter=new Season();

}*/
