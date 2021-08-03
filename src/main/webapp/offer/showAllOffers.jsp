<%--
  Created by IntelliJ IDEA.
  User: d3nal1
  Date: 23.07.2021
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
//Both Admin and user//
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Offers List</title>
</head>
<body>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Duration (mins)</th>
        <th>Price(PLN)</th>
        <th>Description</th>
    </tr>
    <c:forEach items="${offers}" var="offer">
        <tr>
            <td>${offer.id}</td>
            <td>${offer.name}</td>
            <td>${offer.timeDuration}</td>
            <td>${offer.price}</td>
            <td>${offer.description}</td>
        </tr>

    </c:forEach>
</table>
</body>
</html>