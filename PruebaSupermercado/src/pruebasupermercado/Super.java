package pruebasupermercado;

import java.text.DecimalFormat;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 912, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        jLabel1.setText("Canastas");

        jLabel2.setText("Carritos");
        jLabel2.setName(""); // NOI18N

        jButton1.setText("CrearCliente");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Activo");
        jCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox2MouseClicked(evt);
            }
        });

        jCheckBox3.setSelected(true);
        jCheckBox3.setText("Activo");
        jCheckBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox3MouseClicked(evt);
            }
        });

        jCheckBox4.setSelected(true);
        jCheckBox4.setText("Activo");
        jCheckBox4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox4MouseClicked(evt);
            }
        });

        jCheckBox5.setSelected(true);
        jCheckBox5.setText("Activo");
        jCheckBox5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox5MouseClicked(evt);
            }
        });

        jCheckBox6.setSelected(true);
        jCheckBox6.setText("Activo");
        jCheckBox6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox6MouseClicked(evt);
            }
        });

        jCheckBox7.setSelected(true);
        jCheckBox7.setText("Activo");
        jCheckBox7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox7MouseClicked(evt);
            }
        });

        jCheckBox8.setSelected(true);
        jCheckBox8.setText("Activo");
        jCheckBox8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox8MouseClicked(evt);
            }
        });

        jCheckBox9.setSelected(true);
        jCheckBox9.setText("Activo");
        jCheckBox9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox9MouseClicked(evt);
            }
        });

        jCheckBox10.setSelected(true);
        jCheckBox10.setText("Activo");
        jCheckBox10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox10MouseClicked(evt);
            }
        });

        jCheckBox11.setSelected(true);
        jCheckBox11.setText("Activo");
        jCheckBox11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox11MouseClicked(evt);
            }
        });

        jLabel3.setText("%");

        jLabel4.setText("%");

        jLabel5.setText("%");

        jLabel7.setText("%");

        jLabel8.setText("%");

        jLabel9.setText("%");

        jLabel10.setText("%");

        jLabel11.setText("%");

        jLabel12.setText("%");

        jLabel13.setText("%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox9)
                    .addComponent(jCheckBox10)
                    .addComponent(jCheckBox11))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)))
                .addGap(21, 21, 21)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void actualizarInterfaz(  LinkedList<Cliente> clientesTotales,LinkedList<Caja> ListaCajas,LinkedList<Cliente> ListaClientesEspera,int carritos,int canastas){
        float suma = 0;
        
        for (int i=0;i<ListaCajas.size();i++){
            
            suma +=(float) ListaCajas.get(i).tiempoAcumulado;
         
        }
        DecimalFormat df=new DecimalFormat("#,##");
        float x;
        if(suma!=0){
               
        for (int i=0;i<ListaCajas.size();i++){
            x=ListaCajas.get(i).tiempoAcumulado*100/suma;
            if(i==0)
              jLabel3.setText(df.format(x) +"%");
            if(i==1)
                jLabel5.setText(df.format(x) +"%");
            if(i==2)
                jLabel9.setText(df.format(x) +"%");
            if(i==3)
                jLabel7.setText(df.format(x) +"%");
            if(i==4)
                jLabel8.setText(df.format(x) +"%");
            if(i==5)
                jLabel12.setText(df.format(x) +"%");
            if(i==6)
                jLabel4.setText(df.format(x) +"%");
            if(i==7)
                jLabel10.setText(df.format(x) +"%");
            if(i==8)
                jLabel13.setText(df.format(x) +"%");
            if(i==9)   
                jLabel11.setText(df.format(x) +"%");
                
        }
        }
       
        
        
        
 
        
        
        
        
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
    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        cont++;
        Cliente cliente = new Cliente(380, 310,"Mainor"+cont,null);
        sup.setClientes(cliente);


// TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jCheckBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox2MouseClicked
          //  JOptionPane.showMessageDialog(null, "holis");        // TODO add your handling code here:
       
        if(jCheckBox2.isSelected()){
            sup.getCajas().get(0).estado=true;
            JOptionPane.showMessageDialog(null, "si funka");
        }
        else
            sup.getCajas().get(0).estado=false;
        
        
    }//GEN-LAST:event_jCheckBox2MouseClicked

    private void jCheckBox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox3MouseClicked
        // TODO add your handling code here:
        if(jCheckBox3.isSelected()){
            sup.getCajas().get(1).estado=true;
            JOptionPane.showMessageDialog(null, "si funka");
        }
        else
            sup.getCajas().get(1).estado=false;
    }//GEN-LAST:event_jCheckBox3MouseClicked

    private void jCheckBox4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox4MouseClicked
        // TODO add your handling code here:
        if(jCheckBox4.isSelected()){
            sup.getCajas().get(2).estado=true;
            JOptionPane.showMessageDialog(null, "si funka");
        }
        else
            sup.getCajas().get(2).estado=false;
    }//GEN-LAST:event_jCheckBox4MouseClicked

    private void jCheckBox5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox5MouseClicked
        // TODO add your handling code here:
        if(jCheckBox5.isSelected()){
            sup.getCajas().get(3).estado=true;
            JOptionPane.showMessageDialog(null, "si funka");
        }
        else
            sup.getCajas().get(3).estado=false;
    }//GEN-LAST:event_jCheckBox5MouseClicked

    private void jCheckBox6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox6MouseClicked
        // TODO add your handling code here:
        if(jCheckBox6.isSelected()){
            sup.getCajas().get(4).estado=true;
            JOptionPane.showMessageDialog(null, "si funka");
        }
        else
            sup.getCajas().get(4).estado=false;
    }//GEN-LAST:event_jCheckBox6MouseClicked

    private void jCheckBox7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox7MouseClicked
        // TODO add your handling code here:
        if(jCheckBox7.isSelected()){
            sup.getCajas().get(5).estado=true;
            JOptionPane.showMessageDialog(null, "si funka");
        }
        else
            sup.getCajas().get(5).estado=false;
    }//GEN-LAST:event_jCheckBox7MouseClicked

    private void jCheckBox8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox8MouseClicked
        // TODO add your handling code here:
        if(jCheckBox8.isSelected()){
            sup.getCajas().get(6).estado=true;
            JOptionPane.showMessageDialog(null, "si funka");
        }
        else
            sup.getCajas().get(6).estado=false;
    }//GEN-LAST:event_jCheckBox8MouseClicked

    private void jCheckBox9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox9MouseClicked
        // TODO add your handling code here:
        if(jCheckBox9.isSelected()){
            sup.getCajas().get(7).estado=true;
            JOptionPane.showMessageDialog(null, "si funka");
        }
        else
            sup.getCajas().get(7).estado=false;
    }//GEN-LAST:event_jCheckBox9MouseClicked

    private void jCheckBox10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox10MouseClicked
        // TODO add your handling code here:
        if(jCheckBox10.isSelected()){
            sup.getCajas().get(8).estado=true;
            JOptionPane.showMessageDialog(null, "si funka");
        }
        else
            sup.getCajas().get(8).estado=false;
    }//GEN-LAST:event_jCheckBox10MouseClicked

    private void jCheckBox11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox11MouseClicked
        // TODO add your handling code here:
        if(jCheckBox11.isSelected()){
            sup.getCajas().get(9).estado=true;
          
        }
        else
            sup.getCajas().get(9).estado=false;
    }//GEN-LAST:event_jCheckBox11MouseClicked

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
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        
    }
}
