/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.oop2.hmsproject.Service.RoomService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import cse.oop2.hmsproject.Service.RoomService.RoomservicePage;
/**
 *
 * @author USER
 */
public class RoomserviceEditPage extends javax.swing.JFrame {

    /**
     * Creates new form OrderEditPage
     */
    public RoomserviceEditPage() {
        initComponents();
        setTitle("OrderEditPage");
        
          try (FileReader r = new FileReader("RoomService.txt")) {
            BufferedReader reader = new BufferedReader(r);
            String ar = null;
            String[] Arr;

            while ((ar = reader.readLine()) != null) {
                Arr = ar.split("/");
                jComboBox1.addItem("" + Arr[0] );
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

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        roomservicesearch = new javax.swing.JButton();
        roomserviceEdit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RSfood = new javax.swing.JComboBox<>();
        RS_Beer = new javax.swing.JComboBox<>();
        RSdesert = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        serviceuser1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        serviceroomnum1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("룸서비스 주문 수정");

        jButton1.setText("뒤로가기");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        roomservicesearch.setText("룸서비스 검색");
        roomservicesearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomservicesearchActionPerformed(evt);
            }
        });

        roomserviceEdit.setText("주문수정");
        roomserviceEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomserviceEditActionPerformed(evt);
            }
        });

        jLabel2.setText("음식 :");

        jLabel3.setText("주류 :");

        jLabel4.setText("디저트 :");

        RSfood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food", "한식(불고기)/7000", "중식(짜장면)/8000", "양식(파스타)/8000", "일식(라멘,스시)/10000", "선택안함/0" }));
        RSfood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSfoodActionPerformed(evt);
            }
        });

        RS_Beer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverage", "맥주/4500", "생맥주/5000", "칵테일/8000", "막걸리/4500", "보드카/10000", "선택안함/0" }));

        RSdesert.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dessert", "케이크/4500", "마카롱/2000", "샌드위치/3000", "아이스크림/2000", "선택안함/0" }));

        jLabel5.setText("서비스 주문자 :");

        serviceuser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceuser1ActionPerformed(evt);
            }
        });

        jLabel6.setText("서비스 이용 객실 :");

        serviceroomnum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceroomnum1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serviceroomnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(serviceuser1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RSfood, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RS_Beer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RSdesert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(roomserviceEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 79, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(roomservicesearch)
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roomservicesearch)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(RSfood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(serviceuser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(RS_Beer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(RSdesert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(serviceroomnum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45)
                .addComponent(roomserviceEdit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roomservicesearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomservicesearchActionPerformed
        // TODO add your handling code here:

         String str1 = jComboBox1.getSelectedItem().toString();
      
         try {
            String s;//배열을 읽을 문자열
            String[] array;//배열
            BufferedReader bo = new BufferedReader(new FileReader("RoomService.txt"));
            while ((s = bo.readLine()) != null) {
                array = s.split("/");
                if (str1.equals(array[0]) ) {
                    serviceuser1.setText("" + array[0]);
                    serviceroomnum1.setText("" + array[1]);
                    RSfood.setSelectedItem("" + array[2]+"/"+array[3]);
                    RS_Beer.setSelectedItem(""+array[4]+"/"+array[5]);
                    RSdesert.setSelectedItem(""+array[6]+"/"+array[7]);
                }
            }
            bo.close();
        } catch (IOException E10) {
            E10.printStackTrace();
        }
    }//GEN-LAST:event_roomservicesearchActionPerformed

    private void serviceuser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceuser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serviceuser1ActionPerformed

    private void serviceroomnum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceroomnum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serviceroomnum1ActionPerformed

    private void roomserviceEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomserviceEditActionPerformed
        // TODO add your handling code here:
        String name = serviceuser1.getText();//예약자
        String num = serviceroomnum1.getText();
        String food = RSfood.getSelectedItem().toString();
        String beer = RS_Beer.getSelectedItem().toString();
        String desert = RSdesert.getSelectedItem().toString();
        int foodmo = 0;
        int beermo=0;
        int desertmo=0;
        //temporary array to hole the data that is read from file
        ArrayList<String> tempArray = new ArrayList<>();

        try {
            try (FileReader fr = new FileReader("RoomService.txt")) {
                Scanner reader = new Scanner(fr);
                String line = null;
                String[] lineArr;
                if (RSfood.getSelectedItem().equals("한식(불고기)/7000")) {
                         foodmo = 7000;
                    }
                    if (RSfood.getSelectedItem().equals("중식(짜장면)/8000")) {
                        foodmo = 8000;
                    }
                    if (RSfood.getSelectedItem().equals("양식(파스타)/8000")) {
                       foodmo = 8000;
                    }
                    if (RSfood.getSelectedItem().equals("일식(라멘,스시)/10000")) {
                         foodmo = 10000;
                    }
                    if (RSfood.getSelectedItem().equals("선택안함/0")) {
                         foodmo = 0;
                    }
                    if (RS_Beer.getSelectedItem().equals("맥주/4500")) {
                         beermo = 4500;
                    }
                    if (RS_Beer.getSelectedItem().equals("생맥주/5000")) {
                        beermo = 5000;
                    }
                    if (RS_Beer.getSelectedItem().equals("칵테일/8000")) {
                         beermo = 4500;
                    }
                    if (RS_Beer.getSelectedItem().equals("막걸리/4500")) {
                         beermo = 4500;
                    }
                    if (RS_Beer.getSelectedItem().equals("보드카/10000")) {
                        beermo = 10000;
                    }
                    if (RS_Beer.getSelectedItem().equals("선택안함/0")) {
                        beermo = 0;
                    }
                     if ( RSdesert.getSelectedItem().equals("케이크/4500")) {
                        desertmo = 4500;
                    }
                     if ( RSdesert.getSelectedItem().equals("마카롱/2000")) {
                         desertmo = 2000;
                    }
                     if ( RSdesert.getSelectedItem().equals("샌드위치/3000")) {
                         desertmo = 3000;
                    }
                     if ( RSdesert.getSelectedItem().equals("아이스크림/2000")) {
                        desertmo = 2000;
                    }
                      if ( RSdesert.getSelectedItem().equals("선택안함/0")) {
                        desertmo = 0;
                    }
                     int all = foodmo+beermo+desertmo;//룸서비스 총 비용
                     String allmo = Integer.toString(all);
         
         
                while ((line = reader.nextLine()) != null) {
                    lineArr = line.split("/");
                    if (lineArr[0].equals(name)) {
                        tempArray.add(
                                 lineArr[0]+"/"
                                + lineArr[1]+"/"
                                + food+"/"
                                + beer+"/"
                                + desert+"/"
                                  + allmo);
                        JOptionPane.showMessageDialog(null, "주문이 수정되었습니다.");
                    } else {
                        tempArray.add(line);
                    }
                }
                
                fr.close();
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
        
        try {
            try (PrintWriter pr = new PrintWriter("RoomService.txt")) {
                for (String str : tempArray) {
                    pr.println(str);
                }
                pr.close();
            } catch (Exception e) {
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_roomserviceEditActionPerformed

    private void RSfoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSfoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RSfoodActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     dispose();   
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RoomserviceEditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomserviceEditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomserviceEditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomserviceEditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomserviceEditPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> RS_Beer;
    private javax.swing.JComboBox<String> RSdesert;
    private javax.swing.JComboBox<String> RSfood;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton roomserviceEdit;
    private javax.swing.JButton roomservicesearch;
    private javax.swing.JTextField serviceroomnum1;
    private javax.swing.JTextField serviceuser1;
    // End of variables declaration//GEN-END:variables
}
