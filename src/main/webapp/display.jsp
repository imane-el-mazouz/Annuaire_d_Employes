<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Liste des employés</title>
    <link rel="stylesheet" href="style.css">
    <!-- <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"></head> --></head>
<body>
    <h1>Liste des employés</h1>
    <table border="1">
        <tr>
            <th>Nom</th>
            <th>Email</th>
            <th>Téléphone</th>
            <th>Département</th>
            <th>Poste</th>
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
</html>
