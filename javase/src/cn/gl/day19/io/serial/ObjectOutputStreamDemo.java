package cn.gl.day19.io.serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        //创建Person类对象
        Person p=new Person();
        p.setName("lili");
        p.setAge(10);

        //创建序列化的对象---指明对象转成数组之后存储的位置
        ObjectOutputStream oos=new ObjectOutputStream
                (new FileOutputStream("p.data"));//默认存到这个工程身上
        //把对象写入到字节数组
        oos.writeObject(p);
        //关流
        oos.close();
    }

}
