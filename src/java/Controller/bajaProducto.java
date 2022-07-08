
package Controller;

import DAO.ProductoDAO;
import DAO.ProductoDAOImplementar;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "bajaProducto", urlPatterns = {"/bajaProducto.do"})
public class bajaProducto extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.setContentType("text/html;charset=UTF-8");
       /* try (PrintWriter out = response.getWriter()) {
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet bajaProducto</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet bajaProducto at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }*/
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        processRequest(request, response);
        
         String respuesta = request.getParameter("respuesta");
         String id = request.getParameter("id");
         
         ProductoDAO producto = new ProductoDAOImplementar();
      
         if(producto.borrarPro(Integer.parseInt(id))){
             System.out.println("Registro eliminado correctamente.");
             this.listaProductos(request, response);
            
         }else{
             System.out.println("Error. No se pudo eliminar el registro.");
         }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void listaProductos(HttpServletRequest request, HttpServletResponse response) 
         throws ServletException, IOException{
        ProductoDAO producto = new ProductoDAOImplementar();
        HttpSession sesion = request.getSession(true);
        sesion.setAttribute("lista", producto.Listar());
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Productos/listarProductos.jsp");
        dispatcher.forward(request, response);
    }

}
