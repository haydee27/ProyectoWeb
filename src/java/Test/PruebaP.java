
package Test;

import DAO.ProductoDAO;
import DAO.ProductoDAOImplementar;
import Model.Producto;
import java.util.List;

public class PruebaP {
    public static void main(String[] args) {
        PruebaP evaluar = new PruebaP();
       evaluar.listarProductos();
       evaluar.editarProducto();
       evaluar.guardaProducto();
       evaluar.eliminarProducto();
        evaluar.listarProductos();
    }

   public void listarProductos() {
       ProductoDAO producto = new ProductoDAOImplementar();
       List<Producto> listar = producto.Listar();
        System.out.println("Listado de producto");
        for(Producto productoListar : listar){
                   System.out.println( "ID: " + productoListar.getId_producto() +
                      "Nombre: " + productoListar.getNom_producto() +  
                     "Stock" + productoListar.getStock() + 
                     "Precio: " + productoListar.getPrecio() +
                    "Unidad de medida: " + productoListar.getUnidadMedida() + 
                    "Estado: " + productoListar.getEstado() +
                   "Categoria: " + productoListar.getCategoria());
                   
        }
    
    }
    public void editarProducto(){
        ProductoDAO producto = new ProductoDAOImplementar();
        Producto pro_edit = producto.editarPro(2);
        System.out.println("PRODUCTOS A MODIFICAR");
        System.out.println("ID: " + pro_edit.getId_producto() +
                                        "NOMBRE: " + pro_edit.getNom_producto() +
                                      "STOCK: " + pro_edit.getStock() +
                                      "PRECIO: " + pro_edit.getPrecio() +
                                       "UNIDAD DE MEDIDA: " + pro_edit.getUnidadMedida() +
                                      "ESTADO: " + pro_edit.getEstado() +
                                       "CATEGORIA: " + pro_edit.getCategoria());
    }
    
    public void guardaProducto(){
        ProductoDAO producto = new ProductoDAOImplementar();
        Producto guarda_pro = new Producto();
        guarda_pro.setNom_producto("Licuados");
        guarda_pro.setStock(0);
        guarda_pro.setPrecio(2);
        guarda_pro.setUnidadMedida("porcion");
        guarda_pro.setEstado(1);
        guarda_pro.setCategoria(1);
        producto.guardarPro(guarda_pro);
        
    }
    
   public void eliminarProducto(){
        ProductoDAO producto = new ProductoDAOImplementar();
        producto.borrarPro(2);
    }
}

