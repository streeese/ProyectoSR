
package modelo;

import java.util.Date;

/**
 *
 * @author Stephanie
 */
public class AlimentoPerro {
    private int idAlimentoPerro;
    private String nombre;
    private String marca;
    private Date fechaIngreso;
    private int precio;
    private boolean estado;

    public AlimentoPerro() {
    }

    public AlimentoPerro(int idAlimentoPerro, String nombre, String marca, Date fechaIngreso, int precio, boolean estado) {
        this.idAlimentoPerro = idAlimentoPerro;
        this.nombre = nombre;
        this.marca = marca;
        this.fechaIngreso = fechaIngreso;
        this.precio = precio;
        this.estado = estado;
    }

    public int getIdAlimentoPerro() {
        return idAlimentoPerro;
    }

    public void setIdAlimentoPerro(int idAlimentoPerro) {
        this.idAlimentoPerro = idAlimentoPerro;
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
