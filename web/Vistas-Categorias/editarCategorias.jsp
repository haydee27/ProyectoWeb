<<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
   
    String id_cat = request.getParameter("id");
    String nombre_cat = request.getParameter("nombre");
    String estado_cat = request.getParameter("estado");
    
    /*out.print("El ID de la categoria es: " + id_cat);
    out.print("El nombre de la categoria es: " + nombre_cat);
    out.print("El estado de la categoria es: " + estado_cat);*/
 %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MODIFICAR CATEGORIAS</title>
        <%@include file = "../WEB-INF/Vistas-Parciales/css-js.jspf" %>
    </head>
    <body background="img/morado.jpg">
         <%@include file = "../WEB-INF/Vistas-Parciales/encabezado.jspf" %>
         <hr>
         <div class="container">
             <%--<div class="col-auto bg-gray p-5 text-center"> --%>
             <hr><h1 class="text-center">DATOS DE CATEGORIA</h1>
        <hr><form action="actualizarCategorias.do" method="post">
        <div class="mb-3 row">
            <center><label for="staticEmail" class="col-sm-2 col-form-label">ID:</label>
            </center> <div class="col-sm-10">
                <center><input type="text" value='<%= id_cat %>' name="id1" id="id1" readonly class="form-control-plaintext" id="staticEmail" placeholder="ID Categoria">
                </center> <input type="hidden" value='<%= id_cat %>' name="id" id="id" readonly class="form-control-plaintext" id="staticEmail" >
            </div>
        </div>
            
        <div >
          <label for="inputPassword" class="col-sm-2 col-form-label">NOMBRE:</label>
          <div class="col-sm-10">
              <input type="text" value='<%= nombre_cat %>' name="nombre" id="nombre" class="form-control" placeholder="Nombre Categoria" required="true">
          </div>
        </div>
          <br>
          <div>
          <label for="inputPassword" class="col-sm-2 col-form-label">ESTADO:</label>
          <div class="col-sm-10">
              <input type="text" size="15" value='<%= estado_cat %>' name="estado" id="estado" class="form-control" placeholder="Estado Categoria" required="true">
          </div>
        </div>
          <br>
          <div>
              <hr>
              <Center><button type="submit" name="send" class="btn btn-secondary ">ACTUALIZAR</button>
              <a href="categorias.do?opcion=listar" class="btn btn-secondary " role="button">REGRESAR</a>
               </center>
          </div>
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
                   <center>Registro Actualizado Correctamente!!
                   </center></div>
           <%   
               }
           %>
           <hr>
         <%@include file = "../WEB-INF/Vistas-Parciales/pie.jspf" %>
    </body>
    
    
</html>
