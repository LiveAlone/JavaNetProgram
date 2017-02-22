package org.yqj.net.demo.logger;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/**
 * Created by yaoqijun on 2016/12/8.
 */
public class NetworkInterfaceTest {
    public static void main(String[] args) throws Exception {
        InetAddress inetAddress = InetAddress.getByName("localhost");
        NetworkInterface networkInterface = NetworkInterface.getByInetAddress(inetAddress);
        if(networkInterface == null){
            System.out.println("net work interface is empty");
        }else {

            Enumeration<NetworkInterface> enumeration = networkInterface.getNetworkInterfaces();
            while (enumeration.hasMoreElements()){
                System.out.println(enumeration.nextElement());
            }

        }
    }
}
