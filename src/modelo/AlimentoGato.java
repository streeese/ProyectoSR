
package modelo;

import java.util.Date;

/**
 *
 * @author Stephanie
 */
public class AlimentoGato {
    
    private int alimentoGato;
    private String nombre;
    private String Marca;
    private Date fechaIngreso;
    private int precio;
    private boolean estado;

    public AlimentoGato() {
    }

    public AlimentoGato(int alimentoGato, String nombre, String Marca, Date fechaIngreso, int precio, boolean estado) {
        this.alimentoGato = alimentoGato;
        this.nombre = nombre;
        this.Marca = Marca;
        this.fechaIngreso = fechaIngreso;
        this.precio = precio;
        this.estado = estado;
    }
    
    
    
}
