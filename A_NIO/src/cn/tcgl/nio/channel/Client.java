package cn.tcgl.nio.channel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class Client {

    public static void main(String[] args) throws IOException, InterruptedException {

        // 开启客户端通道
        SocketChannel sc = SocketChannel.open();
        // 手动设置为非阻塞
        sc.configureBlocking(false);
        // 发起连接
        // 如果设置为非阻塞,那么试图连接一次
        // 无论是否连接上,都会继续往下执行
        sc.connect(new InetSocketAddress("localhost", 8090));

        // 因为设置为非阻塞,所以需要手动判断连接是否建立
        // 如果连接多次都没有成功,则说明这个连接无法建立
        // 如果连接无法建立,放弃连接并且提示异常

        while (!sc.isConnected()) {
            // finishConnect这个方法在底层会自动计数  20-30
            sc.finishConnect();
        }
        // 如果连接成功
        // 给服务器端发送数据
        // 需要将数据封装到ByteBuffer中
        ByteBuffer buffer = ByteBuffer.wrap("hello server".getBytes());
        // 写出数据
        sc.write(buffer);

        // Thread.sleep(30);
        Thread.sleep(1000);

        // 接收服务器打回的消息
        ByteBuffer dst = ByteBuffer.allocate(1024);
        sc.read(dst);
        System.out.println(
                new String(dst.array(), 0, dst.position()));

        // 关流
        sc.close();
    }
}
