/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanGUI;

/**
 *
 * @author WINDOWS 10
 */
public class Latihan4 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan4
     */
    public Latihan4() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        absen = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        rpl = new javax.swing.JRadioButton();
        tkj = new javax.swing.JRadioButton();
        submit = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        combo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 13, 0, 0);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 0, 0);

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 255));
        jLabel2.setText("Biodata Siswa");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(161, 13, 286, 41);

        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("NAMA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(58, 106, 34, 16);

        jLabel4.setForeground(new java.awt.Color(255, 204, 102));
        jLabel4.setText("ABSEN");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(58, 168, 38, 16);

        jLabel5.setForeground(new java.awt.Color(0, 204, 0));
        jLabel5.setText("KELAS");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(58, 240, 36, 16);

        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("JURUSAN");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(58, 302, 53, 16);

        jLabel7.setForeground(new java.awt.Color(255, 0, 255));
        jLabel7.setText("ALAMAT");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(58, 367, 48, 16);
        getContentPane().add(nama);
        nama.setBounds(161, 103, 286, 22);
        getContentPane().add(absen);
        absen.setBounds(161, 165, 286, 22);

        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });
        getContentPane().add(alamat);
        alamat.setBounds(161, 364, 230, 22);

        rpl.setFont(new java.awt.Font("Tekton Pro", 0, 13)); // NOI18N
        rpl.setForeground(new java.awt.Color(0, 204, 204));
        rpl.setText("RPL");
        rpl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rplActionPerformed(evt);
            }
        });
        getContentPane().add(rpl);
        rpl.setBounds(219, 300, 49, 25);

        tkj.setFont(new java.awt.Font("Tekton Pro", 0, 13)); // NOI18N
        tkj.setForeground(new java.awt.Color(204, 0, 204));
        tkj.setText("TKJ");
        tkj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tkjActionPerformed(evt);
            }
        });
        getContentPane().add(tkj);
        tkj.setBounds(296, 300, 49, 25);

        submit.setFont(new java.awt.Font("Tekton Pro", 0, 13)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 51, 51));
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(521, 239, 77, 23);

        exit.setFont(new java.awt.Font("Tekton Pro", 0, 13)); // NOI18N
        exit.setForeground(new java.awt.Color(153, 255, 255));
        exit.setText("EXIT");
        getContentPane().add(exit);
        exit.setBounds(521, 301, 77, 23);

        combo.setFont(new java.awt.Font("Tekton Pro", 0, 13)); // NOI18N
        combo.setForeground(new java.awt.Color(0, 0, 204));
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XRPL1", "XRPL2", "XRPL3", "XRPL4", "XTKJ1", "XTKJ2", "XTKJ3", "XTKJ4", " " }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        getContentPane().add(combo);
        combo.setBounds(161, 240, 61, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rplActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rplActionPerformed

    private void tkjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tkjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tkjActionPerformed

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        //Deklarsi variable
        String nm,abs,jur,almt;
        String kelas = combo.getSelectedItem().toString();
        nm = nama.getText();
        abs = absen.getText();
        almt = alamat.getText();
        //jurusan
        if(rpl.isSelected()=="XRPL1"){            
        }
        
    }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField absen;
    private javax.swing.JTextField alamat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nama;
    private javax.swing.JRadioButton rpl;
    private javax.swing.JButton submit;
    private javax.swing.JRadioButton tkj;
    // End of variables declaration//GEN-END:variables
}
