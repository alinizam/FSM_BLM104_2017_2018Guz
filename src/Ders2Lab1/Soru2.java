/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders2Lab1;

/**
 *
 * @author anizam
 */
public class Soru2 extends javax.swing.JFrame {

    /**
     * Creates new form Soru2
     */
    public Soru2() {
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

        txt_giden = new javax.swing.JTextField();
        btn_yukari = new javax.swing.JButton();
        btn_asagi = new javax.swing.JButton();
        btn_sag = new javax.swing.JButton();
        btn_sol = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_giden.setText("gezgin");

        btn_yukari.setText("Yukari");
        btn_yukari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yukariActionPerformed(evt);
            }
        });

        btn_asagi.setText("Asagi");
        btn_asagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_asagiActionPerformed(evt);
            }
        });

        btn_sag.setText("Sag");
        btn_sag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sagActionPerformed(evt);
            }
        });

        btn_sol.setText("Sol");
        btn_sol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_solActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_yukari)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_giden, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_asagi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btn_sol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(btn_sag)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btn_yukari)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sag)
                    .addComponent(btn_sol))
                .addGap(3, 3, 3)
                .addComponent(btn_asagi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(txt_giden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_yukariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yukariActionPerformed
        // TODO add your handling code here:
        if (txt_giden.getY()-10>0)
            txt_giden.setLocation(txt_giden.getX(),txt_giden.getY()-10);
       
    }//GEN-LAST:event_btn_yukariActionPerformed

    private void btn_asagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asagiActionPerformed
        // TODO add your handling code here:
          if (txt_giden.getY()+txt_giden.getSize().height+30<this.getSize().height )
            txt_giden.setLocation(txt_giden.getX(),txt_giden.getY()+10);
    }//GEN-LAST:event_btn_asagiActionPerformed

    private void btn_solActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_solActionPerformed
        // TODO add your handling code here:
         if (txt_giden.getX()-10>0)
            txt_giden.setLocation(txt_giden.getX()-10,txt_giden.getY());
    }//GEN-LAST:event_btn_solActionPerformed

    private void btn_sagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sagActionPerformed
        // TODO add your handling code here:
         if (txt_giden.getY()+txt_giden.getSize().width+30<this.getSize().width )
            txt_giden.setLocation(txt_giden.getX()+10,txt_giden.getY());
    }//GEN-LAST:event_btn_sagActionPerformed

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
            java.util.logging.Logger.getLogger(Soru2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Soru2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Soru2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Soru2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Soru2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_asagi;
    private javax.swing.JButton btn_sag;
    private javax.swing.JButton btn_sol;
    private javax.swing.JButton btn_yukari;
    private javax.swing.JTextField txt_giden;
    // End of variables declaration//GEN-END:variables
}
