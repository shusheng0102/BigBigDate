package cn.gl.log.log4j;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Log4jTest {
    @Test
    public void testQuick() throws Exception{

        //获取日志记录器
        Logger logger = LogManager.getLogger("Log4jTest.class");

        //日志记录的输出
        logger.error("hjkshd");
    }
}
