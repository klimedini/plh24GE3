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
    private static SimpleDateFormat timestamp = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("test");

        HashMap<String, String> columns = new HashMap<>();
        Date now = new Date();
        columns.put("temperature", "3250");
        columns.put("humidity", "3260");
        columns.put("windspeedKmph", "3220");
        columns.put("uvIndex", "325");
        columns.put("weatherDesc", "'32sunny'");
        columns.put("createDate", "'" + timestamp.format(now) + "'");
        columns.put("weatherDate", "'" + sdf.format(now) + "'");
        columns.put("town", "'athens'");

        HashMap<String, String> results = DbUtil.getDataFromTable("weather", 1);
        for (Map.Entry<String, String> column : results.entrySet()) {
            System.out.println("before: " +column.getKey() + " : " + column.getValue());
        }
        //DbUtil.editDataInTable("weather", 1, columns);
        results = DbUtil.getDataFromTable("weather", 1);
        for (Map.Entry<String, String> column : results.entrySet()) {
            System.out.println("after: " +column.getKey() + " : " + column.getValue());
        }
        
        //DbUtil.deleteDataFromTable("weather", 4);

    }

}
