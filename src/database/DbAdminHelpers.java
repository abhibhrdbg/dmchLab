/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author h0rcrx
 */
public class DbAdminHelpers {
    Connection conn =null;
    ResultSet rs =null;
    PreparedStatement stmt =null;
    Statement cursor =null;
    String sql = null;
    
    public DbAdminHelpers(){
        conn = conn = database.DbConnection.Main();
    }
    //helper functions for getting Table records
    public ResultSet getTableRecords(String table){
        sql = "SELECT * FROM "+table;
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if(rs != null){
                return rs;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unable to query database!!");
            return null;
            //Logger.getLogger(DbAdminHelpers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void insertIntoUnits(String unit){
       sql = "INSERT INTO units (name) VALUES('"+unit+"')";
       insert();
    }
    
     public void insertIntoGroups(String group){
       sql = "INSERT INTO groups (name) VALUES('"+group+"')";
       insert();
    }
     
      public void insertIntoCategory(String category){
       sql = "INSERT INTO category (name) VALUES('"+category+"')";
       insert();
        
    }
     
      public void insertIntoDepartments(String department,String hod){
       sql = "INSERT INTO departments (name,hod) VALUES('"+department+"','"+hod+"')";
       insert();
    }
      
      public void insertIntoLabs(String name,String location, String phone){
       sql = "INSERT INTO labs (name,location,phone) VALUES('"+name+"','"+location+"','"+phone+"')";
       insert();
    }
      
       public void insertIntoDoctors(String name,String degree, String phone){
       sql = "INSERT INTO labs (name,degree,phone) VALUES('"+name+"','"+degree+"','"+phone+"')";
       insert();
    }
        public void insertIntoTechnicians(String name,String degree, String phone){
       sql = "INSERT INTO technicians (name,degree,phone) VALUES('"+name+"','"+degree+"','"+phone+"')";
       insert();
    }
      
      private void insert(){
          try {
            stmt = conn.prepareStatement(sql);
            stmt.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"unable to insert data");
            Logger.getLogger(DbAdminHelpers.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
      
    
    //helper functions for Groups
    /*
    public ResultSet getGroups(){
        sql = "SELECT * FROM groups";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if(rs != null){
                return rs;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unable to query database!!");
            return null;
            //Logger.getLogger(DbAdminHelpers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */
    
    //helper functions for units
    /*
    public ResultSet getUnits(){
        sql = "SELECT * FROM units";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if(rs != null){
                return rs;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unable to query database!!");
            return null;
            //Logger.getLogger(DbAdminHelpers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */
    
    
    
    //helper functions for Cateegory
    /*
    public ResultSet getCategory(){
        sql = "SELECT * FROM category";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if(rs != null){
                return rs;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unable to query database!!");
            return null;
            //Logger.getLogger(DbAdminHelpers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */
    
    
    //helper functions for Cateegory
    /*
    public ResultSet getDepartments(){
        sql = "SELECT * FROM departments";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if(rs != null){
                return rs;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unable to query database!!");
            return null;
            //Logger.getLogger(DbAdminHelpers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */
    //helper functions for Labs
    /*
    public ResultSet getLabs(){
        sql = "SELECT * FROM labs";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if(rs != null){
                return rs;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unable to query database!!");
            return null;
            //Logger.getLogger(DbAdminHelpers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */
    
    
    //helper functions for Doctors
    /*
    public ResultSet getDoctors(){
        sql = "SELECT * FROM doctors";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if(rs != null){
                return rs;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unable to query database!!");
            return null;
            //Logger.getLogger(DbAdminHelpers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */
    
    //helper functions for Technicians
    /*
    public ResultSet getTechnicians(){
        sql = "SELECT * FROM technicians";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if(rs != null){
                return rs;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unable to query database!!");
            return null;
            //Logger.getLogger(DbAdminHelpers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */
    
    //helper functions for Profiles
    /*
    public ResultSet getProfiles(){
        sql = "SELECT * FROM profiles";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if(rs != null){
                return rs;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unable to query database!!");
            return null;
            //Logger.getLogger(DbAdminHelpers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */
    //helper functions for Tests
    /*
    public ResultSet getTests(){
        sql = "SELECT * FROM tests";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if(rs != null){
                return rs;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unable to query database!!");
            return null;
            //Logger.getLogger(DbAdminHelpers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */
    
    //helper functions for Users

    /**
     *
     * @return 
     */
    /*
    public ResultSet getUsers(){
        sql = "SELECT * FROM users";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if(rs != null){
                return rs;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unable to query database!!");
            return null;
            //Logger.getLogger(DbAdminHelpers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */
}
