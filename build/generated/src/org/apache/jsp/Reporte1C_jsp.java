package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Reporte1C_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         ");
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
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body background=\"img/morado.jpg\" >\n");
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
      out.write("                    \r\n");
      out.write("                     <li class=\"nav-item\">\r\n");
      out.write("                         <a style=\"margin-left: 10px;\" href=\"productos.do?opcion=listarss\" class=\"btn\" style=\"background-color: #967ADC;\" role=\"button\" >REGISTROS</a>\r\n");
      out.write("                         \r\n");
      out.write("                     </li>\r\n");
      out.write("                     <a href=\"../../Reporte1C.jsp\"></a>\r\n");
      out.write("                      <li class=\"nav-item\">\r\n");
      out.write("                         <a style=\"margin-left: 10px;\" href=\"Reportes.do\" class=\"btn\" style=\"background-color: #967ADC;\" role=\"button\" >REGISTROS</a>\r\n");
      out.write("                         \r\n");
      out.write("                     </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("             </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("        <h3> REPORTES </h3>\n");
      out.write("        <hr>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <hr>\n");
      out.write("            <center> <a href=\"Reporte/ReporteCategoria.jsp\" class=\"btn btn-success\" role=\"button\">REPORTE CATEGORIA</a></center>\n");
      out.write("            <hr>\n");
      out.write("        </div>\n");
      out.write("        <HR>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <hr>\n");
      out.write("            <center> <a href=\"Reporte/ReporteProducto.jsp\" class=\"btn btn-success\"role=\"button\">REPORTE PRODUCTO</a></center>\n");
      out.write("            <hr>\n");
      out.write("        </div>\n");
      out.write("    <hr>");
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
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
