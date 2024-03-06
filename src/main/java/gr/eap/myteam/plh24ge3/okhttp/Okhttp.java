/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.eap.myteam.plh24ge3.okhttp;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 *
 * @author alex
 */
public class Okhttp {

    public static JsonObject connect(String townName) {
        String urlToCall
                = "https://wttr.in/"+townName+"?format=j1";
        System.out.println("urlToCall: " + urlToCall);

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder().url(urlToCall).build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful() && response.body() != null) {
                String responseString = response.body().string();
                System.out.println(responseString);
                JsonObject responseJson = new Gson().fromJson(responseString, JsonObject.class);
                return responseJson;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    

}
