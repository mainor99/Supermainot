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

//import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import pruebasupermercado.Caja;
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
    private LinkedList<Caja> ListaCajas= new LinkedList<Caja>();
  /*  private Caja ACaja = new Caja(15, 21);
    private Caja BCaja = new Caja(105, 21);
    private Caja CCaja = new Caja(195, 21);
    private Caja DCaja = new Caja(285, 21);
    private Caja ECaja = new Caja(375, 21);
    private Caja FCaja = new Caja(465, 21);
    private Caja GCaja = new Caja(555, 21);
    private Caja HCaja = new Caja(645, 21);
    private Caja ICaja = new Caja(735, 21);
    private Caja JCaja = new Caja(825, 21);
     Cliente cliente = new Cliente(260, 310);
     Cliente cliente2 = new Cliente(160, 310);*/
    Thread anima;
    private LinkedList<Cliente> ListaClientes= new LinkedList<Cliente>();
private LinkedList<Cliente> ListaEnEspera= new LinkedList<Cliente>();
    

    
    private Timer timer;

    //Constructor
    public Panel(Dimension d,LinkedList<Caja> ListaCajasP,LinkedList<Cliente> ListaClientesP,LinkedList<Cliente> ListaClientesEspera,int canastas,int carritos) {
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
         // JOptionPane.showMessageDialog(null,"si llega");
            for(int a =0 ; a<ListaCajas.get(i).clientes.size();a++){
                
                ListaCajas.get(i).clientes.get(a).X=ListaCajas.get(i).X+40 ;
                ListaCajas.get(i).clientes.get(a).Y=ListaCajas.get(i).Y+a*50 ;
                ListaCajas.get(i).clientes.get(a).dibujar(g);
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
