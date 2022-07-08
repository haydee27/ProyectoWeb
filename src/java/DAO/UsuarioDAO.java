
package DAO;

import Model.Usuario;
import java.util.ArrayList;

public interface UsuarioDAO {
    //Definir los metodos, como la clase de interface. Los metodos no se implementan
    //aqui, los metodos son de tipo abstracto
    public ArrayList<Usuario> startSesion(String user, String clave);

   // public ArrayList<Usuario> startSesion(String dato_user_form, String dato_pass_form);
}
