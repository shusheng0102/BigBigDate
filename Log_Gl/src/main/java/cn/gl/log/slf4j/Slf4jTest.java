package cn.gl.log.slf4j;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jTest {
    public static final Logger LOGGER = LoggerFactory.getLogger(Slf4jTest.class);
    @Test
    public void test01 () throws Exception{
        LOGGER.error("Slf4jTest : error");
        LOGGER.warn("Slf4jTest : warn");
        LOGGER.info("Slf4jTest : info");
        LOGGER.debug("Slf4jTest : debug");
        LOGGER.trace("Slf4jTest : trace");

        //占位符
        String name = "渤海金控时代光华发哈健康上报";
        Integer age = 123;
        LOGGER.info("输出什么呢：{}，阿萨德好看{}",name,age,name);
        //将系统的异常信息输出
        try {
            int i =1/0;
        }catch (Exception e){
            //e.printStackTrace();
            LOGGER.error("出现异常",e);
        }

    }
}
