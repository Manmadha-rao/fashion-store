/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.clothing.store;

/**
 *
 * @author manjeet
 */
public class Top_Wear_M extends javax.swing.JFrame {

    /**
     * Creates new form Top_Wear_M
     */
    public Top_Wear_M() {
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

        Jackets = new javax.swing.JButton();
        Shirts = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        Jackets.setBackground(new java.awt.Color(0, 102, 204));
        Jackets.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jackets.setText("Jackets/Coats/Sweater/Sweatshirts");
        Jackets.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jackets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JacketsActionPerformed(evt);
            }
        });
        getContentPane().add(Jackets);
        Jackets.setBounds(200, 30, 360, 50);

        Shirts.setBackground(new java.awt.Color(0, 102, 255));
        Shirts.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Shirts.setText("Shirts / T-Shirts / Polos");
        Shirts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Shirts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShirtsActionPerformed(evt);
            }
        });
        getContentPane().add(Shirts);
        Shirts.setBounds(280, 110, 330, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgnew/clothing/store/Abstract-blue-black-dark-cubes-reflections-485x728.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-1, 2, 620, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JacketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JacketsActionPerformed
        // TODO add your handling code here:
        Jackets_M a;
        a = new Jackets_M();
        a.setVisible(true);
    }//GEN-LAST:event_JacketsActionPerformed

    private void ShirtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShirtsActionPerformed
        // TODO add your handling code here:
        shirts_m a;
        a = new shirts_m();
        a.setVisible(true);
    }//GEN-LAST:event_ShirtsActionPerformed

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
            java.util.logging.Logger.getLogger(Top_Wear_M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Top_Wear_M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Top_Wear_M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Top_Wear_M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Top_Wear_M().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jackets;
    private javax.swing.JButton Shirts;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
