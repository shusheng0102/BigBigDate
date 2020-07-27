package com.gl.lombok;

import lombok.*;

/**
 * @author 冷夜雨花未眠
 * @create 2020/7/8 0008-21:32
 */
@Setter
@Getter
//exclude和of是冲突的
@ToString(exclude = {"email"},of = {"s"})//要加在类上方,成员变量输出   将email排除出去   指定s进行输出
@EqualsAndHashCode  //equals() canEquals() hashCode()
public class User1 {
//    @Getter(AccessLevel.PROTECTED)
//    @Setter
    //注解里面设置访问等级
    private Integer id;
//    @Getter(AccessLevel.PRIVATE)
    private String userName;
    private String password;
    private String phone;
    //特殊场景
    @Getter(AccessLevel.NONE)//没有人可以访问，不会生成get方法
    @Setter(AccessLevel.NONE)//同上不会有set
    private String email;
    //特殊情况
    static String s="";//静态 类一级  注解不产生效果
    final int id2=10;//生成了get方法，但是不会生成对应的set方法，因为是final，值不会变

    public static void main(String[] args) {
        User1 user1 = new User1();
        user1.setId(12);
        user1.setUserName("wangzhewudi");
        user1.setPassword("123456");
        user1.setPhone("1234567890");
        System.out.println(user1);
    }
}
