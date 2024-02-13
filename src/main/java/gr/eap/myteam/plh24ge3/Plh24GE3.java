/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package gr.eap.myteam.plh24ge3;

import gr.eap.myteam.plh24ge3.GE3GUI.GE3GUI;
import gr.eap.myteam.plh24ge3.GuiGe3.GuiGe3;
import gr.eap.myteam.plh24ge3.db.DbUtil;
import gr.eap.myteam.plh24ge3.models.Weather;
import gr.eap.myteam.plh24ge3.okhttp.Okhttp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex
 */
public class Plh24GE3 {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private static SimpleDateFormat timestamp = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("test");
//        Date now = new Date();
//        Weather columns = new Weather(15, 70, 10, 3, "kalws2", timestamp.format(now) ,  sdf.format(now) , "athens");
//DbUtil.addDataInTable("weather", columns);
//        Weather results = DbUtil.getDataFromTable("weather", 4);
//        System.out.println(results.toString());
//        results.setWeatherDesc("kalws4");
        
//        DbUtil.editDataInTable("weather", results.getId(), results);
//        results = DbUtil.getDataFromTable("weather", results.getId());
//        System.out.println(results.toString());
        
        new GuiGe3().setVisible(true);
        
        Okhttp.connect();

        //DbUtil.deleteDataFromTable("weather", 4);
    }

}
