<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style><%@include file="../css/style.css"%></style>
<html>
  <head>
    <title>Clientes Registrados</title>
  </head>
  <body>
    <h1>Clientes Registrados:</h1>
    ${content}
    <form method="get" action="registration-form">
      <button>Registrar clientes</button>
    </form>
    <form method="get" action="list-registered-clients">
      <button>Listar clientes</button>
    </form>
  </body>
</html>
