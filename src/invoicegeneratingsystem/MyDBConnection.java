/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicegeneratingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class MyDBConnection {
    
    private Connection connection;
    
    public MyDBConnection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
    public void createConnection(String host, String username, String password)
    {
        try
        {
            connection = DriverManager.getConnection(host,username,password);
            
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
    }
    
    public Connection getConnection()
    {
        return connection;
    }
    
    public void closeConnection()
    {
        try
        {
            connection.close();
        }
        
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new MyDBConnection();
    }
    
}
