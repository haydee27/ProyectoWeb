package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexx_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/Vistas-Parciales/css-js.jspf");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"Mark Otto, Jacob Thornton, and Bootstrap contributors\">\n");
      out.write("        <meta name=\"generator\" content=\"Hugo 0.98.0\">\n");
      out.write("        <title>Signin Template Â· Bootstrap v5.2</title>\n");
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
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .bd-placeholder-img {\n");
      out.write("                font-size: 1.125rem;\n");
      out.write("                text-anchor: middle;\n");
      out.write("                -webkit-user-select: none;\n");
      out.write("                -moz-user-select: none;\n");
      out.write("                user-select: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media (min-width: 768px) {\n");
      out.write("                .bd-placeholder-img-lg {\n");
      out.write("                    font-size: 3.5rem;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .b-example-divider {\n");
      out.write("                height: 3rem;\n");
      out.write("                background-color: rgba(0, 0, 0, .1);\n");
      out.write("                border: solid rgba(0, 0, 0, .15);\n");
      out.write("                border-width: 1px 0;\n");
      out.write("                box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .b-example-vr {\n");
      out.write("                flex-shrink: 0;\n");
      out.write("                width: 1.5rem;\n");
      out.write("                height: 100vh;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bi {\n");
      out.write("                vertical-align: -.125em;\n");
      out.write("                fill: currentColor;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nav-scroller {\n");
      out.write("                position: relative;\n");
      out.write("                z-index: 2;\n");
      out.write("                height: 2.75rem;\n");
      out.write("                overflow-y: hidden;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nav-scroller .nav {\n");
      out.write("                display: flex;\n");
      out.write("                flex-wrap: nowrap;\n");
      out.write("                padding-bottom: 1rem;\n");
      out.write("                margin-top: -1px;\n");
      out.write("                overflow-x: auto;\n");
      out.write("                text-align: center;\n");
      out.write("                white-space: nowrap;\n");
      out.write("                -webkit-overflow-scrolling: touch;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"css/signin.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    ");
 String rspta="";
    if(request.getParameter("rspta")!=null){
        int r=Integer.parseInt(request.getParameter("rspta"));
        if(r==0){
            rspta="Error: El Usuario y Contaseña no Coinciden";
        }
        
    }
    
    
      out.write("\n");
      out.write("    <body class=\"text-center\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <main class=\"form-signin w-100 m-auto\">\n");
      out.write("            <form method=\"post\" action=\"LoginController\">\n");
      out.write("                <center>\n");
      out.write("                    <div class=\"container\" style=\"margin-top: 80px\">\n");
      out.write("                    <div class=\"card\" style=\"width: 30rem;\">\n");
      out.write("                        <img class=\"mb-4\" src=\"img/login.png\" alt=\"\" width=\"72\" height=\"67\">\n");
      out.write("                        <h1 class=\"h3 mb-3 fw-normal\">Inicio de Sesion</h1>\n");
      out.write("\n");
      out.write("                        <div class=\"form-floating\">\n");
      out.write("                            <input type=\"text\" name=\"txtusuario\" class=\"form-control mt-5\" id=\"floatingInput\" placeholder=\"Usuario\" required>\n");
      out.write("                            <label for=\"floatingInput\">Tu usuario</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-floating\">\n");
      out.write("                            <input type=\"password\" name=\"txtclave\" class=\"form-control mt-5\" id=\"floatingPassword\" placeholder=\"Contraseña\" required>\n");
      out.write("                            <label for=\"floatingPassword\">Tu clave</label>\n");
      out.write("                        </div>\n");
      out.write("                         <p style=\"color: red;\">");
      out.print(rspta );
      out.write("</p>\n");
      out.write("\n");
      out.write("                        <div class=\"checkbox mb-3\">\n");
      out.write("                            <label>\n");
      out.write("                               \n");
      out.write("                          <input type=\"checkbox\" value=\"remember-me\"> Recordar usuario\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("                        <button class=\"w-100 btn btn-lg btn-primary\" type=\"submit\" name=\"btn-login\">Entrar</button>\n");
      out.write("                        <p class=\"mt-5 mb-3 text-muted\">&copy; 2022</p>\n");
      out.write("                        </form>\n");
      out.write("                        </main>\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </body>\n");
      out.write("                        </html>\n");
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
