package cn.tedu.day20.thread;

public class WaitNotifyDemo {

    public static void main(String[] args) {
        Product p=new Product();
        p.setCount(100);
        //开启线程---模型生产和消费
        new Thread(new Manufacture(p)).start();
        new Thread(new Manufacture(p)).start();
        new Thread(new Manufacture(p)).start();
        new Thread(new Consumer(p)).start();
        new Thread(new Consumer(p)).start();
        new Thread(new Consumer(p)).start();
    }
}


//代表生产的类---模拟线程生产的过程
class Manufacture implements Runnable{
    private Product p;
    public Manufacture(Product p){
        this.p=p;
    }
    //模拟生产
    @Override
    public void run() {
        while (true){
            synchronized (p){
                //if (p.flag==false)//线程不会回头执行代码
                while (p.flag==false)
                //让线程等待
                try {
                    p.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //可以生产的最大范围
                int count=1000-p.getCount();
                //随机生产数量
                int rancount=(int)(Math.random()*(count+1));
                //设置商品数量
                p.setCount(p.getCount()+rancount);
                //输出
                System.out.println
                        ("此次生产了" + rancount +
                                "个商品,还剩余"
                                + p.getCount() + "个商品...");

                //唤醒
                //p.notify();//随机唤醒一个
                p.notifyAll();
                //改变布尔值
                p.flag=false;

            }
        }
    }




}


//代表消费的类---模拟线程消费的过程
class Consumer implements Runnable{
    //
    private Product p;
    public Consumer(Product p){
        this.p=p;
    }
    //线程消费的过程
    @Override
    public void run() {
        while (true) {
            synchronized (p) {//锁对象
                //if(p.flag==true)
                while (p.flag==true)
                //线程的等待
                try {
                    p.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //获取剩余商品数量
                int count = p.getCount();
                //获取此次随机消费的商品数量
                int rancount = (int) (Math.random() * (count + 1));
                //设置商品数量
                //剩余数量-消费数量
                p.setCount(count - rancount);
                //输出结果
                System.out.println
                        ("此次消费了" + rancount +
                                "个商品,还剩余" + p.getCount() + "个商品...");
                //唤醒
                //p.notify();
                p.notifyAll();
                //
                p.flag=true;
            }


        }

    }
}


//代表商品的类
class Product{
    //商品数量
    private int count;
    //
    boolean flag=true;
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}



