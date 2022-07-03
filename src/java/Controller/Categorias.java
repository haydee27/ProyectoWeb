
package Controller;

import DAO.CategoriaDAO;
import DAO.CategoriaDAOImplementar;
import Model.Categoria;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Categorias", urlPatterns = {"/categorias.do"})
public class Categorias extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Categorias</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Categorias at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    protected void listaCategorias(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        CategoriaDAO categoria = new CategoriaDAOImplementar();
        
        HttpSession sesion = request.getSession(true);
        sesion.setAttribute("lista", categoria.Listar());
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Categorias/listarCategorias.jsp");
        dispatcher.forward(request, response);
    }
    @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String parametro = request.getParameter("opcion");
        
        String estado = request.getParameter("opcion");
         String id_cat = request.getParameter("id");
         String nombre_cat = request.getParameter("nombre");
         String estado_cat = request.getParameter("estado");
         
        if(estado.equals("listar")){
            this.listaCategorias(request, response);
        }else if(parametro.equals("crear")){ //Evaluar si el parametro es crear o listar o cualquier otro
            System.out.println("Crear Categoria");
            String pagina = "/Vistas-Categorias/crearCategoria.jsp"; //Vista o formula para registrar nueva categoria
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
        }else if(estado.equals("editar")){
             System.out.println("Editando categorias....");
             RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Categorias/editarCategorias.jsp?id="+id_cat+"&&nombre="+nombre_cat+"&&estado="+estado_cat);
             dispatcher.forward(request, response);
             
         }else if(estado.equals("eliminar")){
             System.out.println("Baja de categorias...");
             RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Categorias/bajaCategoria.jsp?id="+id_cat+"&&nombre="+nombre_cat);
             dispatcher.forward(request, response);
         }else {
           
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       Categoria categoria = new Categoria();
       
       categoria.setId_categoria(Integer.parseInt(request.getParameter("id_categoria")));
       categoria.setNom_categoria(request.getParameter("txtNomCategoria"));
       categoria.setEstado_categoria(Integer.parseInt(request.getParameter("txtEstadoCategoria")));
       
       CategoriaDAO guardaCategoria = new CategoriaDAOImplementar();
       guardaCategoria.guardarCat(categoria);
       this.listaCategorias(request, response);
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
