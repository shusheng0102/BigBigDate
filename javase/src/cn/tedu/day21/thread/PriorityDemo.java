package cn.tedu.day21.thread;

public class PriorityDemo {

    public static void main(String[] args) {
        //创建线程对象
        Thread t1=new Thread(new PDemo(),"A");
        Thread t2=new Thread(new PDemo(),"B");

        //设置优先级
        t1.setPriority(1);
        t2.setPriority(10);

        //开启线程
        t1.start();
        t2.start();
    }
}


//
class PDemo implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<=10;i++) {
            System.out.println(Thread.currentThread().getName() + "," + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
