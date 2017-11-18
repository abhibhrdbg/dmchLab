/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*; 
import javax.swing.JOptionPane;
/**
 *
 * @author h0rcrx
 */
public class DbConnection {
    public static Connection Main(){
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dmchLab","root","@bh1sh3k");  
            //here sonoo is database name, root is username and password  
            if(con!=null){
                //JOptionPane.showMessageDialog(null,"Connection Established!!");  
            }
            return con;
        }catch( ClassNotFoundException | SQLException e){
            System.out.println(e);
            return null;
        }  
    }  
}

