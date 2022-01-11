/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs345.gui.project;

import java.sql.*;

/**
 *
 * @author garry
 */
public class CS345GUIProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        MainMenu menu = new MainMenu();
        
        menu.setVisible( true );
        
        
    }
    
    public static Connection getConnection() throws Exception
    {
        try
        {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://127.0.0.1:3306/enrollment?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String username = "root";
            String password = "Anche0397rry@";
            Class.forName( driver );
            Connection currConnection = DriverManager.getConnection( url, username, password );
            System.out.println("Connected to the database....");
            return currConnection;
        }
        catch ( Exception error )
        {
            System.out.println( error );
        }
     
        return null;
    }
        
    
}
