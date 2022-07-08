
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
   try{
        HttpSession var_Session = request.getSession(false);
        String nombres = (String) var_Session.getAttribute("sessionNombres");
        String user = (String) var_Session.getAttribute("sessionUsuario");
        String tipo = (String) var_Session.getAttribute("sessionTipo");
        String correo = (String) var_Session.getAttribute("sessionEmail");
 
        if(user == null){
            out.print("<center><h2><font color='blue'>Debe de haber iniciado Sesion para poder ingresar a esta pagina.</font><br><hr><font color='blue'>Intentelo de Nuevo</font><hr><h2></center><br>");
            out.print("<center><h2><font color='blue'> Por Favor Epere...</font><hr><h2></center>");
            out.print("<meta http-equiv='refresh' content='4; url=http:sesion'/ >");
            out.print("<meta http-equiv='refresh' content='4; url=http:./'/ >");
            response.sendRedirect("./");
        }else if(user!=null){
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <title> Inicio </title>
        <%@include file="./WEB-INF/Vistas-Parciales/css-js.jspf" %>
    </head>
    <body>
        <%@include file ="WEB-INF/Vistas-Parciales/encabezado.jspf" %>
        <h3 style="text-align: center; width: 100%;">BIENVENIDOS<%= nombres %></h3>
        <%@include file="WEB-INF/Vistas-Parciales/pie.jspf" %>
        
    </body>
</html>
<%
    }
   
    }catch(Exception e){

}
 %>
