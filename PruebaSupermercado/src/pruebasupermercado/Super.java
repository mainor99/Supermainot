package pruebasupermercado;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Super extends javax.swing.JFrame implements Runnable {
         Panel mipanel;//new Panel( this.jPanel1.getSize() );
         boolean primera=false;
         public SuperMercado sup ;
         int cont=0;
            // private LinkedList<Clientes> ListaClientes= new LinkedList<Clientes>();
            // private LinkedList<Cajero> ListaCajas= new LinkedList<Cajero>();
    /**
     * Creates new form Super
     */
    public Super() {
        initComponents();
        setTitle( "Mainor Gamboa was here" );
        setLocationRelativeTo(null);
     
                
   /* Caja ACaja = new Caja(15, 21);
    Caja BCaja = new Caja(105, 21);
    Caja CCaja = new Caja(195, 21);
    Caja DCaja = new Caja(285, 21);
    Caja ECaja = new Caja(375, 21);
    Caja FCaja = new Caja(465, 21);
    Caja GCaja = new Caja(555, 21);
    Caja HCaja = new Caja(645, 21);
    Caja ICaja = new Caja(735, 21);
    Caja JCaja = new Caja(825, 21);
    Cliente cliente = new Cliente(260, 310);
    Cliente cliente2 = new Cliente(160, 310);
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
        ListaClientes.add(cliente);
        ListaClientes.add(cliente2);*/
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        button1 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 817, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        button1.setLabel("button1");
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Canastas");

        jLabel2.setText("Carritos");
        jLabel2.setName(""); // NOI18N

        jButton1.setText("CrearCliente");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(276, 276, 276)
                        .addComponent(jButton1)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void actualizarInterfaz(  LinkedList<Cliente> clientesTotales,LinkedList<Caja> ListaCajas,LinkedList<Cliente> ListaClientesEspera,int carritos,int canastas){
          if(primera){
        this.mipanel.setVisible(false);
         
        mipanel = new Panel( this.jPanel1.getSize(),ListaCajas,clientesTotales,ListaClientesEspera,carritos,canastas);
      
        }
        primera=true;
     
        mipanel = new Panel(this.jPanel1.getSize(),ListaCajas,clientesTotales,ListaClientesEspera,carritos,canastas);
       
        
        this.jLabel1.setText("Canasta: "+canastas);
         this.jLabel2.setText("Carritos: "+carritos);
        this.jPanel1.add(mipanel);
    
       

      mipanel.animar(true);
    }
    
    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        // TODO add your handling code here:
     /*   
          LinkedList<Cliente> ListaClientesGlobales = new LinkedList<Cliente>();
         LinkedList<Cliente> ListaClientesEspera = new LinkedList<Cliente>();
         LinkedList<Caja> ListaCajas = new LinkedList<Caja>();
    Cliente cliente15 = new Cliente(0, 0);
    Cliente cliente16 = new Cliente(0, 0);
    Cliente cliente17 = new Cliente(0, 0);
    Cliente cliente8 = new Cliente(0, 0);
    Cliente cliente9 = new Cliente(0, 0);
    Cliente cliente10 = new Cliente(0, 0);
    Cliente cliente11 = new Cliente(0, 0);
    Cliente cliente12 = new Cliente(0, 0);
    Cliente cliente13 = new Cliente(0, 0);
    
    
        
    Caja ACaja = new Caja(15, 21);
  
    ACaja.ListaClientes.add(cliente15);
  //  ACaja.ListaClientes.add(cliente16);
   // ACaja.ListaClientes.add(cliente17);
    // ACaja.ListaClientes.add(cliente12);
    
    Caja BCaja = new Caja(105, 21);
    
     BCaja.ListaClientes.add(cliente8);
   // ACaja.ListaClientes.add(cliente9);
  
    
    
    Caja CCaja = new Caja(195, 21);
     CCaja.ListaClientes.add(cliente10);
      
      
    Caja DCaja = new Caja(285, 21);
    DCaja.ListaClientes.add(cliente11);
    
    Caja ECaja = new Caja(375, 21);
    //ECaja.ListaClientes.add(cliente12);
    ECaja.ListaClientes.add(cliente13);
    
    
    Caja FCaja = new Caja(465, 21);
    Caja GCaja = new Caja(555, 21);
    Caja HCaja = new Caja(645, 21);
    Caja ICaja = new Caja(735, 21);
    Caja JCaja = new Caja(825, 21);
    Cliente cliente = new Cliente(260, 310);
    Cliente cliente2 = new Cliente(160, 310);
    Cliente cliente3 = new Cliente(180, 310);
    Cliente cliente4 = new Cliente(380, 310);
     Cliente cliente5 = new Cliente(380, 310);
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
 // this.actualizarInterfaz(ListaClientes, ListaCajas, , , );
        this.actualizarInterfaz(ListaClientesGlobales, ListaCajas, ListaClientesEspera, 5, 6);
      
*/

    }//GEN-LAST:event_button1MouseClicked

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        cont++;
        Cliente cliente = new Cliente(380, 310,"Mainor"+cont,null);
        sup.setClientes(cliente);


// TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Super.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Super.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Super.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Super.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Super().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        
    }
}
