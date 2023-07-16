package example;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] split = s.split(",");
        int[] ints = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            ints[i] = Integer.parseInt(split[i]);
        }
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints.length==1 && ints[0] ==0){
                sum++;
                ints[i] = 1;
                continue;
            }
            if (i == 0 && ints[0] == 0 && ints[1] == 0) {
                sum ++;
                ints[i] = 1;
                continue;
            }
            if ((i == ints.length - 1) && ints[i] == 0 && ints[i - 1] == 0) {
                sum ++;
                ints[i] = 1;
                continue;
            }
            if ( ints[i] == 0 && ( i > 0 && ints[i - 1] == 0) && (i < ints.length - 1 &&
                    ints[i + 1] == 0 )) {
                sum ++;
                ints[i] = 1;
                continue;
            }
        }
        System.out.println(sum);
    }
}
