package cn.gl.log.jul;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.*;

public class JULTest {
    @Test
    public void testQuick() throws Exception {
        // 1.创建日志记录器对象
        Logger logger = Logger.getLogger("cn.log.jul.JULTest");
        // 2.日志记录输出
        logger.info("hello jul");//是默认只实现info以上的级别
        logger.log(Level.INFO, "info msg");
        String name = "jack";
        Integer age = 18;
        logger.log(Level.INFO, "用户信息：{0},{1}", new Object[]{name, age});
        String a1="a1";
        String a2="a2";
        String a3="a3";
        int a4=44;
        logger.log(Level.INFO,"{0},{3}",new Object[]{a1,a2,a3,a4});

    }

    /**
     * 自定义日志级别
     */
    @Test
    public void testLogConfig() throws IOException {
        // 1.创建日志记录器对象
        Logger logger = Logger.getLogger("cn.log.jul.JULTest");
        // 一、自定义日志级别
        // a.关闭系统默认配置
        logger.setUseParentHandlers(false);
        // b.创建handler对象
        ConsoleHandler consoleHandler = new ConsoleHandler();
        // c.创建formatter对象
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        // d.进行关联
        consoleHandler.setFormatter(simpleFormatter);
        logger.addHandler(consoleHandler);
        // e.设置日志级别
        logger.setLevel(Level.CONFIG);
        consoleHandler.setLevel(Level.CONFIG);
        // 二、输出到日志文件
        FileHandler fileHandler = new FileHandler("d:/logs/jul.log");
        fileHandler.setFormatter(simpleFormatter);
        logger.addHandler(fileHandler);

        // 2.日志记录输出
        logger.severe("severe");
        logger.warning("warning");
        logger.info("info");
        logger.config("config");
        logger.fine("fine");
        logger.finer("finer");
        logger.finest("finest");
    }


    /**
     * Logger之间的父子关系:  父子关系通过路径来关联
     */
    @Test
    public void testLogParent() throws Exception {
        // 日志记录器对象父子关系
        Logger logger1 = Logger.getLogger("cn.log.jul");
        Logger logger2 = Logger.getLogger("cn.log");
        Logger logger3 = Logger.getLogger("cn");

        System.out.println(logger1.getParent() == logger2);
        System.out.println("logger1 parent:" + logger1.getParent() + "，=====>name：" + logger1.getParent().getName());
        System.out.println("logger2 parent:" + logger2.getParent() + "，=====>name：" + logger2.getParent().getName());
        System.out.println("logger3 parent:" + logger3.getParent() + "，=====>name：" + logger3.getParent().getName());


        // a.关闭系统默认配置
        logger2.setUseParentHandlers(false);
        // b.创建handler对象
        ConsoleHandler consoleHandler = new ConsoleHandler();
        // c.创建formatter对象
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        // d.进行关联
        consoleHandler.setFormatter(simpleFormatter);
        logger2.addHandler(consoleHandler);
        // e.设置日志级别
        logger2.setLevel(Level.ALL);
        consoleHandler.setLevel(Level.ALL);

        // 2.日志记录输出
        logger1.severe("severe");
        logger1.warning("warning");
        logger1.info("info");
        logger1.config("config");
        logger1.fine("fine");
        logger1.finer("finer");
        logger1.finest("finest");
    }


    /**
     * 加载自定义的配置文件
     */
    @Test
    public void testLogProperties() throws Exception {
        //读取配置文件，通过类加载器
        InputStream resourceAsStream = JULTest.class.getClassLoader().getResourceAsStream("logging.properties");
        //创建LogManager
        LogManager logManager = LogManager.getLogManager();
        //通过LogManager加载配置文件
        logManager.readConfiguration(resourceAsStream);

        Logger logger1 = Logger.getLogger("cn.gl.log");

        // 2.日志记录输出
        logger1.severe("severe会尽快的时间开发");
        logger1.warning("warning尽快回复山东矿机");
        logger1.info("info按实际的记录卡1");
        logger1.config("config圣诞节开发好舒服");
        logger1.fine("fine");
        logger1.finer("finer");
        logger1.finest("finest");
    }
}
