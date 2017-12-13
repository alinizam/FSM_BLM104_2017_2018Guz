/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12Lab2;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FSMBLM1
 */
public class frm_entitybean extends javax.swing.JFrame {

    DefaultComboBoxModel cbMalzemeler = new DefaultComboBoxModel();
    DefaultComboBoxModel cbMusteriler = new DefaultComboBoxModel();
    DefaultTableModel dtm = new DefaultTableModel();

    List<Musteri> müsteriler = new ArrayList<>();
    List<Malzeme> malzemeler = new ArrayList<>();

    /**
     * Creates new form frm_entitybean
     */
    public frm_entitybean() {
        initComponents();

        jTable2.setModel(dtm);
        jComboBox2.setModel(cbMusteriler);
        dtm.setColumnIdentifiers(new String[]{"sid", "mid", "malzemeadi", "mlid", "adet", "tutar", "müsteriadı"});
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("entitybeanPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT m from Musteri m");
        müsteriler = q.getResultList();
        for (Musteri mus : müsteriler) {
            cbMusteriler.addElement(mus);
        }
        jComboBox1.setModel(cbMalzemeler);
        EntityManagerFactory emff = Persistence.createEntityManagerFactory("entitybeanPU");
        EntityManager emm = emff.createEntityManager();
        Query qq = emm.createQuery("SELECT ma from Malzeme ma");
        malzemeler = qq.getResultList();
        for (Malzeme mal : malzemeler) {
            cbMalzemeler.addElement(mal);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_ekle = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_tutar = new javax.swing.JTextField();
        txt_adet = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txt_sorgula = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Malzeme:");

        jLabel2.setText("Müşteri:");

        txt_ekle.setText("ekle");
        txt_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ekleActionPerformed(evt);
            }
        });

        jLabel3.setText("tutae:");

        jLabel4.setText("adet:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        txt_sorgula.setText("sorgula");
        txt_sorgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sorgulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(txt_ekle))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(txt_tutar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(45, 45, 45)
                                .addComponent(txt_adet, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_sorgula))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txt_ekle))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_tutar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_adet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_sorgula)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ekleActionPerformed
        // TODO add your handling code here:
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("entitybeanPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT m from Satis m");
        List<Satis> satıslar = q.getResultList();
        int maxid = 0;
        for (Satis satis : satıslar) {
            if (satis.getSId() > maxid) {
                maxid = satis.getSId();
            }
        }

        em.getTransaction().begin();
        Satis s = new Satis();
        s.setAdet(Integer.parseInt(txt_adet.getText()));
        s.setTutar(Integer.parseInt(txt_tutar.getText()));
        s.setMalId(malzemeler.get(jComboBox1.getSelectedIndex()).getMalId());
        s.setMusteriId(müsteriler.get(jComboBox2.getSelectedIndex()).getMusteriId());
        s.setSId(maxid + 1);
        em.persist(s);
        em.getTransaction().commit();
    }//GEN-LAST:event_txt_ekleActionPerformed

    private void txt_sorgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sorgulaActionPerformed
        // TODO add your handling code here:
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("entitybeanPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT m from Satis m");
        List<Satis> satıslar = q.getResultList();
        for (Satis satis : satıslar) {
            Query q2 = em.createQuery("SELECT m from Malzeme m where m.malId=:mID");
            q2.setParameter("mID", satis.getMalId());
            Malzeme m = (Malzeme) q2.getSingleResult();
            Query q3 = em.createQuery("Select m from Musteri m where m.musteriId=:musID");
            q3.setParameter("musID", satis.getMusteriId());
            Musteri mm = (Musteri)q3.getSingleResult();
            dtm.addRow(new Object[]{satis.getSId(), satis.getMalId(), m.getMalzemeAdi(), 
                satis.getMusteriId(), satis.getAdet(), satis.getTutar(), mm.getMAdi()});
        }

    }//GEN-LAST:event_txt_sorgulaActionPerformed

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
            java.util.logging.Logger.getLogger(frm_entitybean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_entitybean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_entitybean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_entitybean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_entitybean().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txt_adet;
    private javax.swing.JButton txt_ekle;
    private javax.swing.JButton txt_sorgula;
    private javax.swing.JTextField txt_tutar;
    // End of variables declaration//GEN-END:variables
}