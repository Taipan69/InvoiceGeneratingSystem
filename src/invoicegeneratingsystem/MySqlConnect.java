/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicegeneratingsystem;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author user
 */
class MySqlConnect {
    Connection conn = null;
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/invoicegeneratingsystem", "root", "Asdfghjkl1234567890");
                
                  return conn;
        }
        catch(Exception e){
         JOptionPane.showMessageDialog(null, "Could not connect to the database!");
         return null;
    }
}
}