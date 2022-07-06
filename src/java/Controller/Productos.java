
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
import javax.servlet.http.HttpSession;

@WebServlet(name = "Productos", urlPatterns = {"/productos.do"})
public class Productos extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        /*try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Productos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Productos at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }*/
        }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String parametro = request.getParameter("opcion");
        String estado = request.getParameter("opcion");
        String id_producto = request.getParameter("id");
        String nom_producto = request.getParameter("nombre");
        String stock = request.getParameter("stock");
        String precio = request.getParameter("precio");
        String unidad = request.getParameter("unidad");
        String estado_pro = request.getParameter("estado");
        String Categoria = request.getParameter("categoria");
        
        if(estado.equals("listarss")){
            this.listaProductos1(request, response);
        }else if(parametro.equals("listar")){
            this.listaProductos(request, response);
        }else if(estado.equals("crear")){
            System.out.println("Crear Productos");
            String pagina = "/Vistas-Productos/crearProducto.jsp";
           RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
        dispatcher.forward(request, response); 
        
        }else if(estado.equals("editar")){
            System.out.println("Editando productos");
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Productos/editarProducto.jsp?id="+ id_producto+"&&nombre="+ nom_producto+"&&stock="+ stock+"&&precio="+precio + "&&unidad="+unidad+"&&estado=" + estado_pro+"&&Categoria="+Categoria);
        dispatcher.forward(request, response); 
            
        }else if(estado.equals("eliminar")){
            System.out.println("Baja de productos");
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Productos/bajaProducto.jsp?id="+ id_producto+"&&nombre="+ nom_producto+"&&stock=" + stock +"&&precio="+precio + "&&unidad="+unidad+"&&estado=" +estado_pro+"&&Categoria="+Categoria);
        dispatcher.forward(request, response); 
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          Producto producto = new Producto();
        
        producto.setId_producto(Integer.parseInt(request.getParameter("id_producto")));
        producto.setNom_producto(request.getParameter("txtNomProducto"));
        producto.setStock(Float.parseFloat(request.getParameter("txtstock")));
        producto.setPrecio(Float.parseFloat(request.getParameter("txtprecio")));
        producto.setUnidadMedida(request.getParameter("txtunidaMedida"));
        producto.setEstado(Integer.parseInt(request.getParameter("txtestado")));
        producto.setCategoria(Integer.parseInt(request.getParameter("txtcategoria")));
        
        ProductoDAO guardaProducto = new ProductoDAOImplementar();
        guardaProducto.guardarPro(producto);
        this.listaProductos(request, response);
        
    }

    protected void listaProductos(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
        response.setContentType("text/html;charset-UTF-8");
        ProductoDAO producto = new ProductoDAOImplementar();
        HttpSession session = request.getSession(true);
        session.setAttribute("lista", producto.Listar());
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Productos/listarProductos.jsp");
        dispatcher.forward(request, response);
        
    }
   
    protected void listaProductos1(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
        response.setContentType("text/html;charset-UTF-8");
        ProductoDAO producto = new ProductoDAOImplementar();
        HttpSession session = request.getSession(true);
        session.setAttribute("listarss", producto.Listar2());
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Categorias/listadoPro_Cat.jsp");
        dispatcher.forward(request, response);
        
    }
   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
