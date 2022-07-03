package Test;

import DAO.CategoriaDAO;
import DAO.CategoriaDAOImplementar;
import DAO.ProductoDAO;
import DAO.ProductoDAOImplementar;
import Model.Categoria;
import Model.Producto;
import java.util.List;

public class Prueba {
    public static void main(String[] args) {
        
        Prueba evaluar = new Prueba();
        evaluar.listarCategorias();
        evaluar.listarProductos();
    }

    public void listarCategorias() {
       CategoriaDAO categoria = new CategoriaDAOImplementar(); 
       List<Categoria> listar = categoria.Listar();
        System.out.println("******LISTADO DE CATEGORIA*****");
        for(Categoria categoriaListar : listar){
            System.out.println("ID: " + categoriaListar.getId_categoria() +
                               "NOMBRE: " + categoriaListar.getNom_categoria() +
                               "ESTADO: " + categoriaListar.getEstado_categoria());
        }
    
    }

    public void listarProductos() {
        ProductoDAO producto = new ProductoDAOImplementar();
        List<Producto> lista = producto.listar();
        System.out.println("***LISTADO DE PRODUCTOS*****");
        for(Producto productolistar : lista){
            System.out.println("id: " + productolistar.getId_producto() +
                                "nombre " + productolistar.getNom_producto()+
                                "stock " +productolistar.getStock() +
                                "precio: " + productolistar.getPrecio() + 
                                "unidad de medida " + productolistar.getUnidad_de_medida() +
                                "estado: " + productolistar.getEstado() +
                                "categoria: " + productolistar.getId_categoria());
        }
    }
 
}
