/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.oop2.hmsproject.Service.RestaurantService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class RestaurantEditPage extends javax.swing.JFrame {

    /**
     * Creates new form RestaurantEditPage
     */
    public RestaurantEditPage() {
        initComponents();
        try (FileReader r = new FileReader("RestaurantService.txt")) {
            BufferedReader reader = new BufferedReader(r);
            String ar = null;
            String[] Arr;

            while ((ar = reader.readLine()) != null) {
                Arr = ar.split("/");
                jComboBox1.addItem("" + Arr[0]);
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        resCustomer1 = new javax.swing.JTextField();
        resRoom1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        resFood1 = new javax.swing.JComboBox<>();
        resBeverage1 = new javax.swing.JComboBox<>();
        resDessert1 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("레스토랑 이용 수정");

        jButton1.setText("뒤로가기");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("검색하기");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("주문수정");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("레스토랑 이용자 :");

        jLabel3.setText("레슽랑 이용자 객실 :");

        jLabel4.setText("음식 :");

        jLabel5.setText("주류 :");

        jLabel6.setText("디저트 :");

        resFood1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food", "파스타/8000", "스테이크/12000", "덮밥/7000", "볶음밥/6000", "선택안함/0" }));

        resBeverage1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverage", "물/500", "쥬스/1000", "맥주/4500", "샴페인/7000", "선택안함/0" }));

        resDessert1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dessert", "티라미슈/4500", "아이스크림/2000", "푸딩/3500", "과일/5000", "선택안함/0" }));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(resRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(resCustomer1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 133, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(resDessert1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(resBeverage1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(resFood1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resFood1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resBeverage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resDessert1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(resCustomer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(resRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(96, 96, 96)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String str1 = jComboBox1.getSelectedItem().toString();
        String name = resCustomer1.getText();//예약자
        String room = resRoom1.getText();
        String food = resFood1.getSelectedItem().toString();
        String beverage = resBeverage1.getSelectedItem().toString();
        String dessert = resDessert1.getSelectedItem().toString();

        int foodmo = 0;
        int beermo = 0;
        int desertmo = 0;
        //temporary array to hole the data that is read from file
        ArrayList<String> tempArray = new ArrayList<>();

        try {
            try (FileReader fr = new FileReader("RestaurantService.txt")) {
                Scanner reader = new Scanner(fr);
                String line = null;
                String[] lineArr;

                if (resFood1.getSelectedItem().equals("파스타/8000")) {
                    foodmo = 8000;
                }
                if (resFood1.getSelectedItem().equals("스테이크/12000")) {
                    foodmo = 12000;
                }
                if (resFood1.getSelectedItem().equals("덮밥/7000")) {
                    foodmo = 7000;
                }
                if (resFood1.getSelectedItem().equals("볶음밥/6000")) {
                    foodmo = 6000;
                }
                if (resFood1.getSelectedItem().equals("선택안함/0")) {
                    foodmo = 0;
                }
                if (resBeverage1.getSelectedItem().equals("물/500")) {
                    beermo = 500;
                }
                if (resBeverage1.getSelectedItem().equals("쥬스/1000")) {
                    beermo = 1000;
                }
                if (resBeverage1.getSelectedItem().equals("맥주/4500")) {
                    beermo = 4500;
                }
                if (resBeverage1.getSelectedItem().equals("샴페인/7000")) {
                    beermo = 7000;
                }
                if (resDessert1.getSelectedItem().equals("티라미슈/4500")) {
                    beermo = 4500;
                }
                if (resDessert1.getSelectedItem().equals("선택안함/0")) {
                    beermo = 0;
                }
                if (resDessert1.getSelectedItem().equals("아이스크림/2000")) {
                    desertmo = 2000;
                }
                if (resDessert1.getSelectedItem().equals("푸딩/3500")) {
                    desertmo = 3500;
                }
                if (resDessert1.getSelectedItem().equals("과일/5000")) {
                    desertmo = 5000;
                }
                if (resDessert1.getSelectedItem().equals("선택안함/0")) {
                    desertmo = 0;
                }
                int all = foodmo + beermo + desertmo;//룸서비스 총 비용
                String allmo = Integer.toString(all);

                while ((line = reader.nextLine()) != null) {
                    lineArr = line.split("/");
                    if (lineArr[0].equals(name)) {
                        tempArray.add(
                                lineArr[0] + "/"
                                + lineArr[1] + "/"
                                + food + "/"
                                + beverage + "/"
                                + dessert + "/"
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

        try (PrintWriter pr = new PrintWriter("RestaurantService.txt")) {
            for (String str : tempArray) {
                pr.println(str);
            }
            pr.close();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String str = jComboBox1.getSelectedItem().toString();;
        try {
            String s;
            String[] array;
            BufferedReader bo = new BufferedReader(new FileReader("RestaurantService.txt"));
            while ((s = bo.readLine()) != null) {
                array = s.split("/");
                if (str.equals(array[0])) {
                    resCustomer1.setText("" + array[0]);
                    resRoom1.setText("" + array[1]);
                    resFood1.setSelectedItem("" + array[2] + "/" + array[3]);
                    resBeverage1.setSelectedItem("" + array[4] + "/" + array[5]);
                    resDessert1.setSelectedItem("" + array[4] + "/" + array[7]);
                }
            }
            bo.close();
        } catch (IOException E10) {
            E10.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(RestaurantEditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurantEditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurantEditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurantEditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurantEditPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> resBeverage1;
    private javax.swing.JTextField resCustomer1;
    private javax.swing.JComboBox<String> resDessert1;
    private javax.swing.JComboBox<String> resFood1;
    private javax.swing.JTextField resRoom1;
    // End of variables declaration//GEN-END:variables
}