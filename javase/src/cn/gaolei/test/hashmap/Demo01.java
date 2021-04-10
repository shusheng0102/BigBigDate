package cn.gaolei.test.hashmap;

import java.util.HashMap;

public class Demo01 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap<>();
        hashMap.put(1,"chuansn");
        hashMap.put(2,"rose");
        hashMap.put(3,"jack");
        hashMap.put(4,"ppd");
        for (int i = 1; i < 5; i++) {
            System.out.println(hashMap.get(i));
        }

    }
}
