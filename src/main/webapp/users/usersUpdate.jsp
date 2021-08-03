<%--
  Created by IntelliJ IDEA.
  User: d3nal1
  Date: 24.07.2021
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Update Profile</title>
</head>
<body>
<form:form modelAttribute="user" method="post">
    Specify new name: <form:input path="name"/>
    Specify new surname: <form:input path="surname"/>
    Specify new nickname: <form:input path="email"/>
    Update data: <input type="submit">
</form:form>
</body>
</html>
