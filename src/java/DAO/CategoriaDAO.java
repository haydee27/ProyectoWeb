package DAO;

import Model.Categoria;
import java.util.List;

public interface CategoriaDAO {
    
    
    public List<Categoria> listar();
    public List<Categoria> listar2();
    public Categoria editarCat (int id_cat_edit);
    public boolean guardarCat (Categoria categoria);
    public boolean borrarCat (int id_cat_borrar);
}
