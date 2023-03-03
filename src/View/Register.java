
package View;

import Model.PasswordHash;
import Model.User;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class Register extends javax.swing.JPanel {

    public Frame frame;
    
    public Register() {
        initComponents();
        // MP NUMBER 4 - masked password, jtextfield was changed to jpasswordfield
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerBtn = new javax.swing.JButton();
        passwordFld = new javax.swing.JPasswordField();
        usernameFld = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        confpassFld = new javax.swing.JPasswordField();
        backBtn = new javax.swing.JButton();

        registerBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        registerBtn.setText("REGISTER");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        passwordFld.setBackground(new java.awt.Color(240, 240, 240));
        passwordFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordFld.setHorizontalAlignment(javax.swing.JPasswordField.CENTER);
        passwordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        passwordFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordFldKeyTyped(evt);
            }
        });

        usernameFld.setBackground(new java.awt.Color(240, 240, 240));
        usernameFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        confpassFld.setBackground(new java.awt.Color(240, 240, 240));
        confpassFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confpassFld.setHorizontalAlignment(javax.swing.JPasswordField.CENTER);
        confpassFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "CONFIRM PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backBtn.setText("<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usernameFld)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordFld, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confpassFld, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(usernameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confpassFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        String user = usernameFld.getText();
        String pass = passwordFld.getText();
        String confpass = confpassFld.getText();
        
        
        if(user.isBlank() || pass.isBlank() || confpass.isBlank()){
            JOptionPane.showMessageDialog(new JFrame(), "One or more fields are empty", "Invalid Register", JOptionPane.ERROR_MESSAGE);
        } else {
            if (validRegister(user, pass, confpass)) {
                if(!userExists(user)){
                    try {
                        // MP NUMBER 18 - cryptographic technique
                        String passHash = PasswordHash.createHash(pass);
                        //MP NUMBER 8 - Clear fields
                        clearFields();
                        frame.registerAction(user, passHash, confpass); // confpass not used in registerAction()
                        frame.loginNav();
                    } catch(Exception ex) {
                        System.out.println("ERROR: " + ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "Invalid details", "Invalid Register", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
    }//GEN-LAST:event_registerBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        //MP NUMBER 8 - Clear fields
        clearFields();
        frame.loginNav();
    }//GEN-LAST:event_backBtnActionPerformed

    private void passwordFldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFldKeyTyped
        // TODO add your handling code here:
        // MP NUMBER 7 - Password Strength, based on length since Cases/SpecialChars/Numbers are mandatory
        //red border
        String pass = passwordFld.getText();
        if(pass.length() < 10){
            passwordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        } else if (pass.length() < 15){ //yellow
            passwordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        } else if (pass.length() > 15) {//green
            passwordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 0), 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        }
    }//GEN-LAST:event_passwordFldKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JPasswordField confpassFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField passwordFld;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField usernameFld;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Method to check if registration details are valid or not.
     * @param user
     * @param pass
     * @param confpass
     * @return Boolean
     */
    private static boolean validRegister(String user, String pass, String confpass){
        boolean validRegister = true;
        
        
        // MP NUMBER 22 - check empty fields
        if (user.isBlank() || pass.isBlank() || confpass.isBlank()) {
            String errorMessage = "One or more of the fields are empty. Try again.";
            JOptionPane.showMessageDialog(new JFrame(), errorMessage, "Invalid Registration Details", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        // MP NUMBER 10 - password and confirm password match
        if (!pass.equals(confpass)) {
            String errorMessage = "Those passwords don't match. Try again.";
            JOptionPane.showMessageDialog(new JFrame(), errorMessage, "Invalid Registration Details", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        // MP NUMBER 11 - username is not same as password
        if (pass.equals(user)) {
            String errorMessage = "Username cannot be the same as password. Try again.";
            JOptionPane.showMessageDialog(new JFrame(), errorMessage, "Invalid Registration Details", JOptionPane.ERROR_MESSAGE);
            return false;
        }
            
        // MP NUMBER 5 - password greater than 8 characters
        if (pass.length() < 8) {
            String errorMessage = "Password must be greater than 8 characters";
            JOptionPane.showMessageDialog(new JFrame(), errorMessage, "Invalid Registration Details", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        // MP NUMBER 6 - password lesser than 64 characters N
        else if (pass.length() > 64) {
            String errorMessage = "Password must be lesser than 64 characters";
            JOptionPane.showMessageDialog(new JFrame(), errorMessage, "Invalid Registration Details", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        // MP NUMBER 15, 16, 19, 20
        if (!isValidPassword(pass)) return false;
        return validRegister;
    }
    
    /**
     * Reference: Java2Blog. "Validate password in java".
     * Method to check if password is valid or not.
     * @param password
     * @return Boolean
     */
    public static boolean isValidPassword(String password)
    {
            boolean isValid = true;
            String upperCaseChars = "(.*[A-Z].*)";
            String lowerCaseChars = "(.*[a-z].*)";
            String numbers = "(.*[0-9].*)";
            String specialChars = "(.*[@,#,$,%].*$)";
            if (!password.matches(upperCaseChars ))
            {
                String errorMessage = "Password must have atleast one uppercase character";
                JOptionPane.showMessageDialog(new JFrame(), errorMessage, "Invalid Registration Details", JOptionPane.ERROR_MESSAGE);
                isValid = false;
            }
            else if (!password.matches(lowerCaseChars ))
            {
                String errorMessage = "Password must have atleast one lowercase character";
                JOptionPane.showMessageDialog(new JFrame(), errorMessage, "Invalid Registration Details", JOptionPane.ERROR_MESSAGE);
                isValid = false;
            }
            else if (!password.matches(numbers ))
            {
                String errorMessage = "Password must have atleast one number";
                JOptionPane.showMessageDialog(new JFrame(), errorMessage, "Invalid Registration Details", JOptionPane.ERROR_MESSAGE);
                isValid = false;
            }
            else if (!password.matches(specialChars ))
            {
                String errorMessage = "Password must have atleast one special character among @#$%";
                JOptionPane.showMessageDialog(new JFrame(), errorMessage, "Invalid Registration Details", JOptionPane.ERROR_MESSAGE);
                isValid = false;
            }
            return isValid; 
    }
    
    private boolean userExists(String username){
        // MP NUMBER 13 - Checks if user exists in Database
        ArrayList<User> userList = frame.main.sqlite.getUsers();
        int size = userList.size();
        for(int i = 0; i < size; i++){
            if (userList.get(i).getUsername().equalsIgnoreCase(username)){ //case insensitive
                    //JOptionPane.showMessageDialog(null, "User was found in database", "Incorrect Credentials");
                return true;
            }
        }
        return false;
    }
    private void clearFields(){
        // MP NUMBER 8 - Clears fields
        usernameFld.setText("");
        passwordFld.setText("");
        confpassFld.setText("");
    }
}
