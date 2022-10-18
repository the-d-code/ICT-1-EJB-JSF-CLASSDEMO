/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlet;

import java.sql.*;

/**
 *
 * @author HP
 */
public class userdatabase {
    
    Connection con ;

    public userdatabase(Connection con) {
        this.con = con;
    }
    
    //for register user 
//    public boolean saveUser(user user){
//        boolean set = false;
//        try{
//            //Insert register data to database
//            
//            String query = "insert into user(name,email,password) values(?,?,?)";
//            
//           
//           PreparedStatement pt = this.con.prepareStatement(query);
//           pt.setString(1, user.getName());
//           pt.setString(2, user.getEmail());
//           pt.setString(3, user.getPassword());
//           
//           pt.executeUpdate();
//           set = true;
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        return set;
//    }
//    
    //user login
    public user login(String email, String pass){
        user usr=null;
        try{
            String query ="select * from user where email=? and password=?";
            
            
            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setString(1, email);
            pst.setString(2, pass);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                usr = new user();
                usr.setId(rs.getInt("id"));
                usr.setName(rs.getString("name"));
                usr.setEmail(rs.getString("email"));
                usr.setPassword(rs.getString("password"));
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return usr;
    }
}
