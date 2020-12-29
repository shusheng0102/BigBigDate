package cn.tcgl.nio.buffer;

import java.nio.ByteBuffer;

public class BufferDemo2 {

    public static void main(String[] args) {

        // 适合于元素已知的场景
        // ByteBuffer buffer = ByteBuffer.wrap("hello".getBytes());
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put("abc".getBytes());

        // 操作位依然从0开始
        // System.out.println(buffer.position());

        // 获取对应的字节数组
        byte[] data = buffer.array();
        // System.out.println(new String(data, 0, buffer.position()));
        buffer.flip();
        System.out.println(new String(data, 0, buffer.limit()));

    }
}
