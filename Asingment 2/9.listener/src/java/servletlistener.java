
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.*;
import javax.servlet.ServletContext;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/ServletListener.java to edit this template
 */

/**
 * Web application lifecycle listener.
 *
 * @author root
 */
public class servletlistener implements ServletContextListener {
    static Connection c=null;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?autoReconnect=true&useSSL=false","root","D3382");
            ServletContext ctx=sce.getServletContext();
            ctx.setAttribute("mycon",c);
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
