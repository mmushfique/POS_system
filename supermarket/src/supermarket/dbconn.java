/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.sql.*;

/**
 *
 * @author mush
 */
public class dbconn {
    private static Connection con;
    
    public dbconn(){
        String url="jdbc:mysql://localhost:3306/supermarket";
        String user="root";
        String pass="";
        con=null;
        try {
            //Load driver
            Class.forName("com.mysql.jdbc.Driver");
            
            //set the connection string through getconnection method of driver manager 
            con=DriverManager.getConnection(url,user,pass);
        } catch (Exception ex) {
              System.err.println(ex);
          }
    }
  public static Connection getConn() {
    return con; 
  }
  
 
    
}
