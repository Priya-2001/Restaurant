/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            String msAccDB = "D:/ead"
                    + "/airlinedb.accdb";
            String dbURL = "jdbc:ucanaccess://"
                    + msAccDB;

            Connection con = DriverManager.getConnection(dbURL);
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,

                        ResultSet.CONCUR_UPDATABLE);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
