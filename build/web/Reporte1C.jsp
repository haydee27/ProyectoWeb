
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <%@include file="WEB-INF/Vistas-Parciales/css-js.jspf" %>
    </head>
    <body background="img/morado.jpg" >
         <%@include file="WEB-INF/Vistas-Parciales/encabezado.jspf"  %>
        <hr>
        <h3 class="text-centert"> REPORTES </h3>
        <hr>
        <div class="container">
            <hr>
            <center> <a href="Reporte/ReporteCategoria.jsp" class="btn btn-success" role="button">REPORTE CATEGORIA</a></center>
            <hr>
        </div>
        <HR>
        <div class="container">
            <hr>
            <center> <a href="Reporte/ReporteProducto.jsp" class="btn btn-success"role="button">REPORTE PRODUCTO</a></center>
            <hr>
        </div>
    <hr><%@include file="WEB-INF/Vistas-Parciales/pie.jspf"  %>
    </body>
</html>
