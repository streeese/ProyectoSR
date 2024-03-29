/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Consulta;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Accesorio;


/**
 *
 * @author Stephanie
 */
public class ActualizarA extends javax.swing.JFrame {
    
    Consulta registro = new Consulta();

    /**
     * Creates new form ActualizarA
     */
    public ActualizarA() {
        initComponents();
        this.jtxt_nombre.setEditable(false);
        this.jtxt_marca.setEditable(false);
        this.jtxt_fecha.setEditable(false);
        this.jtxt_precio.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtxt_buscar = new javax.swing.JTextField();
        jbtn_buscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxt_nombre = new javax.swing.JTextField();
        jtxt_marca = new javax.swing.JTextField();
        jtxt_fecha = new javax.swing.JTextField();
        jtxt_precio = new javax.swing.JTextField();
        jbtn_modificar = new javax.swing.JButton();
        jbtn_actualizar = new javax.swing.JButton();
        jbtn_volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualizar Accesorios");

        jLabel1.setText("ID");

        jtxt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_buscarActionPerformed(evt);
            }
        });

        jbtn_buscar.setText("Buscar");
        jbtn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_buscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Marca");

        jLabel4.setText("Fecha Ingreso:");

        jLabel5.setText("Precio:");

        jtxt_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_marcaActionPerformed(evt);
            }
        });

        jtxt_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_precioActionPerformed(evt);
            }
        });

        jbtn_modificar.setText("Modificar");
        jbtn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_modificarActionPerformed(evt);
            }
        });

        jbtn_actualizar.setText("Actualizar");
        jbtn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_actualizarActionPerformed(evt);
            }
        });

        jbtn_volver.setText("Volver");
        jbtn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jbtn_modificar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn_actualizar)
                                .addGap(83, 83, 83)
                                .addComponent(jbtn_volver))
                            .addComponent(jtxt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(93, 93, 93)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jbtn_buscar)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_buscar))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_modificar)
                    .addComponent(jbtn_actualizar)
                    .addComponent(jbtn_volver))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_buscarActionPerformed

    private void jtxt_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_marcaActionPerformed

    private void jtxt_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_precioActionPerformed

    private void jbtn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_modificarActionPerformed
        this.jtxt_nombre.setEditable(true);
        this.jtxt_marca.setEditable(true);
        this.jtxt_fecha.setEditable(true);
        this.jtxt_precio.setEditable(true);
        this.jtxt_nombre.requestFocus();
    }//GEN-LAST:event_jbtn_modificarActionPerformed

    private void jbtn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_buscarActionPerformed
        int id = Integer.parseInt(this.jtxt_buscar.getText());
       
       Accesorio accesorio = registro.buscarAccesorio(id);
       
       String nombre = accesorio.getNombre();
       String marca = accesorio.getMarca();
       int precio = accesorio.getPrecio();
       Date fecha = accesorio.getFechaIngreso();
       
       this.jtxt_nombre.setText(nombre);
       this.jtxt_marca.setText(marca);
       this.jtxt_precio.setText(String.valueOf(precio));
       this.jtxt_fecha.setText(""+fecha);
    }//GEN-LAST:event_jbtn_buscarActionPerformed

    private void jbtn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_actualizarActionPerformed
        int precio, id;
        String nombre,marca;
        
        id = Integer.parseInt(this.jtxt_buscar.getText());
        precio = Integer.parseInt(this.jtxt_precio.getText());
        nombre = this.jtxt_nombre.getText();
        marca = this.jtxt_marca.getText();
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyy");
        Date fecha = null;
        
        try {
            fecha= formato.parse(this.jtxt_fecha.getText());
        } catch (ParseException e) {
            
            System.out.println("Error al actualizar fecha" + e.getMessage());
        }
        Accesorio accesorio = new Accesorio(id, nombre, marca, fecha, precio, true);
        
        registro.actualizarA(accesorio);
        JOptionPane.showMessageDialog(null, "Datos Actualizados Correctamente", "Aviso", 2);
    }//GEN-LAST:event_jbtn_actualizarActionPerformed

    private void jbtn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_volverActionPerformed
        dispose();
    }//GEN-LAST:event_jbtn_volverActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ActualizarA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ActualizarA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ActualizarA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ActualizarA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ActualizarA().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbtn_actualizar;
    private javax.swing.JButton jbtn_buscar;
    private javax.swing.JButton jbtn_modificar;
    private javax.swing.JButton jbtn_volver;
    private javax.swing.JTextField jtxt_buscar;
    private javax.swing.JTextField jtxt_fecha;
    private javax.swing.JTextField jtxt_marca;
    private javax.swing.JTextField jtxt_nombre;
    private javax.swing.JTextField jtxt_precio;
    // End of variables declaration//GEN-END:variables
}
