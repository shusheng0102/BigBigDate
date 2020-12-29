package cn.tedu.zk;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
public class ZookeeperDemo2 {
    ZooKeeper zk;

    // 连接Zookeeper
    @Before
    public void connect() throws IOException, InterruptedException {
        CountDownLatch cdl = new CountDownLatch(1);
        zk = new ZooKeeper(
                "10.42.189.171:2181",
                5000,
                new Watcher() {
                    @Override
                    public void process(WatchedEvent event) {
                        if (event.getState() == Event.KeeperState.SyncConnected)
                            System.out.println("连接成功");
                        cdl.countDown();
                    }
                });
        cdl.await();
    }

    // 监控节点数据是否发生变化
    @Test
    public void dataChanged() throws Exception {
        while (true) {
            CountDownLatch cdl = new CountDownLatch(1);
            zk.getData("/log", new Watcher() {
                @Override
                public void process(WatchedEvent event) {
                    if (event.getType() == Event.EventType.NodeDataChanged)
                        // 实际过程中需要去记录日志
                        System.out.println("节点数据发生改变");
                    cdl.countDown();
                }
            }, null);
            cdl.await();
        }
    }

    // 监控子节点个数变化
    @Test
    public void childrenChanged() throws KeeperException, InterruptedException {

        CountDownLatch cdl = new CountDownLatch(1);
        zk.getChildren("/log", new Watcher() {
            @Override
            public void process(WatchedEvent event) {
                if (event.getType() == Event.EventType.NodeChildrenChanged)
                    System.out.println("子节点个数发生变化");
                cdl.countDown();
            }
        });
        cdl.await();
    }

    // 监听节点的增删
    @Test
    public void nodeChanged() throws KeeperException, InterruptedException {

        CountDownLatch cdl = new CountDownLatch(1);
        zk.exists("/video", new Watcher() {
            @Override
            public void process(WatchedEvent event) {
                if (event.getType() == Event.EventType.NodeCreated)
                    System.out.println("节点被创建~~~");
                else if (event.getType() == Event.EventType.NodeDeleted)
                    System.out.println("节点被删除~~~");
                cdl.countDown();
            }
        });
        cdl.await();
    }
}
