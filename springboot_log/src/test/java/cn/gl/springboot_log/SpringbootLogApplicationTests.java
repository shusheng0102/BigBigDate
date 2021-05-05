package cn.gl.springboot_log;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootLogApplicationTests {
    public static final Logger LOGGER = LoggerFactory.getLogger(SpringbootLogApplicationTests.class);
    @Test
    void contextLoads() {
        LOGGER.error("{} : error",SpringbootLogApplicationTests.class);
        LOGGER.warn("{} : warn",SpringbootLogApplicationTests.class);
        LOGGER.info("{} : info",SpringbootLogApplicationTests.class);
        LOGGER.debug("{} : debug",SpringbootLogApplicationTests.class);
        LOGGER.trace("{} : trace",SpringbootLogApplicationTests.class);

        org.apache.logging.log4j.Logger log01 = LogManager.getLogger(SpringbootLogApplicationTests.class);
        log01.info("{} :log4j:info",SpringbootLogApplicationTests.class);
    }

}
