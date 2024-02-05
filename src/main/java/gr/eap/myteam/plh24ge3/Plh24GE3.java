/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gr.eap.myteam.plh24ge3;

import gr.eap.myteam.plh24ge3.db.DbUtil;
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
    private static SimpleDateFormat timestamp =   new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public static void main(String[] args) {
        System.out.println("Hello World!"); 
        System.out.println("test"); 
        //DbUtil.connect();
//        HashMap<String,String> columns = new HashMap<>();
//        Date now = new Date();
//        columns.put("temperature", "250");
//        columns.put("humidity", "260");
//        columns.put("windspeedKmph", "220");
//        columns.put("uvIndex", "25");
//        columns.put("weatherDesc", "'2sunny'");
//        columns.put("createDate", "'"+timestamp.format(now)+"'");
//        columns.put("weatherDate", "'"+sdf.format(now)+"'");
//        columns.put("town", "'athens'");
        //DbUtil.createTable("weather", columns);
        
//        DbUtil.editDataInTable("weather", columns);
        
        
    }

}
