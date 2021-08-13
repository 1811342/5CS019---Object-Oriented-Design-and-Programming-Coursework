/**
 * Edit Public Memebr GUI
 * */
package ManagementSystem;
import javax.swing.*;
public class EditPublicMemberWindow extends javax.swing.JFrame {
    /**
     * Creates new form EditMemebrsWindow
     */
    public EditPublicMemberWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        main1 = new javax.swing.JPanel();
        Edit = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        newName = new javax.swing.JTextField();
        newAge = new javax.swing.JTextField();
        newPhone = new javax.swing.JTextField();
        newEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        Find = new javax.swing.JButton();
        oldName = new javax.swing.JTextField();
        OldAge = new javax.swing.JTextField();
        oldPhone = new javax.swing.JTextField();
        oldemail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main1.setBackground(new java.awt.Color(0, 102, 102));
        main1.setForeground(new java.awt.Color(255, 255, 255));

        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter First Name");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter Age");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter Phone Number");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter Email");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter ID");

        Find.setText("Find");
        Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout main1Layout = new javax.swing.GroupLayout(main1);
        main1.setLayout(main1Layout);
        main1Layout.setHorizontalGroup(
                main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(main1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(main1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(oldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(newPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(main1Layout.createSequentialGroup()
                                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(Edit)
                                                        .addComponent(jLabel6))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(oldemail, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(newEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Cancel)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main1Layout.createSequentialGroup()
                                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(main1Layout.createSequentialGroup()
                                                                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(Find))
                                                        .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main1Layout.createSequentialGroup()
                                                                        .addComponent(OldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(newAge, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main1Layout.createSequentialGroup()
                                                                        .addComponent(oldName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(newName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(39, 39, 39))
        );
        main1Layout.setVerticalGroup(
                main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Find))
                                .addGap(21, 21, 21)
                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(newName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(oldName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(newAge, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(OldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(newPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(oldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(newEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(oldemail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Edit)
                                        .addComponent(Cancel))
                                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(main1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(main1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {
        PublicMemberList plist= new PublicMemberList();
        String Id = ID.getText();
        if(newName.getText().isEmpty()||newAge.getText().isEmpty()||newPhone.getText().isEmpty()||newEmail.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Mandatory fields Empty");
        }
        else{
            plist.EditPublicMembers(Id,newName.getText(),newAge.getText(),newPhone.getText(),newEmail.getText());
            JOptionPane.showMessageDialog(null,"Edited");
            this.hide();
            MembersWindow mw =new MembersWindow();
            mw.setLocationRelativeTo(null);
            mw.setVisible(true);
        }
    }

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {
        this.hide();
        MembersWindow mw =new MembersWindow();
        mw.setLocationRelativeTo(null);
        mw.setVisible(true);
    }

    /**
     * Find action performed
     * simple method to find the member and display results
     * */
    private void FindActionPerformed(java.awt.event.ActionEvent evt) {
        PublicMemberList plist = new PublicMemberList();
        plist.readCSV();
        String Id = ID.getText();
        PublicMember foundMember = plist.findById(Id);

        if (foundMember == null){
            JOptionPane.showMessageDialog(null,"Error");
        }
        else{
            oldemail.setText(foundMember.getEmail());
            oldPhone.setText(foundMember.getPhone());
            oldName.setText(foundMember.getName().getFullName());
            OldAge.setText(foundMember.getAge());
            oldemail.setEditable(false);
            oldPhone.setEditable(false);
            oldName.setEditable(false);
            OldAge.setEditable(false);
        }
    }

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
            java.util.logging.Logger.getLogger(EditPublicMemberWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditPublicMemberWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditPublicMemberWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditPublicMemberWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditPublicMemberWindow().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton Add;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Find;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField OldAge;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel main;
    private javax.swing.JPanel main1;
    private javax.swing.JTextField newAge;
    private javax.swing.JTextField newEmail;
    private javax.swing.JTextField newName;
    private javax.swing.JTextField newPhone;
    private javax.swing.JTextField oldName;
    private javax.swing.JTextField oldPhone;
    private javax.swing.JTextField oldemail;

}
