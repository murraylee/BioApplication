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
public class BioEnzymes extends javax.swing.JFrame {

    /**
     * Creates new form BioEnzymes
     */
    public BioEnzymes() {
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

        jLabel2 = new javax.swing.JLabel();
        BackButton = new javax.swing.JLabel();
        HomeButton = new javax.swing.JLabel();
        HelpButton = new javax.swing.JLabel();
        BioEnzymeImg = new javax.swing.JLabel();
        BioEnyzmeTitle = new javax.swing.JLabel();
        BioHistoryBackground = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

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

        BioEnzymeImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biologygameapp/enyzme.png"))); // NOI18N
        BioEnzymeImg.setText("jLabel1");
        getContentPane().add(BioEnzymeImg);
        BioEnzymeImg.setBounds(-10, 60, 340, 222);

        BioEnyzmeTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BioEnyzmeTitle.setForeground(new java.awt.Color(0, 204, 102));
        BioEnyzmeTitle.setText("Enzyme Action");
        getContentPane().add(BioEnyzmeTitle);
        BioEnyzmeTitle.setBounds(90, 0, 150, 40);

        BioHistoryBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biologygameapp/BiologyBackground.jpg"))); // NOI18N
        BioHistoryBackground.setText("jLabel2");
        getContentPane().add(BioHistoryBackground);
        BioHistoryBackground.setBounds(0, 0, 320, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonMouseClicked

    private void HomeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeButtonMouseClicked

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
            java.util.logging.Logger.getLogger(BioEnzymes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BioEnzymes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BioEnzymes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BioEnzymes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BioEnzymes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackButton;
    private javax.swing.JLabel BioEnyzmeTitle;
    private javax.swing.JLabel BioEnzymeImg;
    private javax.swing.JLabel BioHistoryBackground;
    private javax.swing.JLabel HelpButton;
    private javax.swing.JLabel HomeButton;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
