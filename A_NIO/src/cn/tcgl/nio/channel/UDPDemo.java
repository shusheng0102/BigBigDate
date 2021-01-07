package cn.tcgl.nio.channel;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

/**
 * 	1. 用于进行UDP收发的通道
 * 	2. 是无连接的网络协议，只能进行发送和接受的操作
 *  3. 基本类是DatagramChannel，是一个抽象类
 */
public class UDPDemo {
//    发送端
    @Test
    public void send() throws IOException {
        // 开启通道
        DatagramChannel dc = DatagramChannel.open();
        // 准备数据
        ByteBuffer buffer = ByteBuffer.wrap("hello".getBytes());
        // 发送数据
        dc.send(buffer, new InetSocketAddress("localhost", 8090));
        // 关闭通道
        dc.close();
    }

//    接收端
    @Test
    public void recieve() throws IOException {

        // 开启通道
        DatagramChannel dc = DatagramChannel.open();
        // 绑定连接地址和端口号
        dc.socket().bind(new InetSocketAddress(8090));

        // 准备缓冲区
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        // 接收数据
        dc.receive(buffer);
        System.out.println(new String(buffer.array(), 0, buffer.position()));

        // 关闭通道
        dc.close();

    }

}
