/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.eap.myteam.plh24ge3.models;

/**
 *
 * @author alex
 */
public class Searches {
    
    private int id;
    private String town;
    private int timesSearched;
public Searches() {
    }
    public Searches(int id, String town, int timesSearched) {
        this.id = id;
        this.town = town;
        this.timesSearched = timesSearched;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Searches{" + "id=" + id + ", town=" + town + ", timesSearched=" + timesSearched + '}';
    }


    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getTimesSearched() {
        return timesSearched;
    }

    public void setTimesSearched(int timesSearched) {
        this.timesSearched = timesSearched;
    }
    
        public String getCreateQuery() {
        StringBuffer query = new StringBuffer("INSERT INTO SEARCHES (ID, TOWN, TIMESSEARCHED)");
        StringBuffer valuesSQL = new StringBuffer(" VALUES( --id--, ");
        valuesSQL.append("'" +getTown()+"'" + ", ");
        valuesSQL.append(getTimesSearched());
        valuesSQL.append(")");
        query.append(valuesSQL.toString());
        return query.toString();
    }
    
     public String getUpdateQuery() {
        StringBuffer query = new StringBuffer("UPDATE SEARCHES SET ");
        query.append("TIMESSEARCHED = "+getTimesSearched()+ ",");
        query.append("TOWN = "+"'"+getTown()+"'");
        query.append(" WHERE ID = " + getId());
        return query.toString();
    }
    
    
    
}
