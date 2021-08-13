package ManagementSystem;

import javax.swing.*;

public class EditBookingWindow extends javax.swing.JFrame {
    /**
     * Creates new form EditBooking
     */
    public EditBookingWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        main1 = new javax.swing.JPanel();
        Edit = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        newDate = new javax.swing.JTextField();
        newFac = new javax.swing.JTextField();
        NewStaff = new javax.swing.JTextField();
        newMem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        Find = new javax.swing.JButton();
        oldDate = new javax.swing.JTextField();
        oldFac = new javax.swing.JTextField();
        OldStaff = new javax.swing.JTextField();
        oldMem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main1.setBackground(new java.awt.Color(0, 102, 102));
        main1.setForeground(new java.awt.Color(255, 255, 255));

        Edit.setText("Edit");
        Edit.setEnabled(false);
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
        jLabel2.setText("Enter Date");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter Date");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter Staff Number");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter Memebr ID");

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
                                                .addComponent(OldStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(NewStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(main1Layout.createSequentialGroup()
                                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(Edit)
                                                        .addComponent(jLabel6))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(oldMem, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(newMem, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                                                        .addComponent(oldFac, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(newFac, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main1Layout.createSequentialGroup()
                                                                        .addComponent(oldDate, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(newDate, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))))
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
                                        .addComponent(newDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(oldDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(newFac, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(oldFac, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(NewStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(OldStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(newMem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(oldMem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        String id = ID.getText();
        BookingList blist = new BookingList();
        String date = newDate.getText();
        String fac = newFac.getText();
        String staff = NewStaff.getText();
        String mem = newMem.getText();
        blist.EditBooking(id,date,fac,staff,mem);
    }

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {
        this.hide();
        BookingWindow bw =new BookingWindow();
        bw.setLocationRelativeTo(null);
        bw.setVisible(true);
    }

    private void FindActionPerformed(java.awt.event.ActionEvent evt) {
        String id = ID.getText();
        BookingList blist = new BookingList();
        blist.ReadCSV();
        if(blist.findById(id)==null){
            JOptionPane.showMessageDialog(null,"Error. Can not find the ID");
        }else {
            Edit.setEnabled(true);
            Booking thisbooking = blist.findById(id);
            oldDate.setText(thisbooking.getDate());
            oldDate.setEditable(false);
            oldFac.setText(thisbooking.getfacilities());
            oldFac.setEditable(false);
            oldMem.setText(thisbooking.getMembers().getId());
            oldMem.setEditable(false);
            OldStaff.setText(thisbooking.getEmployees().getId());
            OldStaff.setEditable(false);
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
            java.util.logging.Logger.getLogger(EditBookingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditBookingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditBookingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditBookingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditBookingWindow().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Find;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField NewStaff;
    private javax.swing.JTextField OldStaff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel main1;
    private javax.swing.JTextField newDate;
    private javax.swing.JTextField newFac;
    private javax.swing.JTextField newMem;
    private javax.swing.JTextField oldDate;
    private javax.swing.JTextField oldFac;
    private javax.swing.JTextField oldMem;
}
