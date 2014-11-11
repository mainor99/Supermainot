/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasupermercado;

import java.util.LinkedList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Aerlepsedy
 */
public class SuperMercado extends Thread {
    private LinkedList<Cliente> ListaClientesGlobales = new LinkedList<Cliente>();
    private LinkedList<Cliente> ListaClientesEspera = new LinkedList<Cliente>();
    private LinkedList<Caja> ListaCajas = new LinkedList<Caja>();
    Random  rnd = new Random();
    private LinkedList<Producto> productos=new LinkedList();
    private LinkedList<Contenedor> contenedores=new LinkedList();

        Super miinterfaz;
      //  private LinkedList<Contenedor> ListaCajas = new LinkedList<contenedor>();
    public SuperMercado() {
        
        
         miinterfaz= new Super();
       miinterfaz.sup=this;
         this.seetearDatos();
         
         
       //  this.ActualizarInterfaz(); poner al lugar de esto this .star
         miinterfaz.setVisible(true);
         
         
         
    }

    public LinkedList<Cliente> getListaClientesGlobales() {
        return ListaClientesGlobales;
    }

    public LinkedList<Cliente> getListaClientesEspera() {
        return ListaClientesEspera;
    }

    public void ActualizarInterfaz(){
      miinterfaz.actualizarInterfaz(ListaClientesGlobales, ListaCajas, ListaClientesEspera, 5, 6);
    }
   
    public void seetearDatos(){
        //

    
    
        
    CajaExpress ACaja = new  CajaExpress(15, 21,"Caja");
  
   /* ACaja.ListaClientes.add(cliente15);
    ACaja.ListaClientes.add(cliente16);
    ACaja.ListaClientes.add(cliente17);*/
    
    
    CajaEstandar BCaja = new CajaEstandar(105, 21,"Caja 1");
    /*
     BCaja.ListaClientes.add(cliente8);
   // ACaja.ListaClientes.add(cliente9);
  
    
    
    Caja CCaja = new Caja(195, 21,"Caja");
     CCaja.ListaClientes.add(cliente10);
      
      
    Caja DCaja = new Caja(285, 21,"Caja");
    DCaja.ListaClientes.add(cliente11);
    
    Caja ECaja = new Caja(375, 21,"Caja");
    //ECaja.ListaClientes.add(cliente12);
    ECaja.ListaClientes.add(cliente13);*/
    
    /*
    Caja FCaja = new Caja(465, 21,"Caja");
    Caja GCaja = new Caja(555, 21,"Caja");
    Caja HCaja = new Caja(645, 21,"Caja");
    Caja ICaja = new Caja(735, 21,"Caja");
    Caja JCaja = new Caja(825, 21,"Caja");*/
    Cliente cliente = new Cliente(260, 310,"Carlos",null);
    Cliente cliente2 = new Cliente(160, 310,"Brian",null);
    Cliente cliente3 = new Cliente(180, 310,"Nano",null);
    Cliente cliente4 = new Cliente(380, 310,"Peniche",null);
     Cliente cliente5 = new Cliente(380, 310,"Eder",null);
        this.crearNContenedores(4);
        this.creaNProductos(25);
        
         this.setClientes(cliente);
        this.setClientes(cliente2);
        this.setClientes(cliente3);
         this.setClientes(cliente4);
        this.asignaConenedorACliente(cliente.getNombre(), 0);
        this.asignaConenedorACliente(cliente2.getNombre(), 1);
        this.asignaConenedorACliente(cliente3.getNombre(), 2);
        this.asignaConenedorACliente(cliente4.getNombre(), 3);
        this.asignarNProductosAContenedor(5);
        
        ACaja.setSuperMain(this);
        BCaja.setSuperMain(this);
        
        
      //  JOptionPane.showMessageDialog(null, ACaja.clientes.get(1).getNombre());
     //   BCaja.agegarClienteACola(cliente4);
      //  ListaCajas.add(ACaja);
       // ACaja.clientes.add(cliente);
        ListaCajas.add(ACaja);
        ListaCajas.add(BCaja);
        
        ACaja.agegarClienteACola(cliente);
        ACaja.agegarClienteACola(cliente2);
        BCaja.agegarClienteACola(cliente3);
        BCaja.agegarClienteACola(cliente4);
       //
        //JOptionPane.showMessageDialog(null, ACaja.clientes.get(1).getNombre());
        //JOptionPane.showMessageDialog(null, ListaCajas.get(1).clientes.size());
        ACaja.start();
        BCaja.start();
        this.start();
        
        
   /*    
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
        ListaClientesEspera.add(cliente5);*/
    
    }    
        
         public LinkedList<Caja> getCajas() {
        return ListaCajas;
    }

    public LinkedList<Cliente> getClientes() {
        return ListaClientesGlobales;
    }

    public LinkedList<Producto> getProductos() {
        return productos;
    }

    public LinkedList<Contenedor> getContenedores() {
        return contenedores;
    }
    ////////sets
    public void setCajas(Caja caja) {
        this.ListaCajas.add(caja);
    }

    public void setClientes(Cliente clientes) {
        this.ListaClientesGlobales.add(clientes);
    }

    public void setProductos(Producto productos) {
        this.productos.add(productos);
    }
    
    public void setContenedores(Contenedor contenedores) {
        this.contenedores.add(contenedores);
    }
    //Este metodo agrega cliente a la cola correcta, distribuye de la maneta apropiada
    public int nAleatorio(int min,int max){
        return rnd.nextInt((max - min) + 1) + min;
    }
    public void agregaClienteALaCola(Cliente clientes){
        
    }
    public void creaNProductos(int n){
        String nom="Producto";
        for(int i=0;i<n;i++){
            Producto p=new Producto(nAleatorio(0,5), nom+" "+String.valueOf(i));
            agregarProducto(p);
        }
        
    }
    public void crearNContenedores(int n){
        
        for(int i=0;i<n*2;i++){
            if(n%2==0){
            Canasta c=new Canasta(contenedores.size());
            agregarContenedor(c);
            }
            else{
            Carrito c=new Carrito(contenedores.size());
            agregarContenedor(c);
            }
            
        }
    }
    public void agregarProducto(Producto p){
        this.productos.add(p);
    }
    public void agregarContenedor(Contenedor c){
        this.contenedores.add(c);
    }
    public Cliente buscaCliente(String nom){
        for(Cliente c : this.ListaClientesGlobales){
            if(c.getNombre().equals(nom)){
                return c;
            }
        }
        System.out.println("Error buscaCliente");
        return null;
    }
    public Contenedor buscaContenedor(int id){
        for(Contenedor c : this.contenedores){
            if(c.getId()==id){
                return c;
            }
        }
        System.out.println("Error buscaContenedor");
        return null;
    }
    public void asignaConenedorACliente(String nombre,int id){
        this.buscaCliente(nombre).setContenedor(this.buscaContenedor(id));
    }
    public void asignarNProductosAContenedor(int n){
        int indice=0;
        for(Contenedor c: this.contenedores){
            for(int i=0;i<n;i++){
                indice=nAleatorio(0,productos.size()-1);
                //System.out.println(indice);
                c.agregarProducto(productos.get(indice));
            }
        }
    }
    public void quitarCliente(Cliente c){
        this.ListaClientesGlobales.remove(c);
    }  
        @Override
    public void run(){
        while(true){
            esperarXsegundos(1);
            this.ActualizarInterfaz();
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
