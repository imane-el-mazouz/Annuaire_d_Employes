<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Employee</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<h1>Update Employee</h1>
<form action="ServletTest?action=update" method="post">
    <label for="email">Email:</label> <input type="text" id="email" name="email" value="${employeToUpdate.email}" required>
    <br>
    <label for="nom">Nom:</label> <input type="text" id="nom" name="nom" value="${employeToUpdate.nom}" required>
    <br>
    <label for="telephone">Téléphone:</label> <input type="text" id="telephone" name="telephone" value="${employeToUpdate.telephone}" required>
    <br>
    <label for="departement">Département:</label> <input type="text" id="departement" name="departement" value="${employeToUpdate.departement}" required>
    <br>
    <label for="poste">Poste:</label> <input type="text" id="poste" name="poste" value="${employeToUpdate.poste}" required>
    <br>
    <input type="submit" value="Update">
</form>
</body>
</html>
