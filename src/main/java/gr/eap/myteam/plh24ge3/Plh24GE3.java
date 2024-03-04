/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package gr.eap.myteam.plh24ge3;

import gr.eap.myteam.plh24ge3.GuiGe3.MainMenu;
import gr.eap.myteam.plh24ge3.db.DbUtil;
import gr.eap.myteam.plh24ge3.models.Weather;
import gr.eap.myteam.plh24ge3.okhttp.Okhttp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
        new MainMenu().setVisible(true);
    }

}
