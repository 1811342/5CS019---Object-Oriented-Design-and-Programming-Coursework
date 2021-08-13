/**
 * Main Login Window
 * */
package ManagementSystem;// imports
import javax.swing.JOptionPane;

    // this class handels the logins for the application
    public class loginForm extends javax.swing.JFrame {
        public loginForm() {
            initComponents();
        }

        @SuppressWarnings("unchecked")
        private void initComponents() {

            // declaring variables for jpanels and jframs
            jPanel1 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            jPanel2 = new javax.swing.JPanel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();

            // dclaring jbuttons
            UserNameTextField1 = new javax.swing.JTextField();
            PasswordjPasswordField1 = new javax.swing.JPasswordField();
            LoginjButton = new javax.swing.JButton();
            CanceljButton = new javax.swing.JButton();
            jCheckBox1 = new javax.swing.JCheckBox();
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            // panel one colors and attributes
            jPanel1.setBackground(new java.awt.Color(0, 51, 102));
            jPanel1.setForeground(new java.awt.Color(0, 0, 102));
            jLabel1.setFont(new java.awt.Font("DigifaceWide", 1, 18)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(204, 102, 0));
            jLabel1.setText("Mangoes Facility Management System");

            // adding the label to japanel 1
            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addComponent(jLabel1)
                                    .addContainerGap(52, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap(30, Short.MAX_VALUE)
                                    .addComponent(jLabel1)
                                    .addContainerGap())
            );

            //jpanel 2 attributes and details
            jPanel2.setBackground(new java.awt.Color(0, 102, 102));
            jPanel2.setLayout(null);
            jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(204, 204, 204));
            jLabel2.setText("User Name");
            jPanel2.add(jLabel2);
            jLabel2.setBounds(44, 29, 90, 19);
            jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(204, 204, 204));
            jLabel3.setText("Password");
            jPanel2.add(jLabel3);
            jLabel3.setBounds(44, 67, 68, 19);

            // text fields for password and username
            UserNameTextField1.setText("Enter User Name");
            jPanel2.add(UserNameTextField1);
            UserNameTextField1.setBounds(160, 20, 170, 30);
            PasswordjPasswordField1.setText("Enter Password");
            jPanel2.add(PasswordjPasswordField1);
            PasswordjPasswordField1.setBounds(160, 60, 170, 30);

            // login button attributes and actionListner
            LoginjButton.setBackground(new java.awt.Color(102, 153, 255));
            LoginjButton.setFont(new java.awt.Font("Felix Titling", 1, 12)); // NOI18N
            LoginjButton.setForeground(new java.awt.Color(255, 255, 255));
            LoginjButton.setText("Login");
            LoginjButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    LoginjButtonActionPerformed(evt);
                }
            });
            jPanel2.add(LoginjButton);
            LoginjButton.setBounds(100, 120, 100, 40);

            // Cancel button addActionListener and properties
            CanceljButton.setBackground(new java.awt.Color(153, 0, 51));
            CanceljButton.setFont(new java.awt.Font("Felix Titling", 1, 12)); // NOI18N
            CanceljButton.setForeground(new java.awt.Color(255, 255, 255));
            CanceljButton.setText("Cancel");
            jPanel2.add(CanceljButton);
            CanceljButton.setBounds(280, 120, 90, 40);
            CanceljButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    CanceljButtonActionPerformed(evt);
                }
            });


            //jCheckBox1 action addActionListener  properties
            jCheckBox1.setBackground(new java.awt.Color(0, 102, 102));
            jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
            jCheckBox1.setSelected(false);
            jCheckBox1.setText("Show");
            jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBox1ActionPerformed(evt);
                }
            });

            jPanel2.add(jCheckBox1);
            jCheckBox1.setBounds(350, 70, 120, 24);

            // layout of the window
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            );

            pack();
            setLocationRelativeTo(null);
        }

        // show password cheackbox
        private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
            if(jCheckBox1.isSelected()){
                PasswordjPasswordField1.setEchoChar((char)0);
            }
            else{
                PasswordjPasswordField1.setEchoChar('*');
            }
        }

        // login button actions
        private void LoginjButtonActionPerformed(java.awt.event.ActionEvent evt) {
            Admin admin = new Admin();
            admin.ReadCSV();
            String uname = UserNameTextField1.getText();
            String pass = PasswordjPasswordField1.getText();

           if(uname.equals(admin.getUname()) && pass.equals(admin.getPassword())) {

                Mainwindow m = new Mainwindow();
                this.hide();
                m.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(this, "UserName or password do not match\ndefault usename= admin\npassword= 1234");
            }
        }

        // cancel button
        private void CanceljButtonActionPerformed(java.awt.event.ActionEvent evt) {
            System.exit(0);
        }

        /**
         * @param args the command line arguments
         */
        // main
        public static void main(String args[]) {
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new loginForm().setVisible(true);
                }
            });
        }

        // Variables declaration
        private javax.swing.JButton CanceljButton;
        private javax.swing.JButton LoginjButton;
        private javax.swing.JPasswordField PasswordjPasswordField1;
        private javax.swing.JTextField UserNameTextField1;
        private javax.swing.JCheckBox jCheckBox1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
    }


