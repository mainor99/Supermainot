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
public class CajaExpress extends Caja{
     private Image Caja;
    //Coordenadas de la pelota
    public int X;
    public int Y;
  //  public LinkedList<Cliente> clientes;

   private String nombre;

   // private LinkedList<Cliente> clientes=new LinkedList();
    private SuperMercado superMain;

     public CajaExpress(int x, int y,String nombre) {
        //coordenadas iniciales
         clientes=new LinkedList<>();
        this.X = x; this.Y = y;
        //imagen de la caja
        Caja = new ImageIcon(getClass().getResource("Caja.png")).getImage();
         this.nombre = nombre;
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

        while(this.clientes.size()!=0){
            for(Cliente c:this.clientes){
                
                for(Producto p : c.getContenedor().getListaProductos()){
                    System.out.println(this.nombre+" prosesando "+
                            p.getDescripcion()+" duracion: "+String.valueOf(p.getDuracion())+
                            " del cliente "+c.getNombre());
                    this.esperarXsegundos(p.getDuracion());
                }
                System.out.println("Termino "+ c.getNombre());
                this.quitarClienteDeCola(c);
            }
        }
        
        
        /*
        System.out.println("La caja " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE "
                + this.cliente.getNombre() + " EN EL TIEMPO: "
                + (System.currentTimeMillis() - this.initialTime) / 1000
                + "seg");
        
        for (int i = 0; i < this.cliente.getCarroCompra().length; i++) {
            
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesado el producto " + (i + 1)
                    + " del cliente " + this.cliente.getNombre() + "->Tiempo: "
                    + (System.currentTimeMillis() - this.initialTime) / 1000
                    + "seg");
        }
        
        System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR "
                + this.cliente.getNombre() + " EN EL TIEMPO: "
                + (System.currentTimeMillis() - this.initialTime) / 1000
                + "seg");*/
    }

	private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
}
