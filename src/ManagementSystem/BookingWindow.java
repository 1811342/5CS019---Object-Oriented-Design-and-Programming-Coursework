/**
 * Booking GUI
 * */

package ManagementSystem;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class BookingWindow extends javax.swing.JFrame {
    public BookingWindow() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        main = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Screen = new javax.swing.JTextArea();
        CloseButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        NewBooking = new javax.swing.JButton();
        EditBooking = new javax.swing.JButton();
        DeleteBooking = new javax.swing.JButton();
        ViewPricess = new javax.swing.JButton();
        ViewClassSchedule = new javax.swing.JButton();
        ViewBooking = new javax.swing.JButton();
        Top = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setBackground(new java.awt.Color(0, 102, 102));

        Screen.setColumns(20);
        Screen.setRows(5);
        BookingList blist = new BookingList();
        Screen.setText("_______________________Bookings_________________________\nID__Date_______Facility_________Lifeguard ID___Member ID" +
                "\n-------------------------------------------------------------------------------------------------"+blist.DisplayAllBookings());
        jScrollPane1.setViewportView(Screen);

        CloseButton.setText("Close");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        NewBooking.setText("New Booking");
        NewBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBookingActionPerformed(evt);
            }
        });

        EditBooking.setText("Edit Booking");
        EditBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBookingActionPerformed(evt);
            }
        });

        DeleteBooking.setText("Delete Booking");
        DeleteBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBookingActionPerformed(evt);
            }
        });

        ViewPricess.setText("view Prices");
        ViewPricess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPricessActionPerformed(evt);
            }
        });

        ViewClassSchedule.setText("View Class Schedule");
        ViewClassSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewClassScheduleActionPerformed(evt);
            }
        });

        ViewBooking.setText("View Bookings");
        ViewBooking.setEnabled(false);
        ViewBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBookingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
                mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainLayout.createSequentialGroup()
                                .addContainerGap(16, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainLayout.createSequentialGroup()
                                                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                                .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(mainLayout.createSequentialGroup()
                                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(ViewClassSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                                        .addComponent(ViewBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(DeleteBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(EditBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(NewBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(ViewPricess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        mainLayout.setVerticalGroup(
                mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainLayout.createSequentialGroup()
                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainLayout.createSequentialGroup()
                                                .addGap(180, 180, 180)
                                                .addComponent(NewBooking)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(EditBooking)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(DeleteBooking)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ViewBooking)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ViewClassSchedule)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ViewPricess)
                                                .addGap(18, 18, 18)
                                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(BackButton)
                                                        .addComponent(CloseButton)))
                                        .addGroup(mainLayout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(75, Short.MAX_VALUE))
        );

        Top.setBackground(new java.awt.Color(0, 51, 102));
        Top.setForeground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("DigifaceWide", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 102, 0));
        jLabel1.setText("Bookings");

        javax.swing.GroupLayout TopLayout = new javax.swing.GroupLayout(Top);
        Top.setLayout(TopLayout);
        TopLayout.setHorizontalGroup(
                TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TopLayout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TopLayout.setVerticalGroup(
                TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopLayout.createSequentialGroup()
                                .addContainerGap(30, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }
    /**
     * Close Program
     * */
    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {
            System.exit(0);
    }

    /**
     * Go back to main window
     * */
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Mainwindow m = new Mainwindow();
        m.setVisible(true);
        this.hide();
    }

    private void NewBookingActionPerformed(java.awt.event.ActionEvent evt) {
        this.hide();
        NewBookingWindow nbw=new NewBookingWindow();
        nbw.setLocationRelativeTo(null);
        nbw.setVisible(true);

    }

    /**
     * Edit a Booking
     * */
    private void EditBookingActionPerformed(java.awt.event.ActionEvent evt) {
        this.hide();
        EditBookingWindow ebw=new EditBookingWindow();
        ebw.setLocationRelativeTo(null);
        ebw.setVisible(true);

    }
    /**
     * Delete a Booking
     * */
    private void DeleteBookingActionPerformed(java.awt.event.ActionEvent evt) {
        this.hide();
        DeleteBookingWindow dbw=new DeleteBookingWindow();
        dbw.setLocationRelativeTo(null);
        dbw.setVisible(true);
    }
    /**
     * View Class Schedules
     * */
    private void ViewClassScheduleActionPerformed(java.awt.event.ActionEvent evt) {
        ViewBooking.setEnabled(true);
        ViewClassSchedule.setEnabled(false);
        ViewPricess.setEnabled(true);
        SwimmingPool pool = new SwimmingPool();
        HalfHall halfhall = new HalfHall();
        TennisCourt tennisCourt = new TennisCourt();
        TabelTennisCourt tabelTennisCourt = new TabelTennisCourt();
        BadmintonCourt badmintonCourt = new BadmintonCourt();
        Screen.setText("_______________________Open Times_________________________\n-------------------------------------------------------------------------------------------------\n" +
                "__________________SwimmingPool Prices__________________\n"+pool.getOpenTimes()+"\n"
                +"________________________Half Hall_______________________\n"+halfhall.getOpenTimes()+"\n"
                +"______________________Tennis Court_______________________\n"+tennisCourt.getOpenTimes()+"\n"
                +"____________________Tabel Tennis Court___________________\n"+tabelTennisCourt.getOpenTimes()+"\n"
                +"_____________________BadmintonCourt_____________________\n"+badmintonCourt.getOpenTimes()+"\n");

    }

    /**
     * Show Class prices to the users
     * */
    private void ViewPricessActionPerformed(java.awt.event.ActionEvent evt) {
        ViewBooking.setEnabled(true);
        ViewPricess.setEnabled(false);
        ViewClassSchedule.setEnabled(true);
        SwimmingPool pool = new SwimmingPool();
        HalfHall halfhall = new HalfHall();
        TennisCourt tennisCourt = new TennisCourt();
        TabelTennisCourt tabelTennisCourt = new TabelTennisCourt();
        BadmintonCourt badmintonCourt = new BadmintonCourt();
        Screen.setText("_________________________Prices___________________________\n-------------------------------------------------------------------------------------------------\n" +
                "__________________SwimmingPool Prices__________________\n"+pool.getPrices()+"\n"
                    +"________________________Half Hall_______________________\n"+halfhall.getPrices()+"\n"
                    +"______________________Tennis Court_______________________\n"+tennisCourt.getPrices()+"\n"
                    +"____________________Tabel Tennis Court___________________\n"+tabelTennisCourt.getPrices()+"\n"
                    +"_____________________BadmintonCourt_____________________\n"+badmintonCourt.getPrices()+"\n");

    }
    /**
     * View Bookings
     * */
    private void ViewBookingActionPerformed(java.awt.event.ActionEvent evt) {
        ViewBooking.setEnabled(false);
        ViewPricess.setEnabled(true);
        ViewClassSchedule.setEnabled(true);

        BookingList blist = new BookingList();
        Screen.setText("_______________________Bookings_________________________\nID__Date_______Facility_________Lifeguard ID___Member ID" +
                "\n-------------------------------------------------------------------------------------------------"+blist.DisplayAllBookings());
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
            java.util.logging.Logger.getLogger(BookingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingWindow().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton BackButton;
    private javax.swing.JButton CloseButton;
    private javax.swing.JButton DeleteBooking;
    private javax.swing.JButton EditBooking;
    private javax.swing.JButton NewBooking;
    private javax.swing.JTextArea Screen;
    private javax.swing.JPanel Top;
    private javax.swing.JButton ViewBooking;
    private javax.swing.JButton ViewClassSchedule;
    private javax.swing.JButton ViewPricess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel main;
}
