package org.apache.jsp.Vistas_002dCategorias;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Categoria;

public final class listasPro_005fCat_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/Vistas-Categorias/../WEB-INF/Vistas-Parciales/css-js.jspf");
    _jspx_dependants.add("/Vistas-Categorias/../WEB-INF/Vistas-Parciales/encabezado.jspf");
    _jspx_dependants.add("/Vistas-Categorias/../WEB-INF/Vistas-Parciales/pie.jspf");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      java.util.List lista = null;
      synchronized (session) {
        lista = (java.util.List) _jspx_page_context.getAttribute("lista", PageContext.SESSION_SCOPE);
        if (lista == null){
          try {
            lista = (java.util.List) java.beans.Beans.instantiate(this.getClass().getClassLoader(), "java.util.List");
          } catch (ClassNotFoundException exc) {
            throw new InstantiationException(exc.getMessage());
          } catch (Exception exc) {
            throw new ServletException("Cannot create bean of class " + "java.util.List", exc);
          }
          _jspx_page_context.setAttribute("lista", lista, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<html>\n");
      out.write("     <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Control de inventario</title>\n");
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
      out.write("    <body background=\"img/morado.jpg\">\n");
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
      out.write("    <div class=\"contenido\"> \r\n");
      out.write("        <!-- Este DIV no se cierra aqui, se cierra en pie.jspf -->\r\n");
      out.write("\n");
      out.write("        <hr><div class=\"container\">\n");
      out.write("            <hr><h1 class=\"text-center\">LISTADO DE CATEGORIAS REGISTRADAS</h1>\n");
      out.write("        <hr><table class=\"table table-bordered\" width=\"40px\">\n");
      out.write("            <tr>\n");
      out.write("            <th class=\"text-center\">ID</th>\n");
      out.write("            <th class=\"text-center\">NOMBRE</th>\n");
      out.write("            <th class=\"text-center\">ESTADO</th>\n");
      out.write("            <th class=\"text-center\">ACCION</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
 
                for(int i=0 ; i < lista.size(); i++){
                    Categoria categoria = new Categoria();
                    categoria = (Categoria)lista.get(i);
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"text-center\">");
      out.print( categoria.getId_categoria() );
      out.write(" </td>\n");
      out.write("                        <td class=\"text-center\">");
      out.print( categoria.getNom_categoria());
      out.write(" </td>\n");
      out.write("                        <td class=\"text-center\">");
      out.print( categoria.getEstado_categoria());
      out.write(" </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("            <center><a href=\"index\" class=\"btn3 btn-sm glyphicon\" role=\"button\"  >REGRESAR A INICIO</a></center>\n");
      out.write("                <hr>\n");
      out.write("        </div>\n");
      out.write("                <hr>\n");
      out.write("               \n");
      out.write("                ");
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
      out.write(" \n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
