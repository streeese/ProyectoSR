
package modelo;

import java.util.Date;

/**
 *
 * @author Stephanie
 */
public class AlimentoGato {
    
    private int alimentoGato;
    private String nombre;
    private String marca;
    private Date fechaIngreso;
    private int precio;
    private boolean estado;

    public AlimentoGato() {
    }

    public AlimentoGato(int alimentoGato, String nombre, String Marca, Date fechaIngreso, int precio, boolean estado) {
        this.alimentoGato = alimentoGato;
        this.nombre = nombre;
        this.marca = marca;
        this.fechaIngreso = fechaIngreso;
        this.precio = precio;
        this.estado = estado;
    }

    public int getAlimentoGato() {
        return alimentoGato;
    }

    public void setAlimentoGato(int alimentoGato) {
        this.alimentoGato = alimentoGato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
