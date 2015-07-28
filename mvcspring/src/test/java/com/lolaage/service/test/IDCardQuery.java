package com.lolaage.service.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class IDCardQuery
{
    
    public static void main(String[] args)
    {
        String httpUrl = "http://apis.baidu.com/apistore/idservice/id";
        String httpArg = "id=420984198704207896";
        String jsonResult = request(httpUrl, httpArg);
        System.out.println(jsonResult);
        System.out.println("\u6e56\u5317\u7701\u5b5d\u611f\u5e02\u6c49\u5ddd\u5e02");
    }
    
    /**
     * @param urlAll :请求接口
     * @param httpArg :参数
     * @return 返回结果
     */
    public static String request(String httpUrl, String httpArg)
    {
        BufferedReader reader = null;
        String result = null;
        StringBuffer sbf = new StringBuffer();
        httpUrl = httpUrl + "?" + httpArg;
        
        try
        {
            URL url = new URL(httpUrl);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("GET");
            // 填入apikey到HTTP header
            connection.setRequestProperty("apikey", "23964cb894b88fa5ceb9695376fba3ce");
            connection.connect();
            InputStream is = connection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            String strRead = null;
            while ((strRead = reader.readLine()) != null)
            {
                sbf.append(strRead);
                sbf.append("\r\n");
            }
            reader.close();
            result = sbf.toString();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }
    
}
