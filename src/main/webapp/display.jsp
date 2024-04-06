<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Employee List</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<h1>Employee List</h1>
<table border="1">
    <tr>
        <th>nom</th>
        <th>email</th>
        <th>telephone</th>
        <th>departement</th>
        <th>poste</th>
    </tr>

    <c:forEach var="employee" items="${employeList}">
        <tr>
            <td>${employee.getNom()}</td>
            <td>${employee.getEmail()}</td>
            <td>${employee.getTelephone()}</td>
            <td>${employee.getDepartement()}</td>
            <td>${employee.getPoste()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>