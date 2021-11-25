
package modelo;

import java.util.Date;

/**
 *
 * @author Stephanie
 */
public class Accesorio {
    
    private int idAccesorio;
    private String nombre;
    private String marca;
    private Date fechaIngreso;
    private int precio;
    private boolean estado;

    public Accesorio() {
    }

    public Accesorio(int idAccesorio, String nombre, String marca, Date fechaIngreso, int precio, boolean estado) {
        this.idAccesorio = idAccesorio;
        this.nombre = nombre;
        this.marca = marca;
        this.fechaIngreso = fechaIngreso;
        this.precio = precio;
        this.estado = estado;
    }
    
    
    
}
