package example;

import java.util.LinkedList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] s = in.nextLine().split(" ");
        LinkedList<Integer> ints = new LinkedList<>();
        for (int i = 0; i < s.length; i++) {
            ints.add(Integer.parseInt(s[i]));
        }
        int size = ints.size();

        int max = 0;
        if (size == 0){
            System.out.println(0);
            return;
        }
        if (size == 1){
            System.out.println(ints.get(0));
            return;
        }
        if (size == 2){
            int max1 = Math.max(ints.get(0), ints.get(1));
            System.out.println(max1);
            return;
        }
        if (size ==3){
            int max1 = Math.max(ints.get(0), ints.get(1));
            int max2 = Math.max(ints.get(2), max1);
            System.out.println(max2);
            return;
        }
        for (int i = 0; i < size; i++) {
            ints.add(ints.get(i));
        }
        for (int i = 0; i < size; i++) {
            Integer integer = ints.get(i);
            int tmp = 0;
            tmp += integer;
            for (int j = i+2; j < size; j+=2) {
                tmp += ints.get(j);
            }
            if (tmp>max){
                max = tmp;
            }
        }
        System.out.println(max);
    }
}
