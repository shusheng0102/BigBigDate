package example;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class TestDemo {
    @org.junit.Test
    public void t1() throws ParseException {
        String dateStr = "20210818154600";
        SimpleDateFormat sdfF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdfP = new SimpleDateFormat("yyyyMMddHHmmss");
        Date d = sdfP.parse(dateStr);
        String dateStr2 = sdfF.format(d); //2021-08-18 15:46:00
        System.out.println(dateStr2);

    }
     @org.junit.Test
     public void t2(){
         int[] ints1 = {1, 2};
         int[] ints2 = {1, 3};
         int[] ints3 = {1, 4};
         int[] ints4 = {1, 2};
         int[] ints5 = {2, 2};
         ArrayList<int[]> list = new ArrayList<>();
         list.add(ints1);
         list.add(ints2);
         list.add(ints3);
         list.add(ints5);
         if (Arrays.equals(list.get(0),ints4)){
             System.out.println("true");
         }
     }

     @Test
    void doPostTest(){

     }
}
