/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platna.lista;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
//konekcija na bazu
public class db {
    
    Connection conn = null;
    public static Connection java_db(){
        
       
        try{
           Class.forName("org.sqlite.JDBC");
           Connection conn =DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Boco\\Desktop\\Platna Lista\\mojabaza.sqlite");
           return conn;
           
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
        
        
        
    }
    
    
    
}
