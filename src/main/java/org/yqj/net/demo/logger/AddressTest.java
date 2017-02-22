package org.yqj.net.demo.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;

/**
 * Created by yaoqijun on 2016/12/8.
 */
public class AddressTest {

    private static final Logger logger = LoggerFactory.getLogger(AddressTest.class);

    public static void main(String[] args) throws Exception {

//        InetAddress[] addresses = InetAddress.getAllByName("www.baidu.com");
//        for (InetAddress address : addresses) {
//            logger.info("current address is :{}", address);
//        }

//        InetAddress localHostAddress = InetAddress.getLocalHost();
//        logger.info("localhost canonical host is :{}", localHostAddress.getCanonicalHostName());
//        logger.info("localhost info is :{}", localHostAddress.getHostAddress());
//        logger.info("localhost address is :{}", localHostAddress.getAddress());

        logger.info("localhost host name by ip : {}", InetAddress.getByName("www.baidu.com").getCanonicalHostName());
    }

}
