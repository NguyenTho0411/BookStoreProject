<%-- 
    Document   : index
    Created on : Sep 9, 2024, 11:23:30 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:directive.include file="header.jsp"></jsp:directive.include>
            <div align="center">
                <h2>Adminstrative Dashboard</h2>
                <div>
                    <hr width="60%">
                    <h2>Quick Action:</h2>
                    <b>
                        <a href="create_book">New Book</a>
                        <a href="create_users">New Users</a>
                        <a href="create_category">New Category</a>
                        <a href="create_customer">New Customer</a>
                    </b>
                </div>
            </div>
            <div align="center">
                <hr width="60%">
                <h2>Recent Sales</h2>
            </div>
            <div align ="center">
                <hr width="60%">
                <h2>Recent Releases</h2>
            </div>
            <div align="center">
                <hr width="60%">
                <h2>Statistics</h2>
            </div>
        <jsp:directive.include file="footer.jsp"></jsp:directive.include>
    </body>
</html>
