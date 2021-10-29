package com.sun.util;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * author sungw
 *
 * @description 爬虫程序
 * @date 2021/5/20
 */
public class HttpClientAndJsoup {
    public static void main(String[] args) throws Exception {
        //获取所有链接
        CloseableHttpClient httpClient = null;
        // 通过址默认配置创建一个httpClient实例
        httpClient = HttpClients.createDefault();
       //爬虫url大部分都是get请求
//        String str = "https://www.taobao.com";
        String str = "http://www.itcast.cn";
        HttpGet httpGet = new HttpGet(str);
        // 执行get请求得到返回对象
        CloseableHttpResponse response =  httpClient.execute(httpGet);
        //将网页解析
        String content  = EntityUtils.toString(response.getEntity(),"utf-8");
//        System.out.println(content);
        //使用Jsoup向服务器发送请求
        Document doc =  Jsoup.parse(content);
        //使用Jsoup解析css
        Elements element = doc.select("a");
        for(Element ele:element){
            System.out.println(ele.text()+":"+ele.attr("href"));
            String url = ele.attr("href");
            getHttp(url);
        }
    }

    private static void getHttp(String url) throws IOException {
        CloseableHttpClient httpClient = null;
        // 通过址默认配置创建一个httpClient实例
        httpClient = HttpClients.createDefault();
        //爬虫url大部分都是get请求
//        String str = "http://localhost:8080/invokeAction?actionsGroup=corporation&actionName=testUserOne";
        HttpGet httpGet = new HttpGet(url);
        // 执行get请求得到返回对象
        CloseableHttpResponse response =  httpClient.execute(httpGet);
        //将网页解析
        String content  = EntityUtils.toString(response.getEntity(),"utf-8");
//        System.out.println(content);
        //使用Jsoup向服务器发送请求
        Document doc =  Jsoup.parse(content);
        //使用Jsoup解析css
        Elements element = doc.select("a");
    }
}
