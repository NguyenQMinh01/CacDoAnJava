/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testkiemtra;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import java.util.*;

/**
 *
 * @author E7440
 */
public class MobiePhone extends javax.swing.JFrame {
  
    private SimpleDateFormat s = new SimpleDateFormat("hh:mm a");
    private final int WIDTH = 380;
    private final int HEIGHT = 380;
    private int oldY;
    /**
     * Creates new form MobiePhone
     */
    public MobiePhone() {
        setUndecorated(true);
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        Body.setBackground(new Color(0, 0, 0, 0));
        this.setLocationRelativeTo(null);
        time.setText(s.format(new Date()));
        Volume.setVisible(false);
        Drawer.setSize(WIDTH,0);
        
        jPanel4.add(new App("/appIconImage/appdt1.png", "caculator"));
        jPanel4.add(new App("/appIconImage/appdt2.png", "Cài Đặt"));
        jPanel4.add(new App("/appIconImage/appdt3.PNG", "Notes"));
        jPanel4.add(new App("/appIconImage/appdt4.PNG", "Chrome"));
        jPanel4.add(new App("/appIconImage/appdt5.PNG", "Maps"));
        jPanel4.add(new App("/appIconImage/appdt6.PNG", "App Store"));
        jPanel4.add(new App("/appIconImage/appdt8.PNG", "Phone"));
        jPanel4.add(new App("/appIconImage/appdt9.PNG", "Mesages"));
        jPanel4.add(new App("/appIconImage/appdt10.PNG", "Camera"));
        jPanel4.add(new App("/appIconImage/appdt11.PNG", "Zing Mp3"));
        jPanel4.add(new App("/appIconImage/appdt12.PNG", "Ảnh"));
        jPanel4.add(new App("/appIconImage/appdt13.PNG", "Facebook"));
        jPanel4.add(new App("/appIconImage/appdt14.PNG", "Instargram\t"));
        jPanel4.add(new App("/appIconImage/appdt15.PNG", "Tin Nhắn"));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Body = new javax.swing.JPanel();
        Drawer = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Volume = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        VolumeUp = new javax.swing.JLabel();
        VolumeDown = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Body.setOpaque(false);
        Body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Drawer.setBackground(new java.awt.Color(51, 51, 255));
        Drawer.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                DrawerMouseDragged(evt);
            }
        });
        Drawer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DrawerMousePressed(evt);
            }
        });

        javax.swing.GroupLayout DrawerLayout = new javax.swing.GroupLayout(Drawer);
        Drawer.setLayout(DrawerLayout);
        DrawerLayout.setHorizontalGroup(
            DrawerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        DrawerLayout.setVerticalGroup(
            DrawerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
        );

        Body.add(Drawer, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 380, 0));

        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        Body.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 30, 40));

        Volume.setBackground(new java.awt.Color(255, 255, 255));
        Volume.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Media");
        Volume.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 7, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appIconImage/sound.PNG"))); // NOI18N
        Volume.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 40, 50));

        jSlider1.setOpaque(false);
        Volume.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 240, -1));

        Body.add(Volume, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 340, 90));

        VolumeUp.setBackground(new java.awt.Color(255, 255, 255));
        VolumeUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VolumeUpMousePressed(evt);
            }
        });
        Body.add(VolumeUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 40, 50));

        VolumeDown.setBackground(new java.awt.Color(255, 255, 255));
        VolumeDown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VolumeDownMousePressed(evt);
            }
        });
        Body.add(VolumeDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 40, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testkiemtra/pindt2.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("100%");

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testkiemtra/wifi1.png"))); // NOI18N

        time.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("images.jpg")).getImage().getScaledInstance(400, 750, Image.SCALE_SMOOTH)));
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(6, 5, 0, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Body.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 380, 750));

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testkiemtra/478-4787073_iphone-mobile-frame-png-transparent-png.png"))); // NOI18N
        Body.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 900));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolumeUpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolumeUpMousePressed
        // TODO add your handling code here:
        Timer time = new Timer();
        if(!Volume.isVisible()){
            Volume.setVisible(true);
            time.schedule(new TimerTask() {
                @Override
                public void run() {
                    Volume.setVisible(false);
                    jSlider1.setValue(jSlider1.getValue()+10);
                }
            }, 2000);
        }else{
            jSlider1.setValue(jSlider1.getValue()+10);
        }
        
        
    }//GEN-LAST:event_VolumeUpMousePressed

    private void VolumeDownMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolumeDownMousePressed
        // TODO add your handling code here:
        Timer time = new Timer();
        if(!Volume.isVisible()){
            Volume.setVisible(true);
            time.schedule(new TimerTask() {
                @Override
                public void run() {
                    Volume.setVisible(false);
                    jSlider1.setValue(jSlider1.getValue()-10);
                }
            }, 2000);
        }else{
            jSlider1.setValue(jSlider1.getValue()-10);
        }
    }//GEN-LAST:event_VolumeDownMousePressed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
       System.exit(0);
        
    }//GEN-LAST:event_jLabel8MousePressed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        oldY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
        oldY = evt.getY();
    }//GEN-LAST:event_jLabel2MousePressed

    private void DrawerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DrawerMousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_DrawerMousePressed

    private void DrawerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DrawerMouseDragged

            
    }//GEN-LAST:event_DrawerMouseDragged

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
         if(oldY < evt.getY() && Drawer.getSize().height < HEIGHT){
            oldY = evt.getY();
            Drawer.setSize(WIDTH, getSize().height + 1);
            
            }
         else if(oldY > evt.getY() && Drawer.getSize().height != 0){
                 oldY = evt.getY();
                 Drawer.setSize(WIDTH, getSize().height - 1);
            }
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        
    }//GEN-LAST:event_jLabel2MouseDragged

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
            java.util.logging.Logger.getLogger(MobiePhone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MobiePhone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MobiePhone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MobiePhone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MobiePhone().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JPanel Drawer;
    private javax.swing.JPanel Volume;
    private javax.swing.JLabel VolumeDown;
    private javax.swing.JLabel VolumeUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}