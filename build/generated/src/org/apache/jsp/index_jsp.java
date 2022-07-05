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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Control de inventario</title>\n");
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
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("    <div class=\"encabezado\">\r\n");
      out.write("        SISTEMA DE CONTROL DE INVENTARIO\r\n");
      out.write("        <a href=\"index\" class=\"btn btn-primary btn-sm\" role=\"button\">INICIO</a>\r\n");
      out.write("        <a href=\"categorias.do?opcion=listar\" class=\"btn btn-primary btn-sm\" role=\"button\">CATEGORIAS</a>\r\n");
      out.write("        <a href=\"productos.do?opcion=listar\" class=\"btn btn-primary btn-sm\" role=\"button\">PRODUCTO</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <nav class=\"navbar navbar-dark bg-dark\">\r\n");
      out.write("    <img src=\"../../img/naber.png\" width=\"30\" height=\"30\" class=\"d-inline-block align-top\" alt=\"\"/>\r\n");
      out.write("    SISTEMA DE CONTROL DE INVENTARIO\r\n");
      out.write("  </a>\r\n");
      out.write("</nav>\r\n");
      out.write("    <div class=\"contenido\"> \r\n");
      out.write("        <!-- Este DIV no se cierra aqui, se cierra en pie.jspf -->\r\n");
      out.write("\n");
      out.write("    <center> <h1>Bienvenid@s!</h1>\n");
      out.write("        <img class=\"mb-4\" src=\"img/fondo.jpg\" alt=\"\" width=\"150\" height=\"200\"/>\n");
      out.write("    </center>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("         <!-- Aqui se deben cerrar las DIV abiertos en encabezado.jspf -->\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"pie\">\r\n");
      out.write("                   &COPY; Haydee B - Astrid G - Jorge G \"ITCA-FEPADE\"\r\n");
      out.write("         </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
