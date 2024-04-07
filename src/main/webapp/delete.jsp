<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Supprimer un employé</title>
    <link rel="stylesheet" href="style.css">
    <!-- <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"></head> --></head>
<body>
<h1>Supprimer un employé</h1>
<form action="ServletTest?action=delete" method="post">
    <label for="email">Email:</label> <input type="text" id="email" name="email">
    <input type="submit" value="Supprimer Employé">
</form>
</body>
</html>
