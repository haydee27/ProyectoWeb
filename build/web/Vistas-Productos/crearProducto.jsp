
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="producto" scope="session" class="Model.Producto" />

<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Control de inventario</title>
         <%@include file = "../WEB-INF/Vistas-Parciales/css-js.jspf" %>
         <script type="text/javascript">
             function regresar(url){
                 location.href = url;
             }
         </script>
    </head>
    <body background="img/morado.jpg">
        
         <%@include file = "../WEB-INF/Vistas-Parciales/css-js.jspf" %>
         <div class="container">
         <hr><h1 class="text-center">AGREGAR PRODUCTO</h1>
         <hr><form class="form-horizontal" id="frmProducto" name="frmProducto" action="<%= request.getContextPath() %>/productos.do" method="post">
            <input type="hidden" name="id_producto" value="<%= producto.getId_producto() %>">
            <div class="form-group">
                <label for="txtNomProducto" class="col-sm-2 control-label">NOMBRE:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="txtNomProducto">
                </div>
            </div>
                <div class="form-group" >
                    <label for="txtstock" class="col-sm-2 control-label">STOCK:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="txtstock"> 
                    </div>
                </div>
                <div class="form-group" >
                    <label for="txtprecio" class="col-sm-2 control-label">PRECIO:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="txtprecio" > 
                    </div>
                </div>
                 <div class="form-group" >
                    <label for="txtunidaMedida" class="col-sm-2 control-label">UNIDAD DE MEDIDA:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="txtunidaMedida" > 
                    </div>
                 </div>
                     <div class="form-group" >
                    <label for="txtestado" class="col-sm-2 control-label">ESTADO:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="txtestado" > 
                    </div>
                     </div>
                     <div class="form-group" >
                    <label for="txtcategoria" class="col-sm-2 control-label">CATEGORIA:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="txtcategoria" > 
                    </div>
                </div>
            <hr>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <center> <input type="submit" class="btn btn-secondary " name="btnGuardar" value="GUARDA"/>
                            <input type="button" class="btn btn-secondary " onclick="regresar('<%=request.getContextPath() %>/productos.do?opcion=listar')" name="btnRegresar" value="REGRESAR"/>
                       </center> 
                        </div>
                    </div>
                        <hr>
        </form>
                        <hr>
    </div>
                        <hr>
                          <%@include file="../WEB-INF/Vistas-Parciales/pie.jspf" %>
    </body>
</html>