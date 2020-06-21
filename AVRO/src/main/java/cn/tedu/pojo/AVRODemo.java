package cn.tedu.pojo;

import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class AVRODemo {
    @Test
    public void createUser(){
        User u=new User();
        u.setUsername("Helen");
        u.setAge(19);
        u.setGender("male");
        System.out.println(u);

        User u2=new User("Lucy",18,"male");
        System.out.println(u2);

        //建造者模式----针对大量对象情况下，只需要改变一部分属性
        User u3=User.newBuilder(u2).setUsername("Lily").build();
        System.out.println(u3);
    }
    //序列化
    @Test
    public void serial() throws IOException {
        User u1=new User("Amy",15,"female");
        User u2=new User("Sam",16,"male");
        User u3=new User("Bob",17,"male");
        User u4=new User("Lily",18,"female");

        //一、获取序列化流
        DatumWriter<User> dw=new SpecificDatumWriter(User.class);
        //二、存---获取一个文件流，将序列化文件写出
        DataFileWriter<User> dfw=new DataFileWriter(dw);
        //三、指定写出文件
        dfw.create(User.SCHEMA$,new File("C:\\a.txt"));
        //四、写出对象
        dfw.append(u1);
        dfw.append(u2);
        dfw.append(u3);
        dfw.append(u4);
        //五、关流
        dfw.close();
    }
    //反序列化
    public void deserial() throws IOException {
        //一、获取反序列化流
        DatumReader<User> dr=new SpecificDatumReader<>(User.class);
        //二、读---获取一个文件流，将序列化文件读出
        DataFileReader<User> dfr=new DataFileReader<>(new File("C:\\a.txt"),dr);
        //三、AVRO将这个文件流设计成一个迭代器模式--可以遍历对象
        while(dfr.hasNext()){
            User u=dfr.next();
            System.out.println(u);
        }
        //四、关流
        dfr.close();
    }

}
