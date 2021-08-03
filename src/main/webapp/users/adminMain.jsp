<%--
  Created by IntelliJ IDEA.
  User: d3nal1
  Date: 23.07.2021
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Admin Page</title>
</head>
<body>
<h1>Massage Salon - Admin Page</h1><br>




<td>Admin: ${username} <td></td></td>




<h1>Offer menu</h1><br>
<a href="/offer/add">Add new offer</a><br>
<a href="/offer/printAll">Show All Offers</a><br>

<h1>User menu</h1><br>
<a href="/printAll">Show All Users</a><br>

<h1>Exercises menu</h1><br>
<a href="/exercise/add">Add new exercise</a><br>
<a href="/exercise/printAll">Show All Exercises</a><br>

</body>
</html>
