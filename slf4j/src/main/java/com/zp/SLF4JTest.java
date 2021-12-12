package com.zp;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TODO
 *
 * @author pengz
 * @since 2021/12/8
 */
public class SLF4JTest {

    /**
     * 级别：TRACE,DEBUG,INFO（默认）,WARN,ERROR
     */
    @Test
    public void test01() {
        Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.trace("trace信息");
        logger.debug("debug信息");
        logger.info("info信息");
        logger.warn("warn信息");
        logger.error("error信息");
    }


}
