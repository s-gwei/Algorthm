package com.sun.util;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class Demo {

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.authDemo();
//        demo2();
    }

    public void authDemo() {
        String ip = "http://61.243.3.162:8088/dbo-service/api/v1/user/auth2/";
        String url = ip + "realNameAuthentication";
        String accessKeyId = "l1oIQus9415FTDAowT/4Sw==";
        String accessKeyString = "k04BHQIlKt7in2XPZwGdTFT2IBcc24GNSJHyIMNoKw4=";
        JSONObject userJson = new JSONObject();
        JSONObject sendJson = new JSONObject();
        userJson.put("name", "程浩");
        userJson.put("idCard", "420625199410052532");
        String data = userJson.toString();
        String verifyDigest = data + accessKeyId + accessKeyString;
        sendJson.put("data", data);
        sendJson.put("accessKeyId", accessKeyId);
        sendJson.put("signature", BCDigestUtil.digestSM3(verifyDigest.getBytes()));
//        System.out.println(sendJson);
//        HttpClientUtil http = new HttpClientUtil();
        CloseableHttpClient httpClient = HttpClients.createDefault();
//        String res = httpClient.doPost(url, sendJson, "UTF-8");
//        System.out.println(res);
    }

}
