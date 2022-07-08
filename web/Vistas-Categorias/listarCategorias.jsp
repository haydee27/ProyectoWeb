
<%@page import="Model.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<jsp:useBean id="lista" scope="session" class="java.util.List" />
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Control de inventario</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
       
        <%@include file="../WEB-INF/Vistas-Parciales/css-js.jspf" %>
    </head>
    <body background="img/morado.jpg">
        <%@include file="../WEB-INF/Vistas-Parciales/encabezado.jspf"  %>
        <hr><div class="container">
            <hr><h1 class="text-center">LISTADO DE CATEGORIAS REGISTRADAS</h1>
        <hr><table class="table table-bordered" width="40px">
            <tr>
            <th class="text-center">ID</th>
            <th class="text-center">NOMBRE</th>
            <th class="text-center">ESTADO</th>
            <th class="text-center">ACCION</th>
            </tr>
            <% 
                for(int i=0 ; i < lista.size(); i++){
                    Categoria categoria = new Categoria();
                    categoria = (Categoria)lista.get(i);
                    %>
                    <tr>
                        <td class="text-center"><%= categoria.getId_categoria() %> </td>
                        <td class="text-center"><%= categoria.getNom_categoria()%> </td>
                        <td class="text-center"><%= categoria.getEstado_categoria()%> </td>
                        <td>
                            <a href="categorias.do?opcion=editar&&id=<%= categoria.getId_categoria() %>&&nombre=<%= categoria.getNom_categoria() %>&&estado=<%= categoria.getEstado_categoria() %>" class="btn btn-sm glyphicon glyphicon-edit" role="button">EDITAR</a>
                            <a href="categorias.do?opcion=eliminar&&id=<%= categoria.getId_categoria() %>&&nombre=<%= categoria.getNom_categoria() %>" class="btn2 btn-sm glyphicon glyphicon-remove" role="button">ELIMINAR</a>
                        </td>
                    </tr>
                    <%
                }
            %>
        </table>
            <center><a href="<%= request.getContextPath ()%>/categorias.do?opcion=crear" class="btn3 btn-sm glyphicon glyphicon-pencil" role="button">AGREGAR</a>
                <a href="index" class="btn3 btn-sm glyphicon" role="button"  >REGRESAR A INICIO</a>
            </center>
                <hr>
        </div>
                <hr>
        
        <%@include file="../WEB-INF/Vistas-Parciales/pie.jspf" %>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

    </body>
</html>
