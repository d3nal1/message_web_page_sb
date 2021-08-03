<%--
  Created by IntelliJ IDEA.
  User: d3nal1
  Date: 01.08.2021
  Time: 13:02
  To change this template use File | Settings | File Templates.
--%>
//Both Admin and user//
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>User List</title>
</head>
<body>
<table>
    <tr>
        <th>Id</th>
        <th>Username</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Email</th>
        <th>Phone</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.username}</td>
            <td>${user.surname}</td>
            <td>${user.email}</td>
            <td>${user.phone}</td>
        </tr>

    </c:forEach>
</table>
</body>
</html>