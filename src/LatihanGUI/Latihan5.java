/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanGUI;

import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 10
 */
public class Latihan5 extends javax.swing.JFrame {
    String angka;
double jumlah,angka1,angka2;
int pilih;

    /**
     * Creates new form Latihan5
     */
    public Latihan5() {
        initComponents();
        angka = "";
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
        btnangka1 = new javax.swing.JButton();
        btnangka2 = new javax.swing.JButton();
        btnangka3 = new javax.swing.JButton();
        btnangka4 = new javax.swing.JButton();
        btnangka5 = new javax.swing.JButton();
        btnangka6 = new javax.swing.JButton();
        btnangka7 = new javax.swing.JButton();
        btnangka8 = new javax.swing.JButton();
        btnangka9 = new javax.swing.JButton();
        display = new javax.swing.JTextField();
        btnangka0 = new javax.swing.JButton();
        btnbagi = new javax.swing.JButton();
        btnkali = new javax.swing.JButton();
        btnkurang = new javax.swing.JButton();
        btntambah = new javax.swing.JButton();
        btnkoma = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        akar = new javax.swing.JButton();
        btnsama = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(null);

        btnangka1.setBackground(new java.awt.Color(102, 255, 255));
        btnangka1.setFont(new java.awt.Font("Tekton Pro Cond", 1, 18)); // NOI18N
        btnangka1.setText("1");
        btnangka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnangka1);
        btnangka1.setBounds(12, 107, 70, 70);

        btnangka2.setBackground(new java.awt.Color(102, 255, 255));
        btnangka2.setFont(new java.awt.Font("Tekton Pro Cond", 1, 18)); // NOI18N
        btnangka2.setText("2");
        btnangka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnangka2);
        btnangka2.setBounds(100, 107, 70, 70);

        btnangka3.setBackground(new java.awt.Color(102, 255, 255));
        btnangka3.setFont(new java.awt.Font("Tekton Pro Cond", 1, 18)); // NOI18N
        btnangka3.setText("3");
        btnangka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnangka3);
        btnangka3.setBounds(190, 110, 60, 70);

        btnangka4.setBackground(new java.awt.Color(102, 255, 255));
        btnangka4.setFont(new java.awt.Font("Tekton Pro Cond", 1, 18)); // NOI18N
        btnangka4.setText("4");
        btnangka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnangka4);
        btnangka4.setBounds(10, 190, 70, 70);

        btnangka5.setBackground(new java.awt.Color(102, 255, 255));
        btnangka5.setFont(new java.awt.Font("Tekton Pro Cond", 1, 18)); // NOI18N
        btnangka5.setText("5");
        btnangka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnangka5);
        btnangka5.setBounds(100, 190, 70, 70);

        btnangka6.setBackground(new java.awt.Color(102, 255, 255));
        btnangka6.setFont(new java.awt.Font("Tekton Pro Cond", 1, 18)); // NOI18N
        btnangka6.setText("6");
        btnangka6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnangka6);
        btnangka6.setBounds(190, 190, 60, 70);

        btnangka7.setBackground(new java.awt.Color(102, 255, 255));
        btnangka7.setFont(new java.awt.Font("Tekton Pro Cond", 1, 18)); // NOI18N
        btnangka7.setText("7");
        btnangka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnangka7);
        btnangka7.setBounds(12, 279, 70, 80);

        btnangka8.setBackground(new java.awt.Color(102, 255, 255));
        btnangka8.setFont(new java.awt.Font("Tekton Pro Cond", 1, 18)); // NOI18N
        btnangka8.setText("8");
        btnangka8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka8ActionPerformed(evt);
            }
        });
        jPanel1.add(btnangka8);
        btnangka8.setBounds(100, 280, 70, 80);

        btnangka9.setBackground(new java.awt.Color(102, 255, 255));
        btnangka9.setFont(new java.awt.Font("Tekton Pro Cond", 1, 18)); // NOI18N
        btnangka9.setText("9");
        btnangka9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka9ActionPerformed(evt);
            }
        });
        jPanel1.add(btnangka9);
        btnangka9.setBounds(190, 280, 60, 80);

        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });
        jPanel1.add(display);
        display.setBounds(12, 13, 278, 81);

        btnangka0.setBackground(new java.awt.Color(102, 255, 255));
        btnangka0.setFont(new java.awt.Font("Tekton Pro Cond", 1, 18)); // NOI18N
        btnangka0.setText("0");
        btnangka0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka0ActionPerformed(evt);
            }
        });
        jPanel1.add(btnangka0);
        btnangka0.setBounds(12, 382, 240, 42);

        btnbagi.setBackground(new java.awt.Color(153, 153, 153));
        btnbagi.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        btnbagi.setForeground(new java.awt.Color(51, 51, 0));
        btnbagi.setText("/");
        btnbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbagiActionPerformed(evt);
            }
        });
        jPanel1.add(btnbagi);
        btnbagi.setBounds(308, 21, 50, 70);

        btnkali.setBackground(new java.awt.Color(153, 153, 153));
        btnkali.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        btnkali.setForeground(new java.awt.Color(51, 51, 0));
        btnkali.setText("*");
        btnkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaliActionPerformed(evt);
            }
        });
        jPanel1.add(btnkali);
        btnkali.setBounds(308, 107, 50, 70);

        btnkurang.setBackground(new java.awt.Color(153, 153, 153));
        btnkurang.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        btnkurang.setForeground(new java.awt.Color(51, 51, 0));
        btnkurang.setText("-");
        btnkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkurangActionPerformed(evt);
            }
        });
        jPanel1.add(btnkurang);
        btnkurang.setBounds(310, 200, 50, 70);

        btntambah.setBackground(new java.awt.Color(153, 153, 153));
        btntambah.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        btntambah.setForeground(new java.awt.Color(51, 51, 0));
        btntambah.setText("+");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });
        jPanel1.add(btntambah);
        btntambah.setBounds(310, 280, 50, 70);

        btnkoma.setBackground(new java.awt.Color(153, 153, 153));
        btnkoma.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        btnkoma.setForeground(new java.awt.Color(51, 51, 0));
        btnkoma.setText(".");
        btnkoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkomaActionPerformed(evt);
            }
        });
        jPanel1.add(btnkoma);
        btnkoma.setBounds(370, 200, 50, 70);

        btnhapus.setBackground(new java.awt.Color(153, 153, 153));
        btnhapus.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        btnhapus.setForeground(new java.awt.Color(51, 51, 0));
        btnhapus.setText("c");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnhapus);
        btnhapus.setBounds(370, 20, 50, 70);

        akar.setBackground(new java.awt.Color(153, 153, 153));
        akar.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        akar.setForeground(new java.awt.Color(51, 51, 0));
        akar.setText("√");
        akar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akarActionPerformed(evt);
            }
        });
        jPanel1.add(akar);
        akar.setBounds(370, 110, 50, 70);

        btnsama.setBackground(new java.awt.Color(153, 153, 153));
        btnsama.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        btnsama.setForeground(new java.awt.Color(51, 51, 0));
        btnsama.setText("=");
        btnsama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsamaActionPerformed(evt);
            }
        });
        jPanel1.add(btnsama);
        btnsama.setBounds(370, 280, 50, 70);

        btnkeluar.setBackground(new java.awt.Color(153, 153, 153));
        btnkeluar.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        btnkeluar.setForeground(new java.awt.Color(51, 51, 0));
        btnkeluar.setText("EXIT");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });
        jPanel1.add(btnkeluar);
        btnkeluar.setBounds(310, 370, 110, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LatihanGUI/4_Dota2-Kunkka - Copy.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 470, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(478, 524));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaliActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
display.setText("*");
angka="";
pilih=3;

    }//GEN-LAST:event_btnkaliActionPerformed

    private void btnangka0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka0ActionPerformed
        // TODO add your handling code here:
        angka += "0";
display.setText(angka);
    }//GEN-LAST:event_btnangka0ActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
display.setText("+");
angka="";
pilih=1;
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnangka4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka4ActionPerformed
        // TODO add your handling code here:
        angka += "4";
display.setText(angka);
    }//GEN-LAST:event_btnangka4ActionPerformed

    private void btnkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkurangActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
display.setText("-");
angka="";
pilih=2;

    }//GEN-LAST:event_btnkurangActionPerformed

    private void btnangka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka1ActionPerformed
        // TODO add your handling code here:
        angka += "1";
display.setText(angka);
    }//GEN-LAST:event_btnangka1ActionPerformed

    private void btnangka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka2ActionPerformed
        // TODO add your handling code here:
        angka += "2";
display.setText(angka);
    }//GEN-LAST:event_btnangka2ActionPerformed

    private void btnangka3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka3ActionPerformed
        // TODO add your handling code here:
        angka += "3";
display.setText(angka);
    }//GEN-LAST:event_btnangka3ActionPerformed

    private void btnangka5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka5ActionPerformed
        // TODO add your handling code here:
        angka += "5";
display.setText(angka);
    }//GEN-LAST:event_btnangka5ActionPerformed

    private void btnangka6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka6ActionPerformed
        // TODO add your handling code here:
        angka += "6";
display.setText(angka);
    }//GEN-LAST:event_btnangka6ActionPerformed

    private void btnangka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka7ActionPerformed
        // TODO add your handling code here:
        angka += "7";
display.setText(angka);
    }//GEN-LAST:event_btnangka7ActionPerformed

    private void btnangka8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka8ActionPerformed
        // TODO add your handling code here:
        angka += "8";
display.setText(angka);
    }//GEN-LAST:event_btnangka8ActionPerformed

    private void btnangka9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka9ActionPerformed
        // TODO add your handling code here:
        angka += "9";
display.setText(angka);
    }//GEN-LAST:event_btnangka9ActionPerformed

    private void btnkomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkomaActionPerformed
        // TODO add your handling code here:
        angka += ".";
display.setText(angka);
    }//GEN-LAST:event_btnkomaActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        display.setText("");
angka1=0.0;
angka2=0.0;
jumlah=0.0;
angka="";
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbagiActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
display.setText("/");
angka="";
pilih=4;

    }//GEN-LAST:event_btnbagiActionPerformed

    private void btnsamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsamaActionPerformed
        // TODO add your handling code here:
         switch(pilih){
        case 1:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 + angka2;
            angka = Double.toString(jumlah);
            display.setText(angka);
            break;
        case 2:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 - angka2;
            angka = Double.toString(jumlah);
            display.setText(angka);
            break;
        case 3:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 * angka2;
            angka = Double.toString(jumlah);
            display.setText(angka);
            break;
        case 4:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 / angka2;
            angka = Double.toString(jumlah);
            display.setText(angka);
            break;
         case 5:
            angka2 = Double.parseDouble(angka);
            jumlah = Math.sqrt(angka1) ;
            angka = Double.toString(jumlah);
            display.setText(angka);
            break;
         default:
            break;
                    
} 

    }//GEN-LAST:event_btnsamaActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
         //  IF ... ELSE
        String tanya = "apakah anda yakin untuk keluar?";
        boolean yakin = JOptionPane.showConfirmDialog(rootPane, tanya)
                == JOptionPane.YES_OPTION;
        if (yakin){
            System.exit(0);
        }
        
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayActionPerformed

    private void akarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akarActionPerformed
        // TODO add your handling code here:
           angka1=Double.parseDouble(angka);
display.setText("√");
angka="";
pilih=5;
        
    }//GEN-LAST:event_akarActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton akar;
    private javax.swing.JButton btnangka0;
    private javax.swing.JButton btnangka1;
    private javax.swing.JButton btnangka2;
    private javax.swing.JButton btnangka3;
    private javax.swing.JButton btnangka4;
    private javax.swing.JButton btnangka5;
    private javax.swing.JButton btnangka6;
    private javax.swing.JButton btnangka7;
    private javax.swing.JButton btnangka8;
    private javax.swing.JButton btnangka9;
    private javax.swing.JButton btnbagi;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkali;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnkoma;
    private javax.swing.JButton btnkurang;
    private javax.swing.JButton btnsama;
    private javax.swing.JButton btntambah;
    private javax.swing.JTextField display;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
