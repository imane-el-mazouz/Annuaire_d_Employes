<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ajouter un employé</title>
    <link rel="stylesheet" href="style.css">
    <!-- <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"></head> --></head>
<body>
<h1>Ajouter un employé</h1>
<form action="ServletTest?action=add" method="post">
    <!-- Champs pour ajouter un employé -->
    <label for="nom">Nom:</label> <input type="text" id="nom" name="nom" required><br>
    <label for="email">Email:</label> <input type="email" id="email" name="email" required><br>
    <label for="telephone">Téléphone:</label> <input type="text" id="telephone" name="telephone" required><br>
    <label for="departement">Département:</label> <input type="text" id="departement" name="departement" required><br>
    <label for="poste">Poste:</label> <input type="text" id="poste" name="poste" required><br>
    <input type="submit" value="Ajouter Employé">
</form>
</body>
</html>
