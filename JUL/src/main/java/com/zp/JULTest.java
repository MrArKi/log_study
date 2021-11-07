package com.zp;

import org.junit.Test;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * TODO
 *
 * @author pengz
 * @since 2021/11/7
 */
public class JULTest {

    public static Logger logger = Logger.getLogger(JULTest.class.getName());

    @Test
    public void run() {
        // 入门案例
        // 创建日志实例

        // 两种输出方式。
        // 1、直接调用日志级别方法
        logger.info("数据info信息1");
        // 2、调用通用的log方法，然后再里面通过level类型来定义日志的级别参数，以及搭配日志输出信息的参数
        logger.log(Level.INFO, "输出info信息2");

        // 输出学生信息（姓名、年龄）
        String name = "zs";
        int age = 23;
        // 硬拼接（不推荐）
        logger.info("学生的姓名为：" + name + ", 年龄为：" + age);
        // 动态输出(占位符)
        logger.log(Level.INFO, "学生的姓名为：{0}, 年龄为：{1}", new Object[]{name, age});

    }

    /**
     * 日志级别
     * SEVERE:错误(最高级)
     * WARNING:警告
     * INFO：消息（默认级别）
     * FINE：详细信息（少）
     * FINER：详细信息（中）
     * FINEST：详细信息（多）----最低级别日志
     * <p>
     * 两个特殊的级别
     * OFF 可用来关闭日志记录
     * ALL 启用所有消息的日志记录
     * <p>
     * 对于日志级别，我们需要重点关注new对象时的第二个参数（int）
     * OFF Integer.MAX_VALUE
     * ...
     * ALL Integer.MIN_VALUE
     * 数值的意义在于，如果我们设置的级别级别是INFO---800
     * 那么最终展现的日志信息，必须是数值大于800的所有日志信息
     */
    @Test
    public void test02() {
        // 需要搭配handler才能设置级别
        logger.setLevel(Level.CONFIG);

        logPrint();
    }

    /**
     * 自定义日志级别
     */
    @Test
    public void Test03() {

        setLogLevel(Level.ALL);
        
        logPrint();
    }

    private void logPrint() {
        logger.severe("severe1000");
        logger.warning("warning900");
        logger.info("info800");
        logger.config("config700");
        logger.fine("fine500");
        logger.finer("finer400");
        logger.finest("finest300");
    }

    private void setLogLevel(Level level) {
        // 将默认的日志打印方式闭掉（默认使用父级打印）
        logger.setUseParentHandlers(false);

        // 处理器handler
        // 在此使用控制台处理器
        ConsoleHandler handler = new ConsoleHandler();
        // 创建日志格式化组件
        SimpleFormatter formatter = new SimpleFormatter();

        handler.setFormatter(formatter);
        logger.addHandler(handler);

        // 设置日志打印机别
        // 此处必须将日志记录器和处理器的级别进行统一的设置，才会达到日志级别
        logger.setLevel(level);
        handler.setLevel(level);
    }
}
