<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee List</title>
</head>
<body>
<h1>Employee List</h1>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Phone</th>
        <th>Department</th>
        <th>Position</th>
    </tr>
    <c:forEach var="employee" items="${employeList}">
        <tr>
            <td>${employee.nom}</td>
            <td>${employee.email}</td>
            <td>${employee.telephone}</td>
            <td>${employee.departement}</td>
            <td>${employee.poste}</td>
        </tr>
    </c:forEach>
</table>
</body>

