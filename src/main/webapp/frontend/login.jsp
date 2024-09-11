<%-- 
    Document   : index
    Created on : Sep 9, 2024, 8:47:08 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BlackMoon BookStore Website </title>
    </head>
    <body>
        <jsp:directive.include file="header.jsp"></jsp:directive.include>
            <div align="center">
                <h2>Please login:</h2>
                <form>
                    <label>Email:</label> <input type="text" size="10"><br>
                    <label>Password:</label> <input type="password" size="10"><br>
                    <input type="button" value="login">
                </form>
            </div>
        <jsp:directive.include file="footer.jsp"></jsp:directive.include>
    </body>
</html>
