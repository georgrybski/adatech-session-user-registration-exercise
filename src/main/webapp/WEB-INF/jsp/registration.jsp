<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<style><%@include file="../css/style.css"%></style>
<!DOCTYPE html>
<html>
    <head>
        <title>Registrat Cliente</title>
    </head>
    <body>
        <h1>Insira os dados do cliente</h1>
        <form action="registration-form" method="post">
            <label for="name"><span class="bold">Nome:</span></label>
            <input type="text" id="name" name="name"><br><br>
            <label for="cpf"><span class="bold">CPF:</span></label>
            <input type="cpf" id="cpf" name="cpf"><br><br>
            <input type="submit" value="Registrar">
        </form>
    </body>
</html>
