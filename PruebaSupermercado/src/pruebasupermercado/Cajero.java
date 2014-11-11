package pruebasupermercado;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.util.LinkedList;
/**
 *
 * @author Admin
 */
public class Cajero {

    private Image Caja;
    //Coordenadas de la pelota
    public int X;
    public int Y;
    public LinkedList<Clientes> ListaClientes= new LinkedList<Clientes>();

  

     public Cajero(int x, int y) {
        //coordenadas iniciales
        this.X = x; this.Y = y;
        //imagen de la caja
        Caja = new ImageIcon(getClass().getResource("Caja.png")).getImage();
    }
     
     public void dibujar(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(Caja, X, Y, null);
        
        
        
        
        
        
    }
     
}
