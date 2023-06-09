/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.oop2.hmsproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author samsung
 */
public class CheckInPage extends javax.swing.JFrame {

    /**
     * Creates new form CheckInPage
     */
    public CheckInPage() {
        initComponents();
        setTitle("CheckIn Page");
         try (FileReader r = new FileReader("Reservation.txt")) {
            BufferedReader reader = new BufferedReader(r);
            String ar = null;
            String[] Arr;

            while ((ar = reader.readLine()) != null) {
                Arr = ar.split("/");
                jComboBox1.addItem("" + Arr[9]);

            }
            r.close();
        } catch (Exception e) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Checkin_time = new javax.swing.JTextField();
        Checkin_Inputbut = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        PayType_Combo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Checkin_request = new javax.swing.JTextField();
        dispose_Button = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("체크인");

        jLabel2.setText("고객 요청");

        Checkin_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Checkin_timeActionPerformed(evt);
            }
        });

        Checkin_Inputbut.setText("입력");
        Checkin_Inputbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Checkin_InputbutActionPerformed(evt);
            }
        });

        jLabel3.setText("결제유형");

        PayType_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "신용카드", "현금", "계좌이체" }));
        PayType_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayType_ComboActionPerformed(evt);
            }
        });

        jLabel4.setText("객실");

        jLabel5.setText("입실 시간");

        dispose_Button.setText("뒤로가기");
        dispose_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose_ButtonActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RoomNumber" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dispose_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PayType_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 148, Short.MAX_VALUE)
                            .addComponent(Checkin_request, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Checkin_time))
                        .addGap(18, 18, 18)
                        .addComponent(Checkin_Inputbut, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PayType_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(dispose_Button)))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(Checkin_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Checkin_Inputbut)))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Checkin_request, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(56, 56, 56)))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void PayType_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayType_ComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PayType_ComboActionPerformed

    private void dispose_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispose_ButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_dispose_ButtonActionPerformed

    private void Checkin_InputbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Checkin_InputbutActionPerformed
        // TODO add your handling code here:
        String str123 = Checkin_time.getText(); //입실시간
        String str1234 = Checkin_request.getText(); //고객리뷰
        String str12345 = PayType_Combo.getSelectedItem().toString(); //결제유형값 가져오기
        String str4 = jComboBox1.getSelectedItem().toString();

        int n = Integer.parseInt(str123);
        
        if (n >= 18) {
            //Integer.toString(n);
            Checkin_time.setText("예약이 취소되었습니다.");
        }
        if (n < 18) {
            File file = new File("mustpay.txt");
            FileWriter write = null;
            String l = "/";
            String p = "필수결제";
            String J = "\n";
            try {
                // 기존 파일의 내용에 이어서 쓰려면 true, 기존 내용을 없애고 새로 쓰려면 false
                write = new FileWriter(file, true);
               write.write(jComboBox1.getSelectedItem().toString());
                write.write(l);
                write.write(p);
                write.write("\n");
                write.flush();// 출력은 버퍼에 쌓여있기에 쌓인 버퍼를 목적지로 보내줌
            } catch (IOException ex) {
                System.out.printf("오류가 발생하였습니다", ex);
            }
            
            File file1 = new File("test.txt");
            FileWriter writer = null;
            String s = "/";
            //String J = "\n";

            try {
                // 기존 파일의 내용에 이어서 쓰려면 true, 기존 내용을 없애고 새로 쓰려면 false
                writer = new FileWriter(file1, true);
            //    writer.write(str12);
             //   writer.write(s);
                 writer.write(str4);//객실번호
                writer.write(s);
                writer.write(str123);//입실시간
                writer.write(s);
                writer.write(str12345);//결제유형값
                writer.write(s);
                writer.write(str1234);//고객리뷰
                writer.write(J);
               JOptionPane.showMessageDialog(null, "체크인이 완료되었습니다.");
                writer.flush();// 출력은 버퍼에 쌓여있기에 쌓인 버퍼를 목적지로 보내줌
            } catch (IOException ex) {
                System.out.printf("오류가 발생하였습니다", ex);
            }
        }


    }//GEN-LAST:event_Checkin_InputbutActionPerformed

    private void Checkin_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Checkin_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Checkin_timeActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(CheckInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckInPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Checkin_Inputbut;
    private javax.swing.JTextField Checkin_request;
    private javax.swing.JTextField Checkin_time;
    private javax.swing.JComboBox<String> PayType_Combo;
    private javax.swing.JButton dispose_Button;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
