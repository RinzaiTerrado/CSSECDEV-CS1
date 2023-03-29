package View;
import Model.User;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import Model.PasswordHash;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Login extends javax.swing.JPanel {

    public Frame frame;
    
    public Login() {
        initComponents();
        // MP NUMBER 3 - masked password, jtextfield was changed to jpasswordfield
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        usernameFld = new javax.swing.JTextField();
        passwordFld = new javax.swing.JPasswordField();
        registerBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        usernameFld.setBackground(new java.awt.Color(240, 240, 240));
        usernameFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        passwordFld.setBackground(new java.awt.Color(240, 240, 240));
        passwordFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordFld.setHorizontalAlignment(javax.swing.JPasswordField.CENTER);
        passwordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        passwordFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFldActionPerformed(evt);
            }
        });
        passwordFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordFldKeyTyped(evt);
            }
        });

        registerBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        registerBtn.setText("REGISTER");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        loginBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        loginBtn.setText("LOGIN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(registerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(usernameFld)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordFld, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(usernameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // retrieve username and password, check if there is a match in database.
        String user = usernameFld.getText();
        String pass = passwordFld.getText();
        if (validLogin(user, pass, frame)) {
            loginCounter = 0;
            // MP NUMBER 9 - Clears Fields
            clearFields();
            frame.mainNav(userType);
        } else {
            // MP NUMBER 17 - lockout
            loginCounter++;
            if(loginCounter > 5){
                JOptionPane.showMessageDialog(new JFrame(), "Login attempts failed 5 times, login will be disabled for 5 seconds and account will be locked. Please contact your Administrator to re-enable the account.", "Invalid Login", JOptionPane.ERROR_MESSAGE);
                loginBtn.setEnabled(false);
                try {
                    Thread.sleep(5000);
                    loginCounter = 0;
                 } catch (InterruptedException ie) {
                 }
                loginBtn.setEnabled(true);
                // MP2 Disabled user-type
                
            }
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        clearFields();
        frame.registerNav();
    }//GEN-LAST:event_registerBtnActionPerformed

    private void passwordFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFldActionPerformed

    private void passwordFldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFldKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordFld;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField usernameFld;
    // End of variables declaration//GEN-END:variables
    private int loginCounter = 0;
    private int userType = 0;
    private boolean validLogin (String user, String pass, Frame frame) {
        boolean isValidLogin = false;
        // check username
        // MP NUMBER 21 - check empty fields
        if (user.isBlank() || pass.isBlank()) {
            // MP NUMBER 12 - error message
            String errorMessage = "One or more of the fields are empty. Try again.";
            JOptionPane.showMessageDialog(new JFrame(), errorMessage, "Invalid Login", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        ArrayList<User> userList = frame.main.sqlite.getUsers();
        
        // go through entire SQLite user list and set isValidLogin to true if fouund.
        // implementation not vulnerable to time-based attack because processing time -- 
        // -- is similar for success cases and failure cases
        for (User userDB : userList) {
            // MP NUMBER 23 - check username (case-insensitive) 
            // MP NUMBER 1 - check if username exist in database
            if (user.equalsIgnoreCase(userDB.getUsername())) {
                // --- MP2 Disabled User-State ---
                if (userDB.getLocked() == 1) {
                    String errorMessage = "Your account is disabled. Please communicate with the Admin in-person in order to re-enable the account.";
                    JOptionPane.showMessageDialog(new JFrame(), errorMessage, "Account Disabled", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                // MP NUMBER 2 - check if password exist in database (given username exists)
                try {
                    // MP NUMBER 18 - cryptographic technique
                    if (PasswordHash.validatePassword(pass, userDB.getPassword())) {
                        userType = userDB.getRole();
                        isValidLogin = true;
                    }
                } catch(Exception ex) {
                    // --- MP2 Fix default users not being able to login bc of hash ---
                    if (pass.equals(userDB.getPassword())) {
                        userType = userDB.getRole();
                        isValidLogin = true;
                    }
                }
            }
        }
        if (!isValidLogin) {
            // MP NUMBER 12 - error message
            String errorMessage = "The user ID or password was incorrect.";
            JOptionPane.showMessageDialog(new JFrame(), errorMessage, "Invalid Login", JOptionPane.ERROR_MESSAGE);
        }
        return isValidLogin;
    }
    
    private void clearFields(){
        // MP NUMBER 9 - Clears fields
        usernameFld.setText("");
        passwordFld.setText("");
    }
}
