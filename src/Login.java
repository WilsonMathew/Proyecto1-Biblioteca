/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Majus
 */
public class Login extends javax.swing.JFrame {

    public usuarioAdmin adminUsers;
    public Proyecto1 sys = new Proyecto1();
    UsuarioNormal normal;
    public int locationUser;
    
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setTitle("Login");
        this.setLocationRelativeTo(null);
        this.pack();
        // Asignanado objecto
        adminUsers = new usuarioAdmin();
        
        // No hay inicializacion de usuarios
        sys.us[0] = new Usuario();
        sys.us[0].setId("admin");
        sys.us[0].setNombre("admin");
        sys.us[0].setApellido("admin");
        sys.us[0].setUser("admin");
        sys.us[0].setPassword("admin");
        sys.us[0].setRol("admin");
    }
    
    public Login(Proyecto1 sys) {
        initComponents();
        this.setTitle("Login");
        this.setLocationRelativeTo(null);
        this.pack();
        this.sys = sys;
       
        //Asignar Objecto;
        adminUsers = new usuarioAdmin();
        // No hay inicializacion de usuarios
        sys.us[0] = new Usuario();
        sys.us[0].setId("admin");
        sys.us[0].setNombre("admin");
        sys.us[0].setApellido("admin");
        sys.us[0].setUser("admin");
        sys.us[0].setPassword("admin");
        sys.us[0].setRol("admin");
    }
    
     public Login(usuarioAdmin adminUsers) {
        initComponents();
        this.setTitle("Login");
        this.setLocationRelativeTo(null);
        this.pack();
        this.adminUsers = adminUsers;
    }
    
    
    /*
    public Login(usuarioAdmin users) {
        initComponents();

        //Usuarios
        this.setTitle("Login");
        this.setLocationRelativeTo(null);
        this.pack();

        this.adminUsers = users;
        us[users.x].setId("admin");
        us[users.x].setNombre("admin");
        us[users.x].setApellido("admin");
        us[users.x].setUser("admin");
        us[users.x].setPassword("admin");
        us[users.x].setRol("admin");
        
    }*/

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
        jLabel3 = new javax.swing.JLabel();
        usuarioF = new javax.swing.JTextField();
        ingreasarB = new javax.swing.JButton();
        cancelarB = new javax.swing.JButton();
        passwordF = new javax.swing.JPasswordField();
        passwordShow = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Contraseña:");

        usuarioF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioFActionPerformed(evt);
            }
        });

        ingreasarB.setText("Ingresar");
        ingreasarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingreasarBActionPerformed(evt);
            }
        });

        cancelarB.setText("Cancelar");
        cancelarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBActionPerformed(evt);
            }
        });

        passwordShow.setText("Mostrar Contraseña");
        passwordShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(usuarioF, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(passwordShow)
                            .addComponent(passwordF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(ingreasarB)
                        .addGap(18, 18, 18)
                        .addComponent(cancelarB)
                        .addGap(93, 93, 93)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usuarioF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(15, 15, 15)
                        .addComponent(passwordF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordShow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ingreasarB)
                            .addComponent(cancelarB, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioFActionPerformed

    private void cancelarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBActionPerformed
        // TODO add your handling code here:
        usuarioF.setText("");
        passwordF.setText("");
    }//GEN-LAST:event_cancelarBActionPerformed

    private void ingreasarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreasarBActionPerformed
        // TODO add your handling code here:
        String uIngresado = usuarioF.getText();
        uIngresado = uIngresado.replaceAll("\\s", "");
        
        String pIngresado =  String.valueOf(passwordF.getPassword());
      
        //Verificando a donde ir cuando ingrese algo.
        //if(uIngresado.equals(admin.getUser()) && pIngresado.equals(admin.getPassword()) ){
          if(uIngresado.equals("admin") && pIngresado.equals("admin")){
              //adminUsers.setVisible(true);
            //usuarioAdmin plataformaadmin = new usuarioAdmin();
            this.setVisible(false);
            adminUsers = new usuarioAdmin(this);
            adminUsers.setVisible(true);
            //plataformaadmin.setVisible(true);
        }else {
            
            boolean existe = false;
            //if(Proyecto1.x > 1){
                for(int i = 0;i < Proyecto1.x;i++){
                    if(usuarioF.getText().equals("")){
              //      if(Proyecto1.us[i].getUser().equals(usuarioF.getText()) && Proyecto1.us[i].getPassword().equals(passwordF.getText())){
                        locationUser = i;
                        System.out.println("Si existe este usuario");
                        this.setVisible(false);
                        normal = new UsuarioNormal(this);
                        normal.setVisible(true);
                        existe = true;
                    }
                }
            //}
            
            if(!existe){
                System.out.println("No existe su usuario porfavor registrese");
            }
        }
    }//GEN-LAST:event_ingreasarBActionPerformed

    private void passwordShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordShowActionPerformed
        // TODO add your handling code here:
        
        if(passwordShow.isSelected() ){
            passwordF.setEchoChar((char)0);
        }else{
            passwordF.setEchoChar('*');
        }
    }//GEN-LAST:event_passwordShowActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarB;
    private javax.swing.JButton ingreasarB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordF;
    private javax.swing.JCheckBox passwordShow;
    private javax.swing.JTextField usuarioF;
    // End of variables declaration//GEN-END:variables
}
