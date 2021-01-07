package cn.tcgl.nio.selector;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 *  1. Selector。称之为多路复用选择器
 * 	2. 对通道进行选择，需要基于事件进行驱动
 * 	3. 针对了四类事件：connect、accept、read、write，四类事件定义在SelectionKey中
 * 	4. 可以实现利用一个或者少量线程处理大量请求
 * 	5. 适用于大量的短任务场景，不适用于长任务场景
 * 	6. Selector针对的必须是非阻塞的通道
 */
public class SelectorDemo {
    @Test
    public void server() throws IOException {

        // 开启服务器端的通道
        ServerSocketChannel ssc = ServerSocketChannel.open();
        // 设置为非阻塞
        ssc.configureBlocking(false);
        // 绑定要监听的端口
        ssc.socket().bind(new InetSocketAddress(8090));
        // 开启选择器
        Selector selector = Selector.open();
        // 将当前通道注册到选择器上，并且为通道注册事件
        ssc.register(selector, SelectionKey.OP_ACCEPT);

        while (true) {
            // select()是Selector提供的用于查询是否有事件触发的机制
            // 如果没有事件触发，则会一直阻塞在这儿，如果有事件触发，则阻塞放开
            // 引入Selector的好处是：线程不必每时每刻都去工作、去查询客户端是否有新事件，没有事件就一直阻塞
            // 有事件发生，Selector则放开阻塞。这样一来，可以避免了线程无意义的空转，节省cpu资源，同时也不影响工作
            selector.select();
            // 能走到下面的代码，说明有事件发生，需要进行处理
            // 在处理的时候需要根据事件类型来做相应的处理
            // 对于服务端来说，事件分为：
            // SelectionKey.OP_ACCPET 新客户端接入
            // SelectionKey.OP_WRITE 已接入的客户端给服务端传数据
            // SelectionKey.OP_READ 服务端给已接入的客户端传数据
            Set<SelectionKey> set = selector.selectedKeys();
            // 迭代遍历进行处理
            Iterator<SelectionKey> it = set.iterator();
            while (it.hasNext()) {
                SelectionKey key = it.next();
                // 判断是否是一个可接受事件
                if (key.isAcceptable()) {
                    // 从事件中获取到通道
                    ServerSocketChannel ss = (ServerSocketChannel) key.channel();
                    // 接受事件
                    SocketChannel sc = ss.accept();
                    sc.configureBlocking(false);
                    sc.register(selector, SelectionKey.OP_READ);

                }
                // 判断是否是一个可读事件
                if (key.isReadable()) {
                    SocketChannel s = (SocketChannel) key.channel();
                    ByteBuffer buffer = ByteBuffer.allocate(1024);
                    s.read(buffer);
                    // 处理完read事件后，需要把read事件从当前的SelectionKey键集里删除，避免重复处理
                    System.out.println("服务端接收到信息：" + new String(buffer.array()));
                    s.register(selector, key.interestOps() ^ SelectionKey.OP_READ);

                }
                // 判断是否是一个可写事件
                if (key.isWritable()) {
                    SocketChannel s = (SocketChannel) key.channel();
                    s.write(ByteBuffer.wrap("hello client".getBytes()));
                    s.register(selector, key.interestOps() ^ SelectionKey.OP_WRITE);
                }
                // 防止已处理完毕的SelectionKey再次被处理
                it.remove();
            }

        }

    }

}
