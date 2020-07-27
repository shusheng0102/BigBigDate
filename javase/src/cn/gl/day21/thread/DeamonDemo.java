package cn.gl.day21.thread;

public class DeamonDemo {

    public static void main(String[] args) {
        //创建线程对象---小兵
        Thread t1=new Thread(new Soilder(),"小兵一号");
        Thread t2=new Thread(new Soilder(),"小兵二号");
        Thread t3=new Thread(new Soilder(),"小兵三号");
        Thread t4=new Thread(new Soilder(),"小兵四号");

        //设置成守护线程
        t1.setDaemon(true);
        t2.setDaemon(true);
        t3.setDaemon(true);
        t4.setDaemon(true);

        //开启线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        //BoSS---被守护线程
        for (int i=20;i>=0;i--){
            System.out.println("BOSS还剩"+i+"滴血...");
        }
    }
}


//代表小兵的类---线程类
class Soilder implements Runnable{

    @Override
    public void run() {
        for (int i=50;i>=0;i--){
            System.out.println
                    (Thread.currentThread().getName()+
                            "还剩"+i+"滴血...");
            //休眠
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
