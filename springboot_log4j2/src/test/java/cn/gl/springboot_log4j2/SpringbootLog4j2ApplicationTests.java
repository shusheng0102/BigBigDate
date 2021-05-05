package cn.gl.springboot_log4j2;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootLog4j2ApplicationTests {
    public static final Logger LOGGER = LoggerFactory.getLogger(SpringbootLog4j2ApplicationTests.class);

    public static void main(String[] args) {

    }
    @Test
    void contextLoads() {
        for (int i = 0; i < 100000; i++) {
            LOGGER.error("{} : error",SpringbootLog4j2ApplicationTests.class);
            LOGGER.warn("{} : warn",SpringbootLog4j2ApplicationTests.class);
            LOGGER.info("{} : info",SpringbootLog4j2ApplicationTests.class);
            LOGGER.debug("{} : debug",SpringbootLog4j2ApplicationTests.class);
            LOGGER.trace("{} : trace",SpringbootLog4j2ApplicationTests.class);
        }

/*        org.apache.logging.log4j.Logger log01 = LogManager.getLogger(SpringbootLog4j2ApplicationTests.class);
        log01.info("{} :log4j:info",SpringbootLog4j2ApplicationTests.class);*/
    }
    @Test
    void test01(){
        User user = new User();
        user.setName("jack");
        user.setBirthdayCalendar(System.currentTimeMillis());
        LOGGER.debug("Logging in user {} with birthday {}", user.getName(), user.getBirthdayCalendar());

        LOGGER.error("{} : error",SpringbootLog4j2ApplicationTests.class);
        LOGGER.warn("{} : warn",SpringbootLog4j2ApplicationTests.class);
        LOGGER.info("{} : info",SpringbootLog4j2ApplicationTests.class);
        LOGGER.debug("{} : debug",SpringbootLog4j2ApplicationTests.class);
        LOGGER.trace("{} : trace",SpringbootLog4j2ApplicationTests.class);
        if(LOGGER.isDebugEnabled()){
            //LOGGER.debug("入参报文：{}",JSON.toJSONString(policyDTO));
        }

    }

}
class User{
    String Name;
    long BirthdayCalendar;

    public User() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getBirthdayCalendar() {
        return BirthdayCalendar;
    }

    public void setBirthdayCalendar(long birthdayCalendar) {
        BirthdayCalendar = birthdayCalendar;
    }
}
