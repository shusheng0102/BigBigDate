package cn.tcgl.nio.buffer;

import java.nio.ByteBuffer;

public class BufferDemo2 {

    public static void main(String[] args) {

        // 适合于元素已知的场景
          ByteBuffer buffer = ByteBuffer.wrap("hello nihao ma".getBytes());
//        ByteBuffer buffer = ByteBuffer.allocate(10);
//        buffer.put("abc".getBytes());

        // 操作位依然从0开始
        // System.out.println(buffer.position());

        // 获取对应的字节数组
        byte[] data = buffer.array();
        // System.out.println(new String(data, 0, buffer.position()));
        //如果我进行了flip操作就要用limit
        //buffer.flip();
        System.out.println(buffer.limit());
        //缓冲区刚创建position指向第0位
        System.out.println(buffer.position());
        System.out.println(buffer.capacity());
        System.out.println(new String(data, 0, buffer.limit()));

    }
}
