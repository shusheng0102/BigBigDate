package cn.gaolei.test;

import org.junit.Test;

import java.util.Optional;

public class OptionalDemo {
    @Test
    public void test() throws Exception {
        User user1 = null;
        User user2 = new User();
        System.out.println(user2);
/*        user2 = Optional.ofNullable(user2).orElse(createUser());
        System.out.println(user2);*/
/*        user2 = Optional.ofNullable(user2).orElseGet(() -> createUser());
        System.out.println(user2);*/
        user1= Optional.ofNullable(user1).orElseGet(() -> createUser());
        System.out.println(user1);
            //Optional.ofNullable(user).orElseThrow(()->new Exception("用户不存在"));


    }
    public User createUser(){
        System.out.println("調用了這個方法");
        User user123 = new User();
        user123.setName("zhangsan");
        return user123;
    }
}
class User{
    String Name;

    public User() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
