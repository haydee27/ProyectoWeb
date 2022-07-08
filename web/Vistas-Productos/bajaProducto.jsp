
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
    String id_producto = request.getParameter("id");
    String nom_producto = request.getParameter("nombre");
    
    %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Baja Categorias</title>
        <%@include file="../WEB-INF/Vistas-Parciales/css-js.jspf" %>
    </head>
    <body background="img/morado.jpg">
        <%@include file="../WEB-INF/Vistas-Parciales/encabezado.jspf"  %>
        <hr>
        <div class="container">
            <hr>
             <h1 class="text-center"> ELIMINAR PRODUCTO  </h1>
             <hr>
       <%-- <div class="col-auto bg-grayp-5 txt-center"> --%>
        <h2 class="text-center">¿DESEA ELIMINAR EL SIGUIENTE PRODUCTO?</h2>
        <h4 class="text-center"> ID: <%= id_producto %></h4>
        <h4 class="text-center"> NOMBRE: <%= nom_producto %></h4>
        
        <div class="d-grid gap-5d-md-flex justify-content-md-center">
            <center><a href="bajaProducto.do?respuesta=yes&&id=<%= id_producto %>" class="btn btn-lg" role="button">Si / Aceptar</a>
          
                <a href="productos.do?opcion=listar" class="btn btn-lg" role="button">NO / Cancelar</a>
            </center></div> 
                
                <div class="row justify-content-center">
                <div class="col-4 bg-white">
                    &nbsp; 
                 </div>
                    <div class="col-4 bg-white">
                        &nbsp;
                    </div>
                </div>  
            <hr>
        </div>
            <hr>
        <%@include file="../WEB-INF/Vistas-Parciales/pie.jspf"  %>
    </body>
</html>

