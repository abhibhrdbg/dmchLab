/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author h0rcrx
 */
public class DbLoginHelpers {
    Connection conn;
    Statement stmt;
    ResultSet rs;
    public String login(String username, String password){
        conn = DbConnection.Main();
        String sql = "SELECT * FROM users WHERE username = '"+username+"' AND password = '"+password+"'";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            if(rs != null){
                while(rs.next()){
                    return rs.getString("type");   
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Invalid Login Credentials!!");
            return null;
        }
        
        return null;
    }
}
