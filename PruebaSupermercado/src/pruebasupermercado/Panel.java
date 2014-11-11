package pruebasupermercado;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */

import pruebasupermercado.Cajero;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;
import java.util.LinkedList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
public class Panel extends JPanel implements Runnable {
    private LinkedList<Cajero> ListaCajas= new LinkedList<Cajero>();
  /*  private Cajero ACaja = new Cajero(15, 21);
    private Cajero BCaja = new Cajero(105, 21);
    private Cajero CCaja = new Cajero(195, 21);
    private Cajero DCaja = new Cajero(285, 21);
    private Cajero ECaja = new Cajero(375, 21);
    private Cajero FCaja = new Cajero(465, 21);
    private Cajero GCaja = new Cajero(555, 21);
    private Cajero HCaja = new Cajero(645, 21);
    private Cajero ICaja = new Cajero(735, 21);
    private Cajero JCaja = new Cajero(825, 21);
     Clientes cliente = new Clientes(260, 310);
     Clientes cliente2 = new Clientes(160, 310);*/
    Thread anima;
    private LinkedList<Clientes> ListaClientes= new LinkedList<Clientes>();
private LinkedList<Clientes> ListaEnEspera= new LinkedList<Clientes>();
    

    
    private Timer timer;

    //Constructor
    public Panel(Dimension d,LinkedList<Cajero> ListaCajasP,LinkedList<Clientes> ListaClientesP,LinkedList<Clientes> ListaClientesEspera,int canastas,int carritos) {
        //cliente=c;
        ListaCajas.addAll(ListaCajasP);
        ListaClientes.addAll(ListaClientesP);
        ListaEnEspera.addAll(ListaClientesEspera);
        this.setSize(d);
        this.setPreferredSize(d);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setBackground(new Color(255,255,255));
      /*    for(int n =0 ; n<ListaClientes.size();n++){
               ListaClientes.get(n).LimitesXY(getWidth(), getHeight());
        }*/

        //para la animación
       timer = new Timer(16, new ActionListener (){
            public void actionPerformed(ActionEvent e) {
        
               /* if(ListaClientes.get(0).X!=325 && ListaClientes.get(0).Y!=100){
                    anima.run();
                   // cliente.move();
                }
                else{
                timer.stop();
                }*/
                
                repaint();
  
            }
        });
       
    }
    public void animar(boolean turnOnOff) {
     /*   if(anima ==null){
        anima=new Thread(this);
        
            }

         for(int i =0 ; i<ListaClientes.size();i++){
                 ListaClientes.get(i).setVelocidadXY();
        }*/
     
            timer.start();
       
        
    }
    //Pinta la animacion
     public void paintComponent(Graphics g) {
        super.paintComponent(g);
  
        
        for(int i =0 ; i<ListaCajas.size();i++){
            ListaCajas.get(i).dibujar(g);
            System.out.print(ListaCajas.get(i).ListaClientes.size());
            for(int a =0 ; a<ListaCajas.get(i).ListaClientes.size();a++){
                ListaCajas.get(i).ListaClientes.get(a).X=ListaCajas.get(i).X+40 ;
                ListaCajas.get(i).ListaClientes.get(a).Y=ListaCajas.get(i).Y+a*50 ;
                ListaCajas.get(i).ListaClientes.get(a).dibujar(g);
            }
            
        }
    
        for(int n =0 ; n<ListaEnEspera .size();n++){
             ListaEnEspera.get(n).X=50+n*50;
             ListaEnEspera.get(n).Y=250;
             
               ListaEnEspera.get(n).dibujar(g);
        }
           
         for(int n =0 ; n<ListaClientes.size();n++){
             ListaClientes.get(n).X=10+n*50;
             ListaClientes.get(n).Y=400;
             
               ListaClientes.get(n).dibujar(g);
        }
         

         
    }

    @Override
    public void run() {
     for(int n =0 ; n<ListaClientes.size();n++){
               ListaClientes.get(n).move();
        }
    }
    
}
