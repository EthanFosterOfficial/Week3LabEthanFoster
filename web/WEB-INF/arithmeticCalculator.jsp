<%-- 
    Document   : arithmiticCalculator
    Created on : Sep 22, 2020, 7:50:56 PM
    Author     : 727045
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calc EF</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="first"><br>
            Second: <input type="text" name="second"><br>

            <input type="submit" value="+" name="+"> <input type="submit" value="-" name="-"> <input type="submit" value="*" name="*"> <input type="submit" value="%" name="%">
        </form>
        <p>Result: ${message}</p>
        <br>
        <br>
        <a href="age">Age Calculator</a>

    </body>
</html>
