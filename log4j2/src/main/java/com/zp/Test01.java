package com.zp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * TODO
 *
 * @author pengz
 * @since 2021/12/18
 */
public class Test01 {

    /**
     * 入门
     * 默认error日志级别
     */
    @Test
    public void test01() {
        Logger logger = LogManager.getLogger(this.getClass());
        logger.fatal("fatal信息");
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }
}
