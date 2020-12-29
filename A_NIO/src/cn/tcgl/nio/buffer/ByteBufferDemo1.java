package cn.tcgl.nio.buffer;

import java.nio.ByteBuffer;

public class ByteBufferDemo1 {
    public static void main(String[] args) {

        /**
         *创建ByteBuffer对象
         * ByteBuffer底层是基于字节数组来进行存储的
         * 参数表示ByteBuffer的容量，实际上就是指底层的字节数组大小
         */
        ByteBuffer buffer  = ByteBuffer.allocate(10);
        System.out.println(buffer.capacity() + "|" + buffer.limit() + "|" + buffer.position());
        //添加数据
        buffer.put("abc".getBytes());
        System.out.println(buffer.capacity() + "|" + buffer.limit() + "|" + buffer.position());
        buffer.put("asdff".getBytes());
        System.out.println(buffer.capacity() + "|" + buffer.limit() + "|" + buffer.position());
        //获取数据--单个元素
        buffer.position(0);
        byte b1 = buffer.get();
        System.out.println(b1);
        byte b2 = buffer.get();
        System.out.println(b2);
        byte b3 = buffer.get();
        System.out.println(b3);

    }
}
