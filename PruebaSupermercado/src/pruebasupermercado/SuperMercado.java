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
    public Caja cajaOptima(int candProductos){
        
        int minimo=-1;
        Caja cajaAux=null;
        
        for(Caja c: ListaCajas){
            if (c.estado){
                if(!c.tipo && candProductos<=10){
                    if(c.getClientes().size()<=minimo || minimo==-1){
                        minimo=c.getClientes().size();
                        cajaAux=c;
                    }
                }
                else{
                    if(c.getClientes().size()<=minimo || minimo==-1){
                        minimo=c.getClientes().size();
                        cajaAux=c;
                    }
                }
            }
        }
        return cajaAux;
    }
    public void reparteClientes(){
        int i;
        while(true){
            this.ActualizarInterfaz();
            this.encenderAutomatico();
            esperarXsegundos(1);
            if(ListaClientesGlobales.size()>=1 && contenedores.size()>=1){
                this.asignaConenedorACliente(ListaClientesGlobales.get(0));
                i=ListaClientesGlobales.get(0).getContenedor().getListaProductos().size();
                cajaOptima(i).agegarClienteACola(ListaClientesGlobales.get(0));
            }
        }
    }

    public LinkedList<Cliente> getListaClientesGlobales() {
        return ListaClientesGlobales;
    }

    public LinkedList<Cliente> getListaClientesEspera() {
        return ListaClientesEspera;
    }
    public int cuantasCanastas(){
        int i=0;
        for(Contenedor c: contenedores){
            if(c.id==1)
                i++;
        }
        return i;
    }
    public int cuantasCarritos(){
        int i=0;
        for(Contenedor c: contenedores){
            if(c.id==0)
                i++;
        }
        return i;
    }
    public void ActualizarInterfaz(){
      miinterfaz.actualizarInterfaz(ListaClientesGlobales, ListaCajas, ListaClientesEspera, cuantasCarritos(), cuantasCanastas());
    }
   
    public void seetearDatos(){
        //

    
    
        
    CajaExpress ACaja = new CajaExpress(15, 21,"Caja 1");
    CajaExpress BCaja = new CajaExpress(105, 21,"Caja 2");
    CajaExpress CCaja = new CajaExpress(195, 21,"Caja 3");
    CajaExpress DCaja = new CajaExpress(285, 21,"Caja 4");
    CajaExpress ECaja = new CajaExpress(375, 21,"Caja 5");
    CajaEstandar FCaja = new CajaEstandar(465, 21,"Caja 6");
    CajaEstandar GCaja = new CajaEstandar(555, 21,"Caja 7");
    CajaEstandar HCaja = new CajaEstandar(645, 21,"Caja 8");
    CajaEstandar ICaja = new CajaEstandar(735, 21,"Caja 9");
    CajaEstandar JCaja = new CajaEstandar(825, 21,"Caja 10");
   /* ACaja.ListaClientes.add(cliente15);
    ACaja.ListaClientes.add(cliente16);
    ACaja.ListaClientes.add(cliente17);*/
    
    
  
     //BCaja.ListaClientes.add(cliente8);
   // ACaja.ListaClientes.add(cliente9);
  
    
    
    
     //CCaja.ListaClientes.add(cliente10);
      
      
    
    //DCaja.ListaClientes.add(cliente11);
    
    
    //ECaja.ListaClientes.add(cliente12);
    //ECaja.ListaClientes.add(cliente13);*/
    
    /*
    
    /*
    Cliente cliente = new Cliente(260, 310,"Carlos",null);
    Cliente cliente2 = new Cliente(160, 310,"Brian",null);
    Cliente cliente3 = new Cliente(180, 310,"Nano",null);
    Cliente cliente4 = new Cliente(380, 310,"Peniche",null);
     Cliente cliente5 = new Cliente(380, 310,"Eder",null);*/
        this.crearNContenedores(10);
        this.creaNProductos(25);
        /*
         this.setClientes(cliente);
        this.setClientes(cliente2);
        this.setClientes(cliente3);
         this.setClientes(cliente4);*/
         
        //this.asignarNProductosAContenedor(5);
        /*
        this.asignaConenedorACliente(cliente);
        this.asignaConenedorACliente(cliente2);
        this.asignaConenedorACliente(cliente3);
        this.asignaConenedorACliente(cliente4);*/
        
        
        
        ACaja.setSuperMain(this);
        BCaja.setSuperMain(this);
        CCaja.setSuperMain(this);
        DCaja.setSuperMain(this);
        ECaja.setSuperMain(this);
        FCaja.setSuperMain(this);
        GCaja.setSuperMain(this);
        HCaja.setSuperMain(this);
        ICaja.setSuperMain(this);
        JCaja.setSuperMain(this);
        
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

        this.cajaOptima(1);
        ACaja.start();
        BCaja.start();
        CCaja.start();
        ECaja.start();
        FCaja.start();
        GCaja.start();
        ICaja.start();
        JCaja.start();
        this.start();
            

    
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
            if(i%2==0){
            Canasta c=new Canasta(1);
            agregarContenedor(c);
            }
            else{
            Carrito c=new Carrito(0);
            agregarContenedor(c);
            }
            
        }
    }
    public void agregarProducto(Producto p){
        this.productos.add(p);
    }
    public void agregarContenedor(Contenedor c){
        c.getListaProductos().clear();
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
    
    public void asignaConenedorACliente(Cliente nombre){
        nombre.setContenedor(this.contenedores.get(0));
        this.asingaProductosAContenedor(this.contenedores.get(0));
        this.contenedores.remove(0);
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
    
    public void asingaProductosAContenedor(Contenedor c){
        int indice=0;
        int cantidad=nAleatorio(1,5);
        for(int i=0;i<cantidad;i++){
            indice=nAleatorio(0,productos.size()-1);
            //System.out.println(indice);
            c.agregarProducto(productos.get(indice));
        }
}
    
    public void quitarCliente(Cliente c){
        this.ListaClientesGlobales.remove(c);
    }  
        @Override
    public void run(){
            reparteClientes();
            
            
        
    }
    private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
    public void encenderAutomatico(){
        for(Caja c:ListaCajas){
            if(c.getClientes().size()>=5){
                encenderAlgunaCaja();
            }
        }
    }
    public void encenderAlgunaCaja(){
        for(Caja c:ListaCajas){
            if(!c.estado){
                c.estado=true;
                return;
            }
        }
    }
}
