package org.yqj.net.demo.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by yaoqijun on 2016/12/8.
 */
public class MainTest {

    private static final Logger logger = LoggerFactory.getLogger(MainTest.class);

    public static void main(String[] args) {
        logger.debug("test out put logger debug");
        logger.info("test output logger content");
        logger.warn("test output logger warn");
        logger.error("test output logger error");
    }

}
