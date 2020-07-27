package cn.gl.day22.jdk;

public class VarsDemo {
    public static void main(String[] args) {
        //调用求和方法进行求和
        System.out.println(sum(1,2));
        System.out.println(sum(4,5,6));
        System.out.println(sum(5,6,7,8,0,1,4,6));
        System.out.println(sum(1.0));
    }

    //...可变参数---可以匹配任意多个参数
    //可变参数底层是一个数组，接受的参数值依次会存放到数组元素中
    //可变参数一定要放在最右边
    public static int sum(double d,int...i){
        int sum=0;
        for(int j=0;j<i.length;j++){
            sum+=i[j];
        }
        return sum;
    }





    /*public static int sum(int m,int n){
        return m+n;
    }

    public static int sum(int x,int y,int z){
        return x+y+z;
    }
    //接受数组就能求任意多个数之和
    public static int sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }*/
}
