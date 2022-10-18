<%-- 
    Document   : Singup
    Created on : 18-Sep-2022, 1:41:00 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

        <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

    </head>
    <body style="background: url(img/about_bg.jpg); background-size: cover;background-attachment: fixed;">
        <div class="container">
            <div class="raw">
                <div class="col m6 offset-m3">
                    <div class="card">
                        <div class="card-content">
                            <h3 style="margin-top: 10px;" class="center-align">Register Here!!!</h3>
                            <div class="form center-align">
                                <form action="Register" method="post" id="myform" enctype="multipart/form-data">
                                    <input type="text" name="user_name" placeholder="Enter User Name">
                                    <input type="text" name="user_email" placeholder="Enter User Email">
                                    <input type="password" name="user_password" placeholder="Enter User Password">
                                    <input type="file" name="image"><br/>
                                    <button class="btn" type="submit">Submit</button>
                                </form>
                            </div>
                           
                        </div>
                    </div>
                </div>
            </div>
        </div>

        
    </body>
</html>
