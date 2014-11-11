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
public class Mercadito {
        private LinkedList<Clientes> ListaClientesGlobales = new LinkedList<Clientes>();
        private LinkedList<Clientes> ListaClientesEspera = new LinkedList<Clientes>();
        private LinkedList<Cajero> ListaCajas = new LinkedList<Cajero>();
        Super miinterfaz;
      //  private LinkedList<Contenedor> ListaCajas = new LinkedList<contenedor>();
    public Mercadito() {
         miinterfaz= new Super();
         this.seetearDatos();
         this.ActualizarInterfaz();
         miinterfaz.setVisible(true);
         // this.ActualizarInterfaz();
    }

    public LinkedList<Clientes> getListaClientesGlobales() {
        return ListaClientesGlobales;
    }

    public LinkedList<Clientes> getListaClientesEspera() {
        return ListaClientesEspera;
    }

    public void ActualizarInterfaz(){
      miinterfaz.actualizarInterfaz(ListaClientesGlobales, ListaCajas, ListaClientesEspera, 5, 6);
    }
   
    public void seetearDatos(){
        //
    Clientes cliente15 = new Clientes(0, 0);
    Clientes cliente16 = new Clientes(0, 0);
    Clientes cliente17 = new Clientes(0, 0);
    Clientes cliente8 = new Clientes(0, 0);
    Clientes cliente9 = new Clientes(0, 0);
    Clientes cliente10 = new Clientes(0, 0);
    Clientes cliente11 = new Clientes(0, 0);
    Clientes cliente12 = new Clientes(0, 0);
    Clientes cliente13 = new Clientes(0, 0);
    
    
        
    Cajero ACaja = new Cajero(15, 21);
  
    
    ACaja.ListaClientes.add(cliente17);
    
    
    Cajero BCaja = new Cajero(105, 21);
    
     BCaja.ListaClientes.add(cliente8);
   // ACaja.ListaClientes.add(cliente9);
  BCaja.ListaClientes.add(cliente15);
   // BC.ListaClientes.add(cliente16);
    
    
    Cajero CCaja = new Cajero(195, 21);
     CCaja.ListaClientes.add(cliente10);
      
      
    Cajero DCaja = new Cajero(285, 21);
    DCaja.ListaClientes.add(cliente11);
    
    Cajero ECaja = new Cajero(375, 21);
    //ECaja.ListaClientes.add(cliente12);
    ECaja.ListaClientes.add(cliente13);
    
    
    Cajero FCaja = new Cajero(465, 21);
    Cajero GCaja = new Cajero(555, 21);
    Cajero HCaja = new Cajero(645, 21);
    Cajero ICaja = new Cajero(735, 21);
    Cajero JCaja = new Cajero(825, 21);
    Clientes cliente = new Clientes(260, 310);
    Clientes cliente2 = new Clientes(160, 310);
    Clientes cliente3 = new Clientes(180, 310);
    Clientes cliente4 = new Clientes(380, 310);
     Clientes cliente5 = new Clientes(380, 310);
        ListaCajas.add(ACaja);
        ListaCajas.add(BCaja);
        ListaCajas.add(CCaja);
        ListaCajas.add(DCaja);
        ListaCajas.add(ECaja);
        ListaCajas.add(FCaja);
        ListaCajas.add(GCaja);
        ListaCajas.add(HCaja);
        ListaCajas.add(ICaja);
        ListaCajas.add(JCaja);
        ListaClientesGlobales.add(cliente);
        ListaClientesGlobales.add(cliente2);
        ListaClientesGlobales.add(cliente3);
        ListaClientesEspera.add(cliente3);
        ListaClientesEspera.add(cliente4);
        ListaClientesEspera.add(cliente5);
    
    }    
        
        
        
}
