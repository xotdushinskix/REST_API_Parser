package com.api.parser.request;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by nikita on 15.12.16.
 */
public class GetRequest {

    public JSONArray getRequest() throws IOException {

//        JSONObject productInfo = new JSONObject();
        JSONParser parser = new JSONParser();

        JSONObject responseBody = null;
        JSONArray array = null;

//        int responseStatus = 0;
//        try {
//            productInfo = (JSONObject) parser.parse(postData);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }

//        String fullURL = url + productInfo.get("productId") + "?" + "access_key=" + accessKey + "&langid="
//                + productInfo.get("langId") +  "&session_type=" + "rest";

        String fullURL = "https://jsonplaceholder.typicode.com/photos";

        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(fullURL);

        HttpResponse httpResponse = null;
        try {
            httpResponse = httpClient.execute(request);
        } catch (IOException e) {
            e.printStackTrace();
        }
        HttpEntity entity = httpResponse.getEntity();
        try {
            responseBody = (JSONObject) parser.parse(EntityUtils.toString(entity, "UTF-8"));
            array.put(responseBody);
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        responseStatus = httpResponse.getStatusLine().getStatusCode();
//        responseBody.put("responseStatus", responseStatus);
        System.out.println(responseBody.toJSONString());
        return array;
    }

}
