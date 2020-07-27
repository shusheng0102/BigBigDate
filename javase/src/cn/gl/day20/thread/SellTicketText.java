package cn.gl.day20.thread;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SellTicketText {
    public static void main(String[] args) throws IOException {
        //读取Properties文件
        Properties p=new Properties();
        p.load(new FileInputStream("ticket.properties"));
        int count=Integer.parseInt(p.getProperty("count"));
        //创建代表票的类
        Ticket t=new Ticket();
        //设置票数
        t.setTicket(count);

        //通过卖票类构建Thread类对象
        //四个售票员
        //传入统一的一个对象 t   四个售票员共卖100张票
        Thread t1=new Thread(new SellTicket(t),"A");//后面的参数指定线程名称
        Thread t2=new Thread(new SellTicket(t),"B");
        Thread t3=new Thread(new SellTicket(t),"C");
        Thread t4=new Thread(new SellTicket(t),"D");

        //开启线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}


//卖票类---表示线程执行的内容---模拟线程卖票的过程
class SellTicket implements Runnable{
    //定义票数---非静态无法共享
    //private static int count=100;

    //属性
    private Ticket t;
    //有参构造
    public SellTicket(Ticket t){
        this.t=t;
    }
    //卖票的过程
    @Override
    public void run() {

        //用while循环来表示卖票的重复动作
        while(true){
            //synchronized (t){//锁对象---线程共享---共享资源
            //synchronized (SellTicket.class){//类的字节码---类的信息
            synchronized (Math.class){//方法区的资源
                if (t.getTicket()<=0)//有线程抢占---判断需要加锁
                    break;
                try {
                    //休眠---强制线程休眠---等一段时间往下执行
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //票数减1--设置新的票数
                t.setTicket(t.getTicket()-1);
                //输出每次卖票结果
                //Thread.currentThread().getName()---当前正在执行线程的名称
                System.out.println
                        (Thread.currentThread().getName()
                                +"卖了一张票，还剩"+t.getTicket()+"张票...");
            }

        }
    }
}

//代表票的类
class Ticket{
    //代表票数的属性
    private int ticket;

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }
}
