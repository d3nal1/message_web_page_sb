<%--
  Created by IntelliJ IDEA.
  User: d3nal1
  Date: 23.07.2021
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
//Both Admin and user//
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Exercises List</title>
</head>
<body>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Periodicity</th>
        <th>Description</th>
        <th>YouTube Video</th>
    </tr>
    <c:forEach items="${exercises}" var="exercise">
        <tr>
            <td>${exercise.id}</td>
            <td>${exercise.name}</td>
            <td>${exercise.periodicity}</td>
            <td>${exercise.description}</td>
            <td><iframe width="240" height="160" src="${exercise.youtubeLink}" title="YouTube video player" frameborder="0"
                    allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
                    allowfullscreen></iframe></td>

        </tr>

    </c:forEach>
</table>
</body>
</html>