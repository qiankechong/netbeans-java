/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author xinning
 */
public class JavaApplicationMysql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
    {
       Class.forName("com.mysql.jdbc.Driver").newInstance();
       Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql","root", "");
       Statement stmt = (Statement) conn.createStatement();
       ResultSet result = (ResultSet) stmt.executeQuery("select * from user");
       String str = "";
       while(result.next())
       {
            String tmp = result.getString("username");
            str += tmp;
        }
       System.out.println("jkl;");
       // JOptionPane.showMessageDialog(null, str);
    }   
    catch(java.lang.Exception ex)
    {
       System.out.println("%kkkk");
    }

    }
    
}
