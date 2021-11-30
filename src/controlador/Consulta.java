
package controlador;

import bd.Conexion;
import java.util.Date;
import modelo.AlimentoPerro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.AlimentoGato;
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
        
    public AlimentoPerro buscarAlimentoPerro(int idAlimentoPerro){
        
        AlimentoPerro alimentop = new AlimentoPerro();
        try {           
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
                        
            
            String query = "SELECT idAlimentoPerro, nombre,marca,fechaIngreso,precio,estado FROM alimentoPerro WHERE idAlimentoPerro = ?";
            PreparedStatement pst = cnx.prepareStatement(query);
            pst.setInt(1, idAlimentoPerro);
            
            ResultSet rs = pst.executeQuery();
                        
           if (rs.next()) {
               alimentop.setIdAlimentoPerro(rs.getInt("idalimentoperro"));
               alimentop.setNombre(rs.getString("nombre"));
               alimentop.setMarca(rs.getString("marca"));
               alimentop.setFechaIngreso(rs.getDate("fechaingreso"));
               alimentop.setPrecio(rs.getInt("precio"));
               alimentop.setEstado(rs.getBoolean("estado"));
           }
            
            rs.close();
            pst.close();
            cnx.close();
            
        } catch (SQLException e) {
            System.out.println("Error al listar Alimento Perro por ID" + e.getMessage());           
        }
        return alimentop;
    }
            
    public List<AlimentoPerro> listarAP() {
        
        List<AlimentoPerro> listaP = new ArrayList<>();
        try {           
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
                        
            
            String query = "SELECT idAlimentoPerro, nombre,marca,fechaIngreso,precio,estado FROM alimentoPerro ORDER BY nombre";
            PreparedStatement pst = cnx.prepareStatement(query);
            
            ResultSet rs = pst.executeQuery();
                        
           while (rs.next()) {
               AlimentoPerro alimentop = new AlimentoPerro();
               alimentop.setIdAlimentoPerro(rs.getInt("idalimentoperro"));
               alimentop.setNombre(rs.getString("nombre"));
               alimentop.setMarca(rs.getString("marca"));
               alimentop.setFechaIngreso(rs.getDate("fechaingreso"));
               alimentop.setPrecio(rs.getInt("precio"));
               alimentop.setEstado(rs.getBoolean("estado"));
               
               listaP.add(alimentop);
           }
            
            rs.close();
            pst.close();
            cnx.close();
            
        } catch (SQLException e) {
            System.out.println("Error al listar Alimento Perro" + e.getMessage());           
        }
        return listaP;
    }
        
    
    
    
    
    
    
    
    public boolean agregar (AlimentoGato alimentoGato){
        
        Date date;
        try {
            
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            date = alimentoGato.getFechaIngreso();
            
            String query = "INSERT INTO alimentoGato(nombre,marca,fechaIngreso,precio,estado)VALUES(?,?,?,?,?)";
            PreparedStatement pst = cnx.prepareStatement(query);
            pst.setString(1, alimentoGato.getNombre());
            pst.setString(2, alimentoGato.getMarca());
            pst.setDate(3, new java.sql.Date(date.getTime()));
            pst.setInt(4, alimentoGato.getPrecio());
            pst.setBoolean(5, alimentoGato.isEstado());
            
            pst.executeUpdate();
            pst.close();
            cnx.close();
            
            return true;
            
        } catch (SQLException e){
            System.out.println("Error al agregar alimentoGato" + e.getMessage());
            return false;
        }
    }
    
    
    public boolean actualizar(AlimentoGato alimentoGato){
            
        Date date;
        try {
            
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            date = alimentoGato.getFechaIngreso();
            
            String query = "UPDATE alimentoGato set nombre = ?,marca=?, fechaIngreso=?,precio=?, estado=? WHERE idAlimentoGato=?";
            PreparedStatement pst = cnx.prepareStatement(query);
            pst.setString(1, alimentoGato.getNombre());
            pst.setString(2, alimentoGato.getMarca());
            pst.setDate(3, new java.sql.Date(date.getTime()));
            pst.setInt(4, alimentoGato.getPrecio());
            pst.setBoolean(5, alimentoGato.isEstado());
            pst.setInt(6, alimentoGato.getidAlimentoGato());
            
            pst.executeUpdate();
            pst.close();
            cnx.close();
            
            return true;
            
        } catch (SQLException e){
            System.out.println("Error al agregar alimentoGato" + e.getMessage());
            return false;
        }
    }
    
    
    }        
    

