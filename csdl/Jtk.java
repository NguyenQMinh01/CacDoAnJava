/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdl;

import java.awt.Color;
import java.awt.FocusTraversalPolicy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import csdl.hfku;

/**
 *
 * @author E7440
 */
public class Jtk extends javax.swing.JFrame {
    private String strTenDangNhap;
    private String strMatKhau;
    private String strTenNguoiDung;
    private boolean bKetQuaDangNhap;
    
    
    /**
     * Creates new form Jtk
     */
    public Jtk() {
        initComponents();
        this.setSize(650,580);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Tài Khoản");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(51, 60, 90, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Mật Khẩu");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(51, 130, 80, 40);

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Đăng Nhập");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(93, 210, 470, 50);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setText("Quên Mật Khẩu ?");
        jPanel1.add(jButton2);
        jButton2.setBounds(240, 300, 170, 40);

        jButton3.setBackground(new java.awt.Color(0, 255, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton3.setText("Đăng ký Tài Khoản");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(150, 380, 350, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ĐĂNG NHẬP");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 630, 40);

        jPasswordField1.setEchoChar((char)0);
        jPasswordField1.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField1.setText("Mật Khẩu");
        jPasswordField1.setToolTipText("");
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyReleased(evt);
            }
        });
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(200, 130, 270, 50);

        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2.setText("Tài Khoản");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField2InputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(200, 60, 270, 50);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 51));
        jButton4.setText("Thoát");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(250, 459, 130, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 630, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
        String strSever = "MMTNGUYENQUANGM\\SQLEXPRESS";
        String strDatabase ="DBVANPHONGPHAM";
        String strUser = "sa";
        String strPassword = "123";
               
        Connection conn = null;
        Statement sta = null;
        ResultSet rs = null;
        try{
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             String connectionURL ="jdbc:sqlserver://" + strSever 
                                +":1433;databaseName= " + strDatabase
                                +";user= "+ strUser +";password =" +strPassword;
             conn = DriverManager.getConnection(connectionURL);
             sta = conn.createStatement();
             String sql = "SELECT * FROM NguoiDung WHERE " 
                     + "TenDangNhap = '" + jTextField2.getText()+"' "
                     + "AND MatKhau = '" + jPasswordField1.getText()+ "'";
             rs = sta.executeQuery(sql);
             while (rs.next()) {
                 setStrTenDangNhap(rs.getString("TenDangNhap"));
                 setStrMatKhau(rs.getString("MatKhau"));
                 setStrTenNguoiDung(rs.getString("HoTen"));
                 setbKetQuaDangNhap(true);
            }
             conn.close();
              
             if (isbKetQuaDangNhap()){
                 jButton1.setEnabled(false);
                 new hfku().setVisible(true);
                 this.setVisible(false);
             }
             else
                 JOptionPane.showMessageDialog(this,"Tên Đăng Nhập Hoặc Mật Khẩu Không Đúng!");
                 return;
        }
        catch(Exception e){
            e.printStackTrace();
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
     
      
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
        String user = jTextField2.getText().trim().toLowerCase();
        
        if(user.equals("tài khoản")){
            
            jTextField2.setText("Tài Khoản");
            jTextField2.setForeground(new Color(153,153,153));
            jTextField2.requestFocusInWindow();
            
        }
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        // TODO add your handling code here:
         String user = jTextField2.getText().trim().toLowerCase();
         
         if(user.equals("tài khoản") || user.equals("")){
            
              jTextField2.setText("Tài Khoản");
            jTextField2.setForeground(new Color(153,153,153));
         }
    }//GEN-LAST:event_jTextField2FocusLost

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        // TODO add your handling code here:
         String userpass = String.valueOf(jPasswordField1.getPassword()).trim().toLowerCase();
         
         if(userpass.equals("mật khẩu")){
              jPasswordField1.setEchoChar((char)0);
              jPasswordField1.setText("Mật Khẩu");
              jPasswordField1.setForeground(new Color(153,153,153));
         }
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        // TODO add your handling code here:
         String userpass = String.valueOf(jPasswordField1.getPassword()).trim().toLowerCase();
         
         if(userpass.equals("mật khẩu")|| userpass.equals("")){
              jPasswordField1.setText("Mật Khẩu");
              jPasswordField1.setForeground(new Color(153,153,153));
         }
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField2InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField2InputMethodTextChanged
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTextField2InputMethodTextChanged

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
        
        if(jTextField2.getText().equals("Tài Khoản"))
             jTextField2.setText("");
       jTextField2.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
        if(jTextField2.getText().equals(""))
        {
            jTextField2.setText("Tài Khoản");
            jTextField2.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        // TODO add your handling code here:
        String str = String.valueOf(jPasswordField1.getPassword()) ;
         if(str.equals("Mật Khẩu") )
         { jPasswordField1.setEchoChar('*');
             jPasswordField1.setText("");
      jPasswordField1.setForeground(Color.BLACK);
         }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jPasswordField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyReleased
        // TODO add your handling code here:
        String str = String.valueOf(jPasswordField1.getPassword()) ;
         if(str.equals(""))
        {
            jPasswordField1.setEchoChar((char)0);
            jPasswordField1.setText("Mật Khẩu");
            jPasswordField1.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jPasswordField1KeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Jdk dk = new Jdk(this, true);
        dk.setVisible(true);
        this.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Jtk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jtk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jtk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jtk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jtk().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the strTenDangNhap
     */
    public String getStrTenDangNhap() {
        return strTenDangNhap;
    }

    /**
     * @param strTenDangNhap the strTenDangNhap to set
     */
    public void setStrTenDangNhap(String strTenDangNhap) {
        this.strTenDangNhap = strTenDangNhap;
    }

    /**
     * @return the strMatKhau
     */
    public String getStrMatKhau() {
        return strMatKhau;
    }

    /**
     * @param strMatKhau the strMatKhau to set
     */
    public void setStrMatKhau(String strMatKhau) {
        this.strMatKhau = strMatKhau;
    }

    /**
     * @return the strTenNguoiDung
     */
    public String getStrTenNguoiDung() {
        return strTenNguoiDung;
    }

    /**
     * @param strTenNguoiDung the strTenNguoiDung to set
     */
    public void setStrTenNguoiDung(String strTenNguoiDung) {
        this.strTenNguoiDung = strTenNguoiDung;
    }

    /**
     * @return the bKetQuaDangNhap
     */
    public boolean isbKetQuaDangNhap() {
        return bKetQuaDangNhap;
    }

    /**
     * @param bKetQuaDangNhap the bKetQuaDangNhap to set
     */
    public void setbKetQuaDangNhap(boolean bKetQuaDangNhap) {
        this.bKetQuaDangNhap = bKetQuaDangNhap;
    }
}