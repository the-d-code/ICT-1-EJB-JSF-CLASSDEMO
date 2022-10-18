<%-- 
    Document   : display
    Created on : 18-Sep-2022, 4:45:57 PM
    Author     : HP
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!--<h1>Hello World!</h1>-->
        <table border="1">
            <tr>
                <th>ID</th>
                <th>NAME</th>
                <th>EMAIL</th>
                <th>PASSWORD</th>
                <th>IMAGE NAME</th>
            </tr>
        <%
//            int imageid = Integer.parseInt(request.getParameter("id"));
            
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/photo","root","nayan2101");
                Statement st = con.createStatement();
                String sql = "select * from user";
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    
                    int id=rs.getInt("id");
                    String name = rs.getString("name");
                    String email = rs.getString("email");
                    String password = rs.getString("password");
                    String imagename = rs.getString("imagename");
            
        %>
        
            <tr>
                <td><%=id%></td>
                <td><%=name%></td>
                <td><%=email%></td>
                <td><%=password%></td>
                <td><image src="img/<%=imagename%>" width="200" hight="200"/></td>
                <!--<td><image src="images/" width="200" hight="200"/></td>-->
            </tr>
            <%
                    }
                    }catch(Exception e){ e.printStackTrace();}
                    %>
                    <button><a href="profile.jsp">Go Back To Profile</a></button>
        </table>
                
    </body>
</html>
