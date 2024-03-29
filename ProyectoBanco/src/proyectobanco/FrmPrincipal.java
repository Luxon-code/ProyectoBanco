/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobanco;

/**
 *
 * @author SENA
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        setLocationRelativeTo(this);
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuAgregar = new javax.swing.JMenuItem();
        menuConsultar = new javax.swing.JMenuItem();
        menuListar = new javax.swing.JMenuItem();
        menuConsignar = new javax.swing.JMenuItem();
        menuTransferir = new javax.swing.JMenuItem();
        menuRetirar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuAcercaDe = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 430));

        jMenu1.setText("Cuentas");

        menuAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Agregar.jpg"))); // NOI18N
        menuAgregar.setText("Agregar ");
        menuAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgregarActionPerformed(evt);
            }
        });
        jMenu1.add(menuAgregar);

        menuConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.jpg"))); // NOI18N
        menuConsultar.setText("Consultar");
        menuConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarActionPerformed(evt);
            }
        });
        jMenu1.add(menuConsultar);

        menuListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Listar.jpg"))); // NOI18N
        menuListar.setText("Listar");
        menuListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarActionPerformed(evt);
            }
        });
        jMenu1.add(menuListar);

        menuConsignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consignar.jpg"))); // NOI18N
        menuConsignar.setText("Consignar");
        menuConsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsignarActionPerformed(evt);
            }
        });
        jMenu1.add(menuConsignar);

        menuTransferir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/transferencia.jpg"))); // NOI18N
        menuTransferir.setText("Transferir");
        menuTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTransferirActionPerformed(evt);
            }
        });
        jMenu1.add(menuTransferir);

        menuRetirar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/retirar.jpg"))); // NOI18N
        menuRetirar.setText("Retirar");
        menuRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRetirarActionPerformed(evt);
            }
        });
        jMenu1.add(menuRetirar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("ayuda");

        menuAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Acercade.jpg"))); // NOI18N
        menuAcercaDe.setText("Acerca De");
        menuAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAcercaDeActionPerformed(evt);
            }
        });
        jMenu2.add(menuAcercaDe);

        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.jpg"))); // NOI18N
        menuSalir.setText("Salir de la aplicacion");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        jMenu2.add(menuSalir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgregarActionPerformed
        // TODO add your handling code here:
        FrmAgregar frm = new FrmAgregar(this, rootPaneCheckingEnabled);
        frm.setVisible(true);
    }//GEN-LAST:event_menuAgregarActionPerformed

    private void menuConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarActionPerformed
        // TODO add your handling code here:
        FrmConsultar frm = new FrmConsultar(this, rootPaneCheckingEnabled);
        frm.setVisible(true);
    }//GEN-LAST:event_menuConsultarActionPerformed

    private void menuListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarActionPerformed
        // TODO add your handling code here:
        FrmListar frm = new FrmListar(this, rootPaneCheckingEnabled);
        frm.setVisible(true);
    }//GEN-LAST:event_menuListarActionPerformed

    private void menuAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAcercaDeActionPerformed
        // TODO add your handling code here:
        FrmAcercaDe frm = new FrmAcercaDe(this, rootPaneCheckingEnabled);
        frm.setVisible(true);
    }//GEN-LAST:event_menuAcercaDeActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuConsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsignarActionPerformed
        // TODO add your handling code here:
        FrmConsignar frm = new FrmConsignar(this, rootPaneCheckingEnabled);
        frm.setVisible(true);
    }//GEN-LAST:event_menuConsignarActionPerformed

    private void menuRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRetirarActionPerformed
        // TODO add your handling code here:
        FrmRetirar frm = new FrmRetirar(this, rootPaneCheckingEnabled);
        frm.setVisible(true);
    }//GEN-LAST:event_menuRetirarActionPerformed

    private void menuTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTransferirActionPerformed
        // TODO add your handling code here:
        FrmTransferir frm = new FrmTransferir(this, rootPaneCheckingEnabled);
        frm.setVisible(true);
    }//GEN-LAST:event_menuTransferirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuAcercaDe;
    private javax.swing.JMenuItem menuAgregar;
    private javax.swing.JMenuItem menuConsignar;
    private javax.swing.JMenuItem menuConsultar;
    private javax.swing.JMenuItem menuListar;
    private javax.swing.JMenuItem menuRetirar;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenuItem menuTransferir;
    // End of variables declaration//GEN-END:variables
}
