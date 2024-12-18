/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.stomas.osoriopedroeva2.GUI;

import com.stomas.osoriopedroeva2.Exceptions.ArtistaException;
import com.stomas.osoriopedroeva2.Logica.Artista;
import com.stomas.osoriopedroeva2.Logica.Conexion;
import com.stomas.osoriopedroeva2.Logica.Genero;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author parag
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        conexion1.conectar();
        this.fr_bd.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_genero = new javax.swing.ButtonGroup();
        fr_bd = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_cant_canciones = new javax.swing.JTextField();
        txt_cant_reproducciones = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rb_clasico = new javax.swing.JRadioButton();
        rb_jazz = new javax.swing.JRadioButton();
        rb_urbano = new javax.swing.JRadioButton();
        rb_rock = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lb_resultado = new javax.swing.JLabel();
        bt_calcular = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lb_bono = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ls_artistas = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bt_agregarbd = new javax.swing.JButton();
        bt_ver_bd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        fr_bd.setVisible(true);

        jScrollPane2.setViewportView(jList1);

        fr_bd.getContentPane().add(jScrollPane2, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 56, -1));

        jLabel3.setText("Cantidad de Canciones subidas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 170, -1));

        jLabel4.setText("Cantidad de Reproducciones");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 200, -1));
        jPanel1.add(txt_cant_canciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 80, -1));
        jPanel1.add(txt_cant_reproducciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 80, -1));

        jLabel7.setText("Género");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        bg_genero.add(rb_clasico);
        rb_clasico.setText("Clásico");
        rb_clasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_clasicoActionPerformed(evt);
            }
        });
        jPanel1.add(rb_clasico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        bg_genero.add(rb_jazz);
        rb_jazz.setText("Jazz");
        rb_jazz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_jazzActionPerformed(evt);
            }
        });
        jPanel1.add(rb_jazz, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        bg_genero.add(rb_urbano);
        rb_urbano.setText("Urbano");
        rb_urbano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_urbanoActionPerformed(evt);
            }
        });
        jPanel1.add(rb_urbano, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        bg_genero.add(rb_rock);
        rb_rock.setText("Rock");
        rb_rock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_rockActionPerformed(evt);
            }
        });
        jPanel1.add(rb_rock, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 310, 230));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Total Pago:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 19, -1, -1));

        lb_resultado.setText("---");
        jPanel2.add(lb_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 19, 80, -1));

        bt_calcular.setText("Calcular");
        bt_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_calcularActionPerformed(evt);
            }
        });
        jPanel2.add(bt_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel6.setText("Aplica bono:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        lb_bono.setText("---");
        jPanel2.add(lb_bono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jScrollPane1.setViewportView(ls_artistas);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 290, 150));

        jLabel8.setText("Registros");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jButton1.setText("Limipiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        bt_agregarbd.setText("Agregar a bd");
        bt_agregarbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agregarbdActionPerformed(evt);
            }
        });
        jPanel2.add(bt_agregarbd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        bt_ver_bd.setText("ver artistas agregados");
        bt_ver_bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ver_bdActionPerformed(evt);
            }
        });
        jPanel2.add(bt_ver_bd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 310, 310));

        jLabel1.setText("Calculadora Pago a Artistas");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void bt_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_calcularActionPerformed
        try {
            if (this.rb_clasico.isSelected() == false && this.rb_jazz.isSelected() == false && this.rb_rock.isSelected() == false && this.rb_urbano.isSelected() == false ){
                throw new Exception("Debe elegir un genero");
            }
            artista1.setCant_canciones(Integer.valueOf(this.txt_cant_canciones.getText()));
            artista1.setCant_reproducciones(Integer.valueOf(this.txt_cant_reproducciones.getText()));
            artista1.setNombre(this.txt_nombre.getText());

            this.lb_resultado.setText(artista1.calcularPago().toString() + " USD");

            if (artista1.getCant_reproducciones() > artista1.getCant_canciones()) {
                this.lb_bono.setText("Si");
                artista1.setAplica_bono("Si");
            } else {
                this.lb_bono.setText("No");
                artista1.setAplica_bono("No");
            }
            artista1.setTotal_pago(artista1.calcularPago());
            this.lista_artistas.add(artista1.toString()+", pago total: "+artista1.getTotal_pago()+" USD.");
            loadList();
            
        }catch (ArtistaException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
       System.out.println(this.lista_artistas);
       

    }//GEN-LAST:event_bt_calcularActionPerformed

    private void rb_clasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_clasicoActionPerformed
        // TODO add your handling code here:
        artista1.setGenero(Genero.CLASICO.toString());
    }//GEN-LAST:event_rb_clasicoActionPerformed

    private void rb_urbanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_urbanoActionPerformed
        artista1.setGenero(Genero.URBANO.toString());
    }//GEN-LAST:event_rb_urbanoActionPerformed

    private void rb_rockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_rockActionPerformed
        // TODO add your handling code here:
        artista1.setGenero(Genero.ROCK.toString());
    }//GEN-LAST:event_rb_rockActionPerformed

    private void rb_jazzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_jazzActionPerformed
        // TODO add your handling code here:
        artista1.setGenero(Genero.JAZZ.toString());
    }//GEN-LAST:event_rb_jazzActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        limpiarFormulario();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bt_agregarbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_agregarbdActionPerformed
        // TODO add your handling code here:
        try {
            conexion1.agregarArtista(artista1);
        } catch (ArtistaException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_agregarbdActionPerformed

    private void bt_ver_bdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ver_bdActionPerformed
        // TODO add your handling code here:
        this.fr_bd.setVisible(true);
    }//GEN-LAST:event_bt_ver_bdActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    Artista artista1 = new Artista();
    ArrayList<String> lista_artistas = new ArrayList<String>();

    private void loadList() {
        DefaultListModel<String> modelo = new DefaultListModel<String>();
        for (String art : lista_artistas) {
            modelo.addElement(art);
        }
        this.ls_artistas.setModel(modelo);
    }
    public void limpiarFormulario(){
        this.txt_cant_canciones.setText("");
        this.txt_cant_reproducciones.setText("");
        this.txt_nombre.setText("");
        this.lb_resultado.setText("---");
        this.lb_bono.setText("---");
        this.bg_genero.clearSelection();
    }
    ArrayList<Artista> artistas = new ArrayList<Artista>();
    Conexion conexion1 = new Conexion();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_genero;
    private javax.swing.JButton bt_agregarbd;
    private javax.swing.JButton bt_calcular;
    private javax.swing.JButton bt_ver_bd;
    private javax.swing.JInternalFrame fr_bd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_bono;
    private javax.swing.JLabel lb_resultado;
    private javax.swing.JList<String> ls_artistas;
    private javax.swing.JRadioButton rb_clasico;
    private javax.swing.JRadioButton rb_jazz;
    private javax.swing.JRadioButton rb_rock;
    private javax.swing.JRadioButton rb_urbano;
    private javax.swing.JTextField txt_cant_canciones;
    private javax.swing.JTextField txt_cant_reproducciones;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
