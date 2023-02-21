<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style><%@include file="../css/style.css"%></style>
<html>
  <head>
    <title>Cadastro realizado</title>
  </head>
  <body>
  <h1>Cliente cadastrado com sucesso!</h1>
  <div class="card">
    <div class="container">
      <p>
        <span class="bold">Nome:</span> <%= request.getAttribute("name") %>
        <br>
        <br>
        <span class="bold">CPF:</span> <%= request.getAttribute("cpf") %>
      </p>
    </div>
  </div>
  <br>
    <form method="get" action="registration-form">
      <button>Registrar mais clientes</button>
    </form>
    <form method="get" action="list-registered-clients">
      <button>Listar clientes</button>
    </form>
  </body>
</html>
