package codecatalystui;

import javax.swing.*;

public class Login extends javax.swing.JFrame {

  private Logs[] logs;
    private int logsCount;
    
    public Login (Logs[] logs, int logsCount) {
        this.logs = logs;
        this.logsCount = logsCount;
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

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        userName = new java.awt.TextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        password = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        login = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        signup = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1620, 900));

        jPanel4.setBackground(new java.awt.Color(67, 67, 172));
        jPanel4.setMinimumSize(new java.awt.Dimension(1100, 910));
        jPanel4.setPreferredSize(new java.awt.Dimension(1100, 600));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(61, 61, 157));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setMinimumSize(new java.awt.Dimension(1620, 600));
        jPanel3.setName(""); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(1600, 600));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CODE");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText(" CATALYST");
        jLabel2.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText(" ARJEL");
        jLabel4.setToolTipText("");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lologo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1088, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(172, 172, 172)
                .addComponent(jLabel4)
                .addContainerGap(310, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 5, 410, 890));

        jPanel1.setBackground(new java.awt.Color(95, 95, 182));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        userName.setBackground(new java.awt.Color(67, 67, 181));
        userName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setPreferredSize(new java.awt.Dimension(100, 20));
        userName.setText("Username");
        userName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userNameFocusGained(evt);
            }
        });
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });

        password.setBackground(new java.awt.Color(67, 67, 181));
        password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("jPasswordField1");
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        login.setBackground(new java.awt.Color(67, 67, 163));
        login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("LOG IN");
        jLabel7.setAlignmentX(0.5F);

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addContainerGap())
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap())
        );

        signup.setBackground(new java.awt.Color(67, 67, 163));
        signup.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SIGN UP");
        jLabel8.setAlignmentX(0.5F);

        javax.swing.GroupLayout signupLayout = new javax.swing.GroupLayout(signup);
        signup.setLayout(signupLayout);
        signupLayout.setHorizontalGroup(
            signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addContainerGap())
        );
        signupLayout.setVerticalGroup(
            signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(187, 187, 187))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(527, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 4, 670, 890));
        jPanel1.getAccessibleContext().setAccessibleName("username");

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked
       //redirect to the sign class after sign up is clicked
        Sign sign = new Sign(logs, logsCount);
        sign.setVisible(true);
        
        //close the login page
        this.dispose();

    }//GEN-LAST:event_signupMouseClicked

    private void userNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameFocusGained
              userName.setText("");
    }//GEN-LAST:event_userNameFocusGained

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
               password.setText("");
    }//GEN-LAST:event_passwordFocusGained

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        String user = userName.getText();
        String pass = new String(password.getPassword());
        
         if (user.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username and password cannot be empty");
            return;
        }
         
        boolean loggedIn = false;
        for (int i = 0; i < logsCount; i++) {
            if (logs[i].getUserName().equals(user) && logs[i].getPassword().equals(pass)) {
                loggedIn = true;
                break; 
    }//GEN-LAST:event_loginMouseClicked
        } 
        
        if (loggedIn) {
            JOptionPane.showMessageDialog(this, "Login successful!");
            //redirect to the main page if the login is successful
            
            AboutUs aboutUs = new AboutUs();
            aboutUs.setVisible(true);
            //close the login page
            this.dispose(); //close the login window
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again.");
        }
    }
        
    public static void main(String args[]) {
       
       Logs[] logs = new Logs[10];
       int accountCount = 0;
       java.awt.EventQueue.invokeLater(() -> {
           new Login(logs, accountCount).setVisible(true);
       });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel login;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel signup;
    private java.awt.TextField userName;
    // End of variables declaration//GEN-END:variables
}
