package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/Vistas-Parciales/css-js.jspf");
    _jspx_dependants.add("/WEB-INF/Vistas-Parciales/encabezado.jspf");
    _jspx_dependants.add("/WEB-INF/Vistas-Parciales/pie.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <title>Control de inventario</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Estilo personalizado -->\r\n");
      out.write("<link href=\"bootstrap337/css/estilo-base.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Estilo personalizado -->\r\n");
      out.write("<link href=\"bootstrap337/css/bootstrap-theme.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"bootstrap337/css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"bootstrap337/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"bootstrap337/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("<!-- Script js de boostrap -->\r\n");
      out.write("<script src=\"bootstrap337/js/bootstrap.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"bootstrap337/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Script libreria jquery -->");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body background=\"img/morado.jpg\" >\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("    \r\n");
      out.write("   <!--<div class=\"encabezado\">\r\n");
      out.write("        SISTEMA DE CONTROL DE INVENTARIO\r\n");
      out.write("        <a href=\"index\" class=\"btn btn-primary btn-sm\" role=\"button\">INICIO</a>\r\n");
      out.write("        <a href=\"categorias.do?opcion=listar\" class=\"btn btn-primary btn-sm\" role=\"button\">CATEGORIAS</a>\r\n");
      out.write("        <a href=\"productos.do?opcion=listar\" class=\"btn btn-primary btn-sm\" role=\"button\">PRODUCTO</a>\r\n");
<<<<<<< Updated upstream
      out.write("        </div>-->\r\n");
      out.write("    <!--<div class=\"contenido\"> -->\r\n");
      out.write("    \r\n");
      out.write("    <!--<nav class=\"navbar bg-light\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("              <strong>&nbsp;SISTEMA DE CONTROL DE NVENTARIO</strong> \r\n");
      out.write("              <a href=\"Index\" class=\"btn btn-primary\">Inicio</a>\r\n");
      out.write("              <a href=\"categorias?opcion=listar\" class=\"btn btn-success\">Catogias</a>\r\n");
      out.write("              <a href=\"productos?opcion=listar\" class=\"btn btn-success\">Productos</a>\r\n");
      out.write("          </a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>-->\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("          <nav class=\"navbar navbar-expand-lg navbar-dark bg-danger\"\r\n");
      out.write("                 <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("                 <ul class=\"navbar-nav\">\r\n");
      out.write("                      <li class=\"nav-item active\">\r\n");
      out.write("                          <a class=\"nav-link active\" ><h3>SISTEMA DE CONTROL DE INVENTARIO</h3><span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("                 </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a style=\"margin-left: 10px;\" href=\"index\" class=\"btn\" style=\"background-color: #967ADC;\" role=\"button\">INICIO</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                     <li class=\"nav-item\">\r\n");
      out.write("                         <a style=\"margin-left: 10px;\" href=\"categorias.do?opcion=listar\" class=\"btn\" style=\"background-color: #967ADC;\" role=\"button\">CATEGORIAS</a>\r\n");
      out.write("                         \r\n");
      out.write("                 </li>\r\n");
      out.write("                     <li class=\"nav-item\">\r\n");
      out.write("                         <a style=\"margin-left: 10px;\" href=\"productos.do?opcion=listar\" class=\"btn\" style=\"background-color: #967ADC;\" role=\"button\" >PRODUCTOS</a>\r\n");
      out.write("                         \r\n");
      out.write("                     </li>\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                     <li class=\"nav-item\">\r\n");
      out.write("                         <a style=\"margin-left: 10px;\" href=\"productos.do?opcion=listarss\" class=\"btn\" style=\"background-color: #967ADC;\" role=\"button\" >REGISTROS</a>\r\n");
      out.write("                         \r\n");
      out.write("                     </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("             </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("        <hr>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <HR>\r\n");
      out.write("            <center> <h1>BIENVENIDOS/AS!</h1> </center>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <img class= \"mb-4\" src=\"img/logo.png\" align=\"left\" width=\"65\" height=\"57\"/><h1 class=\"text-center\">CORPORACION BANTANG S.A de CV </h1>\r\n");
      out.write("        <p class=\"text-center\"> INFORMACION GENERAL </h4>\r\n");
      out.write("        <table class=\"table table-bordered\" width=\"20px\" >\r\n");
      out.write("            <tr>\r\n");
      out.write("            <td class=\"text-center\">Nombre: </td>\r\n");
      out.write("            <td class=\"text-center\">Dirección: </td>\r\n");
      out.write("            <td class=\"text-center\">Telefono: </td>\r\n");
      out.write("            <td class=\"text-center\">CEO: </td>\r\n");
      out.write("            <td class=\"text-center\">E-mail: </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("            <td class=\"text-center\">Bantang S.A de C.V</td>\r\n");
      out.write("            <td class=\"text-center\">San Salvador, carretera al Litoral </td>\r\n");
      out.write("            <td class=\"text-center\">2775-0000</td>\r\n");
      out.write("            <td class=\"text-center\">Bang PD</td>\r\n");
      out.write("            <td class=\"text-center\">bantang2013@gmail.com </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        <hr>\r\n");
      out.write("        <center> <a  href=\"categorias.do?opcion=listars\" class=\"btn btn-sm \" role=\"button\" >REGISTROS</a></center>\r\n");
      out.write("        <hr>\r\n");
      out.write("        </div>\r\n");
      out.write("      \r\n");
=======
      out.write("        <a href=\"categorias.do?opcion=listars\" class=\"btn btn-primary btn-sm\" role=\"button\">REGISTROS</a> \r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"contenido\"> \r\n");
      out.write("        <!-- Este DIV no se cierra aqui, se cierra en pie.jspf -->\r\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <HR>\n");
      out.write("            <center> <h1>BIENVENIDOS/AS!</h1> </center>\n");
      out.write("            <hr>\n");
      out.write("            <img class= \"mb-4\" src=\"img/logo.png\" align=\"left\" width=\"65\" height=\"57\"/><h1 class=\"text-center\">CORPORACION BANTANG S.A de CV </h1>\n");
      out.write("        <p class=\"text-center\"> INFORMACION GENERAL </h4>\n");
      out.write("        <table class=\"table table-bordered\" width=\"20px\" >\n");
      out.write("            <tr>\n");
      out.write("            <td class=\"text-center\">Nombre: </td>\n");
      out.write("            <td class=\"text-center\">Dirección: </td>\n");
      out.write("            <td class=\"text-center\">Telefono: </td>\n");
      out.write("            <td class=\"text-center\">CEO: </td>\n");
      out.write("            <td class=\"text-center\">E-mail: </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("            <td class=\"text-center\">Bantang S.A de C.V</td>\n");
      out.write("            <td class=\"text-center\">San Salvador, carretera al Litoral </td>\n");
      out.write("            <td class=\"text-center\">2775-0000</td>\n");
      out.write("            <td class=\"text-center\">Bang PD</td>\n");
      out.write("            <td class=\"text-center\">bantang2013@gmail.com </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <hr>\n");
      out.write("        <Center><a href=\"productos.do?opcion=listarss\" class=\"btn\" role=\"button\">REGISTROS GUARDADOS</a>\n");
      out.write("        </center><HR>\n");
      out.write("        </div>\n");
      out.write("      \n");
>>>>>>> Stashed changes
      out.write("        <hr>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("         <!-- Aqui se deben cerrar las DIV abiertos en encabezado.jspf -->\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"pie\">\r\n");
      out.write("                   &COPY; HAYDEE B - ASTRID G - JORGE G \"ITCA-FEPADE\"\r\n");
      out.write("         </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
