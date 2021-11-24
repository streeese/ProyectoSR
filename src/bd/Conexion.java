
package bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Stephanie
 */
public class Conexion {
    
    public Connection obtenerConexion(){
        
        Connection connection = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda","root","");
            System.out.println("Se ha conectado exitosamente");
            
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Error de clase conexión"+ e.getMessage());
                     
        }
        return connection;
    }
    
    
   //Para probar conexión: 
//    public static void main(String[] args) {
//        Conexion con = new Conexion();
//        con.obtenerConexion();
//    }
    
       
    
}
