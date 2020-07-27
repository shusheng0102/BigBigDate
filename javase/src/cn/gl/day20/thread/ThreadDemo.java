package cn.gl.day20.thread;

public class ThreadDemo {

    public static void main(String[] args) {
        //创建线程内容类对象
        TDemo t=new TDemo();

       //t.run();//调用是父类方法---不是开启线程
        //开启线程
        t.start();//调用父类的开启线程方法
        //主方法本身也是一个线程
        for (int i=20;i>=0;i--){
            System.out.println("main"+i);
        }
    }
}

//定义类---表示线程执行任务的内容
//继承Thread类---就是为了保证CPU可以去执行类里的内容
class TDemo extends Thread{

    //重写方法---线程将要执行的具体内容
    @Override
    public void run() {
       for (int i=0;i<20;i++){
           System.out.println("i"+i);
       }
    }
}
