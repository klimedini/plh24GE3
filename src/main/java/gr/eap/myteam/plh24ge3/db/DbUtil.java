/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.eap.myteam.plh24ge3.db;

import gr.eap.myteam.plh24ge3.Plh24GE3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex
 */
public class DbUtil {
// TABLES THAT ALREADY CREATED
    //    HashMap<String,String> columns = new HashMap<>();
//        DbUtil.createTable("testTable", columns);
//        columns.put("type", "integer not null");
//        columns.put("place", "varchar(50)");
//        columns.put("createDate", "date");
//        columns.put("Switch", "boolean");

    //    HashMap<String,String> columns = new HashMap<>();
//        DbUtil.createTable("weather", columns);
//        columns.put("temperature", "integer not null");
//        columns.put("humidity", "integer not null");
//        columns.put("windspeedKmph", "integer not null");
//        columns.put("uvIndex", "integer not null");
//        columns.put("weatherDesc", "varchar(50) not null");
//        columns.put("createDate", "timestamp not null");
//        columns.put("weatherDate", "date not null");
//        columns.put("town", "varchar(100) not null");
    
// TEST DATA FOR TABLE WEATHER 
//    HashMap<String,String> columns = new HashMap<>();
//    Date now = new Date();
//        columns.put("temperature", "250");
//        columns.put("humidity", "260");
//        columns.put("windspeedKmph", "220");
//        columns.put("uvIndex", "25");
//        columns.put("weatherDesc", "'2sunny'");
//        columns.put("createDate", "'"+timestamp.format(now)+"'");
//        columns.put("weatherDate", "'"+sdf.format(now)+"'");
//        columns.put("town", "'athens'");
//        DbUtil.createTable("weather", columns);
    public static Connection connect() {
        try {
            String protocol = "jdbc:derby:";
            String connectionString = protocol + "./derbyDB;create=true";
            Connection connection = DriverManager.getConnection(connectionString);
            System.out.println("connect successful");
            return connection;
        } catch (Exception ex) {
            Logger.getLogger(Plh24GE3.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void createTable(String name, HashMap<String, String> columns) {
        Connection connection = connect();
        StringBuffer createSQL = new StringBuffer("CREATE TABLE " + name.toUpperCase());
        createSQL.append("(ID INTEGER NOT NULL PRIMARY KEY");
        for (Map.Entry<String, String> column : columns.entrySet()) {
            createSQL.append(", ");
            System.out.println("column name: " + column.getKey().toUpperCase());
            System.out.println("column type: " + column.getValue().toUpperCase());
            createSQL.append(column.getKey().toUpperCase() + " " + column.getValue().toUpperCase());
        }
        createSQL.append(") ");
        try {
            if (!columns.isEmpty()) {
                System.out.println("create sql string: " + createSQL.toString());
                Statement statement = connection.createStatement();
                statement.executeUpdate(createSQL.toString());
                statement.close();
                connection.close();
                System.out.println("Create table successful");
            }
            //String insertSQL = "INSERT INTO D_USER VALUES(1,'Athanasia','12345')";
            //statement.executeUpdate(insertSQL);
        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }

    public static int getCounterForTable(String name) {
        int id = 0;
        try {
            Connection connection = connect();
            Statement statement = connection.createStatement();

            String query = "SELECT ID FROM " + name.toUpperCase();
            System.out.println("query: " + query);
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                if(rs.getInt(1) >= id){
                    id = rs.getInt(1);
                }
            }
            return id;
        } catch (SQLException ex) {
            Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public static void editDataInTable(String name, HashMap<String, String> columns) {
        try {
            Connection connection = connect();
            Statement statement = connection.createStatement();
            int id = getCounterForTable(name);
            System.out.println("id found: " + id);
             System.out.println("id to save: " + ++id);
            StringBuffer editSQL = new StringBuffer("INSERT INTO " + name.toUpperCase() + "(ID");
            StringBuffer valuesSQL = new StringBuffer(" VALUES(" + id);
            for (Map.Entry<String, String> column : columns.entrySet()) {
                editSQL.append(", ");
                valuesSQL.append(", ");
               // System.out.println("column name: " + column.getKey().toUpperCase());
                //System.out.println("column type: " + column.getValue());
                editSQL.append(column.getKey().toUpperCase());
                valuesSQL.append(column.getValue());
            }
            editSQL.append(")");
            valuesSQL.append(")");

            editSQL.append(valuesSQL.toString());
            System.out.println("editSQL: " + editSQL);
           statement.executeUpdate(editSQL.toString());
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
