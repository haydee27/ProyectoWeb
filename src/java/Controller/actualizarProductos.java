
package Controller;

import DAO.ProductoDAO;
import DAO.ProductoDAOImplementar;
import Model.Producto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "actualizarProductos", urlPatterns = {"/actualizarProductos.do"})
public class actualizarProductos extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        /*try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet actualizarProductos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet actualizarProductos at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }*/
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String id_producto = request.getParameter("id");
        String nom_producto  = request.getParameter("nombre");
        String stock = request.getParameter("stock");
        String precio = request.getParameter("precio");
        String unidad = request.getParameter("unidad");
        String estado_pro = request.getParameter("estado");
        String categoria = request.getParameter("categoria");
        
        ProductoDAO producto = new ProductoDAOImplementar();
        Producto pro = new Producto();
        pro.setId_producto(Integer.parseInt(id_producto));
        pro.setNom_producto(nom_producto);
        pro.setStock(Float.parseFloat(stock));
        pro.setPrecio(Float.parseFloat(precio));
        pro.setUnidadMedida(unidad);
        pro.setEstado(Integer.parseInt(estado_pro));
        pro.setCategoria(Integer.parseInt(categoria));
        
        if(producto.guardarPro(pro)==true){
            
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Productos/editarProducto.jsp?aviso=ok");
            dispatcher.forward(request, response);
        }else{
            System.out.println("Error. El registro no se puede actualizar.");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
