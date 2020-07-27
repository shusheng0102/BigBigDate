package cn.gl.day20.thread;

public class RunnableDemo {

    public static void main(String[] args) {
        //根据Runnable实现类的对象构建Thread类对象
        //Thread是Runnable接口的实现类，RDemo也是实现类
        //Thread类给RDemo增强方法---start()
        //装饰者设计模式
        Thread t=new Thread(new RDemo());

        //开启线程
        t.start();

        //主方法也是线程
        for(int i=20;i>=0;i--)
            System.out.println("main"+i);
    }

}


//类存储线程的内容
class RDemo implements Runnable{
    //重写方法---线程执行的任务
    @Override
    public void run() {
        for (int i=0;i<20;i++)
            System.out.println("i"+i);
    }
}
