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
public class connection {
    
    private static Connection con;
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/photo","root","nayan2101");
            
//            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/store","root","nayan2101");
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
