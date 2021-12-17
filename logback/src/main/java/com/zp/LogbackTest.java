package com.zp;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TODO
 *
 * @author pengz
 * @since 2021/12/17
 */
public class LogbackTest {

    /**
     * 默认日志级别是debug
     */
    @Test
    public void test01() {
        Logger logger = LoggerFactory.getLogger(this.getClass());

        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }

    @Test
    public void test02() {
        Logger logger = LoggerFactory.getLogger(this.getClass());
        // logback配置文件的使用
        // 测试拆分归档
        for (int i = 0; i < 1000; i++) {
            logger.error("error信息");
            logger.warn("warn信息");
            logger.info("info信息");
            logger.debug("debug信息");
            logger.trace("trace信息");
        }

    }

    @Test
    public void test03() {
        Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }
}
