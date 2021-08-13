/**
 * Edit Shifts GUI
 * */
package ManagementSystem;
import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class EditShiftsWindow extends javax.swing.JFrame {
    public EditShiftsWindow() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        main1 = new javax.swing.JPanel();
        Edit = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        NewMLG = new javax.swing.JTextField();
        NewELG = new javax.swing.JTextField();
        NewMR = new javax.swing.JTextField();
        NewER = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Find = new javax.swing.JButton();
        OldMLG = new javax.swing.JTextField();
        OldELG = new javax.swing.JTextField();
        OldMR = new javax.swing.JTextField();
        OldER = new javax.swing.JTextField();
        Day = new javax.swing.JComboBox<>();

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
        jLabel2.setText("Morning Lifeguard");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Evening lifeguard");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Morning Receptionist");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Evening Receptionist");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter ID");

        Find.setText("Find");
        Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindActionPerformed(evt);
            }
        });

        Day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday " }));

        javax.swing.GroupLayout main1Layout = new javax.swing.GroupLayout(main1);
        main1.setLayout(main1Layout);
        main1Layout.setHorizontalGroup(
                main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(main1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(main1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                                .addComponent(OldMR, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(NewMR, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(main1Layout.createSequentialGroup()
                                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(Edit)
                                                        .addComponent(jLabel6))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(OldER, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(NewER, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Cancel)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main1Layout.createSequentialGroup()
                                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(main1Layout.createSequentialGroup()
                                                                .addComponent(Day, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(Find))
                                                        .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main1Layout.createSequentialGroup()
                                                                        .addComponent(OldELG, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(NewELG, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main1Layout.createSequentialGroup()
                                                                        .addComponent(OldMLG, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(NewMLG, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(39, 39, 39))
        );
        main1Layout.setVerticalGroup(
                main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(Find)
                                        .addComponent(Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(NewMLG, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(OldMLG, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(NewELG, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(OldELG, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(NewMR, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(OldMR, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(NewER, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(OldER, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Edit)
                                        .addComponent(Cancel))
                                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(main1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(main1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    /**
     * Edit Shifts
     * */
    private void EditActionPerformed(java.awt.event.ActionEvent evt) {
        String id = ((String)Day.getSelectedItem()).trim();
        String filepath = "Shifts.txt";
        String tempFile = "Temp.txt";
        String serchTerm = id;
        File oldFile = new File(filepath);
        File newFile = new File(tempFile);

        if(NewMLG.getText().trim().isEmpty()||NewELG.getText().trim().isEmpty()||NewMR.getText().trim().isEmpty()||
                NewER.getText().trim().isEmpty())
        {
                             JOptionPane.showMessageDialog(null,"Mandatory fields Empty");
        }else{
            String day ="";
            String morningLG = "";
            String eveningLG = "";
            String morningR = "";
            String eveningR = "";
            try {
                FileWriter fw =new FileWriter(tempFile,true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                Scanner x;
                x=new Scanner(new File(filepath));
                x.useDelimiter("[,\n]");

                while (x.hasNext()){
                    day=x.next().trim();
                    morningLG = x.next().trim();
                    eveningLG = x.next().trim();
                    morningR = x.next().trim();
                    eveningR = x.next().trim();
                    if (id.equals(day)){
                        pw.println(day+","+NewMLG.getText().trim()+","+NewELG.getText().trim()+","+
                                NewMR.getText().trim()+","+NewER.getText().trim());
                    }else {
                        pw.println(day+","+morningLG+","+eveningLG+","+
                                morningR+","+eveningR);
                    }
                }
                x.close();
                pw.flush();
                pw.close();
                oldFile.delete();
                File dump = new File(filepath);
                newFile.renameTo(dump);
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error Reading File");
            }

        }


    }

    /**
     * Close this window
     * */
    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {
        this.hide();
    }

    /**
     * Search the shifts and display the results.
     * */
    private void FindActionPerformed(java.awt.event.ActionEvent evt) {
        String id = ((String)Day.getSelectedItem()).trim();
        String filepath = "Shifts.csv";
        String serchTerm = id;

        try {
            Scanner x;
            x=new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");
            while (x.hasNext())
            {
                String day=x.next();
                if (id.equals(day)){
                    OldMLG.setText(x.next());
                    OldMLG.setEditable(false);
                    OldELG.setText(x.next());
                    OldELG.setEditable(false);
                    OldMR.setText(x.next());
                    OldMR.setEditable(false);
                    OldER.setText(x.next());
                    OldER.setEditable(false);
                    Edit.setEnabled(true);
                    break;
                }
                x.close();
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error Reading File");
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
            java.util.logging.Logger.getLogger(EditShiftsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditShiftsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditShiftsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditShiftsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditShiftsWindow().setVisible(true);
            }
        });
    }

    private javax.swing.JButton Cancel;
    private javax.swing.JComboBox<String> Day;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Find;
    private javax.swing.JTextField NewELG;
    private javax.swing.JTextField NewER;
    private javax.swing.JTextField NewMLG;
    private javax.swing.JTextField NewMR;
    private javax.swing.JTextField OldELG;
    private javax.swing.JTextField OldER;
    private javax.swing.JTextField OldMLG;
    private javax.swing.JTextField OldMR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel main1;
}

