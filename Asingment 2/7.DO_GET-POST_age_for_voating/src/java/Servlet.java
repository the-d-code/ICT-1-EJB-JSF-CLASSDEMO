/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Voating Checker</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   @Override
   public void doPost(HttpServletRequest req, HttpServletResponse res) 
      throws ServletException, IOException {
       PrintWriter pw = null;
       String name = null;
       String tage = null;
       int age = 0;

       // set content type
       res.setContentType("text/html");

       // get PrintWriter object
       pw = res.getWriter();

       // get form data (from req parameter)
       name = req.getParameter("pname");
       tage = req.getParameter("page");

       // convert String value to int
       age = Integer.parseInt(tage);

       // check age
       pw.println("<h1 style='text-align: center; color:blue'>"
                 + "Hello "+ name + "</h1>");
       if(age < 18) {
          pw.println("<h2 style='text-align: center; color:red'>"
                    +"You are not eligible for voting,You can vote if you are older than 18+.</h2>"
                    +"<h3 style='text-align: center; color:green'>"
                    +"Please wait for more " + (18-age) + " years.<br>"
                    +" Thank You.<h3>"
          );
       } else  {
          pw.println("<h2 style='text-align: center; color:green'>"
                    +"You are eligible for voting.</h2>"
                    +"<h3 style='text-align: center'>"
                    +"Thank You.<h3>"
          );
       }

       // close stream
       pw.close();
       
   }
    @Override
   public void doGet(HttpServletRequest req, HttpServletResponse resp) 
       throws ServletException, IOException {
     doPost(req, resp); 
   }
}
