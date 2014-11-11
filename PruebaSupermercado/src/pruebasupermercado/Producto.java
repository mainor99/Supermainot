/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasupermercado;

/**
 *
 * @author Carlos
 */
public class Producto {
    private int duracion;
    private String descripcion;

    public Producto(int duracion, String descripcion) {
        this.duracion = duracion;
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
