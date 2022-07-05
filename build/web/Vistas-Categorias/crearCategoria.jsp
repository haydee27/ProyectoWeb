<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:useBean id="categoria" scope="session" class="Model.Categoria" />
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Control de inventario</title>
        <%@include file="../WEB-INF/Vistas-Parciales/css-js.jspf" %>
        <script type="text/javascript">
            function regresar(url){
                location.href = url;
            }
            </script>
    </head>
    <body background="img/morado.jpg">
        
        <%@include file="../WEB-INF/Vistas-Parciales/encabezado.jspf"  %>
        
        <h1>AGREGAR CATEGORIAS</h1>
        <form class="form-horizontal" id="frmCategoria" name="frmCategoria" action="<%= request.getContextPath() %>/categorias.do" method="post">
            <input type="hidden" name="id_categoria" value="<%= categoria.getId_categoria() %>">
            <div class="form-group">
                <label for="txtNomCategoria" class="col-sm-2 control-label">NOMBRE:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="txtNomCategoria" >
                </div>
            </div>
            <div class="form-group">
                <label for="txtEstadoCategoria" class="col-sm-2 control-label">ESTADO:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="txtEstadoCategoria">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-10 col-sm-10">
                    <input type="submit" class="btn btn-success btn-sm" name="btnGuardar" value="GUARDAR" />
                    <input type="button" class="btn btn-danger btn-sm" onclick="regresar('<%= request.getContextPath() %>/categorias.do?opcion=listar')" name="btnRegresar" value="REGRESAR" />
                </div>
            </div>
        </form>
        
        <%@include file="../WEB-INF/Vistas-Parciales/pie.jspf"  %>
    </body>
</html>
