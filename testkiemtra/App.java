/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testkiemtra;

/**
 *
 * @author E7440
 */
public class App extends javax.swing.JPanel {

    /**
     * Creates new form App
     */
    public App(String icon, String name) {
        initComponents();
        appIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon)));
        appNam.setText(name);
        
        CàiĐặt.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon)));
        appName1.setText(name);
       
        Notes.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon)));
        appName2.setText(name);
        
        GGChrome.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon)));
        appName3.setText(name);
        
        GGMap.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon)));
        appName4.setText(name);
        
        AppStore.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon)));
        appName5.setText(name);
        
        Phone.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon)));
        appName6.setText(name);
        
        Mess.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon)));
        appName7.setText(name);
        
        Face.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon)));
        jLabel18.setText(name);
        
        Camera.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon)));
        jLabel8.setText(name);
        
        Zing.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon)));
        jLabel2.setText(name);
        
        Ảnh.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon)));
        jLabel10.setText(name);
        
        TinNhắn.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon)));
        jLabel17.setText(name);
        
        Ins.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon)));
        jLabel20.setText(name);
        
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        appIcon = new javax.swing.JLabel();
        appNam = new javax.swing.JLabel();
        CàiĐặt = new javax.swing.JLabel();
        appName1 = new javax.swing.JLabel();
        Notes = new javax.swing.JLabel();
        appName2 = new javax.swing.JLabel();
        GGChrome = new javax.swing.JLabel();
        appName3 = new javax.swing.JLabel();
        GGMap = new javax.swing.JLabel();
        appName4 = new javax.swing.JLabel();
        appName5 = new javax.swing.JLabel();
        Phone = new javax.swing.JLabel();
        appName6 = new javax.swing.JLabel();
        Mess = new javax.swing.JLabel();
        appName7 = new javax.swing.JLabel();
        Camera = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Zing = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Face = new javax.swing.JLabel();
        AppStore = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Ảnh = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TinNhắn = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Ins = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel3.setText("jLabel3");

        jLabel2.setText("jLabel2");

        jLabel5.setText("jLabel5");

        jLabel7.setText("jLabel7");

        jLabel9.setText("jLabel9");

        jLabel13.setText("jLabel13");

        jLabel6.setText("jLabel6");

        jLabel11.setText("jLabel11");

        jLabel14.setText("jLabel14");

        jLabel15.setText("jLabel15");

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        appIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appIconImage/appdt1.png"))); // NOI18N
        appIcon.setOpaque(true);
        add(appIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        appNam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        appNam.setForeground(new java.awt.Color(255, 255, 255));
        appNam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appNam.setText("caculator");
        add(appNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 60, 70, -1));

        CàiĐặt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CàiĐặt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appIconImage/appdt2.png"))); // NOI18N
        add(CàiĐặt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, 50));

        appName1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        appName1.setForeground(new java.awt.Color(255, 255, 255));
        appName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appName1.setText("Cài Đặt");
        add(appName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 50, 30));

        Notes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appIconImage/appdt3.PNG"))); // NOI18N
        add(Notes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 840, 50, 50));

        appName2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        appName2.setForeground(new java.awt.Color(255, 255, 255));
        appName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appName2.setText("Notes");
        add(appName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 890, 50, 30));

        GGChrome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appIconImage/appdt4.PNG"))); // NOI18N
        add(GGChrome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, -1, 50));

        appName3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        appName3.setForeground(new java.awt.Color(255, 255, 255));
        appName3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        appName3.setText("Google Chrome");
        add(appName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 100, 30));

        GGMap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appIconImage/appdt5.PNG"))); // NOI18N
        add(GGMap, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 50, 50));

        appName4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        appName4.setForeground(new java.awt.Color(255, 255, 255));
        appName4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appName4.setText("Google Map");
        add(appName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 90, 20));

        appName5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        appName5.setForeground(new java.awt.Color(255, 255, 255));
        appName5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appName5.setText("App Store");
        add(appName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1050, 70, 30));

        Phone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appIconImage/appdt8.PNG"))); // NOI18N
        add(Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 920, -1, 50));

        appName6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        appName6.setForeground(new java.awt.Color(255, 255, 255));
        appName6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appName6.setText("Phone");
        add(appName6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 970, 50, 30));

        Mess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appIconImage/appdt9.PNG"))); // NOI18N
        add(Mess, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 57, 50));

        appName7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        appName7.setForeground(new java.awt.Color(255, 255, 255));
        appName7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appName7.setText("Messages");
        add(appName7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 70, 30));

        Camera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appIconImage/appdt10.PNG"))); // NOI18N
        add(Camera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 50, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Camera");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, 20));

        Zing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appIconImage/appdt11.PNG"))); // NOI18N
        add(Zing, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 50, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Zing Mp3");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 730, -1, 30));

        Face.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appIconImage/appdt13.PNG"))); // NOI18N
        add(Face, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 50, 50));

        AppStore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appIconImage/appdt6.PNG"))); // NOI18N
        add(AppStore, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1000, 50, 50));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Facebook");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, -1, -1));

        Ảnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appIconImage/appdt12.PNG"))); // NOI18N
        add(Ảnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 50, 50));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Ảnh");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 810, 50, 30));

        TinNhắn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appIconImage/appdt15.PNG"))); // NOI18N
        add(TinNhắn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 50, 50));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Tin Nhắn");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, -1, -1));

        Ins.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appIconImage/appdt14.PNG"))); // NOI18N
        add(Ins, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 48, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Instagram");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 70, 20));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppStore;
    private javax.swing.JLabel Camera;
    private javax.swing.JLabel CàiĐặt;
    private javax.swing.JLabel Face;
    private javax.swing.JLabel GGChrome;
    private javax.swing.JLabel GGMap;
    private javax.swing.JLabel Ins;
    private javax.swing.JLabel Mess;
    private javax.swing.JLabel Notes;
    private javax.swing.JLabel Phone;
    private javax.swing.JLabel TinNhắn;
    private javax.swing.JLabel Zing;
    private javax.swing.JLabel appIcon;
    private javax.swing.JLabel appNam;
    private javax.swing.JLabel appName1;
    private javax.swing.JLabel appName2;
    private javax.swing.JLabel appName3;
    private javax.swing.JLabel appName4;
    private javax.swing.JLabel appName5;
    private javax.swing.JLabel appName6;
    private javax.swing.JLabel appName7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel Ảnh;
    // End of variables declaration//GEN-END:variables
}
