/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Paquete.Estructuras.Constructor;
import Paquete.Logica.PruebaBD4O;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class Principal extends javax.swing.JFrame {

    PruebaBD4O Basedatos=new PruebaBD4O();
    static Constructor usuarios;
    //ObjectSet resultado;
    static String x="";
    
    public Principal() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1250, 720));
        setPreferredSize(new java.awt.Dimension(623, 623));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Latitud");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 149, -1, -1));

        jLabel2.setText("Longitud");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 187, -1, -1));

        jLabel3.setText("Lugar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 225, -1, -1));

        jLabel4.setText("Medio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 268, -1, -1));

        jLabel5.setText("Dia");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 306, -1, -1));

        jLabel6.setText("Mes");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 306, -1, -1));

        jLabel7.setText("Año");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 306, 24, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 146, 50, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 184, 50, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 222, 50, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 265, 50, -1));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 303, 18, -1));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 303, 21, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 303, 19, -1));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 341, -1, -1));

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 341, -1, -1));

        jLabel8.setText("Usuario");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 149, -1, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 146, 56, -1));

        jLabel9.setText("Latitud");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 149, -1, -1));

        jLabel10.setText("Longitud");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 187, -1, -1));

        jLabel11.setText("Lugar");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 225, -1, -1));

        jLabel12.setText("Medio");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 268, -1, -1));

        jLabel13.setText("Dia");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 306, -1, -1));

        jLabel14.setText("Mes");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 306, -1, -1));

        jLabel15.setText("Usuario");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 149, -1, -1));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 146, 56, -1));

        jLabel16.setText("Año");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 306, 24, -1));

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 146, 50, -1));
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 184, 50, -1));
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 222, 50, -1));
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 265, 50, -1));

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 303, 18, -1));

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 303, 21, -1));
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 303, 19, -1));

        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 341, -1, -1));

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 341, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/FONDO.jpg"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1740, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if((jTextField1.getText() == null || jTextField1.getText().equals(""))||
                (jTextField2.getText() == null || jTextField2.getText().equals(""))||
                (jTextField3.getText() == null || jTextField3.getText().equals(""))||
                (jTextField4.getText() == null || jTextField4.getText().equals(""))||
                (jTextField5.getText() == null || jTextField5.getText().equals(""))||
                (jTextField6.getText() == null || jTextField6.getText().equals(""))||
                (jTextField7.getText() == null || jTextField7.getText().equals(""))||
                (jTextField8.getText() == null || jTextField7.getText().equals(""))){
            JOptionPane.showMessageDialog(null,"Debe completar los espacios vacios");
        }
        else{
            JOptionPane.showMessageDialog(null,"Buscando");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if((jTextField1.getText() == null || jTextField1.getText().equals(""))||
                (jTextField2.getText() == null || jTextField2.getText().equals(""))||
                (jTextField3.getText() == null || jTextField3.getText().equals(""))||
                (jTextField4.getText() == null || jTextField4.getText().equals(""))||
                (jTextField5.getText() == null || jTextField5.getText().equals(""))||
                (jTextField6.getText() == null || jTextField6.getText().equals(""))||
                (jTextField7.getText() == null || jTextField7.getText().equals(""))||
                (jTextField8.getText() == null || jTextField7.getText().equals(""))){
            JOptionPane.showMessageDialog(null,"Debe completar los espacios vacios");
            return;
        }
        else{
            int latitud = Integer.parseInt(jTextField1.getText());
            int longitud = Integer.parseInt(jTextField2.getText());
            Constructor persona=new Constructor(jTextField8.getText(),latitud,longitud,jTextField3.getText(),jTextField4.getText(),
               jTextField5.getText(),jTextField6.getText(),jTextField7.getText());
            Basedatos.Insertar(persona);
        
            System.out.println("\n*Aquí se hace un SELECT del usuario");
             ObjectSet resultado=Basedatos.Consultar(new Constructor(null,0,0,null,null,null,null,null));
		while(resultado.hasNext()) {
			System.out.println(resultado.next().toString());
                        JOptionPane.showMessageDialog(null, resultado.next().toString());
                       
		}
                //JOptionPane.showMessageDialog(null,x+"probando");
                
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int latitud = Integer.parseInt(jTextField1.getText());
        int longitud2 = Integer.parseInt(jTextField2.getText());
        int latitud2 = Integer.parseInt(jTextField10.getText());
        int longitud = Integer.parseInt(jTextField11.getText());
        Basedatos.Modificar(new Constructor(jTextField9.getText(),latitud,longitud,jTextField3.getText(),jTextField4.getText(),
               jTextField5.getText(),jTextField6.getText(),jTextField7.getText()), jTextField9.getText(),latitud,longitud,jTextField12.getText(),jTextField13.getText(),
               jTextField14.getText(),jTextField15.getText(),jTextField16.getText());
                
		System.out.println("\n*Aquí se hace un SELECT del usuario*");
		ObjectSet resultado=Basedatos.Consultar(new Constructor("",0,0,"Puntarenas",null,null,null,null));
		while(resultado.hasNext()) {
			System.out.println(resultado.next().toString());
                        
		}
                
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int latitud = Integer.parseInt(jTextField10.getText());
        int longitud = Integer.parseInt(jTextField11.getText());
        Basedatos.Borrar(new Constructor(jTextField9.getText(),latitud,longitud,jTextField12.getText(),jTextField13.getText(),
               jTextField14.getText(),jTextField15.getText(),jTextField16.getText()));
		
		System.out.println("\n*Aquí consulta todos los objetos de la base de datos.*");
		ObjectSet resultado=Basedatos.Consultar();
		while(resultado.hasNext()) {
			System.out.println(resultado.next().toString());
		}
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
