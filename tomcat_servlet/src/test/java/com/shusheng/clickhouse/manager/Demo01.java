package com.shusheng.clickhouse.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @BeforeClass：针对所有测试，只执行一次，且修饰符必须为static void。
 *
 * @Before：初始化方法，在执行当前测试类的每个测试方法前执行。
 *
 * @Test：测试方法，在这里可以测试期望的异常和超时时间。
 *
 * @After：释放资源，在执行当前测试类的每个测试方法后执行。
 *
 * @AfterClass：针对所有测试，只执行一次，且必须为static void。
 *
 * @Ignore：忽略的测试方法(只在测试类的时候生效，单独执行该测试方法无效)。
 *
 * @RunWith: 更改测试运行器，缺省值org.junit.runner.Runner
 *
 * https://blog.csdn.net/qfxietian/article/details/122425261
 */

public class Demo01 {
    private static final Logger LOGGER = LoggerFactory.getLogger(Demo01.class);

    void t1(){
        LOGGER.info("demo01---");
    }
}
