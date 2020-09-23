<%-- 
    Document   : ageCalculator
    Created on : Sep 22, 2020, 7:04:55 PM
    Author     : 727045
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Age Calc EF</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
           Enter your age: <input type="text" name="Age"><br>
            
            <input type="submit" value="Age Next Birthday">
        </form>
        <p>${message}</p>
    </body>
</html>
