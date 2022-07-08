
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Control de inventario</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <%@include file="WEB-INF/Vistas-Parciales/css-js.jspf" %>
    </head>
    <body background="img/morado.jpg" >
        <%@include file="WEB-INF/Vistas-Parciales/encabezado.jspf"  %>
        <hr>
        <div class="container">
            <HR>
            <center> <h1>BIENVENIDOS/AS!</h1> </center>
            <hr>
            <img class= "mb-4" src="img/logo.png" align="left" width="65" height="57"/><h1 class="text-center">CORPORACION BANTANG S.A de CV </h1>
        <p class="text-center"> INFORMACION GENERAL </h4>
        <table class="table table-bordered" width="20px" >
            <tr>
            <td class="text-center">Nombre: </td>
            <td class="text-center">Dirección: </td>
            <td class="text-center">Telefono: </td>
            <td class="text-center">CEO: </td>
            <td class="text-center">E-mail: </td>
            </tr>
            <tr>
            <td class="text-center">Bantang S.A de C.V</td>
            <td class="text-center">San Salvador, carretera al Litoral </td>
            <td class="text-center">2775-0000</td>
            <td class="text-center">Bang PD</td>
            <td class="text-center">bantang2013@gmail.com </td>
            </tr>
        </table>
        <hr>
        <%--cambios de pruebas --%>
        <center> <a  href="categorias.do?opcion=listars" class="btn btn-sm " role="button" >REGISTROS</a></center>
        <hr>
        </div>
      
        <hr><%@include file="WEB-INF/Vistas-Parciales/pie.jspf"  %>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>

