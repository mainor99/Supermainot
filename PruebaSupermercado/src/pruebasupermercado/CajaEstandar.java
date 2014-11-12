/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasupermercado;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.LinkedList;
import javax.swing.ImageIcon;

/**
 *
 * @author Aerlepsedy
 */
public class CajaEstandar extends Caja {
    private Image Caja;
    private String nombre;
    private SuperMercado superMain;

    public CajaEstandar(int x, int y,String nombre) {
        clientes=new LinkedList();
        this.X = x; 
        this.Y = y;
        Caja = new ImageIcon(getClass().getResource("Caja.png")).getImage();
        this.nombre = nombre;
        this.tipo=true;
        this.estado=true;
        this.tiempoAcumulado=0;
    }
    
     public void dibujar(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(Caja, X, Y, null);
  
    }
      public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(LinkedList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public SuperMercado getSuperMain() {
        return superMain;
    }

    public void setSuperMain(SuperMercado superMain) {
        this.superMain = superMain;
    }
    
    
    public void agegarClienteACola(Cliente c){
        this.clientes.add(c);
        this.superMain.quitarCliente(c);
    }
    public void quitarClienteDeCola(Cliente c){
        this.clientes.remove(c);
    }

    public void run() {
        while(true){
            esperarXsegundos(1);
        if(this.clientes.size()!=0){
                Cliente c =clientes.get(0);
                
                for(Producto p : c.getContenedor().getListaProductos()){
                    System.out.println(this.nombre+" prosesando "+
                            p.getDescripcion()+" duracion: "+String.valueOf(p.getDuracion())+
                            " del cliente "+c.getNombre());
                    this.tiempoAcumulado+=p.getDuracion();
                    this.esperarXsegundos(p.getDuracion());
                }
                System.out.println("Termino "+ c.getNombre());
                superMain.agregarContenedor(c.getContenedor());
                this.quitarClienteDeCola(c);
            }

        }
    }


    private void esperarXsegundos(int segundos) {
            try {
                    Thread.sleep(segundos * 1000);
            } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
            }
    }
}
