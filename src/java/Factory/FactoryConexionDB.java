package Factory;

public class FactoryConexionDB {
    
    public static final int mysql = 1;
    public static String[] configMysql = {"bd_inventario", " root", ""};
    
    public static ConexionBD open (int tipoBD){
        switch(tipoBD){
            case FactoryConexionDB.mysql:
                return new MySQLConexionFactory(configMysql);
            default:
                return null;
        }
    }
}
