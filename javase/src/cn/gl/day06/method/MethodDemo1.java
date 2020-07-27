package cn.gl.day06.method;

public class MethodDemo1 {
    //Alt+?提示键
    //自动编译
    //java的方法不允许嵌套
    public static void main(String[] args) {

		/*//打印5行6列星星
		for(int i=1;i<=5;i++){
			for(int j=1;j<=6;j++){
				System.out.print("*");
			}
			//换行
			System.out.println();
		}

		//打印7行7列星星
		for(int i=1;i<=7;i++){
			for(int j=1;j<=7;j++){
				System.out.print("*");
			}
			//换行
			System.out.println();
		}*/

        //方法的调用
		/*printXing(5, 4);
		//printXing(6, 7);
		//方法的返回值直接返回给调用者
		//把方法的返回值赋值给新变量
		int result=sum(5,7);
		//把方法的返回值直接输出
		System.out.println(sum(2,3));*/

        //
       // System.out.println(isOdd(8));


        //操作大于6的偶数
        int n=20;
        //判断是否是大于6的偶数
        if(n>6&&(n%2==0)){
            //把n范围内的所有数表示出来
            for(int i=1;i<=n/2;i++){//i只取一半不会有重复
                //n的两个组成数--i  n-i
                if(isPrime(i)&&isPrime(n-i)){//保证都是质数
                    System.out.println(n+"="+i+"+"+(n-i));
                }
            }
        }
    }


    //抽取成方法---和main方法同级
    //只需要出现星星图案不需要把图案返回
    //参数列表---决定行和列的值
    public static void printXing(int x,int y){
        //方法体---重复且有效代码
        for(int i=1;i<=x;i++){//和参数有关系不能写死
            for(int j=1;j<=y;j++){
                if(j==2){
                    //结束方法
                    return;//后面不能跟上任何值
                }
                System.out.print("*");
            }
            //换行
            System.out.println();
        }

        //这个1没有输出代表return结束的是方法
        System.out.println(1);
    }


    //求两个整数之和
    //两个明确：返回值类型---int，参数列表---int x int y
    public static int sum(int m,int n){
        //m+n是求和---返回值
        //把返回值进行返回
        return m+n;
    }


    //判断一个任意整数是否是奇数
    //两个明确：返回值类型---boolean  参数列表---int x
    public static boolean isOdd(int x){//-1
        //x的不正常的范围
        if(x<0){
            return false;//表面不是奇数
        }

        //正常范围---判断是否是奇数---判断条件
        if((x&1)!=0){//任意一个整数&1==0  整数一定偶数
            return true;
        }

        //表面是正常范围内的偶数
        //把所有数据的范围要有对应的返回值
        return false;

    }



    /*
     * 8=3+5
     * 10=3+7
     * 所有大于6的偶数都能分成两个质数求和
     *
     * */
    //判断一个整数是否是质数
    //两个明确:返回值类型---boolean   参数列表:int m
    public static boolean isPrime(int m){
        //参数不正常范围
        if(m<2){
            return false;//不是质数
        }

        //操作循环---for循环范围确定
        for(int i=2;i<=m/2;i++){//把m范围内所有的数
            //判断是否能被整除
            if(m%i==0){//9
               return false;//不是一个质数  结束方法
            }
        }

        //没有被整除的数
        return true;
    }








}
