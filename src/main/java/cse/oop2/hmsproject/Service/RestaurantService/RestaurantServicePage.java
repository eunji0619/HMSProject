/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.oop2.hmsproject.Service.RestaurantService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class RestaurantServicePage extends javax.swing.JFrame {

    /**
     * Creates new form RestaurantServicePage
     */
    public RestaurantServicePage() {
        initComponents();
        setTitle("RestaurantServicePage");
         try (FileReader r = new FileReader("Reservation.txt")) {
            BufferedReader reader = new BufferedReader(r);
            String ar = null;
            String[] Arr;

            while ((ar = reader.readLine()) != null) {
                Arr = ar.split("/");
                jComboBox3.addItem("" + Arr[0]);
            }
            r.close();
        } catch (Exception e) {
        }
    }

    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        resFood1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        resBeverage1 = new javax.swing.JComboBox<>();
        resDessert1 = new javax.swing.JComboBox<>();
        use = new javax.swing.JButton();
        useEdit = new javax.swing.JButton();
        useCancel = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        resCustomer1 = new javax.swing.JTextField();
        resRoom1 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("레스토랑");

        jLabel2.setText("레스토랑 이용자 :");

        jLabel3.setText("레스토랑 이용자 객실 :");

        jButton1.setText("뒤로가기");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("주류 :");

        resFood1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food", "파스타/8000", "스테이크/12000", "덮밥/7000", "볶음밥/6000", "선택안함/0" }));

        jLabel5.setText("음식 :");

        jLabel6.setText("디저트 :");

        resBeverage1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverage", "물/500", "쥬스/1000", "맥주/4500", "샴페인/7000", "선택안함/0" }));

        resDessert1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dessert", "티라미슈/4500", "아이스크림/2000", "푸딩/3500", "과일/5000", "선택안함/0" }));

        use.setText("이용하기");
        use.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useActionPerformed(evt);
            }
        });

        useEdit.setText("이용수정하기");
        useEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useEditActionPerformed(evt);
            }
        });

        useCancel.setText("이용취소하기");
        useCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useCancelActionPerformed(evt);
            }
        });

        jButton2.setText("검색하기");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        resCustomer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resCustomer1ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(resCustomer1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 137, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resDessert1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resBeverage1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resFood1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addComponent(use, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(useCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(useEdit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(resFood1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(resBeverage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(use)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(resCustomer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(resRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(resDessert1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(useCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(useEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
boolean check2=true;
    private void useActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useActionPerformed
        // TODO add your handling code here:
        
        File fe = new File("RestaurantService.txt");
        
        String customer= resCustomer1.getText();
        String room = resRoom1.getText();
        String food = resFood1.getSelectedItem().toString();
        String beverage = resBeverage1.getSelectedItem().toString();
        String dessert = resDessert1.getSelectedItem().toString();
        

        int foodmoney = 0;//레스토랑 서비스 음식값
        int beermoney = 0;//레스토랑 서비스 주류값
        int desertmoney = 0;//레스토랑 서비스 디저트값

        ArrayList<String> tempArray = new ArrayList<>();
       
        try  {
            try(FileReader fr = new FileReader("Reservation.txt")){
            Scanner reader = new Scanner(fr);
            String line = null;
            String[] lineArr;

            while ((line = reader.nextLine()) != null) {
                lineArr = line.split("/");
                if (resFood1.getSelectedItem().equals("파스타/8000")) {
                    foodmoney = 8000;
                }
                if (resFood1.getSelectedItem().equals("스테이크/12000")) {
                    foodmoney = 12000;
                }
                if (resFood1.getSelectedItem().equals("덮밥/7000")) {
                    foodmoney = 7000;
                }
                if (resFood1.getSelectedItem().equals("볶음밥/6000")) {
                    foodmoney = 6000;
                }
                if (resFood1.getSelectedItem().equals("선택안함/0")) {
                    foodmoney = 0;
                }
                if (resBeverage1.getSelectedItem().equals("물/500")) {
                    beermoney = 500;
                }
                if (resBeverage1.getSelectedItem().equals("쥬스/1000")) {
                    beermoney = 1000;
                }
                if (resBeverage1.getSelectedItem().equals("맥주/4500")) {
                    beermoney = 4500;
                }
                if (resBeverage1.getSelectedItem().equals("샴페인/7000")) {
                    beermoney = 7000;
                }
                if (resBeverage1.getSelectedItem().equals("선택안함/0")) {
                    beermoney = 0;
                }
                if (resDessert1.getSelectedItem().equals("티라미슈/4500")) {
                    desertmoney = 4500;
                }
                if (resDessert1.getSelectedItem().equals("아이스크림/2000")) {
                    desertmoney = 2000;
                }
                if (resDessert1.getSelectedItem().equals("푸딩/3500")) {
                    desertmoney = 3500;
                }
                if (resDessert1.getSelectedItem().equals("과일/5000")) {
                    desertmoney = 5000;
                }
                if (resDessert1.getSelectedItem().equals("선택안함/0")) {
                    desertmoney = 0;
                }
                else {
                    tempArray.add(line);
                }
            }
            fr.close();
        } catch (Exception e) {
        }

        int allmoney = foodmoney + beermoney + desertmoney;//레스토랑서비스 총 비용
        String to = Integer.toString(allmoney);


        try {
            File fi = new File("Reservation.txt");
            FileReader fr;
            fr = new FileReader(fi);
            BufferedReader reader = new BufferedReader(fr);
            String line = null;
            String[] arr;
            while ((line = reader.readLine()) != null) {
                arr = line.split("/");
                if(arr[9].equals(room)){
                   check2=true;
                   break;
                }
            }
            if (check2 == true) {
                JOptionPane.showMessageDialog(null, "레스토랑 예약이 접수되었습니다!");
                FileWriter writerf;
                String s = "/";
                
                writerf = new FileWriter(fe, true);
                writerf.write(customer);
                writerf.write(s);
                writerf.write(room);
                writerf.write(s);
                writerf.write(food);
                writerf.write(s);
                writerf.write(beverage);
                writerf.write(s);
                writerf.write(dessert);
                writerf.write(s);
                writerf.write(to);
                writerf.write("\n");
                writerf.flush();// 출력은 버퍼에 쌓여있기에 쌓인 버퍼를 목적지로 보내줌
                writerf.close();
            }

        } catch (IOException e) {
            System.out.println("오류발생");
        }
    } catch (Exception e) {
    }
        
    }//GEN-LAST:event_useActionPerformed

    private void useEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useEditActionPerformed
        // TODO add your handling code here:
        RestaurantEditPage restauranteditpage = new RestaurantEditPage();
        restauranteditpage.setVisible(true);
    }//GEN-LAST:event_useEditActionPerformed

    private void useCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useCancelActionPerformed
        // TODO add your handling code here:
        RestaurantCancelPage restaurantcancelpage = new RestaurantCancelPage();
        restaurantcancelpage.setVisible(true);
    }//GEN-LAST:event_useCancelActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      String str = jComboBox3.getSelectedItem().toString();
        try {
            String s;
            String[] array;
            BufferedReader bo = new BufferedReader(new FileReader("Reservation.txt"));
            while ((s = bo.readLine()) != null) {
                array = s.split("/");
                if (str.equals(array[0])) {
                    resCustomer1.setText("" + array[0]);
                    resRoom1.setText("" + array[9]);
                }
            }
            bo.close();
        } catch (IOException E10) {
            E10.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void resCustomer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resCustomer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resCustomer1ActionPerformed

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
            java.util.logging.Logger.getLogger(RestaurantServicePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurantServicePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurantServicePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurantServicePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurantServicePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox3;
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
    private javax.swing.JButton use;
    private javax.swing.JButton useCancel;
    private javax.swing.JButton useEdit;
    // End of variables declaration//GEN-END:variables
}
