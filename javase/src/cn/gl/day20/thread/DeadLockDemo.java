package cn.gl.day20.thread;

public class DeadLockDemo {
    private static Print p=new Print();
    private static Scann s=new Scann();

    public static void main(String[] args) {
        //模拟两个员工去干活---用两个线程去是实现
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                //先打印在扫描
                synchronized (p){//锁住打印对象
                    p.print();
                    //休眠
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //扫描---锁住
                    synchronized (s){
                        s.scan();
                    }
                }
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                //先扫描在打印
                synchronized (s){
                    s.scan();
                    //休眠
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //
                    synchronized (p){
                        p.print();
                    }
                }
            }
        });

        //开启线程，员工开始工作
        t1.start();
        t2.start();
    }



}


class Print{
    public void print(){
        System.out.println("呼哧呼哧的打印...");
    }
}

class Scann{
    public void scan(){
        System.out.println("赤赤的扫描...");
    }
}
