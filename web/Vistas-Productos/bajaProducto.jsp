
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
    <body>
        <%@include file="../WEB-INF/Vistas-Parciales/encabezado.jspf"  %>
        <div class="col-auto bg-grayp-5 txt-center">
        <h1>¿DESEA ELIMINAR EL SIGUIENTE PRODUCTO?</h1>
        <h3> ID: <%= id_producto %></h3>
        <h3> NOMBRE: <%= nom_producto %></h3>
        
        </div>
        
        <div class="d-grid gap-5d-md-flex justify-content-md-center">
                <a href="bajaProducto.do?respuesta=yes&&id=<%= id_producto %>" class="btn btn-primary btn-lg" role="button">Si / Aceptar</a>
          
                <a href="productos.do?opcion=listar" class="btn btn-secondary btn-lg" role="button">NO / Cancelar</a>
            </div> 
                
                <div class="row justify-content-center">
                <div class="col-4 bg-white">
                    &nbsp; 
                 </div>
                    <div class="col-4 bg-white">
                        &nbsp;
                    </div>
                </div>  
        <%@include file="../WEB-INF/Vistas-Parciales/pie.jspf"  %>
    </body>
</html>

