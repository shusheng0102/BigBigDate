package cn.gl.day19.io.serial;

import java.io.Serializable;

/**
 * 	注意：
 * 		a.如果对象想序列化，对象对应的类需要实现Serializable接口
 * 		b.把对象以及属性序列化过去，方法不参与
 * 		c.如果被static/transient修饰就不能被序列化
 * 		d.
 * 			serialVersionUID---序列化版本号
 * 			在类实现Serializable接口之后，底层会默认根据当前的属性和方法计算出一个版本号，当要进行序列化的时候，
 * 			之前计算出来的版本号会随着对象一起序列化出去。当要进行反序列化的时候，会再次根据当前类的属性和方法计算出一个版本号，
 * 			会拿着这个计算出来的版本号和之前序列化过来的的版本号进行比较，如果一致就反序列化成功，如果不一致就报错。
 * 			为了避免这种比较造成报错的情况，在这个类中去指定序列化版本号，前后版本号一定一致（private final static long）
 *
 * 		e.集合和映射的对象都不支持序列化，只能依次遍历元素对象依次进行序列化
 */
class Person implements Serializable {

    //指定当前类的序列化版本号---保证前后一定一致
    //private static final long serialVersionUID=454345155L; //自己指定也可以自己配置
    //idea配置完之后可以自动提示  insp  serial   勾选 whithout 'serialVersionUID'
    private static final long serialVersionUID = -3379135167541666291L;

    //属性
    private String name;
    private int age;

    private char gender;
    //属性---班级
    //静态信息不能被序列化
    private static String classroom;
    //不会进行序列化  transient--关键之--短暂的
    private transient double heigth;


    private String skin;   //这里引出序列化版本号
    //public void m(){}

    /*public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
