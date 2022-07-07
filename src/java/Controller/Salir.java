package Controller;

import DAO.UsuarioDAO;
import DAO.UsuarioDAOImplementar;
import Model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Salir", urlPatterns = {"/Salir.do"})
public class Salir extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Salir</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Salir at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
         RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        String dato_user_form = request.getParameter("txtEmail");
        String dato_pass_form = request.getParameter("txtPassword");
        
        UsuarioDAO usuario = new UsuarioDAOImplementar();
        ArrayList<Usuario> users = new ArrayList();
        HttpSession var_session = request.getSession(true);
        users = usuario.starSesion(dato_user_form, dato_pass_form);
        
        if(users.size()>0){
            String name_full = users.get(0).getNombre() + " " + users.get(0).getApellido();
            
            int tipo_user = users.get(0).getTipo();
            String name_user = users.get(0).getNombre();
            String email_user = users.get(0).getCorreo();
            
            var_session.setAttribute("sessionNombres", name_full );
            
            var_session.setAttribute("sessionTipo", String.valueOf(tipo_user));
            var_session.setAttribute("sessionUsuario", name_user);
            var_session.setAttribute("sessionEmail", email_user);
            //MODIFICAR
            var_session.setAttribute("lista", users);
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/principal.jsp");
            dispatcher.forward(request, response);
        }else{
            response.setContentType("text/html;charset=UTF-8");
                try (PrintWriter out = response.getWriter()) {
                     String url = "sesion";   
                        out.println("<script>valor=confirm(\"Error. Usuario o Clave Incorrecto. " +"\\nNombre de Usuario: "  + dato_user_form + " \\n\\nClic en aceptar para volver a intentarlo. \");valor;"
                        + "if (valor==true){"
                        + "location.href='"+ url + "';"
                        + "}else{"
                        + "location.href='"+ url + "';"
                        + "}"
                        + "</script>");
                
            }
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}