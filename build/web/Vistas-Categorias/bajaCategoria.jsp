
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
    String id_cat = request.getParameter("id");
    String nombre_cat = request.getParameter("nombre");
    %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BAJA CATEGORIAS</title>
       <%@include file="../WEB-INF/Vistas-Parciales/css-js.jspf"  %>
    </head>
    <body background="img/morado.jpg">
       <%@include file="../WEB-INF/Vistas-Parciales/encabezado.jspf"  %>
       <%--<div class="col-auto bg-grayp-5 txt-center"> --%>
       <hr>
       <div class="container">
           <hr>
                <h1 class="text-center"> ELIMINAR CATEGORIA </h1>
                <hr>
                <h2 class="text-center">¿Realmente Desea Eliminar el Registro?</h2>
                <h4 class="text-center">ID Categoria: <%=id_cat %></h4>
                <h4 class="text-center">Nombre Categoria: <%=nombre_cat %></h4>

            <div class="d-grid gap-5d-md-flex justify-content-md-center">
                <center><a href="bajaCategorias.do?respuesta=yes&&id=<%= id_cat %>" class="btn  btn-lg" role="button">Si / Aceptar</a>
          
                <a href="categorias.do?opcion=listar" class="btn btn-lg" role="button">NO / Cancelar</a>
                </center> </div> 
                
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
               <%@include  file="../WEB-INF/Vistas-Parciales/pie.jspf"  %>
    </body>
</html>
