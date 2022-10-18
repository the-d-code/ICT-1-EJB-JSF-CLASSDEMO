<%-- 
    Document   : login
    Created on : 03-Oct-2022, 9:39:09 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <div class="box">
                <img class="avatar" src="img/1.png">
                <h1>Login Account</h1>
                <form action="login" method="post">
                    <p>Username</p>
                    <input type="text" placeholder="Username" name="email" required>
                    <p>Password</p>
                    <input type="password" placeholder="Password" name="password" required>
                    <input type="submit" value="Login">
                    <!--<a href="#">Forget Password?</a><br>-->
                    <a href="Singup.jsp">Create New Account</a>
                </form>
            </div>
        </div>
        <a href="welcome.jsp"></a>
    </body>
</html>
