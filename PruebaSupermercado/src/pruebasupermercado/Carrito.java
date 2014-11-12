/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasupermercado;

import java.util.LinkedList;

/**
 *
 * @author Aerlepsedy
 */
public class Carrito extends Contenedor{
    
     public Carrito(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public LinkedList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListaProductos(LinkedList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    public void agregarProducto(Producto p){
        this.listaProductos.add(p);
    }
}
