package com.shusheng.file;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String filePath = "F://abc.txt";

        while (true) {
            String data = in.nextLine();
            if (data.equals("shushengover")){
                break;
            }


            Path file = new File(filePath).toPath();
            try {
                /*Files.write(file, data.getBytes(StandardCharsets.UTF_8),
                        StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);*/
                Files.write(file, (data+"\r\n").getBytes(StandardCharsets.UTF_8),
                        StandardOpenOption.CREATE, StandardOpenOption.APPEND);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("File saved successfully!");
    }
}
