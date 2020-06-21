package cn.tedu.day19.junit;

import org.junit.Test;

/**
 * @author 冷夜雨花未眠
 * @create 2020/6/16 0016-0:41
 */
public class JunitDemo1 {
    @Test
    public void sum(){
        n(19,51);
    }
    public void n(int m,int n){
        System.out.println(m+n);
    }
}
