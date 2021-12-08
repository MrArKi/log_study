package com.zp;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

/**
 * TODO
 *
 * @author pengz
 * @since 2021/12/8
 */
public class test {
    /**
     * jcl使用原则：默认使用jul如果有log4j优先使用log4j
     */
    @Test
    public void test01() {
        Log log = LogFactory.getLog(this.getClass());
        log.trace("info 信息");
        log.info("info 信息");
        log.error("info 信息");
        log.fatal("info 信息");

    }
}
