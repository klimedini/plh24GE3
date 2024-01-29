/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gr.eap.myteam.plh24ge3;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex
 */
public class Plh24GE3 {

    public static void main(String[] args) {
        System.out.println("Hello World!"); 
        System.out.println("test"); 
        connect();
        
        
    }
    
    private static Connection connect(){
        try {
            //String driver = "org.apache.derby.jdbc.EmbeddedDriver";
           // Object kati = Class.forName(driver).newInstance();
             String protocol = "jdbc:derby:";
            String connectionString = protocol+"./derbyDB;create=true";
            Connection connection = DriverManager.getConnection(connectionString);
            return connection;
        } catch (Exception ex) {
            Logger.getLogger(Plh24GE3.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
