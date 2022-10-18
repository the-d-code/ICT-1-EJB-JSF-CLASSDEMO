<%-- 
    Document   : welcome
    Created on : 03-Oct-2022, 10:21:10 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="servlet.user"%>
<% 

//    response.setHeader("Cache-Control", "no-cache,no-store");
    user user = (user) session.getAttribute("login");
    if (user == null) {
        response.sendRedirect("index.jsp");
    }

  
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1>Hello World!</h1>
        <h1>Welcome, <%= user.getName()%></h1>
        <h3>Your Account ID: <%= user.getId()%> </h3>
        <h3>Your Email: <%= user.getEmail()%> </h3>
        <h3>Your Password: <%= user.getPassword()%></h3>
        <button><a href="display.jsp">Display All User</a></button>
        <button><a href="logoutservlet">Log Out</a></button>
    </body>
</html>
