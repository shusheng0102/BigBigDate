package com.shusheng.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static String readTextFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filePath));

            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return content.toString();
    }

    public static void main(String[] args) {
        String filePath = "F://a.txt"; // 替换为实际的文件路径
        try {
            String jsonText = readTextFile(filePath);
            System.out.println(jsonText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
