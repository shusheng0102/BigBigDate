package com.gl.lombok;

import javafx.scene.NodeBuilder;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Cleanup;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.extern.java.Log;
import lombok.val;

import java.io.*;
import java.util.HashMap;

/**
 * @author 冷夜雨花未眠
 * @create 2020/7/8 0008-0:15
 */
public class User {
    static String s = "";
    //final int id2;
    @NonNull
    private Integer id;
    private String userName;
    private String password;
    private String phone;
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private String email;

/*    public static void main(String[] args) throws IOException {
//        User user = new User(1,11);
        User user = User.builder().id(String.valueOf(1)).password("password").phone("13312341234").userName("username").build();
//        user.setId(1);
//        user.setPassword("password");
//        user.setPhone("13312341234");
//        user.setUserName("username");
        val map = new HashMap<String, String>();
        System.out.println(user);
        user.test("ssfsdfj");
        @Cleanup InputStream in = new FileInputStream("filepath");
        @Cleanup OutputStream out = new FileOutputStream("path2");
        byte[] b = new byte[1000];
        while (true) {
            int r = in.read(b);
            if (r == -1) break;
            out.write(b, 0, r);
        }

    }

    private static NodeBuilder builder() {
        return null;
    }*/

/*    public void test(@NonNull String s) {
        log.info("test");
        System.out.println(s);
    }*/
}
