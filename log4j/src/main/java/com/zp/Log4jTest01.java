package com.zp;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.helpers.LogLog;
import org.junit.Test;

/**
 * @author pengz
 * @since 2021/12/1
 */
public class Log4jTest01 {

//    private Logger logger = Logger.getLogger(this.getClass());

    /**
     * 日志级别说明：
     * ALL 最低级别，打开所有级别日志记录
     * TRACE 程序推进下的追踪信息，一般不使用
     * DEBUG 主要配合开发过程中打印重要信息用于调试
     * INFO 消息的粗粒度级别运行信息
     * WARN 表示警告，程序运行过程中会出现的可能会发生的隐形的错误（不是错误，是告警）
     * ERROR 系统错误信息 发生的错误不影响系统运行，一般情况下，如果不想输出太多日志，可以使用该级别
     * FATAL 表示严重错误，他是一旦发生系统就不可能继续运行的严重错误
     * OFF 最高级别，用户关闭所有日志记录
     * 其中DEBUG是默认级别
     */
    @Test
    public void test01() {
        // 初始化配置
        BasicConfigurator.configure();

//        printAll();
    }

    /**
     * log4j配置文件使用
     */
    @Test
    public void test02() {
//        printAll();
    }

    @Test
    public void test03() {
        LogLog.setInternalDebugging(true);
        Logger logger = Logger.getLogger(Log4jTest01.class);
        logger.fatal("fatal信息");
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }

    @Test
    public void test04() {
        LogLog.setInternalDebugging(true);
        Logger logger = Logger.getLogger(Log4jTest01.class);
        logger.fatal("fatal信息");
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }

    @Test
    public void test05() {
        LogLog.setInternalDebugging(true);
        Logger logger = Logger.getLogger(Log4jTest01.class);
        logger.fatal("fatal信息");
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }

//    private void printAll() {
//        logger.fatal("fatal信息");
//        logger.error("error信息");
//        logger.warn("warn信息");
//        logger.info("info信息");
//        logger.debug("debug信息");
//        logger.trace("trace信息");
//    }
}
