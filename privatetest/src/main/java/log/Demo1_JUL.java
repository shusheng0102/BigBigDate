package log;

import org.junit.Test;

import javax.lang.model.element.VariableElement;
import java.text.SimpleDateFormat;
import java.util.logging.*;

/**
 * @author 冷夜雨花未眠
 * @create 2020/7/26 0026-16:15
 */
public class Demo1_JUL {
    //入门测试
    @Test
    public void testQuick() throws Exception{
        //1.获取日志记录器对象
        Logger logger = Logger.getLogger("log.Demo1");
        //2.日志记录输出
        logger.info("第一次使用gul");

        //通用方法进行日志记录
        logger.log(Level.INFO,"info msg");

        //通过占位符方式输出变量值
        String name="hjkadh";
        int age=19;
        logger.log(Level.INFO,"用户信息：{0},{1}",new Object[]{name,age});
    }
    @Test
    public void testLogLevel() throws Exception{
        //1.获取日志记录器对象
        Logger logger = Logger.getLogger("log.Demo1");
        //2.日志记录输出---on开启所有的日志  off关闭所有的日志
        logger.severe("日志级别：server");
        logger.warning("日志级别：warning");
        logger.info("日志级别：info");//jul默认的日志级别是info
        logger.config("日志级别：config");
        logger.fine("日志级别：fine");//debug使用这个就好，3选1
        logger.finer("日志级别：finer");
        logger.finest("日志级别：finest");
    }
    //自定义日志级别
    @Test
    public void testLogConfig() throws Exception{
        //1.获取日志记录器对象
        Logger logger = Logger.getLogger("log.Demo1");
        //2.自定义配置日志级别
            //关闭系统默认配置
        logger.setUseParentHandlers(false);
            //创建consoleHandler
        ConsoleHandler consoleHandler = new ConsoleHandler();
            //创建简单格式转换对象
        SimpleFormatter simpleFormatter = new SimpleFormatter();
            //进行关联
        consoleHandler.setFormatter(simpleFormatter);
        logger.addHandler(consoleHandler);
            //配置日志的级别
        logger.setLevel(Level.ALL);
        consoleHandler.setLevel(Level.ALL);
            //场景FileHandler  文件输出
        FileHandler fileHandler = new FileHandler("D:/logs/jul.log");
        fileHandler.setFormatter(simpleFormatter);
        logger.addHandler(fileHandler);
        //4.日志记录输出
        logger.severe("日志级别：server");
        logger.warning("日志级别：warning");
        logger.info("日志级别：info");//jul默认的日志级别是info
        logger.config("日志级别：config");
        logger.fine("日志级别：fine");//debug使用这个就好，3选1
        logger.finer("日志级别：finer");
        logger.finest("日志级别：finest");

    }
    //logger对象父子关系
    @Test
    public void testLogParent() throws Exception{
        //logger1是2的子对象
        Logger logger1 = Logger.getLogger("log.Demo1");
        Logger logger2 = Logger.getLogger("log");
        //测试
        System.out.println(logger1.getParent() == logger2);
        //所有日志记录器的顶级父元素LogManager$RootLogger，name是""  空字符串
        //它内部设置了向控制台输出的处理器，以及简单的数据格式转换器
        //如果没有设置自定义配置，那么就会继承它
        System.out.println("logger2的parent"+logger2.getParent() + ",name:" + logger2.getParent().getName());

        //关闭系统默认配置
        logger2.setUseParentHandlers(false);
        //创建consoleHandler
        ConsoleHandler consoleHandler = new ConsoleHandler();
        //创建简单格式转换对象
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        //进行关联
        consoleHandler.setFormatter(simpleFormatter);
        logger2.addHandler(consoleHandler);
        //配置日志的级别
        logger2.setLevel(Level.ALL);
        consoleHandler.setLevel(Level.ALL);

        logger1.severe("日志级别：server");
        logger1.warning("日志级别：warning");
        logger1.info("日志级别：info");//jul默认的日志级别是info
        logger1.config("日志级别：config");
        logger1.fine("日志级别：fine");//debug使用这个就好，3选1
        logger1.finer("日志级别：finer");
        logger1.finest("日志级别：finest");
    }

}
