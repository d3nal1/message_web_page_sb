<%--
  Created by IntelliJ IDEA.
  User: d3nal1
  Date: 23.07.2021
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
//Admin only page//
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Massage Exercises - Admin View</title>
</head>
<body>
<form:form modelAttribute="exercise" method="post">
    Specify name of new exercise: <form:input path="name"/><br>
    Specify periodicity of new exercise: <form:input path="periodicity"/><br>
    Specify description of new exercise: <form:input path="description"/><br>
    Add YouTube link of new offer:: <form:input value="https://www.youtube.com/embed/C0vf3o0vOi4" path="youtubeLink"/><br>
    Save new exercise to the base: <input type="submit">
</form:form>
</body>
</html>