package utils;


import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HttpHelper {

    public  static String UpLoadFileFromUrlToOther(String sourceUrl, String targetUrl, Map<String,String> map){

        try {
            UploaderDownloader up = new UploaderDownloader();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static  String SendPost(String url, Map<String,String> map) {

        String result = null;
        CloseableHttpClient httpclient = HttpClients.createDefault();

        List<NameValuePair> parameters = new ArrayList<NameValuePair>();

        HttpPost httpPost = new HttpPost(url);
        for (Map.Entry<String, String> entry : map.entrySet()) {

            parameters.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
        }
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(parameters, Consts.UTF_8);

        httpPost.setEntity(entity);
        try {
            CloseableHttpResponse response = httpclient.execute(httpPost);
            HttpEntity entity1 = response.getEntity();
            result= EntityUtils.toString(entity1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
