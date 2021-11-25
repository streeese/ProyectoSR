
package controlador;

import bd.Conexion;
import java.util.Date;
import modelo.AlimentoPerro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Stephanie
 */
public class Consulta {
    
    public boolean agregar (AlimentoPerro alimentoPerro){
        
        Date date;
        try {
            
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            date = alimentoPerro.getFechaIngreso();
            
            String query = "INSERT INTO alimentoPerro(nombre,marca,fechaIngreso,precio,estado)VALUES(?,?,?,?,?)";
            PreparedStatement pst = cnx.prepareStatement(query);
            pst.setString(1, alimentoPerro.getNombre());
            pst.setString(2, alimentoPerro.getMarca());
            pst.setDate(3, new java.sql.Date(date.getTime()));
            pst.setInt(4, alimentoPerro.getPrecio());
            pst.setBoolean(5, alimentoPerro.isEstado());
            
            pst.executeUpdate();
            pst.close();
            cnx.close();
            
            return true;
            
        } catch (SQLException e){
            System.out.println("Error al agregar alimentoPerro" + e.getMessage());
            return false;
        }
    }    
        public boolean actualizar(AlimentoPerro alimentoPerro){
            Date date;
        try {
            
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            date = alimentoPerro.getFechaIngreso();
            
            String query = "UPDATE alimentoPerro set nombre = ?,marca=?, fechaIngreso=?,precio=?, estado=? WHERE idAlimentoPerro=?";
            PreparedStatement pst = cnx.prepareStatement(query);
            pst.setString(1, alimentoPerro.getNombre());
            pst.setString(2, alimentoPerro.getMarca());
            pst.setDate(3, new java.sql.Date(date.getTime()));
            pst.setInt(4, alimentoPerro.getPrecio());
            pst.setBoolean(5, alimentoPerro.isEstado());
            pst.setInt(6, alimentoPerro.getIdAlimentoPerro());
            
            pst.executeUpdate();
            pst.close();
            cnx.close();
            
            return true;
            
        } catch (SQLException e){
            System.out.println("Error al actualizar alimentoPerro" + e.getMessage());
            return false;
        }
            
    }
    public boolean eliminar(int idAlimentoPerro){
        
        try {
            
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            
            
            String query = "DELETE FROM alimentoPerro WHERE idAlimentoPerro=?";
            PreparedStatement pst = cnx.prepareStatement(query);
            pst.setInt(1, idAlimentoPerro);
                        
            pst.executeUpdate();
            pst.close();
            cnx.close();
            
            return true;
            
        } catch (SQLException e){
            System.out.println("Error al eliminar alimentoPerro" + e.getMessage());
            return false;
        }
    }
        
    
    
}
