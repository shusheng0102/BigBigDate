package cn.tcgl.nio.buffer;

import java.nio.ByteBuffer;

public class BufferDemo1 {

    public static void main(String[] args) {

        // 参数表示容量，容量实际上是指定字节数组的长度
        ByteBuffer buffer = ByteBuffer.allocate(10);

        // 获取容量位
        System.out.println(buffer.capacity());
        // 获取操作位
        System.out.println(buffer.position());
        // 获取限制位
        System.out.println(buffer.limit());

        // 添加元素
        buffer.put("abc".getBytes());
        buffer.put((byte) 0);
        buffer.put("def".getBytes());
        System.out.println(buffer.position());
        // 挪动操作位
        // buffer.position(0);

        // 获取元素
        // 获取的应该是字节,如果读取不到则返回-1
        // byte b = buffer.get();
        // System.out.println(b);

        // 如果需要遍历,那么需要先将限制位挪到当前的操作位上
        // 然后将操作位归零
        // 这一系列操作称之为翻转缓冲区
        // buffer.limit(buffer.position());
        // buffer.position(0);
        // 翻转缓冲区:
        buffer.flip();

        // while (buffer.position() < buffer.limit()) {
        // 等价于
        while (buffer.hasRemaining()) {
            byte b=buffer.get();
            System.out.print((char) b);

        }


    }

}
