/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_6.Vistas;

import java.util.TreeSet;
import tp_6.Entidades.Productos;

/**
 *
 * @author Luciano Muzzachiodi
 */
public class DeTodoSA extends javax.swing.JFrame {
    public static TreeSet<Productos>lista=new TreeSet<>();
    /**
     * Creates new form DeTodoSA
     */
    public DeTodoSA() {
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

        jdEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAdministracion = new javax.swing.JMenu();
        jmiProductos = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        jmiPorNombre = new javax.swing.JMenuItem();
        jmiPorPrecio = new javax.swing.JMenuItem();
        jmiPorRubro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("De Todo SA");

        javax.swing.GroupLayout jdEscritorioLayout = new javax.swing.GroupLayout(jdEscritorio);
        jdEscritorio.setLayout(jdEscritorioLayout);
        jdEscritorioLayout.setHorizontalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jdEscritorioLayout.setVerticalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jmAdministracion.setText("Administración");

        jmiProductos.setText("Productos");
        jmiProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProductosActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmiProductos);

        jMenuBar1.add(jmAdministracion);

        jmConsultas.setText("Consultas");

        jmiPorNombre.setText("Por Nombre");
        jmiPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPorNombreActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiPorNombre);

        jmiPorPrecio.setText("Por Precio");
        jmiPorPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPorPrecioActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiPorPrecio);

        jmiPorRubro.setText("Por Rubro");
        jmiPorRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPorRubroActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiPorRubro);

        jMenuBar1.add(jmConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdEscritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProductosActionPerformed
        jdEscritorio.removeAll();
        jdEscritorio.repaint();
        GestionProductos gp = new GestionProductos();
        gp.setVisible(true);
        jdEscritorio.add(gp);
        jdEscritorio.moveToFront(gp);
    }//GEN-LAST:event_jmiProductosActionPerformed

    private void jmiPorRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPorRubroActionPerformed
        jdEscritorio.removeAll();
        jdEscritorio.repaint();
        PorRubro pr = new PorRubro();
        pr.setVisible(true);
        jdEscritorio.add(pr);
        jdEscritorio.moveToFront(pr);
    }//GEN-LAST:event_jmiPorRubroActionPerformed

    private void jmiPorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPorNombreActionPerformed
        jdEscritorio.removeAll();
        jdEscritorio.repaint();
        PorNombre pn = new PorNombre();
        pn.setVisible(true);
        jdEscritorio.add(pn);
        jdEscritorio.moveToFront(pn);
    }//GEN-LAST:event_jmiPorNombreActionPerformed

    private void jmiPorPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPorPrecioActionPerformed
        jdEscritorio.removeAll();
        jdEscritorio.repaint();
        PorPrecio pp = new PorPrecio();
        pp.setVisible(true);
        jdEscritorio.add(pp);
        jdEscritorio.moveToFront(pp);
    }//GEN-LAST:event_jmiPorPrecioActionPerformed

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
            java.util.logging.Logger.getLogger(DeTodoSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeTodoSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeTodoSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeTodoSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeTodoSA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdEscritorio;
    private javax.swing.JMenu jmAdministracion;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenuItem jmiPorNombre;
    private javax.swing.JMenuItem jmiPorPrecio;
    private javax.swing.JMenuItem jmiPorRubro;
    private javax.swing.JMenuItem jmiProductos;
    // End of variables declaration//GEN-END:variables
}
