package cn.tedu.zk;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class ZookeeperDemo {
    ZooKeeper zk;
    //连接zookeeper
    @Before
    public void connect() throws IOException, InterruptedException {
        // connectString - 连接地址+端口号
        // sessionTimeout - 回话超时时间，默认单位是毫秒
        // watcher - 监控者
        // Zookeeper底层是利用Netty来进行连接
        // Netty是一个基于NIO的异步非阻塞框架
        // 也就意味着Zookeeper的连接过程是一个非阻塞过程
        // 监控和连接过程是异步的
        CountDownLatch cdl=new CountDownLatch(1);
        zk=new ZooKeeper(
                "10.42.189.171:2181",//连接地址
                5000,               //4000-40000之间
                new Watcher() {
                    public void process(WatchedEvent event) {
                        //判断是否连接上
                        if(event.getState()==Event.KeeperState.SyncConnected){
                            System.out.println("连接成功");
                            cdl.countDown();
                        }
                    }
                }
        );
        cdl.await();
        System.out.println("finish");
    }

    // 创建节点
    @Test
    public void createNode() throws KeeperException, InterruptedException {

        // path - 节点路径
        // data - 数据
        // acl - 权限策略
        // createMode - 节点类型
        // 返回值表示节点名字
        String name = zk.create("/log", "logs".getBytes(),
                ZooDefs.Ids.OPEN_ACL_UNSAFE,
                CreateMode.PERSISTENT);
        System.out.println(name);

    }

    // 修改数据
    @Test
    public void setData() throws KeeperException, InterruptedException {
        // final String path, byte data[]
        // int version - 数据版本 - dataVersion
        // 在修改数据的时候，要保证版本一致
        // 不然修改失败
        // 返回值表示节点信息
        // 如果version为-1，则忽略版本校验必须执行
        Stat s = zk.setData("/log",
                "log servers".getBytes(), -1);
        System.out.println(s);
    }

    // 获取数据
    @Test
    public void getData() throws KeeperException, InterruptedException {
        // String path, Watcher watcher, Stat stat
        // Stat s = new Stat();
        // byte[] data = zk.getData("/log", null, s);
        byte[] data = zk.getData("/log", null, null);
        System.out.println(new String(data));
    }

    // 删除节点
    @Test
    public void deleteNode() throws KeeperException, InterruptedException {
        // String path, int version
        // 这个方法要求节点为空
        zk.delete("/log", -1);
    }


    // 获取子节点
    @Test
    public void getChildren() throws KeeperException, InterruptedException {

        // 返回值是子节点的名字
        List<String> list = zk.getChildren("/", null);
        for (String s : list) {
            System.out.println(s);
        }
    }

    // 判断节点是否存在
    @Test
    public void exist() throws KeeperException, InterruptedException {
        // 返回值是Stat对象
        // 如果节点不存在，则返回值是null
        // 如果节点存在，则返回这个节点的节点信息
        Stat s = zk.exists("/zookeeper", null);
        System.out.println(s);
    }
}
