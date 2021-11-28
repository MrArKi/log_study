package com.zp;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * @author pengz
 * @since 2021/11/28
 */
public class JULTest2 {

    @Test
    public void test02() throws Exception {
        // 需要搭配handler才能设置级别
        InputStream inputStream = new FileInputStream("E:\\ideaproject\\log_study\\JUL\\src\\main\\resources\\logging.properties");
        LogManager logManager = LogManager.getLogManager();

        logManager.readConfiguration(inputStream);
        Logger logger = Logger.getLogger("com.zp.JULTest2");

        logger.severe("severe1000");
        logger.warning("warning900");
        logger.info("info800");
        logger.config("config700");
        logger.fine("fine500");
        logger.finer("finer400");
        logger.finest("finest300");
    }

}
