/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.eap.myteam.plh24ge3.okhttp;

/**
 *
 * @author alex
 */
public class Okhttp {

    public void connect() {
        String urlToCall
                = " your url goes here";

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder().url(urlToCall).build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful() && response.body() != null) {
                String responseString = response.body().string();
                System.out.println(responseString);
                return responseString;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

}
