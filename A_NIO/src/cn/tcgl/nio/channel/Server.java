package cn.tcgl.nio.channel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class Server {

    public static void main(String[] args) throws IOException {

        // 开启服务器端的通道
        ServerSocketChannel ssc = ServerSocketChannel.open();
        // 设置非阻塞
        ssc.configureBlocking(false);
        // 绑定端口
        ssc.bind(new InetSocketAddress(8090));
        // 接收连接
        // 无论是否接收到连接,都会继续向下执行
        SocketChannel sc = ssc.accept();

        // 判断是否接收到了连接
        while (sc == null)
            sc = ssc.accept();

        // 如果接收到了连接
        // 读取数据
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        sc.read(buffer);
        // 解析数据
        System.out.println(
                new String(buffer.array(), 0, buffer.position()));

        // 服务器给客户端打回数据
        sc.write(ByteBuffer.wrap("数据收到了~~~".getBytes()));

        // 关流
        ssc.close();
    }

}
