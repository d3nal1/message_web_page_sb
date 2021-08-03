<%--
  Created by IntelliJ IDEA.
  User: d3nal1
  Date: 24.07.2021
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Registration Page</title>
</head>
<body>

<form:form method="post" modelAttribute="user">

    <tr> <br/>Specify name: <form:input path="name"/></tr>
    <tr> Specify surname: <form:input path="surname"/><br/></tr>
    <tr> <br/>Specify name: <form:input path="username"/></tr>
    <tr> Specify email: <form:input path="email"/><br/></tr>
    <tr> Specify password: <form:password path="password"/><br/></tr>
    <tr> Specify phone:<form:input value="48123456789" path="phone" /><br/></tr>
    <tr> Submit: <input type="submit"><br/></tr>
</form:form>

</body>
</html>