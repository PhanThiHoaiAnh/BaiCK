/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ThucPham;

/**
 *
 * @author HoaiAnh
 */
public class QuanLy extends javax.swing.JFrame {

    /**
     * Creates new form QuanLy
     */
    public QuanLy() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btrau = new javax.swing.JButton();
        btTS = new javax.swing.JButton();
        btDL = new javax.swing.JButton();
        bthop = new javax.swing.JButton();
        btkieng = new javax.swing.JButton();
        btkho = new javax.swing.JButton();
        btsan = new javax.swing.JButton();
        bthat = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Anh_221\\LTJVNC\\icon\\tp.jpg")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("THỰC PHẨM TƯƠI SẠCH");

        btrau.setBackground(new java.awt.Color(204, 255, 204));
        btrau.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btrau.setForeground(new java.awt.Color(0, 102, 51));
        btrau.setText("Rau củ quả");
        btrau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrauActionPerformed(evt);
            }
        });

        btTS.setBackground(new java.awt.Color(204, 255, 204));
        btTS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btTS.setForeground(new java.awt.Color(0, 102, 51));
        btTS.setText("Thực phẩm tươi sống");
        btTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTSActionPerformed(evt);
            }
        });

        btDL.setBackground(new java.awt.Color(204, 255, 204));
        btDL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btDL.setForeground(new java.awt.Color(0, 102, 51));
        btDL.setText("Thực phẩm đông lạnh");
        btDL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDLActionPerformed(evt);
            }
        });

        bthop.setBackground(new java.awt.Color(204, 255, 204));
        bthop.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bthop.setForeground(new java.awt.Color(0, 102, 51));
        bthop.setText("Thực phẩm đóng hộp");
        bthop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthopActionPerformed(evt);
            }
        });

        btkieng.setBackground(new java.awt.Color(204, 255, 204));
        btkieng.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btkieng.setForeground(new java.awt.Color(0, 102, 51));
        btkieng.setText("Thực phẩm ăn kiêng");
        btkieng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkiengActionPerformed(evt);
            }
        });

        btkho.setBackground(new java.awt.Color(204, 255, 204));
        btkho.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btkho.setForeground(new java.awt.Color(0, 102, 51));
        btkho.setText("Thực phẩm khô");
        btkho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkhoActionPerformed(evt);
            }
        });

        btsan.setBackground(new java.awt.Color(204, 255, 204));
        btsan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btsan.setForeground(new java.awt.Color(0, 102, 51));
        btsan.setText("Thực phẩm chế biến sẵn");
        btsan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsanActionPerformed(evt);
            }
        });

        bthat.setBackground(new java.awt.Color(204, 255, 204));
        bthat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bthat.setForeground(new java.awt.Color(0, 102, 51));
        bthat.setText("Hạt, trứng, sữa");
        bthat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthatActionPerformed(evt);
            }
        });

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setText("Hệ thống");

        jMenuItem1.setIcon(new javax.swing.ImageIcon("D:\\Anh_221\\LTJVNC\\icon\\signup.png")); // NOI18N
        jMenuItem1.setText("Đăng ký");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon("D:\\Anh_221\\LTJVNC\\icon\\dxuat.jpg")); // NOI18N
        jMenuItem2.setText("Đăng xuất");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setText("Tùy chọn");

        jMenuItem3.setIcon(new javax.swing.ImageIcon("D:\\Anh_221\\LTJVNC\\icon\\trogiup.jpg")); // NOI18N
        jMenuItem3.setText("Trợ giúp");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon("D:\\Anh_221\\LTJVNC\\icon\\thu.png")); // NOI18N
        jMenuItem4.setText("Phản hồi");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(92, 92, 92))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btTS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btrau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btDL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btsan, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btkho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bthop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btkieng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bthat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btrau, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bthop, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTS, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btkho, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDL, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btkieng, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsan, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bthat, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btsanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsanActionPerformed
        QuanLyThucPham qt = new QuanLyThucPham();
        qt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btsanActionPerformed

    private void bthatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthatActionPerformed
        QuanLyThucPham qt = new QuanLyThucPham();
        qt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bthatActionPerformed

    private void btrauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrauActionPerformed
        QuanLyThucPham qt = new QuanLyThucPham();
        qt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btrauActionPerformed

    private void btTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTSActionPerformed
        QuanLyThucPham qt = new QuanLyThucPham();
        qt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btTSActionPerformed

    private void btDLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDLActionPerformed
        QuanLyThucPham qt = new QuanLyThucPham();
        qt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btDLActionPerformed

    private void bthopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthopActionPerformed
        QuanLyThucPham qt = new QuanLyThucPham();
        qt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bthopActionPerformed

    private void btkhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkhoActionPerformed
        QuanLyThucPham qt = new QuanLyThucPham();
        qt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btkhoActionPerformed

    private void btkiengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkiengActionPerformed
        QuanLyThucPham qt = new QuanLyThucPham();
        qt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btkiengActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        SignUp sg = new SignUp();
        sg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        LogIn lg = new LogIn();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDL;
    private javax.swing.JButton btTS;
    private javax.swing.JButton bthat;
    private javax.swing.JButton bthop;
    private javax.swing.JButton btkho;
    private javax.swing.JButton btkieng;
    private javax.swing.JButton btrau;
    private javax.swing.JButton btsan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}