
package com.mycompany.gestplanning;

import com.mycompany.model.Utilisateur;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Login_Form extends javax.swing.JFrame {

PreparedStatement pst = null;
ResultSet  rs = null;

    public Login_Form() {
        initComponents();
        
        // center the form
        this.setLocationRelativeTo(null);
        
        // create a yellow border for the jpanel_title
        // 0 border in the top
        Border jpanel_title_border = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.yellow);
        // set the border to the jPanel_title
        jPanel_title.setBorder(jpanel_title_border);
        
        // create an orange border for the global panel
        Border glob_panel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.orange);
        jPanel1.setBorder(glob_panel_border);
        
        // create a black border for the close & minimize jlables
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_minimize.setBorder(label_border);
        jLabel_close.setBorder(label_border);
        
        // create a border for the create acconut jlabel
        Border label_create_accont_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.lightGray);
        jLabel_Create_Account.setBorder(label_create_accont_border);
        

        
        // create border for the username and password field
        Border field_border = BorderFactory.createMatteBorder(1, 5, 1, 1, Color.white);
        jTextField_Username.setBorder(field_border);
        jPasswordField.setBorder(field_border);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextField_Username = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jButton_Login = new javax.swing.JButton();
        jLabel_Create_Account = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_minimize = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jPanel_title = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jTextField_Username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Username.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_Username.setText("nom d'utilisateur");
        jTextField_Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_UsernameFocusLost(evt);
            }
        });
        jTextField_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UsernameActionPerformed(evt);
            }
        });

        jPasswordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField.setText("password");
        jPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusLost(evt);
            }
        });

        jButton_Login.setBackground(new java.awt.Color(0, 84, 140));
        jButton_Login.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jButton_Login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Login.setText("SE CONNECTER");
        jButton_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_LoginMouseExited(evt);
            }
        });
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });

        jLabel_Create_Account.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Create_Account.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Create_Account.setText(">> Vous n'avez pas de compte? Créer en une !");
        jLabel_Create_Account.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Create_Account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Create_AccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_Create_AccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Create_AccountMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("MOT DE PASSE :");
        jLabel1.setName(""); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("LOGIN :");
        jLabel2.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel_Create_Account)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Create_Account)
                .addGap(32, 32, 32))
        );

        jLabel_minimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_minimize.setText(" -");
        jLabel_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseExited(evt);
            }
        });

        jLabel_close.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_close.setText(" X");
        jLabel_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseExited(evt);
            }
        });

        jPanel_title.setBackground(new java.awt.Color(255, 255, 0));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 38)); // NOI18N
        jLabel3.setText("CONNEXION");

        javax.swing.GroupLayout jPanel_titleLayout = new javax.swing.GroupLayout(jPanel_title);
        jPanel_title.setLayout(jPanel_titleLayout);
        jPanel_titleLayout.setHorizontalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_titleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(42, 42, 42))
        );
        jPanel_titleLayout.setVerticalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_minimize)
                            .addComponent(jLabel_close)))
                    .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseEntered
        
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_minimizeMouseEntered

    private void jLabel_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseExited
        
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.black);
        
    }//GEN-LAST:event_jLabel_minimizeMouseExited

    private void jLabel_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseEntered
        
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.white);
        
    }//GEN-LAST:event_jLabel_closeMouseEntered

    private void jLabel_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseExited
        
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.black);
        
    }//GEN-LAST:event_jLabel_closeMouseExited

    private void jTextField_UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UsernameFocusGained
        
        // clear the textfield on focus if the text is "username"
        if(jTextField_Username.getText().trim().toLowerCase().equals("nom d'utilisateur"))
        {
            jTextField_Username.setText("");
            jTextField_Username.setForeground(Color.black);
        }
        

        
    }//GEN-LAST:event_jTextField_UsernameFocusGained

    private void jTextField_UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UsernameFocusLost
        
        // if the text field is equal to username or empty
        // we will set the "username" text in the field 
        // on focus lost event
        
        if(jTextField_Username.getText().trim().equals("") || 
           jTextField_Username.getText().trim().toLowerCase().equals("nom d'utilisateur"))
        {
            jTextField_Username.setText("nom d'utilisateur");
            jTextField_Username.setForeground(new Color(153,153,153));
        }
        

        
    }//GEN-LAST:event_jTextField_UsernameFocusLost

    private void jPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusGained
        
        // clear the password field on focus if the text is "password"
        
        // get the password text
        Utilisateur u = new Utilisateur();
        u.setPassword(String.valueOf(jPasswordField.getPassword()));
        
        if(u.getPassword().trim().toLowerCase().equals("password"))
        {
            jPasswordField.setText("");
            jPasswordField.setForeground(Color.black);
        }
       
        
        
    }//GEN-LAST:event_jPasswordFieldFocusGained

    private void jPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusLost
      
        // if the password field is equal to password or empty
        // we will set the "password" text in the field 
        // on focus lost event
        
        // get the password text
        Utilisateur u = new Utilisateur();
        u.setPassword(String.valueOf(jPasswordField.getPassword()));
        
        if(u.getPassword().trim().equals("") || 
           u.getPassword().trim().toLowerCase().equals("password"))
        {
            jPasswordField.setText("password");
            jPasswordField.setForeground(new Color(153,153,153));
        }
       
        
    }//GEN-LAST:event_jPasswordFieldFocusLost

    private void jButton_LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_LoginMouseEntered
        
        // set jbutton background
        jButton_Login.setBackground(new Color(0,101,183));
        
    }//GEN-LAST:event_jButton_LoginMouseEntered

    private void jButton_LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_LoginMouseExited
       
        // set jbutton background
        jButton_Login.setBackground(new Color(0,84,104));
        
    }//GEN-LAST:event_jButton_LoginMouseExited

    private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseClicked
        
        this.setState(JFrame.ICONIFIED);
        
    }//GEN-LAST:event_jLabel_minimizeMouseClicked

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed
        
        
        // get the username & password
        Utilisateur u = new Utilisateur();
        u.setLogin(jTextField_Username.getText());
        u.setPassword(String.valueOf(jPasswordField.getPassword()));
        
        //create a select query to check if the username and the password exist in the database
        String query = "Select * from utilisateur where login=? and password=?";
        
        // show a message if the username or the password fields are empty
        if(u.getLogin().trim().equals("nom d'utilisateur"))
        {
            JOptionPane.showMessageDialog(null, "Veuillez entrer un nom d'utilisateur", "Champ nom d'utilisateur vide", 2);
        }
        else if(u.getPassword().trim().equals("password"))
        {
            JOptionPane.showMessageDialog(null, "Veuillez entré un mot de passe", "Champs mot de passe vide", 2);
        }
        else{
            
            try {
            Connection conn = MysqlConnect.ConnectDB();    
            pst =conn.prepareStatement(query);
            
            pst.setString(1, u.getLogin());
            
            pst.setString(2, u.getPassword());
            rs= pst.executeQuery();
            
            if(rs.next())
            {
                // show a new form
                JOptionPane.showMessageDialog(null, "Bienvenue !");
                Dashboard_Form form = new Dashboard_Form();
                form.setVisible(true);
                form.pack();
                // close the current form(login form)
                this.dispose();
                
            }else{
                // error message
                JOptionPane.showMessageDialog(null, " Nom d'utilisateur / Mot de passe incorrect","Erreur d'authentification",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Login_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        
    }//GEN-LAST:event_jButton_LoginActionPerformed

    private void jLabel_Create_AccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Create_AccountMouseEntered
        
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.red);
        jLabel_Create_Account.setBorder(label_border);
        
    }//GEN-LAST:event_jLabel_Create_AccountMouseEntered

    private void jLabel_Create_AccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Create_AccountMouseExited
       
        Border label_create_accont_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.lightGray);
        jLabel_Create_Account.setBorder(label_create_accont_border);
        
    }//GEN-LAST:event_jLabel_Create_AccountMouseExited

    private void jLabel_Create_AccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Create_AccountMouseClicked
        
        Register_Form rf = new Register_Form();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_jLabel_Create_AccountMouseClicked

    private void jTextField_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UsernameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login_Form().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Create_Account;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_minimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_title;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
