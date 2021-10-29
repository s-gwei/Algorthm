package com.sun.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * author sungw
 *
 * @description 解析网页数据
 * @date 2021/5/20
 */
public class MyJsoup {
    public static void main(String[] args) throws IOException {
        //使用Jsoup向服务器发送请求
        Document doc =  Jsoup.connect("https://www.taobao.com/").get();
        //使用Jsoup解析css
//        Elements element = doc.getElementsByTag("a");
//        String str = element.text();
//        String[] strs= str.split(" ");
//        for(String  s : strs){
//            System.out.println(s);
//        }
//        System.out.println(element);


        Elements element = doc.select("a");
        for(Element ele:element){
            System.out.println(ele.text()+":"+ele.attr("href"));
        }
    }
}
