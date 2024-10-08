/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author GOI
 */
public class AdminMenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminMenuPage
     */
    public AdminMenuFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        studentReg = new javax.swing.JButton();
        schoolReg = new javax.swing.JButton();
        closeMenu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("WELCOME TO ADMIN MENU, PLEASE CHOOSE A PAGE TO CONTINUE.");

        studentReg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        studentReg.setText("DEPARTMENT REGISTRATION");
        studentReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentRegActionPerformed(evt);
            }
        });

        schoolReg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        schoolReg.setText("SCHOOL REGISTRATION");
        schoolReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolRegActionPerformed(evt);
            }
        });

        closeMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        closeMenu.setText("CLOSE");
        closeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeMenuActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("POST RESULT (LEVEL AND SEMESTER) FORM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studentReg, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                            .addComponent(schoolReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(closeMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addComponent(jLabel1))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(schoolReg, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(studentReg, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(667, 396));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents



// Method to open the SchoolRegistration page for school registration
void openSchoolRegPage() {
    // Create an instance of the SchoolRegistration frame
    SchoolRegistration schoolReg = new SchoolRegistration();
    
    // Make the SchoolRegistration frame visible
    schoolReg.setVisible(true);
    
    // Hide the current window/frame by setting its visibility to false
    this.setVisible(false);
}
   // Method to open the DepartmentRegistration page for student registration
void openDepartmentRegPage() {
    // Create an instance of the DepartmentRegistration frame (for student registration)
    DepartmentRegistration departmentReg = new DepartmentRegistration();
    
    // Make the DepartmentRegistration frame visible
    departmentReg.setVisible(true);
    
    // Hide the current window/frame by setting its visibility to false
    this.setVisible(false);
}

// Method to open the SelectLevelAndSemester page
void openLevelAnSemesterPage() {
    // Create an instance of the SelectLevelAndSemester frame (to select levels and semesters)
    SelectLevelAndSemester s = new SelectLevelAndSemester();
    
    // Make the SelectLevelAndSemester frame visible
    s.setVisible(true);
    
    // Hide the current window/frame by setting its visibility to false
    this.setVisible(false);
}

// Event handler for the student registration button's action
private void studentRegActionPerformed(java.awt.event.ActionEvent evt) {                                           
    // Call the method to open the student registration page
    openDepartmentRegPage();
    // TODO add your handling code here: (auto-generated comment for future code)
}                                          

// Event handler for the school registration button's action
private void schoolRegActionPerformed(java.awt.event.ActionEvent evt) {                                          
    // Call the method to open the school registration page
    openSchoolRegPage();
    // TODO add your handling code here: (auto-generated comment for future code)
}                                         

// Method to close the current menu page
void closeMenuPage() {
    // Dispose of the current window, effectively closing it
    this.dispose();
}

// Event handler for the "close menu" button's action
private void closeMenuActionPerformed(java.awt.event.ActionEvent evt) {                                          
    // Call the method to close the current menu page
    closeMenuPage();
    // TODO add your handling code here: (auto-generated comment for future code)
}                                         

// Event handler for jButton1 (likely a button to open the Level and Semester page)
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    // Call the method to open the Level and Semester selection page
    openLevelAnSemesterPage();
    // TODO add your handling code here: (auto-generated comment for future code)
}                                        

// Event handler for when jLabel2 (label, likely a clickable text or image) is clicked
private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {                                     
    // Create an instance of the WelcomeMenu frame (presumably the main menu or welcome screen)
    WelcomeMenu menu = new WelcomeMenu();
    
    // Make the WelcomeMenu frame visible
    menu.setVisible(true);
    
    // Dispose of the current window, effectively closing it
    this.dispose();
    // TODO add your handling code here: (auto-generated comment for future code)
}                                    

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
            java.util.logging.Logger.getLogger(AdminMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton schoolReg;
    private javax.swing.JButton studentReg;
    // End of variables declaration//GEN-END:variables
}
