/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Stephanie
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jmi_agregarap = new javax.swing.JMenuItem();
        jmi_actualizarap = new javax.swing.JMenuItem();
        jmi_listarap = new javax.swing.JMenuItem();
        jmi_eliminarap = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jmi_agregarag = new javax.swing.JMenuItem();
        jmi_actualizarag = new javax.swing.JMenuItem();
        jmi_listarag = new javax.swing.JMenuItem();
        jmi_eliminarag = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jmi_agregarac = new javax.swing.JMenuItem();
        jmi_actualizarac = new javax.swing.JMenuItem();
        jmi_listarac = new javax.swing.JMenuItem();
        jmi_eliminarac = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmi_salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Productos");

        jMenu6.setText("Alimento Perro");

        jmi_agregarap.setText("Agregar");
        jmi_agregarap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_agregarapActionPerformed(evt);
            }
        });
        jMenu6.add(jmi_agregarap);

        jmi_actualizarap.setText("Actualizar");
        jmi_actualizarap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_actualizarapActionPerformed(evt);
            }
        });
        jMenu6.add(jmi_actualizarap);

        jmi_listarap.setText("Listar");
        jmi_listarap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_listarapActionPerformed(evt);
            }
        });
        jMenu6.add(jmi_listarap);

        jmi_eliminarap.setText("Eliminar");
        jmi_eliminarap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarapActionPerformed(evt);
            }
        });
        jMenu6.add(jmi_eliminarap);

        jMenu1.add(jMenu6);

        jMenu7.setText("Alimento Gato");

        jmi_agregarag.setText("Agregar");
        jmi_agregarag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_agregaragActionPerformed(evt);
            }
        });
        jMenu7.add(jmi_agregarag);

        jmi_actualizarag.setText("Actualizar");
        jmi_actualizarag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_actualizaragActionPerformed(evt);
            }
        });
        jMenu7.add(jmi_actualizarag);

        jmi_listarag.setText("Listar");
        jMenu7.add(jmi_listarag);

        jmi_eliminarag.setText("Eliminar");
        jMenu7.add(jmi_eliminarag);

        jMenu1.add(jMenu7);

        jMenu8.setText("Accesorios");

        jmi_agregarac.setText("Agregar");
        jmi_agregarac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_agregaracActionPerformed(evt);
            }
        });
        jMenu8.add(jmi_agregarac);

        jmi_actualizarac.setText("Actualizar");
        jMenu8.add(jmi_actualizarac);

        jmi_listarac.setText("Listar");
        jMenu8.add(jmi_listarac);

        jmi_eliminarac.setText("Eliminar");
        jMenu8.add(jmi_eliminarac);

        jMenu1.add(jMenu8);
        jMenu1.add(jSeparator2);

        jmi_salir.setText("Salir");
        jmi_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_salirActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_actualizaragActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_actualizaragActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_actualizaragActionPerformed

    private void jmi_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_salirActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_jmi_salirActionPerformed

    private void jmi_agregarapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_agregarapActionPerformed
        new AgregarAP().setVisible(true);
    }//GEN-LAST:event_jmi_agregarapActionPerformed

    private void jmi_listarapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_listarapActionPerformed
        new ListarAP().setVisible(true);
    }//GEN-LAST:event_jmi_listarapActionPerformed

    private void jmi_eliminarapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarapActionPerformed
        new EliminarAP().setVisible(true);
    }//GEN-LAST:event_jmi_eliminarapActionPerformed

    private void jmi_actualizarapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_actualizarapActionPerformed
        new ActualizarAP().setVisible(true);
    }//GEN-LAST:event_jmi_actualizarapActionPerformed

    private void jmi_agregaragActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_agregaragActionPerformed
        new AgregarAG().setVisible(true);
    }//GEN-LAST:event_jmi_agregaragActionPerformed

    private void jmi_agregaracActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_agregaracActionPerformed
        new AgregarA().setVisible(true);
    }//GEN-LAST:event_jmi_agregaracActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem jmi_actualizarac;
    private javax.swing.JMenuItem jmi_actualizarag;
    private javax.swing.JMenuItem jmi_actualizarap;
    private javax.swing.JMenuItem jmi_agregarac;
    private javax.swing.JMenuItem jmi_agregarag;
    private javax.swing.JMenuItem jmi_agregarap;
    private javax.swing.JMenuItem jmi_eliminarac;
    private javax.swing.JMenuItem jmi_eliminarag;
    private javax.swing.JMenuItem jmi_eliminarap;
    private javax.swing.JMenuItem jmi_listarac;
    private javax.swing.JMenuItem jmi_listarag;
    private javax.swing.JMenuItem jmi_listarap;
    private javax.swing.JMenuItem jmi_salir;
    // End of variables declaration//GEN-END:variables
}
