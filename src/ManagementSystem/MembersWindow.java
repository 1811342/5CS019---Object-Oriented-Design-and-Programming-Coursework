/**
 * Memebrship GUI
 * */
package ManagementSystem;
public class MembersWindow extends javax.swing.JFrame {

    /**
     * Creates new form MembersWindow
     */
    public MembersWindow() {
        initComponents();
    }

    private void initComponents() {

        CloseButton = new javax.swing.JButton();
        main = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        SchoolMembers = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        PublicMembers = new javax.swing.JTextArea();
        SearchPublic = new javax.swing.JButton();
        SearchSchool = new javax.swing.JButton();
        SchoolID = new javax.swing.JTextField();
        PublicID = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        SchoolDetail = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        PublicDetail = new javax.swing.JTextArea();
        BackButton = new javax.swing.JButton();
        CloseButton1 = new javax.swing.JButton();
        NewSchoolMember = new javax.swing.JButton();
        NewPublicMember = new javax.swing.JButton();
        EditSchoolMember = new javax.swing.JButton();
        EditPublicMember1 = new javax.swing.JButton();
        DeleteSchoolMembers = new javax.swing.JButton();
        DeletePublicMembers = new javax.swing.JButton();
        Top = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        CloseButton.setText("Close");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt){
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setBackground(new java.awt.Color(0, 102, 102));

        SchoolMembers.setColumns(20);
        SchoolMembers.setRows(5);
        SchoolMembers.setEditable(false);
        SchoolMembersList sList = new SchoolMembersList();
        sList.readCSV();
        SchoolMembers.setText("School Members\nID---Name---Age---Phone---Email\n______________________________________\n"+sList.listDetails()+"");
        jScrollPane2.setViewportView(SchoolMembers);

        PublicMembers.setColumns(20);
        PublicMembers.setRows(5);
        PublicMembers.setEditable(false);
        PublicMemberList plist =new PublicMemberList();
        plist.readCSV();
        PublicMembers.setText("Public Members\nID---Name---Age---Phone---Email---Membership\n______________________________________\n"+plist.listDetails()+"");
        jScrollPane3.setViewportView(PublicMembers);

        SearchPublic.setText("search");
        SearchPublic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchPublicActionPerformed(evt);
            }
        });

        SearchSchool.setText("search");
        SearchSchool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchSchoolActionPerformed(evt);
            }
        });

        SchoolID.setText("Enter ID");
        SchoolID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        PublicID.setText("Enter ID");

        SchoolDetail.setColumns(20);
        SchoolDetail.setRows(5);
        SchoolDetail.setEditable(false);
        jScrollPane4.setViewportView(SchoolDetail);

        PublicDetail.setColumns(20);
        PublicDetail.setRows(5);
        PublicDetail.setEditable(false);
        jScrollPane6.setViewportView(PublicDetail);

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        CloseButton1.setText("Close");
        CloseButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButton1ActionPerformed(evt);
            }
        });

        NewSchoolMember.setText("Add School Member");
        NewSchoolMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewSchoolMemberActionPerformed(evt);
            }
        });

        NewPublicMember.setText("Add Public Member");
        NewPublicMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPublicMemberActionPerformed(evt);
            }
        });

        EditSchoolMember.setText("Edit School Member");
        EditSchoolMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditSchoolMemberActionPerformed(evt);
            }
        });

        EditPublicMember1.setText("Edit Public Member");
        EditPublicMember1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPublicMember1ActionPerformed(evt);
            }
        });

        DeleteSchoolMembers.setText("Delete School Member");
        DeleteSchoolMembers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteSchoolMembersActionPerformed(evt);
            }
        });

        DeletePublicMembers.setText("Delete Public Member");
        DeletePublicMembers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePublicMembersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
                mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainLayout.createSequentialGroup()
                                                .addComponent(SchoolID, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(SearchSchool)
                                                .addGap(18, 18, 18)
                                                .addComponent(PublicID, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(SearchPublic))
                                        .addGroup(mainLayout.createSequentialGroup()
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(mainLayout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(NewSchoolMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(NewPublicMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(EditSchoolMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(EditPublicMember1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(mainLayout.createSequentialGroup()
                                                                .addGap(35, 35, 35)
                                                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(CloseButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(DeleteSchoolMembers)
                                                        .addComponent(DeletePublicMembers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        mainLayout.setVerticalGroup(
                mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(mainLayout.createSequentialGroup()
                                                .addGap(99, 99, 99)
                                                .addComponent(NewSchoolMember)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(NewPublicMember)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(EditSchoolMember)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(EditPublicMember1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(DeleteSchoolMembers)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(DeletePublicMembers)
                                                .addGap(85, 85, 85)
                                                .addComponent(BackButton)
                                                .addGap(12, 12, 12)
                                                .addComponent(CloseButton1)))
                                .addGap(6, 6, 6)
                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SchoolID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SearchSchool)
                                        .addComponent(PublicID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SearchPublic))
                                .addGap(28, 28, 28)
                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Top.setBackground(new java.awt.Color(0, 51, 102));
        Top.setForeground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("DigifaceWide", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 102, 0));
        jLabel1.setText("Members");

        javax.swing.GroupLayout TopLayout = new javax.swing.GroupLayout(Top);
        Top.setLayout(TopLayout);
        TopLayout.setHorizontalGroup(
                TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TopLayout.createSequentialGroup()
                                .addGap(292, 292, 292)
                                .addComponent(jLabel1)
                                .addContainerGap(414, Short.MAX_VALUE))
        );
        TopLayout.setVerticalGroup(
                TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopLayout.createSequentialGroup()
                                .addContainerGap(36, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(Top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

        /**
         * Searchpublic Memebrs
         * */
    private void SearchPublicActionPerformed(java.awt.event.ActionEvent evt) {
        PublicMemberList plist = new PublicMemberList();
        plist.readCSV();
        String ID = PublicID.getText();
        PublicMember foundMember = plist.findById(ID);

        if (foundMember != null){
            PublicDetail.setText(foundMember.getName().getFullName()+ " Has the phone Number " + foundMember.getPhone());
        }else{
            PublicDetail.setText("Public Member not found please check the ID");
        }
    }

        /**
         * SearchSchoolMembers
         * */
    private void SearchSchoolActionPerformed(java.awt.event.ActionEvent evt) {
        SchoolMembersList slist= new SchoolMembersList();
        slist.readCSV();
        String ID = SchoolID.getText();
        SchoolMemebr foundStudentMember = slist.findById(ID);

        if (foundStudentMember != null){
            SchoolDetail.setText(foundStudentMember.getName().getFullName()+ " Has the phone Number " + foundStudentMember.getPhone());
        }else{
            SchoolDetail.setText("Student Member not found please check the ID");
        }
    }

    /**
     * Back button action performed
      */
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Mainwindow m = new Mainwindow();
        m.setVisible(true);
        this.hide();
    }

    /**
     * Close button action performed
     */
    private void CloseButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        this.hide();
    }

    private void NewSchoolMemberActionPerformed(java.awt.event.ActionEvent evt) {
        AddSchoolMemebrs asn = new AddSchoolMemebrs();
        asn.setLocationRelativeTo(null);
        this.hide();
        asn.setVisible(true);
    }

    private void NewPublicMemberActionPerformed(java.awt.event.ActionEvent evt) {
        AddPublicMembers apm = new AddPublicMembers();
        apm.setLocationRelativeTo(null);
        this.hide();
        apm.setVisible(true);
    }

    private void EditSchoolMemberActionPerformed(java.awt.event.ActionEvent evt) {
        EditSchoolMemebrWindow esm =new EditSchoolMemebrWindow();
        esm.setLocationRelativeTo(null);
        this.hide();
        esm.setVisible(true);
    }

    private void EditPublicMember1ActionPerformed(java.awt.event.ActionEvent evt) {
        EditPublicMemberWindow esm =new EditPublicMemberWindow();
        esm.setLocationRelativeTo(null);
        this.hide();
        esm.setVisible(true);
    }

    private void DeleteSchoolMembersActionPerformed(java.awt.event.ActionEvent evt) {
        this.hide();
        DeleteSchoolMemberWindow Dsmw = new DeleteSchoolMemberWindow();
        Dsmw.setLocationRelativeTo(null);
        Dsmw.setVisible(true);
    }

    private void DeletePublicMembersActionPerformed(java.awt.event.ActionEvent evt) {
        this.hide();
        DeletePublicMembersWindow Dpmw = new DeletePublicMembersWindow();
        Dpmw.setLocationRelativeTo(null);
        Dpmw.setVisible(true);
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
            java.util.logging.Logger.getLogger(MembersWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MembersWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MembersWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MembersWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MembersWindow().setVisible(true);
            }
        });
    }

    /**
     * Variables declaration
     */

    private javax.swing.JButton BackButton;
    private javax.swing.JButton CloseButton;
    private javax.swing.JButton CloseButton1;
    private javax.swing.JButton DeletePublicMembers;
    private javax.swing.JButton DeleteSchoolMembers;
    private javax.swing.JButton EditPublicMember1;
    private javax.swing.JButton EditSchoolMember;
    private javax.swing.JButton NewPublicMember;
    private javax.swing.JButton NewSchoolMember;
    private javax.swing.JTextArea PublicDetail;
    private javax.swing.JTextField PublicID;
    private javax.swing.JTextArea PublicMembers;
    private javax.swing.JTextArea SchoolDetail;
    private javax.swing.JTextField SchoolID;
    private javax.swing.JTextArea SchoolMembers;
    private javax.swing.JButton SearchPublic;
    private javax.swing.JButton SearchSchool;
    private javax.swing.JPanel Top;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel main;
    // End of variables declaration
}