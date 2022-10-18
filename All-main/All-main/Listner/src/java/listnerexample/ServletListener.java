/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/ServletListener.java to edit this template
 */
package listnerexample;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.*;
import javax.servlet.ServletContext;

/**
 * Web application lifecycle listener.
 *
 * @author HP
 */
public class ServletListener implements ServletContextListener {
    
    static Connection c = null;
        
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","nayan2101");
            ServletContext ctx =sce.getServletContext();
            ctx.setAttribute("mycon", c);
            
        }catch(Exception e){}
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
