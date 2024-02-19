/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.eap.myteam.plh24ge3.db;

import gr.eap.myteam.plh24ge3.Plh24GE3;
import gr.eap.myteam.plh24ge3.models.Weather;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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

    public static void deleteDataFromTable(String name, int id) {
        try {
            Connection connection = connect();
            Statement statement = connection.createStatement();
            StringBuffer deleteSQL = new StringBuffer("DELETE FROM " + name.toUpperCase());
            deleteSQL.append(" WHERE ID = " + id);
            int num = statement.executeUpdate(deleteSQL.toString());
            System.out.println("deleted " + num + " rows");
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }

    public static void createTable(String name, HashMap<String, String> columns) {

        try {
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
            connection.close();
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
                if (rs.getInt(1) >= id) {
                    id = rs.getInt(1);
                }
            }
            connection.close();
            return id;
        } catch (SQLException ex) {
            Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public static ArrayList<Weather> getDataFromTableWithId(String tableName, int id) {
        ArrayList<Weather> results = new ArrayList<Weather>();
        try {
            Connection connection = connect();
            Statement statement = connection.createStatement();
            StringBuffer getSQL = new StringBuffer("SELECT * FROM " + tableName.toUpperCase() + " WHERE ID=" + id);
            ResultSet rs = statement.executeQuery(getSQL.toString());

            while (rs.next()) {
                Weather row = new Weather();
                row.setId(rs.getInt("id"));
                row.setTemperature(rs.getInt("temperature"));
                row.setHumidity(rs.getInt("humidity"));
                row.setWindspeedKmph(rs.getInt("windspeedKmph"));
                row.setUvIndex(rs.getInt("uvIndex"));
                row.setWeatherDesc(rs.getString("weatherDesc"));
                row.setCreateDate(rs.getString("createDate"));
                row.setWeatherDate(rs.getString("weatherDate"));
                row.setTown(rs.getString("town"));
                results.add(row);

            }
            connection.close();
            return results;
        } catch (SQLException ex) {
            Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static ArrayList<Weather> getDataFromTableWithName(String tableName, String townName) {
        ArrayList<Weather> results = new ArrayList<Weather>();
        try {
            Connection connection = connect();
            Statement statement = connection.createStatement();
            StringBuffer getSQL = new StringBuffer("SELECT * FROM " + tableName.toUpperCase() + " WHERE TOWN = '" + townName+"'");
            System.out.println(getSQL.toString());
            ResultSet rs = statement.executeQuery(getSQL.toString());

            while (rs.next()) {
                Weather row = new Weather();
                row.setId(rs.getInt("id"));
                row.setTemperature(rs.getInt("temperature"));
                row.setHumidity(rs.getInt("humidity"));
                row.setWindspeedKmph(rs.getInt("windspeedKmph"));
                row.setUvIndex(rs.getInt("uvIndex"));
                row.setWeatherDesc(rs.getString("weatherDesc"));
                row.setCreateDate(rs.getString("createDate"));
                row.setWeatherDate(rs.getString("weatherDate"));
                row.setTown(rs.getString("town"));
                results.add(row);

            }
            connection.close();
            return results;
        } catch (SQLException ex) {
            Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public static void editDataInTable(String name, int id, Weather columns) {
        try {
            Connection connection = connect();
            Statement statement = connection.createStatement();
            ArrayList<Weather> result = getDataFromTableWithId(name, id);
            if (result != null) {
                addDataInTable(name, id, columns);
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static void addDataInTable(String name, int id, Weather columns) {
        try {
            Connection connection = connect();
            Statement statement = connection.createStatement();
            String query = "";
            if (id == -1) {
                System.out.println("add new row in db");
                id = getCounterForTable(name)+1;
                System.out.println("new id: " + id);
               query = columns.getCreateQuery().replace("--id--", String.valueOf(id));
               System.out.println(query);
            } else {
                query = columns.getUpdateQuery();
            }

            System.out.println("editSQL: " + query);
            statement.executeUpdate(query);
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void addDataInTable(String name, Weather columns) {
        addDataInTable(name, -1, columns);
    }

}
