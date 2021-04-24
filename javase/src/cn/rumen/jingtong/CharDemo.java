package cn.rumen.jingtong;

public class CharDemo {
    public static void main(String[] args) {
/*        char word='d';
        System.out.println((int)word);*/
/*        char word=105;
        System.out.println(word);*/
        int num;

        for (int i = 0; i < 65536; i++) {
            num=i;
            System.out.println("unicode 表中的第"+i+"位是："+(char)num);
        }
        //System.out.println("unicode 表中的第"+num+"位是："+(char)num);
    }
}
