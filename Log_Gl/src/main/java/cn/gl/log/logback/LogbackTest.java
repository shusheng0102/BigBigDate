package cn.gl.log.logback;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {
//    public static final Logger LOGGER= LoggerFactory.getLogger(LogbackTest.class);
    public static final Logger LOGGER= LoggerFactory.getLogger("cn.gl");
    @Test
    public void testQuick()throws Exception{
        for (int i = 0; i < 10000; i++) {
            LOGGER.error("Slf4jTest : error");
            LOGGER.warn("Slf4jTest : warn");
            LOGGER.info("Slf4jTest : info");
            LOGGER.debug("Slf4jTest : debug");
            LOGGER.trace("Slf4jTest : trace");
        }
    }
}
