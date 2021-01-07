package cn.tcgl.nio.channel;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * 	1. 用于进行TCP通信的通道
 * 	2. 需要进行连接的网络协议
 * 	3. 提供了连接、接收、读取、写入操作
 *  4. 客户端通道是SocketChannel，服务器端通道是ServerSocketChannel
 */
public class TCPDemo {
//    客户端
    @Test
    public void client() throws IOException {

        // 开启客户端通道
        SocketChannel sc = SocketChannel.open();
        // 可以手动设置为非阻塞模式
        sc.configureBlocking(false);
        // 发起连接
        sc.connect(new InetSocketAddress("localhost", 8090));
        // 由于是非阻塞的，所以连接不一定建立了，所以要判断连接是否建立
        while (!sc.isConnected())
            // 如果连接没有建立，则试图重新建立连接
            sc.finishConnect();
        // 写出数据
        sc.write(ByteBuffer.wrap("hello".getBytes()));
        // 关闭通道
        sc.close();
    }

//    服务器端
    @Test
    public void server() throws IOException {

        // 开启服务器端通道
        ServerSocketChannel ssc = ServerSocketChannel.open();
        // 绑定要监听的端口
        ssc.socket().bind(new InetSocketAddress(8090));
        // 手动设置为非阻塞
        ssc.configureBlocking(false);
        // 获取连接过来的通道
        SocketChannel sc = ssc.accept();
        // 判断连接是否真正建立
        while (sc == null)
            // 如果没有建立则重新获取建立
            sc = ssc.accept();
        // 准备缓冲区用于存储数据
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        // 读取数据
        sc.read(buffer);
        System.out.println(new String(buffer.array(), 0, buffer.position()));
        // 关闭通道
        ssc.close();

    }

}
