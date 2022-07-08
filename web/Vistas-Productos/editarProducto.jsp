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
    <body background="img/morado.jpg">
      <%@include file = "../WEB-INF/Vistas-Parciales/encabezado.jspf" %>
      <hr>
      <div class="container"> 
          <hr><h1 class= "text-center">DATOS DE PRODUCTO</h1>
      <hr><form action="actualizarProductos.do" method="post">
            
          <div class="mb-3 row"> 
              <center><label for="staticEmail" class="col-sm-2 col-form-label">ID:</label>
              </center><div class="col-sm-10">
                  <center> <input type="text" value='<%= id_Pro%>' name="id" id="id" readonly class="form-control-plaintext" id="staticEmail" placeholder="Id_Pro">
                  </center> <input type="hidden" value='<%= id_Pro %>' name="id" id="id" readonly class="form-control-plaintext"  
        </div>
        </div>
    </div>
        
            <div class="mb-3 row">
                 <label for="inputPassword" class="col-sm-2 col-form-label">NOMBRE:</label> 
                  <div class="col-sm-10">
                     <input type="text" value='<%= nom_Pro %>' name="nombre" id="nombre" class="form-control" placeholder="nombre" >
        </div>
    </div>
        
            <div class="mb-3 row">
                 <label for="inputPassword" class="col-sm-2 col-form-label"> STOCK: </label>
                 <div class="col-sm-10">
                    <input type="text" value='<%= stock %>' name="stock" id="stock" class="form-control" placeholder="stock" >
        </div>
    </div> 
        
            <div class="mb-3 row">
                 <label for="inputPassword" class="col-sm-2 col-form-label">PRECIO: </label>
                 <div class="col-sm-10">
                    <input type="text" value='<%= precio %>' name="precio" id="precio" class="form-control" placeholder="precio" >
        </div>
   </div>
        
            <div class="mb-3 row">
                 <label for="inputPassword" class="col-sm-2 col-form-label"> UNIDAD DE MEDIDA:</label>
                 <div class="col-sm-10">
                     <input type="text" value='<%= unidad_de_medida %>' name="unidad_de_medida" id="unidad_de_medida" class="form-control" placeholder="unidad" >
        </div>
    </div>
           <div class="mb-3 row">
                 <label for="inputPassword" class="col-sm-2 col-form-label">ESTADO:</label>
                 <div class="col-sm-10">
                     <input type="text" value='<%= estado_Pro %>' name="estado_producto" id="estado_producto" class="form-control" placeholder="estado" >
        </div>
    </div>
            <div class="mb-3 row">
                   <label for="inputPassword" class="col-sm-2 col-form-label">CATEGORIA:</label>
                     <div class="col-sm-10">
                    <input type="text" value='<%= categoria %>' name="categoria" id="categoria" class="form-control" placeholder="categoria" >
        </div>
    </div>
        
            <div class="mb-3 row">
                <hr>
                <center><button type="submit" name="send" class="btn btn-secondary">ACTUALIZAR</button>
               <a href="productos.do?opcion=listar" class="btn btn-secondary " role="button">REGRESAR</a>
                </center></div>
        <hr>
        </form>
      </div>
        <br>
        
           <%
            String dato = request.getParameter("aviso");
            if(dato!=null){
                //out.print("Registro Actualizado Correctamente");
                //System.out.println("End");
           %>
                   <div class="alert" role="alert">
                       <center> Registro Actualizado Correctamente!!</center>
                 </div>
           <%   
               }
           %>
           
           <hr>
         <%@include file = "../WEB-INF/Vistas-Parciales/pie.jspf" %>
                        
    </body>
</html>
