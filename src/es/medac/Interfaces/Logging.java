/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package es.medac.Interfaces;
import es.medac.ProyectoInterfaces.LoginPablo;
import javax.swing.JOptionPane; 
/**
 *
 * @author Usuario
 */
public class Logging extends javax.swing.JFrame {
LoginPablo LOG =new LoginPablo();
    /**
     * Creates new form Login
     */
    public Logging() {
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

        User = new javax.swing.JTextField();
        Usuario = new javax.swing.JLabel();
        Aceptar = new javax.swing.JButton();
        Contraseña = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });
        getContentPane().add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 120, -1));

        Usuario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Usuario.setForeground(new java.awt.Color(255, 255, 255));
        Usuario.setText("Usuario");
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        Aceptar.setBackground(new java.awt.Color(255, 153, 153));
        Aceptar.setForeground(new java.awt.Color(255, 255, 255));
        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        getContentPane().add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        Contraseña.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(255, 255, 255));
        Contraseña.setText("Contraseña");
        getContentPane().add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 120, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/medac/Interfaces/fondo.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 440, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed

    }//GEN-LAST:event_UserActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
     String r= LOG.logging_usuario_pablo(User.getText(),password.getText());//Coge usuario y contraseña para usar el metodo de la clase
     if(!r.equals("Log Incorrecto")){//si el resultado es distinto de log incorrecto
         String mensaje = r;//coge el mensaje del metodo
         JOptionPane.showMessageDialog(this, mensaje);//le dice al usuario que se activaron bien sus credenciales
         this.setVisible(false);//te lleva al menu principal (interfaz)
            Interfaces p = new Interfaces();
        p.setVisible(true);
     }else{//si es "Logging Incorrecto" mostrara el siguiente error
         String mensaje = "Log Incorrecto";
          String titulo = "Error";
         JOptionPane.showMessageDialog(this,mensaje,titulo,JOptionPane.ERROR_MESSAGE);
     }
    }//GEN-LAST:event_AceptarActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Logging().setVisible(true);
           }
       });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JLabel Contraseña;
    private javax.swing.JTextField User;
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
