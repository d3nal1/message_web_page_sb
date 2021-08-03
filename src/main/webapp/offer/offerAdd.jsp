<%--
  Created by IntelliJ IDEA.
  User: d3nal1
  Date: 23.07.2021
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
//Admin only page//
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Massage Offers - Admin View</title>
</head>
<body>
<form:form modelAttribute="offer" method="post">
    Specify name of new offer: <form:input path="name"/><br>
    Specify duration (mins) of new offer:: <form:input path="timeDuration"/><br>
    Specify price (PLN) of new offer: <form:input path="price"/><br>
    Add description of new offer:: <form:input path="description"/><br>
    Save new offer to the base: <input type="submit">
</form:form>
</body>
</html>