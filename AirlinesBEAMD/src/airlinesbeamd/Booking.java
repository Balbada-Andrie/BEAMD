/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airlinesbeamd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;


/**
 *
 * @author WELCOME
 */
public class Booking extends javax.swing.JFrame {

    /**
     * Creates new form LandingPage
     */
    public Booking() {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ddtxt = new javax.swing.JComboBox<>();
        dtxt = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        nptxt = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        lnf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        fnf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        agef = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        origintxt = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ATI = new javax.swing.JComboBox<>();
        Book = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel5.setText("Departure Date:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setText("Booking Info");

        jLabel4.setText("Destination:");

        jLabel3.setText("Origin:");

        ddtxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT HERE:", "MORNING: 8 AM", "AFTERNOON: 4 PM" }));
        ddtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddtxtActionPerformed(evt);
            }
        });

        dtxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT HERE:", "MANILA", "CEBU", "DAVAO" }));
        dtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtxtActionPerformed(evt);
            }
        });

        jLabel7.setText("Number of Passengers:");

        nptxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT HERE:", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        nptxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nptxtActionPerformed(evt);
            }
        });

        jLabel9.setText("Last Name:");

        jLabel10.setText("First Name:");

        fnf.setToolTipText("");
        fnf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnfActionPerformed(evt);
            }
        });

        jLabel11.setText("Age:");

        agef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agefActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Book Now!");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        origintxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT HERE:", "MANILA", "CEBU", "DAVAO" }));
        origintxt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                origintxtItemStateChanged(evt);
            }
        });
        origintxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origintxtActionPerformed(evt);
            }
        });

        jLabel1.setText("ARRIVAL TIME:");

        jLabel6.setText("Booking Class:");

        ATI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT HERE:", "Morning 10 AM", "Afternoon 4 PM" }));

        Book.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT HERE:", "LOCAL CLASS", "MEDIUM CLASS", "VIP " }));
        Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookActionPerformed(evt);
            }
        });

        jLabel8.setText("PRICES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ddtxt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nptxt, 0, 151, Short.MAX_VALUE)
                                            .addComponent(ATI, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(origintxt, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(Book, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lnf, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19)
                        .addComponent(fnf, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(agef, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(115, 115, 115))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(fnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel8)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(origintxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ddtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(nptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ATI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1AncestorAdded

    private void origintxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origintxtActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_origintxtActionPerformed

    private void ddtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddtxtActionPerformed

    private void origintxtItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_origintxtItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_origintxtItemStateChanged

    private void fnfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnfActionPerformed

    private void agefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agefActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       // TODO add your handling code here:
       String lastname = null, fullname, Edad, ORigin, DEstination, DEparture, NumP, ARival, BookClass, query, id, D, DD, NN, O, AT, BC, ff, ll;
    String SUrl, SUser, SPass;
    int notFound = 0;

    SUrl = "jdbc:MySQL://localhost:3306/airlinesbeamd";
    SUser = "root";
    SPass = "";

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
        Statement st = con.createStatement();

        String originSelectedItem = (String) origintxt.getSelectedItem();
        String dtSelectedItem = (String) dtxt.getSelectedItem();
        String ddSelectedItem = (String) ddtxt.getSelectedItem();
        String npSelectedItem = (String) nptxt.getSelectedItem();
        String ArTSelectedItem = (String) ATI.getSelectedItem();
        String BookcSelectedItem = (String) Book.getSelectedItem();

        if ("SELECT HERE:".equals(ddSelectedItem) || "SELECT HERE:".equals(npSelectedItem) || "SELECT HERE:".equals(BookcSelectedItem) || "SELECT HERE:".equals(ArTSelectedItem) || "SELECT HERE:".equals(originSelectedItem) || "SELECT HERE:".equals(dtSelectedItem)) {
            JOptionPane.showMessageDialog(new JFrame(), "The Select Item is required", "Error", JOptionPane.ERROR_MESSAGE);
        } else if ("".equals(lnf.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "Last name is required", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else if ("".equals(fnf.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "First name is required", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else if ("".equals(agef.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "Age is required", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            lastname = lnf.getText();
            fullname = fnf.getText();
            Edad = agef.getText();
            ORigin = (String) origintxt.getSelectedItem();
            DEstination = (String) dtxt.getSelectedItem();
            DEparture = (String) ddtxt.getSelectedItem();
            NumP = (String) nptxt.getSelectedItem();
            ARival = (String) ATI.getSelectedItem();
            BookClass = (String) Book.getSelectedItem();

            // Calculate prices based on selected items
            int originPrice = calculateOriginPrice(ORigin);
            int destinationPrice = calculateDestinationPrice(DEstination);
            int passengerPrice = Integer.parseInt(NumP) * 500; // Assuming 500 is the price per passenger
            int bookingClassPrice = calculateBookingClassPrice(BookClass);

            // Calculate total price
            int totalPrice = originPrice + destinationPrice + passengerPrice + bookingClassPrice;

            query = "INSERT INTO user_booking (Lname,fname,AGE,Origin,Destination,Departure,NP,ArrivalTime,BookingClass,Price)" +
                    "VALUES('" + lastname + "','" + fullname + "','" + Edad + "','" + ORigin + "','" + DEstination + "','" + DEparture + "','" + NumP + "','" + ARival + "','" + BookClass + "','" + totalPrice + "')";

            st.execute(query);
            lnf.setText("");
            fnf.setText("");
            showMessageDialog(null, "Booking successfully!");

            // Display trip details
            displayTripDetails(lastname, ORigin, DEstination, DEparture, NumP, ARival, BookClass, totalPrice);

        }

        if (lastname != null) {
            query = "SELECT * FROM user_booking WHERE Lname = '" + lastname + "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                id = rs.getString("FN");
                O = rs.getString("Origin");
                D = rs.getString("Destination");
                DD = rs.getString("Departure");
                NN = rs.getString("NP");
                AT = rs.getString("ArrivalTime");
                BC = rs.getString("BookingClass");
                ff = rs.getString("fname");
                ll = rs.getString("Lname");
                String totalPrice = rs.getString("Price");
                notFound = 1;

                TripDetails TD = new TripDetails();
                TD.setAT(AT);
                TD.setBC(BC);
                TD.setNN(ff);
                TD.setLastname(ll);
                TD.setOrigin(O);
                TD.setDestination(D);
                TD.setDisplay(id);
                TD.setDeparture(DD);
                TD.setTotal(totalPrice);
                TD.setNumberP(NN);
                TD.setVisible(true);
                TD.setLocationRelativeTo(null);
                TD.pack();
                this.dispose();
            }
        }

    } catch (Exception e) {
        System.out.println("Error" + e.getMessage());
    }
    }//GEN-LAST:event_jButton3ActionPerformed
private int calculateOriginPrice(String origin) {
    if ("Manila".equals(origin) || "Cebu".equals(origin) || "Davao".equals(origin)) {
        return 5000;
    }
    return 0; // Default price
}

private int calculateDestinationPrice(String destination) {
    if ("Manila".equals(destination) || "Cebu".equals(destination) || "Davao".equals(destination)) {
        return 5000;
    }
    return 0; // Default price
}

private int calculateBookingClassPrice(String bookingClass) {
    if ("LocalClass".equals(bookingClass)) {
        return 200;
    } else if ("Medium Class".equals(bookingClass)) {
        return 300;
    } else if ("VIP".equals(bookingClass)) {
        return 500;
    }
    return 0; // Default price
}

private void displayTripDetails(String lastname, String origin, String destination, String departure, String numPassengers, String arrivalTime, String bookingClass, int totalPrice) {
    TripDetails TD = new TripDetails();
    TD.setLastname(lastname);
    TD.setOrigin(origin);
    TD.setDestination(destination);
    TD.setDeparture(departure);
    TD.setNumberP(numPassengers);
    TD.setAT(arrivalTime);
    TD.setBC(bookingClass);
    TD.setTotal(totalPrice);
    TD.setVisible(true);
    TD.setLocationRelativeTo(null);
    TD.pack();
    this.dispose();
}
    
    
    private void nptxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nptxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nptxtActionPerformed

    private void dtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dtxtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     Mainscreen m = new Mainscreen();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
        m.pack();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ATI;
    private javax.swing.JComboBox<String> Book;
    private javax.swing.JTextField agef;
    private javax.swing.JComboBox<String> ddtxt;
    private javax.swing.JComboBox<String> dtxt;
    private javax.swing.JTextField fnf;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lnf;
    private javax.swing.JComboBox<String> nptxt;
    private javax.swing.JComboBox<String> origintxt;
    // End of variables declaration//GEN-END:variables
}
