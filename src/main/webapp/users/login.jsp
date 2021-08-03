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
<html>
<head>
  <title>Login</title>
  </style>
</head>
<body>
<form:form modelAttribute="user" method="post">
  <tr>Email:<form:input path="email"/><br/></tr>
  <tr>Password:<form:password path="password"/><br/></tr>
  <input type="submit">
</form:form>
</body>
</html>