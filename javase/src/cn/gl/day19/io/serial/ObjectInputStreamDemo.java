package cn.gl.day19.io.serial;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建反序列化的对象
        //指定要获取的字节数组所在的位置
        ObjectInputStream ois=new ObjectInputStream
                (new FileInputStream("p.data"));
        //获取对象---读取字节数组转成对象
        //返回值是Object转成对应的Person类，才能拿到Person类里的信息
        Person p=(Person) ois.readObject();

        //获取类里的信息
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
