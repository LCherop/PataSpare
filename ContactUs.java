/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.ui;

/**
 *
 * @author otien
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ContactUs extends javax.swing.JFrame {

    /**
     * Creates new form ContactUs
     */
    DBConnect con = new DBConnect();
    Connection conny;
    public ContactUs() {
        
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

        bg = new javax.swing.JPanel();
        navigationContainer = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        dashButton = new javax.swing.JButton();
        shopButton = new javax.swing.JButton();
        locationButton = new javax.swing.JButton();
        contactusButton = new javax.swing.JButton();
        logoutButton1 = new javax.swing.JButton();
        feedbackContainer = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentsTextarea = new javax.swing.JTextArea();
        commentsLabel = new javax.swing.JLabel();
        rating = new javax.swing.JSlider();
        ratingLabek = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        poorLabel = new javax.swing.JLabel();
        greatLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navigationContainer.setBackground(new java.awt.Color(38, 64, 84));

        homeButton.setBackground(new java.awt.Color(38, 64, 84));
        homeButton.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        homeButton.setText("Home");
        homeButton.setBorder(null);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        dashButton.setBackground(new java.awt.Color(38, 64, 84));
        dashButton.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        dashButton.setText("Dashboard");
        dashButton.setBorder(null);
        dashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashButtonActionPerformed(evt);
            }
        });

        shopButton.setBackground(new java.awt.Color(38, 64, 84));
        shopButton.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        shopButton.setText("Shop");
        shopButton.setBorder(null);
        shopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopButtonActionPerformed(evt);
            }
        });

        locationButton.setBackground(new java.awt.Color(38, 64, 84));
        locationButton.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        locationButton.setText("Locations");
        locationButton.setBorder(null);
        locationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationButtonActionPerformed(evt);
            }
        });

        contactusButton.setBackground(new java.awt.Color(38, 64, 84));
        contactusButton.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        contactusButton.setText("Contact Us");
        contactusButton.setBorder(null);
        contactusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactusButtonActionPerformed(evt);
            }
        });

        logoutButton1.setBackground(new java.awt.Color(38, 64, 84));
        logoutButton1.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        logoutButton1.setText("Log Out");
        logoutButton1.setBorder(null);
        logoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navigationContainerLayout = new javax.swing.GroupLayout(navigationContainer);
        navigationContainer.setLayout(navigationContainerLayout);
        navigationContainerLayout.setHorizontalGroup(
            navigationContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dashButton, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(shopButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(locationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contactusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        navigationContainerLayout.setVerticalGroup(
            navigationContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationContainerLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(locationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        bg.add(navigationContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 545));

        feedbackContainer.setBackground(new java.awt.Color(203, 214, 231));

        nameField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        nameField.setBorder(null);

        nameLabel.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        nameLabel.setText("Name");

        commentsTextarea.setColumns(20);
        commentsTextarea.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        commentsTextarea.setRows(5);
        commentsTextarea.setBorder(null);
        jScrollPane1.setViewportView(commentsTextarea);

        commentsLabel.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        commentsLabel.setText("Comments");

        rating.setBackground(new java.awt.Color(203, 214, 231));
        rating.setForeground(new java.awt.Color(38, 64, 84));
        rating.setMaximum(10);

        ratingLabek.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        ratingLabek.setText("Rating");

        submitButton.setBackground(new java.awt.Color(249, 62, 0));
        submitButton.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.setBorder(null);
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        poorLabel.setFont(new java.awt.Font("Poppins Light", 0, 11)); // NOI18N
        poorLabel.setText("Poor");

        greatLabel.setFont(new java.awt.Font("Poppins Light", 0, 11)); // NOI18N
        greatLabel.setText("Great");

        javax.swing.GroupLayout feedbackContainerLayout = new javax.swing.GroupLayout(feedbackContainer);
        feedbackContainer.setLayout(feedbackContainerLayout);
        feedbackContainerLayout.setHorizontalGroup(
            feedbackContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feedbackContainerLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(feedbackContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(commentsLabel)
                    .addComponent(ratingLabek))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(feedbackContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(feedbackContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(feedbackContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(nameField)))
                    .addGroup(feedbackContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(feedbackContainerLayout.createSequentialGroup()
                            .addComponent(poorLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(greatLabel))
                        .addComponent(rating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        feedbackContainerLayout.setVerticalGroup(
            feedbackContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feedbackContainerLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(feedbackContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(feedbackContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ratingLabek))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(feedbackContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(poorLabel)
                    .addComponent(greatLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(feedbackContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(commentsLabel))
                .addGap(18, 18, 18)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        bg.add(feedbackContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 31, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        try {
            // TODO add your handling code here:
            conny = DriverManager.getConnection("jdbc:mysql://localhost/pataspare","root","");
            PreparedStatement feed = conny.prepareStatement("INSERT INTO `feedback` (`feedbackId`, `review`, `reviewerName`) VALUES (NULL, ?, ?);");
            feed.setString(2, this.nameField.getText());
            feed.setString(1, this.commentsTextarea.getText());
            feed.executeUpdate();
            
            this.dispose();
            new ContactUs().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ContactUs.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void dashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_dashButtonActionPerformed

    private void shopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Shop().setVisible(true);
    }//GEN-LAST:event_shopButtonActionPerformed

    private void locationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Locations().setVisible(true);
    }//GEN-LAST:event_locationButtonActionPerformed

    private void contactusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactusButtonActionPerformed
        // TODO add your handling code here:
        //this.setVisible(true);
        
        
        
    }//GEN-LAST:event_contactusButtonActionPerformed

    private void logoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactUs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel commentsLabel;
    private javax.swing.JTextArea commentsTextarea;
    private javax.swing.JButton contactusButton;
    private javax.swing.JButton dashButton;
    private javax.swing.JPanel feedbackContainer;
    private javax.swing.JLabel greatLabel;
    private javax.swing.JButton homeButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton locationButton;
    private javax.swing.JButton logoutButton1;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel navigationContainer;
    private javax.swing.JLabel poorLabel;
    private javax.swing.JSlider rating;
    private javax.swing.JLabel ratingLabek;
    private javax.swing.JButton shopButton;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
