<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String id_Pro = request.getParameter("id");
    String nom_Pro = request.getParameter("nombre");
    String stock = request.getParameter("stock");
    String precio = request.getParameter("precio");
    String unidad_de_medida = request.getParameter("unidad_de_medida");
    String estado_Pro = request.getParameter("estado_producto");
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
        <form action="actualizarProductos.do" method="post">
            
            <div class="mb-3 row"> 
                <label for="staticEmail" class="col-sm-2 col-form-label">ID Producto:</label>
            <div class="col-sm-10">
                <input type="text" value='<%= id_Pro%>' name="id" id="id" readonly class="form-control-plaintext" id="staticEmail" placeholder="Id_Pro">
                <input type="hidden" value='<%= id_Pro %>' name="id" id="id" readonly class="form-control-plaintext"  
        </div>
    </div>
        
            <div class="mb-3 row">
                 <label for="inputPassword" class="col-sm-2 col-form-label">Nombre Producto:</label> 
                  <div class="col-sm-10">
                     <input type="text" value='<%= nom_Pro %>' name="nombre" id="nombre" class="form-control" placeholder="nombre" >
        </div>
    </div>
        
            <div class="mb-3 row">
                 <label for="inputPassword" class="col-sm-2 col-form-label"> Stock: </label>
                 <div class="col-sm-10">
                    <input type="text" value='<%= stock %>' name="stock" id="stock" class="form-control" placeholder="stock" >
        </div>
    </div> 
        
            <div class="mb-3 row">
                 <label for="inputPassword" class="col-sm-2 col-form-label"> Precio: </label>
                 <div class="col-sm-10">
                    <input type="text" value='<%= precio %>' name="precio" id="precio" class="form-control" placeholder="precio" >
        </div>
   </div>
        
            <div class="mb-3 row">
                 <label for="inputPassword" class="col-sm-2 col-form-label"> Unidad de medida </label>
                 <div class="col-sm-10">
                     <input type="text" value='<%= unidad_de_medida %>' name="unidad_de_medida" id="unidad_de_medida" class="form-control" placeholder="unidad" >
        </div>
    </div>
           <div class="mb-3 row">
                 <label for="inputPassword" class="col-sm-2 col-form-label">Estado Producto</label>
                 <div class="col-sm-10">
                     <input type="text" value='<%= estado_Pro %>' name="estado_producto" id="estado_producto" class="form-control" placeholder="estado" >
        </div>
    </div>
            <div class="mb-3 row">
                   <label for="inputPassword" class="col-sm-2 col-form-label">Categoria</label>
                     <div class="col-sm-10">
                    <input type="text" value='<%= categoria %>' name="categoria" id="categoria" class="form-control" placeholder="categoria" >
        </div>
    </div>
        
            <div class="mb-3 row">
          
              <button type="submit" name="send" class="btn btn-success">Actualizar Producto</button>
               <a href="productos.do?opcion=listar" class="btn btn-secondary btn-lg" role="button">Regresa</a>
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
