/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princ;

import com.sun.awt.AWTUtilities;
import java.util.logging.Level;
import java.util.logging.Logger;
import rojeru_san.RSPanelsSlider;

/**
 *
 * @author User
 */
public class pg_login extends javax.swing.JFrame {

    /**
     * Creates new form pg_login
     */
    public pg_login() {
        initComponents();
        
        AWTUtilities.setWindowOpaque(this, false);
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelShadow1 = new rojeru_san.RSPanelShadow();
        jPanel1 = new javax.swing.JPanel();
        rSPanelsSlider1 = new rojeru_san.RSPanelsSlider();
        panel_login = new javax.swing.JPanel();
        txt_user = new rojeru_san.RSMTextFull();
        txt_pass = new rojeru_san.RSMPassView();
        btn_ingresar = new rojeru_san.RSButtonRiple();
        msg_errorsesion = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panel_carga = new javax.swing.JPanel();
        rSProgressMaterial1 = new rojerusan.componentes.RSProgressMaterial();
        jLabel1 = new javax.swing.JLabel();
        panel_registro = new javax.swing.JPanel();
        btn_reguser = new rojeru_san.RSMTextFull();
        btn_regmail = new rojeru_san.RSMPassView();
        btn_registrar = new rojeru_san.RSButtonRiple();
        btn_regpass1 = new rojeru_san.RSMPassView();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_cerrar = new rojeru_san.RSButtonRiple();
        rSButtonRiple2 = new rojeru_san.RSButtonRiple();
        btn_menuregi = new rojeru_san.RSButton();
        btn_menuingres = new rojeru_san.RSButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panel_login.setBackground(new java.awt.Color(255, 255, 255));
        panel_login.setName("panel_sesion"); // NOI18N
        panel_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_user.setForeground(new java.awt.Color(15, 43, 60));
        txt_user.setBordeColorFocus(new java.awt.Color(15, 43, 60));
        txt_user.setBordeColorNoFocus(new java.awt.Color(153, 153, 153));
        txt_user.setBotonColor(new java.awt.Color(15, 43, 60));
        txt_user.setModoMaterial(true);
        txt_user.setPlaceholder("Ingrese usuario");
        panel_login.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 129, 280, -1));

        txt_pass.setForeground(new java.awt.Color(15, 43, 60));
        txt_pass.setBordeColorFocus(new java.awt.Color(15, 43, 60));
        txt_pass.setBordeColorNoFocus(new java.awt.Color(153, 153, 153));
        txt_pass.setBotonColor(new java.awt.Color(15, 43, 60));
        txt_pass.setModoMaterial(true);
        txt_pass.setPlaceholder("Ingrese contraseña");
        panel_login.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 189, 280, -1));

        btn_ingresar.setBackground(new java.awt.Color(15, 43, 60));
        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        panel_login.add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        msg_errorsesion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        msg_errorsesion.setForeground(new java.awt.Color(255, 0, 0));
        panel_login.add(msg_errorsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 249, 280, 19));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pass.png"))); // NOI18N
        panel_login.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 42));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/user32.png"))); // NOI18N
        panel_login.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 42));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(15, 43, 60));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Ingresar");
        panel_login.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 180, -1));

        rSPanelsSlider1.add(panel_login, "card2");

        panel_carga.setBackground(new java.awt.Color(255, 255, 255));
        panel_carga.setName("panel_carga"); // NOI18N

        rSProgressMaterial1.setForeground(new java.awt.Color(15, 43, 60));
        rSProgressMaterial1.setAnchoProgress(15);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 43, 60));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cargando...");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout panel_cargaLayout = new javax.swing.GroupLayout(panel_carga);
        panel_carga.setLayout(panel_cargaLayout);
        panel_cargaLayout.setHorizontalGroup(
            panel_cargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cargaLayout.createSequentialGroup()
                .addGroup(panel_cargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_cargaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_cargaLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(rSProgressMaterial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_cargaLayout.setVerticalGroup(
            panel_cargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cargaLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(rSProgressMaterial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        rSPanelsSlider1.add(panel_carga, "card3");

        panel_registro.setBackground(new java.awt.Color(255, 255, 255));
        panel_registro.setName("panel_registro"); // NOI18N

        btn_reguser.setForeground(new java.awt.Color(15, 43, 60));
        btn_reguser.setBordeColorFocus(new java.awt.Color(15, 43, 60));
        btn_reguser.setBordeColorNoFocus(new java.awt.Color(153, 153, 153));
        btn_reguser.setBotonColor(new java.awt.Color(15, 43, 60));
        btn_reguser.setModoMaterial(true);
        btn_reguser.setPlaceholder("Ingrese usuario");

        btn_regmail.setForeground(new java.awt.Color(15, 43, 60));
        btn_regmail.setBordeColorFocus(new java.awt.Color(15, 43, 60));
        btn_regmail.setBordeColorNoFocus(new java.awt.Color(153, 153, 153));
        btn_regmail.setBotonColor(new java.awt.Color(15, 43, 60));
        btn_regmail.setModoMaterial(true);
        btn_regmail.setPlaceholder("Ingrese e-mail");

        btn_registrar.setBackground(new java.awt.Color(15, 43, 60));
        btn_registrar.setText("Registrar");
        btn_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_regpass1.setForeground(new java.awt.Color(15, 43, 60));
        btn_regpass1.setBordeColorFocus(new java.awt.Color(15, 43, 60));
        btn_regpass1.setBordeColorNoFocus(new java.awt.Color(153, 153, 153));
        btn_regpass1.setBotonColor(new java.awt.Color(15, 43, 60));
        btn_regpass1.setModoMaterial(true);
        btn_regpass1.setPlaceholder("Ingrese contraseña");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(15, 43, 60));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Regístrate");

        javax.swing.GroupLayout panel_registroLayout = new javax.swing.GroupLayout(panel_registro);
        panel_registro.setLayout(panel_registroLayout);
        panel_registroLayout.setHorizontalGroup(
            panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_registroLayout.createSequentialGroup()
                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_registroLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_regpass1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_regmail, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_reguser, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_registroLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_registroLayout.createSequentialGroup()
                    .addGap(25, 63, Short.MAX_VALUE)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 92, Short.MAX_VALUE)))
        );
        panel_registroLayout.setVerticalGroup(
            panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_registroLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_reguser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btn_regpass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_regmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_registroLayout.createSequentialGroup()
                    .addGap(0, 281, Short.MAX_VALUE)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 40, Short.MAX_VALUE)))
        );

        rSPanelsSlider1.add(panel_registro, "card4");

        jPanel2.setBackground(new java.awt.Color(15, 43, 60));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HUMAN-WARE");
        jLabel3.setToolTipText("");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 239, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/logo1.1.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 220, 217));

        btn_cerrar.setBackground(new java.awt.Color(15, 43, 60));
        btn_cerrar.setText("X");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        rSButtonRiple2.setBackground(new java.awt.Color(15, 43, 60));
        rSButtonRiple2.setText("-");

        btn_menuregi.setBackground(new java.awt.Color(255, 255, 255));
        btn_menuregi.setText("Registrarse");
        btn_menuregi.setColorText(new java.awt.Color(15, 43, 60));
        btn_menuregi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuregiActionPerformed(evt);
            }
        });

        btn_menuingres.setBackground(new java.awt.Color(255, 255, 255));
        btn_menuingres.setText("Ingresar");
        btn_menuingres.setColorHover(new java.awt.Color(240, 240, 240));
        btn_menuingres.setColorText(new java.awt.Color(15, 43, 60));
        btn_menuingres.setSelected(true);
        btn_menuingres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuingresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_menuregi, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_menuingres, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rSButtonRiple2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonRiple2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(btn_menuingres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_menuregi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rSPanelShadow1.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(rSPanelShadow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 397));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        if (txt_user.getText().isEmpty() || txt_pass.getText().isEmpty()) {
            msg_errorsesion.setText("Debe llenar los dos campos");
        }else{
            if (txt_user.getText().equals("admin") && txt_pass.getText().equals("1234")) {
                rSPanelsSlider1.setPanelSlider(1,panel_carga,RSPanelsSlider.DIRECT.RIGHT);
                
                new Thread(new Runnable(){
                  @Override
                  public void run(){
                      try {
                          Thread.sleep(900);
                          dispose();
                          new pg_prinmenu().setVisible(true);
                      } catch (InterruptedException ex) {
                          Logger.getLogger(pg_login.class.getName()).log(Level.SEVERE, null, ex);
                      }
                  }
                }).start();
            }else{
                msg_errorsesion.setText("Datos incorrectos");
            }
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_menuingresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuingresActionPerformed
        if (!this.btn_menuingres.isSelected()) {
            this.btn_menuingres.setSelected(true);
            this.btn_menuregi.setSelected(false);
            rSPanelsSlider1.setPanelSlider(20,panel_login,RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btn_menuingresActionPerformed

    private void btn_menuregiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuregiActionPerformed
        if (!this.btn_menuregi.isSelected()) {
            this.btn_menuingres.setSelected(false);
            this.btn_menuregi.setSelected(true);
            rSPanelsSlider1.setPanelSlider(20,panel_registro,RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btn_menuregiActionPerformed

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
            java.util.logging.Logger.getLogger(pg_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pg_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pg_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pg_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pg_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btn_cerrar;
    private rojeru_san.RSButtonRiple btn_ingresar;
    private rojeru_san.RSButton btn_menuingres;
    private rojeru_san.RSButton btn_menuregi;
    private rojeru_san.RSButtonRiple btn_registrar;
    private rojeru_san.RSMPassView btn_regmail;
    private rojeru_san.RSMPassView btn_regpass1;
    private rojeru_san.RSMTextFull btn_reguser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel msg_errorsesion;
    private javax.swing.JPanel panel_carga;
    private javax.swing.JPanel panel_login;
    private javax.swing.JPanel panel_registro;
    private rojeru_san.RSButtonRiple rSButtonRiple2;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private rojeru_san.RSPanelsSlider rSPanelsSlider1;
    private rojerusan.componentes.RSProgressMaterial rSProgressMaterial1;
    private rojeru_san.RSMPassView txt_pass;
    private rojeru_san.RSMTextFull txt_user;
    // End of variables declaration//GEN-END:variables
}
