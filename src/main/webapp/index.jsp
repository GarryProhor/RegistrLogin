<%--
  Created by IntelliJ IDEA.
  User: igorp
  Date: 07.11.2021
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form action="Registr" method="post">
    <table>
        <tr><td>User Name</td><td><input type="text" name="name"></td></tr>
        <tr><td>Email</td><td><input type="email" placeholder="email" name="email"></td></tr>
        <tr><td>Password</td><td><input type="password" placeholder="******" name="password"></td></tr>
        <tr><td></td><td><input type="submit" name="register"></td></tr>
    </table>
</form>
</body>
</html>
