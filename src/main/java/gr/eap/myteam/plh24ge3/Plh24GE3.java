/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package gr.eap.myteam.plh24ge3;

import gr.eap.myteam.plh24ge3.GuiGe3.MainMenu;
import java.text.SimpleDateFormat;

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
