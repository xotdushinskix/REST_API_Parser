package com.api.parser.main;

import com.api.parser.request.GetRequest;
import com.api.parser.service.AlbumService;
import org.json.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by nikita on 15.12.16.
 */
public class MainHelp {

    public static void main(String[] args) throws IOException {

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:/home/nikita/HomeJava/REST_API_Parser/src/main/resources/beans.xml");
//        AlbumService albumService = applicationContext.getBean(AlbumService.class);

        GetRequest getRequest = new GetRequest();
        getRequest.getRequest();

        //System.out.println(getRequest.getRequest());

    }

}
