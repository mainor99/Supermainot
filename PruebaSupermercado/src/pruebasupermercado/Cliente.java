/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebasupermercado;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class Cliente {
     private Image cliente;
    //Coordenadas de la pelota
    public int X;
    public int Y;
    private String nombre;
    private Contenedor contenedor;
    private int velocidad_X;
    private int velocidad_Y;

    private int limite_izquierda=0;
    private int limite_derecha;
    private int limite_superior=0;
    private int limite_inferior;
    
    public Cliente(int x, int y,String nombre, Contenedor contenedor) {
        //coordenadas iniciales
        this.X = x; this.Y = y;
        //imagen de la pelota
        cliente = new ImageIcon(getClass().getResource("Cliente.jpg")).getImage();
         this.nombre = nombre;
        this.contenedor = contenedor;
    }
    public void dibujar(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(cliente, X, Y, null);
    }
       public void LimitesXY(int width, int height) {
        limite_derecha  = width  - cliente.getWidth(null);
        limite_inferior = height - cliente.getHeight(null);
    }
          public void move() {
        //nueva posicion
        this.X +=1;
        this.Y -=1;
        //controla que la pelota no salga de los limites del contenedor
        if (X < this.limite_izquierda) {
            X = 0;
            velocidad_X = -velocidad_X;
        } else if (X > limite_derecha) {
            X = limite_derecha;
            velocidad_X = -velocidad_X;
        }
        if (Y < this.limite_superior) {
            Y = 0;
            velocidad_Y = -velocidad_Y;

        } else if (Y > limite_inferior) {
            Y =  limite_inferior;
            velocidad_Y = -velocidad_Y;
        }
    }
           public void setVelocidadXY(){
        velocidad_X = 4;
        velocidad_Y =5;
        
    }
           public String getNombre() {
        return nombre;
    }
           
    public Cliente(String nombre, Contenedor contenedor) {
        this.nombre = nombre;
        this.contenedor = contenedor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Contenedor getContenedor() {
        return contenedor;
    }

    public void setContenedor(Contenedor contenedor) {
        this.contenedor = contenedor;
    }
    public int duracionCanasta(){
        int duracion=0;
        for(Producto p : contenedor.getListaProductos()){
            duracion+=p.getDuracion();
        }
        return duracion;
    }
}
