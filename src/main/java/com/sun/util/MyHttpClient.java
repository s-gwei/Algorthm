package com.sun.util;

import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * author sungw
 *
 * @description 爬取数据
 * @date 2021/5/20
 */
public class MyHttpClient {
    public static void main(String[] args) throws IOException {
        CloseableHttpClient httpClient = null;
        // 通过址默认配置创建一个httpClient实例
        httpClient = HttpClients.createDefault();
//        HttpClient httpClient = new DefaultHttpClient();
//         httpClient.getParams()
//                .setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT,10000)
//                .setParameter(CoreConnectionPNames.SO_TIMEOUT,10000)
//                .setParameter(ConnRouteParams.DEFAULT_PROXY,new HttpHost("201.55.119.43",1080));
        //爬虫url大部分都是get请求
        String str = "http://www.itcast.cn";
        HttpGet httpGet = new HttpGet(str);
        // 执行get请求得到返回对象
        CloseableHttpResponse response =  httpClient.execute(httpGet);
        //将网页解析
        String content  = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(content);

    }

}
