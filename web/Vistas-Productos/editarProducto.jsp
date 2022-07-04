<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String id_Pro = request.getParameter("id");
    String nom_Pro = request.getParameter("nombre");
    String stock = request.getParameter("stock");
    String precio = request.getParameter("precio");
    String unidad_de_medida = request.getParameter("unidadMedida");
    String estado_Pro = request.getParameter("estado");
    String categoria = request.getParameter("categoria");
    
    %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MODIFICAR PRODUCTOS</title>
        <%@include file = "../WEB-INF/Vistas-Parciales/css-js.jspf" %>
    </head>
    <body class="m-o row justify-content-center"
      <%@include file = "../WEB-INF/Vistas-Parciales/encabezado.jspf" %>
      <div class="col-auto bg-gray p-5 text-center"> 
      <h1 class= 'text-center'>Datos de Producto</h1>
        <form action="actualizarProductos" method="post">
            
            <div class="mb-3 row"> 
                <label for="staticEmail" class="col-sm-2 col-form-label">ID Producto:</label>
            <div class="col-sm-10">
                <input type="text" value='<%= id_Pro%>' name="id1" id="id1" readonly class="form-control-plaintext" id="staticEmail" placeholder="ID Producto">
                <input type="hidden" value='<%= id_Pro %>' name="id" id="id" readonly class="form-control-plaintext"  
        </div>
    </div>
        
            <div class="mb-3 row">
                 <label for="inputPassword" class="col-sm-2 col-form-label">Nombre Producto:</label> 
                  <div class="col-sm-10">
                     <input type="text" value='<%= nom_Pro %>' name="nombre" id="nombre" class="form-control" placeholder="Nombre Producto" required="true">
        </div>
    </div>
        
            <div class="mb-3 row">
                 <label for="inputPassword" class="col-sm-2 col-form-label"> Stock: </label>
                 <div class="col-sm-10">
                    <input type="text" value='<%= stock %>' name="stock" id="stock" clas="form-control" placeholder="stock" required="true">
        </div>
    </div> 
        
            <div class="mb-3 row">
                 <label for="inputPassword" class="col-sm-2 col-form-label"> Precio: </label>
                 <div class="col-sm-10">
                    <input type="text" value='<%= precio %>' name="precio" id="precio" clas="form-control" placeholder="precio" required="true">
        </div>
   </div>
        
            <div class="mb-3 row">
                 <label for="inputPassword" class="col-sm-2 col-form-label"> Unidad_de_medida </label>
                 <div class="col-sm-10">
                     <input type="text" value='<%= unidad_de_medida %>' name="unidad_de_medida" id="precio" clas="form-control" placeholder="unidad_de_medida" required="true">
        </div>
    </div>
           <div class="mb-3 row">
                 <label for="inputPassword" class="col-sm-2 col-form-label">Estado Producto</label>
                 <div class="col-sm-10">
                     <input type="text" value='<%= estado_Pro %>' name="estado" id="estado" class="form-control" placeholder="Estado Producto" required="true">
        </div>
    </div>
            <div class="mb-3 row">
                   <label for="inputPassword" class="col-sm-2 col-form-label">Categoria</label>
                     <div class="col-sm-10">
                    <input type="text" value='<%= categoria %>' name="categoria" id="categoria" class="form-control" placeholder="Categoria" required="true">
        </div>
    </div>
        
            <div class="mb-3 row">
          
              <button type="submit" name="send" class="btn btn-success">Actualizar Producto</button>
               <a href="Producto?opcion=listar" class="btn btn-secondary btn-lg" role="button">Regresa</a>
        </div>
        </form>
  
        
             <%
            String dato = request.getParameter("aviso");
            if(dato!=null){
                //out.print("Registro Actualizado Correctamente");
                //System.out.println("End");
           %>
                   <div class="alert alert-success" role="alert">
                   Registro Actualizado Correctamente!!
                 </div>
           <%   
               }
           %>
           
    </div>
         <%@include file = "../WEB-INF/Vistas-Parciales/pie.jspf" %>
                        
    </body>
</html>
