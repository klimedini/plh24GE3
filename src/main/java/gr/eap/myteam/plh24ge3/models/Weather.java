/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.eap.myteam.plh24ge3.models;

import java.util.Date;

/**
 *
 * @author alex
 */
public class Weather {

    private int id;
    private int temperature;
    private int humidity;
    private int windspeedKmph;
    private int uvIndex;
    private String weatherDesc;
    private String createDate;
    private String weatherDate;
    private String town;

    public Weather(int temperature, int humidity, int windspeedKmph, int uvIndex, String weatherDesc, String createDate, String weatherDate, String town) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.windspeedKmph = windspeedKmph;
        this.uvIndex = uvIndex;
        this.weatherDesc = weatherDesc;
        this.createDate = createDate;
        this.weatherDate = weatherDate;
        this.town = town;
    }

    public Weather() {
    }

    public Weather(int id, int temperature, int humidity, int windspeedKmph, int uvIndex, String weatherDesc, String createDate, String weatherDate, String town) {
        this.id = id;
        this.temperature = temperature;
        this.humidity = humidity;
        this.windspeedKmph = windspeedKmph;
        this.uvIndex = uvIndex;
        this.weatherDesc = weatherDesc;
        this.createDate = createDate;
        this.weatherDate = weatherDate;
        this.town = town;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getWindspeedKmph() {
        return windspeedKmph;
    }

    public void setWindspeedKmph(int windspeedKmph) {
        this.windspeedKmph = windspeedKmph;
    }

    public int getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(int uvIndex) {
        this.uvIndex = uvIndex;
    }

    public String getWeatherDesc() {
        return weatherDesc;
    }

    public void setWeatherDesc(String weatherDesc) {
        this.weatherDesc = weatherDesc;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getWeatherDate() {
        return weatherDate;
    }

    public void setWeatherDate(String weatherDate) {
        this.weatherDate = weatherDate;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "Weather{" + "id=" + id + ", temperature=" + temperature + ", humidity=" + humidity + ", windspeedKmph=" + windspeedKmph + ", uvIndex=" + uvIndex + ", weatherDesc=" + weatherDesc + ", createDate=" + createDate + ", weatherDate=" + weatherDate + ", town=" + town + '}';
    }

    public String getCreateQuery() {
        StringBuffer query = new StringBuffer("INSERT INTO WEATHER (ID, TEMPERATURE, HUMIDITY, WINDSPEEDKMPH, UVINDEX, WEATHERDESC, CREATEDATE, WEATHERDATE, TOWN)");
        StringBuffer valuesSQL = new StringBuffer(" VALUES( --id--, ");
        valuesSQL.append(getTemperature() + ", ");
        valuesSQL.append(getHumidity() + ", ");
        valuesSQL.append(getWindspeedKmph() + ", ");
        valuesSQL.append(getUvIndex() + ", ");
        valuesSQL.append("'"+getWeatherDesc()+"'" + ", ");
        valuesSQL.append("'"+getCreateDate()+"'"  + ", ");
        valuesSQL.append("'"+getWeatherDate()+"'"  + ",");
        valuesSQL.append("'" +getTown()+"'" );
        valuesSQL.append(")");
        query.append(valuesSQL.toString());
        return query.toString();
    }
    
     public String getUpdateQuery() {
        StringBuffer query = new StringBuffer("UPDATE WEATHER SET ");
        query.append("TEMPERATURE = " + getTemperature() + ", ");
        query.append("HUMIDITY = "+getHumidity() + ", ");
        query.append("WINDSPEEDKMPH = "+getWindspeedKmph() + ", ");
        query.append("UVINDEX = " + getUvIndex() + ", ");
        query.append("WEATHERDESC = " + "'"+getWeatherDesc()+"'" + ", ");
        query.append("CREATEDATE = "+"'"+getCreateDate() +"'"+ ", ");
        query.append("WEATHERDATE = "+"'"+getWeatherDate() +"'"+ ",");
        query.append("TOWN = "+"'"+getTown()+"'");
        query.append(" WHERE ID = " + getId());
        return query.toString();
    }

}
