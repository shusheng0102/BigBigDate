package com.shusheng.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ReadFileExample {
    public static void main(String[] args) {
        /*StringBuilder requestBody = new StringBuilder();
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(request.getInputStream(), StandardCharsets.UTF_8));*/

        try {
            File file = new File("F://a.txt"); // 文件路径
            FileInputStream fis = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
