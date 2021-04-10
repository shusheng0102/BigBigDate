package cn.gl.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPClient {
    public static void main(String[] args) {
        DatagramSocket ds = null;
        try {
            // 创建客户端的套接字对象
            ds = new DatagramSocket();
            // 定义一个发送的内容
//            字符串.getBytes()将字符串转换为字节数组
            byte[] bs = "你好".getBytes();
            // 创建要发送的目的的IP地址也可以是本机的名字也可以是192.168.1.102(本人电脑)
            InetAddress is = InetAddress.getByName("127.0.0.1");
            // 打数据包
            DatagramPacket dp = new DatagramPacket(bs, bs.length, is, 10005);
            // 发送数据
            ds.send(dp);
            System.out.println("数据包已经send");

        } catch (SocketException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ds != null) {
                ds.close();
            }
        }

    }
}
