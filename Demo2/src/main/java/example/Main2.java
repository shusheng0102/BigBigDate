package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Jx> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String[] s = in.nextLine().split(" ");
            int[] ints = new int[2];
            ints[0]= Integer.parseInt(s[0]);
            ints[1]= Integer.parseInt(s[1]);
            list.add(new Jx(Integer.parseInt(s[3]),Integer.parseInt(s[2]),ints));
        }

        List<int[]> lists1 = getLists(list.get(0));
        List<int[]> lists2 = getLists(list.get(1));
        List<int[]> lists3 = getLists(list.get(2));

        int jc = getJc(lists1, lists2, lists3);
        System.out.println(jc);

    }

    private static int  getJc(List<int[]> lists1, List<int[]> lists2, List<int[]> lists3) {

        int count = 0;
        for (int i = 0; i < lists1.size(); i++) {
            int[] ints = lists1.get(i);
            for (int j = 0; j < lists2.size(); j++) {
                int[] ints1 = lists2.get(j);
                if (Arrays.equals(ints,ints1)){
                    for (int k = 0; k < lists3.size(); k++) {
                        int[] ints2 = lists3.get(k);
                        if (Arrays.equals(ints,ints2)){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    private static List<int[]> getLists(Jx jx) {
        ArrayList<int[]> list = new ArrayList<>();
        int[] p1 = jx.getP1();
        for (int j = p1[1]; j > p1[1]-jx.g ; j--) {
            for (int i = p1[0]; i < p1[0]+jx.k; i++) {
                int[] ints = new int[2];
                ints[0] = i;
                ints[1] = j;
                list.add(ints);
            }
        }
        return list;
    }

    static class Jx {
        int g; // 高
        int k; // 宽
        int[] p1;



        public Jx(int g, int k, int[] p1) {
            this.g = g;
            this.k = k;
            this.p1 = p1;
        }

        public int[] getP1() {
            return p1;
        }
    }

}
