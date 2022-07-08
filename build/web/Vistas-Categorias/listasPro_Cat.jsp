
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Categoria"%>
<%@page import="Model.Producto" %>
<!DOCTYPE html>

<jsp:useBean id="listars" scope="session" class="java.util.List" />
<jsp:useBean id="listarss" scope="session" class="java.util.List" />
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Control de inventario</title>
         <%@include file="../WEB-INF/Vistas-Parciales/css-js.jspf" %>
    </head>
    <body background="img/morado.jpg">
        <%@include file="../WEB-INF/Vistas-Parciales/encabezado.jspf" %>
        <hr><div class="container">
            <hr><h1 class="text-center">LISTADO DE CATEGORIAS REGISTRADAS</h1>
        <hr><table class="table table-bordered" width="40px">
            <tr>
            <th class="text-center">ID</th>
            <th class="text-center">NOMBRE</th>
            <th class="text-center">ESTADO</th>
            </tr>
            <% 
                for(int i=0 ; i < listars.size(); i++){
                    Categoria categoria = new Categoria();
                    categoria = (Categoria)listars.get(i);
                    %>
                    <tr>
                        <td class="text-center"><%= categoria.getId_categoria() %> </td>
                        <td class="text-center"><%= categoria.getNom_categoria()%> </td>
                        <td class="text-center"><%= categoria.getEstado_categoria()%> </td>
                    </tr>
                    <%
                }
            %>
        </table>
        <hr>
             <h1 class="text-center">LISTADO DE PRODUCTO</h1>
                    </center><table class="table table-bordered">
            <tr> 
                <th class="text-center">ID</th>
                <th class="text-center">NOMBRE</th>
                <th class="text-center">STOCK</th>
                <th class="text-center">PRECIO</th>
                <th class="text-center">UNIDAD DE MEDIDA</th>
                <th class="text-center">ESTADO</th>
                <th class="text-center">CATEGORIA</th>
            </tr>
            <%
                for(int i=0 ; i <listarss.size(); i++){
                Producto producto = new Producto();
                producto = (Producto)listarss.get(i);
                %>
                <tr>
                    <td class="text-center"><%= producto.getId_producto()%></td>
                    <td class="text-center"><%= producto.getNom_producto()%></td>
                    <td class="text-center"><%= producto.getStock()%></td>
                    <td class="text-center"><%= producto.getPrecio()%></td>
                    <td class="text-center"><%= producto.getUnidadMedida()%></td>
                    <td class="text-center"><%= producto.getEstado()%></td>
                    <td class="text-center"><%= producto.getCategoria()%></td>
                </tr>  
                <%
                    }
           %> 
         <hr>
         </div>
        <hr>
        </table>
            <center><a href="index" class="btn3 btn-sm glyphicon" role="button"  >REGRESAR A INICIO</a></center>
                <hr>
        </div>
                <hr>
                
                
               
                <%@include file="../WEB-INF/Vistas-Parciales/pie.jspf"%> 
    </body>
</html>