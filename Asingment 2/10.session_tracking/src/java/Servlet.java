/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author devanshi
 */
@WebServlet(urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
             HttpSession session = request.getSession(true);
 
        // Get session creation time.
        Date createTime
            = new Date(session.getCreationTime());
 
        // Get last access time of this web page.
        Date lastAccessTime
            = new Date(session.getLastAccessedTime());
 
        String title = "Welcome Back Rahul";
        Integer visitCount = 0;
        String visitCountKey = "visitCount";
        String userIDKey = "userID";
        String userID = "Devanshi Akbari";
 
        // Check if this is new comer on your web page.
        if (session.isNew()) {
            title = "Welcome Devanshi";
            session.setAttribute(userIDKey, userID);
        }
        else {
            visitCount = (Integer)session.getAttribute(
                visitCountKey);
            visitCount = visitCount + 1;
            userID
                = (String)session.getAttribute(userIDKey);
        }
        session.setAttribute(visitCountKey, visitCount);
 
        // Set response content type
        response.setContentType("text/html");        
 
        String docType
            = "<!doctype html public \"-//w3c//dtd html 4.0 "
              + "transitional//en\">\n";
 
        out.println(
            docType + "<html>\n"
            + "<head><title>" + title + "</title></head>\n"
            +
 
            "<body bgcolor = \"#f0f0f0\">\n"
            + "<h1 align = \"center\">" + title + "</h1>\n"
            + "<h2 align = \"center\">Session Information</h2>\n"
            + "<table border = \"1\" align = \"center\">\n"
            +
 
            "<tr bgcolor = \"#949494\">\n"
            + "  <th>Session info</th><th>value</th>"
            + "</tr>\n"
            +
 
            "<tr>\n"
            + "  <td>id</td>\n"
            + "  <td>" + session.getId() + "</td>"
            + "</tr>\n"
            +
 
            "<tr>\n"
            + "  <td>Creation Time</td>\n"
            + "  <td>" + createTime + "  </td>"
            + "</tr>\n"
            +
 
            "<tr>\n"
            + "  <td>Time of Last Access</td>\n"
            + "  <td>" + lastAccessTime + "</td>"
            + "</tr>\n"
            +
 
            "<tr>\n"
            + "  <td>User ID</td>\n"
            + "  <td>" + userID + "</td>"
            + "</tr>\n"
            +
 
            "<tr>\n"
            + "  <td>Number of visits</td>\n"
            + "  <td>" + visitCount + "</td>"
            + "</tr>\n"
            + "</table>\n"
            + "</body>"
            + "</html>");
    
    
            out.println("<h1>Servlet Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
}
