package org.yqj.net.demo.logger;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

/**
 * Created by yaoqijun on 2016/12/8.
 */
public class URLBaseTest {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://www.sina.com.cn/");
        InputStream inputStream = new BufferedInputStream(url.openConnection().getInputStream());
        Reader reader = new InputStreamReader(inputStream);
        int c;
        while ((c = reader.read()) != -1){
            System.out.print((char) c);
        }
        inputStream.close();
    }
}
