<%-- 
    Document   : index
    Created on : Sep 9, 2024, 11:23:30 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Manager - Evergreen Bookstore Administration</title>
    </head>
    <body>
        <jsp:directive.include file="header.jsp"></jsp:directive.include>
            <div align="center">
                <div>
                    <h2>Users Management</h2>
                    <h3><a href>Create new Users</a></h3>
                    
                </div>
            </div>
   
            <div align="center">
                <table border="1">
                    <tr>
                        <th>Index</th>
                        <th>ID</th>
                        <th>Email</th>
                        <th>Full Name</th>
                        <th>Actions</th>
                    </tr>
                <c:forEach var="user" items="${listUsers}" varStatus="status" >
                    <tr>
                        <td>${status.index+1 }</td>
                        <td>${user.userId}</td>
                        <td>${user.email}</td>
                        <td>${user.fullName}</td>
                    </tr>
                </c:forEach>
                </table>
            </div>
        <jsp:directive.include file="footer.jsp"></jsp:directive.include>
    </body>
</html>
