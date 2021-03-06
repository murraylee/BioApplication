/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biologygameapp;

/**
 *
 * @author Lee
 */
public class BiologyMain extends javax.swing.JFrame {

    /**
     * Creates new form BiologyMain
     */
    public BiologyMain() {
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

        BackButton = new javax.swing.JLabel();
        HomeButton = new javax.swing.JLabel();
        HelpButton = new javax.swing.JLabel();
        HangmanButton = new javax.swing.JButton();
        KeyNotesBtn = new javax.swing.JButton();
        MainBioTitle = new javax.swing.JLabel();
        BioMainBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biologygameapp/backbtn.png"))); // NOI18N
        BackButton.setText("jLabel1");
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        getContentPane().add(BackButton);
        BackButton.setBounds(0, 350, 130, 50);

        HomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biologygameapp/homebtn.png"))); // NOI18N
        HomeButton.setText("jLabel1");
        HomeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeButtonMouseClicked(evt);
            }
        });
        getContentPane().add(HomeButton);
        HomeButton.setBounds(130, 350, 60, 50);

        HelpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biologygameapp/helpbtn.png"))); // NOI18N
        HelpButton.setText("jLabel1");
        getContentPane().add(HelpButton);
        HelpButton.setBounds(180, 350, 140, 50);

        HangmanButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        HangmanButton.setForeground(new java.awt.Color(0, 204, 102));
        HangmanButton.setText("Play Hangman");
        HangmanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HangmanButtonActionPerformed(evt);
            }
        });
        getContentPane().add(HangmanButton);
        HangmanButton.setBounds(80, 180, 180, 50);

        KeyNotesBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        KeyNotesBtn.setForeground(new java.awt.Color(0, 204, 102));
        KeyNotesBtn.setText("Key Notes");
        KeyNotesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeyNotesBtnActionPerformed(evt);
            }
        });
        getContentPane().add(KeyNotesBtn);
        KeyNotesBtn.setBounds(110, 280, 110, 40);

        MainBioTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        MainBioTitle.setForeground(new java.awt.Color(0, 204, 102));
        MainBioTitle.setText("Biology");
        getContentPane().add(MainBioTitle);
        MainBioTitle.setBounds(90, 0, 170, 80);

        BioMainBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biologygameapp/BiologyBackground.jpg"))); // NOI18N
        BioMainBackground.setText("jLabel1");
        getContentPane().add(BioMainBackground);
        BioMainBackground.setBounds(0, 0, 320, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonMouseClicked

    private void HomeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeButtonMouseClicked

    private void KeyNotesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeyNotesBtnActionPerformed
           
    }//GEN-LAST:event_KeyNotesBtnActionPerformed

    private void HangmanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HangmanButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HangmanButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BiologyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BiologyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BiologyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BiologyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BiologyMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackButton;
    private javax.swing.JLabel BioMainBackground;
    private javax.swing.JButton HangmanButton;
    private javax.swing.JLabel HelpButton;
    private javax.swing.JLabel HomeButton;
    private javax.swing.JButton KeyNotesBtn;
    private javax.swing.JLabel MainBioTitle;
    // End of variables declaration//GEN-END:variables
}
