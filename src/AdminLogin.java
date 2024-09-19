
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author GOI
 */
public class AdminLogin extends javax.swing.JFrame {

    /**
     * Creates new form AdminMenu
     */
    public AdminLogin() {
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

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        iii = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        loginAdmin = new javax.swing.JButton();
        CancleLogin = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("WELCOME TO THE ADMIN MENU, LOGIN TO CONTINUE YOUR REGISTRATION");

        iii.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        iii.setText("USERNAME");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel3.setText("PASSWORD");

        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameKeyPressed(evt);
            }
        });

        loginAdmin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginAdmin.setText("LOGIN");
        loginAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginAdminActionPerformed(evt);
            }
        });

        CancleLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CancleLogin.setText("CANCEL");
        CancleLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancleLoginActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/backnewicon.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(iii, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(password))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(loginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(CancleLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iii, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginAdmin)
                    .addComponent(CancleLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Method to handle admin login
private void adminLogin() {
    
    // Retrieve the password from the password field as a char array
    char[] passWrd = password.getPassword();

    // Convert the char array into a String
    String PASSWORD = new String(passWrd);

    // Check if the username or password fields are empty
    if ("".equals(username.getText()) || "".equals(PASSWORD)) {
        // Show a warning message if any of the fields are empty
        JOptionPane.showMessageDialog(this, "FIELD CANNOT BE EMPTY!!", "No empty field allowed", JOptionPane.WARNING_MESSAGE);
        return; // Exit the method to prevent further execution
    }

    // Database connection details (remote MySQL database)
    String url = "jdbc:MySql://db4free.net:3306/imsu_db";
    String usrname = "imsustaff";   // Database username
    String passwd = "imsuadmin";    // Database password

    try {
        // Establish a connection to the MySQL database
        Connection con = DriverManager.getConnection(url, usrname, passwd);

        // SQL query to select login information from the 'admin_login' table for a specific admin (id = 1)
        String queryForLogin = "SELECT * FROM admin_login WHERE id =?";
        PreparedStatement ps = con.prepareStatement(queryForLogin);
        
        // Set the ID parameter in the query to 1 (assuming you're always looking up the first admin)
        ps.setInt(1, 1);
        
        // Execute the query and get the result set
        ResultSet rs = ps.executeQuery();
        rs.next(); // Move the cursor to the first row of the result set
        
        // Retrieve the admin's username and password from the result set
        String adminUsername = rs.getString("username");
        String adminPassword = rs.getString("password");

        // Get the username entered by the user in the login form
        String USERNAME = username.getText();
        
        // Check if the entered username and password match the stored admin credentials
        if (USERNAME.equals(adminUsername) && PASSWORD.equals(adminPassword)) {
            // If credentials are valid, open the AdminMenuFrame (admin dashboard)
            AdminMenuFrame admin = new AdminMenuFrame();
            boolean Value = true;
            admin.setVisible(Value);  // Make the admin menu visible
            this.setVisible(false);   // Hide the current login window
        } else {
            // If the credentials don't match, show an access denied message
            JOptionPane.showMessageDialog(this, "Unauthorized access to Admin Menu Page!!! \n(Incorrect Username or password)", "Access Denied", JOptionPane.WARNING_MESSAGE);
        }

    } catch (SQLException exceptionMessage) {
        // Handle SQL exceptions and connection issues
        // Check for a specific SQL state or error code indicating a connection issue
        if (exceptionMessage.getSQLState().equals("08S01") || exceptionMessage.getErrorCode() == 0) {
            // Display a message for connection failure, suggesting an internet issue
            JOptionPane.showMessageDialog(this,
                "Failed to connect to the server. Please check your internet connection and try again."
                + "\nSQL State: " + exceptionMessage.getSQLState()
                + "\nError Code: " + exceptionMessage.getErrorCode(),
                "Connection Error",
                JOptionPane.ERROR_MESSAGE);
        } else {
            // Display any other SQL error that might have occurred
            JOptionPane.showMessageDialog(this,
                exceptionMessage.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }
}

// Method to handle the cancellation of admin login
void cancelAdminLogin() {
    // Exit the program when the user cancels the login attempt
    System.exit(0);
}

    private void CancleLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancleLoginActionPerformed
        cancelAdminLogin();
// TODO add your handling code here:
    }//GEN-LAST:event_CancleLoginActionPerformed

    private void loginAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginAdminActionPerformed
        adminLogin();
        // TODO add your handling code here:
    }//GEN-LAST:event_loginAdminActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        AdminAndStudentFrame aup = new AdminAndStudentFrame();
        aup.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameKeyPressed

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancleLogin;
    private javax.swing.JLabel iii;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginAdmin;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
