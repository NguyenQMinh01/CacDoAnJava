/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javafx.scene.text.Font.font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
/**
 *
 * @author E7440
 */
public class Bai2_3 extends JFrame{
    private JButton lbxoa,lbgiai,lbthoat;
    private JRadioButton rdcong,rdnhan,rdtru,rdchia;
    private JTextField txta,txtb, txtkq;
    public Bai2_3(){
        initComponents();
        xuLySuKien();
    }
    
    private  void initComponents()
    {
        this.setTitle("Cong-Tru-Nhan-Chia");
        this.setSize(300, 400);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        Container con = getContentPane();
        con.setLayout(new BorderLayout());
        JPanel pnTop = new JPanel();
        JLabel lbltieude = new JLabel("Cong-Tru-Nhan-Chia");
        pnTop.add(lbltieude);
        lbltieude.setFont(new Font("Verdana",Font.BOLD, 25));
        lbltieude.setForeground(Color.BLUE);
               
        JPanel pnLeft = new JPanel();
        Border redline = BorderFactory.createLineBorder(Color.red);
        Border Title = BorderFactory.createTitledBorder(redline, "chon tac vu");
        pnLeft.setBorder(Title);
        
        pnLeft.setPreferredSize(new Dimension(1000,0));
        lbgiai = new JButton("giai");
        lbthoat = new JButton("thoat");
        lbxoa = new JButton("xoa");
        pnLeft.setLayout(new BoxLayout(pnLeft,BoxLayout.Y_AXIS));
        pnLeft.add(lbgiai);
        pnLeft.add(Box.createVerticalStrut(10));
        pnLeft.add(lbxoa);
        pnLeft.add(Box.createVerticalStrut(10));
        pnLeft.add(lbthoat);
        
        
        
        
        JPanel pnCenter = new JPanel();
        Border pheptoan = BorderFactory.createLineBorder(Color.red);
        Border giaitoan = BorderFactory.createTitledBorder(pheptoan, "nhap 2 so a va b");
        pnCenter.setBorder(giaitoan);
        pnCenter.setLayout(new BoxLayout(pnCenter,BoxLayout.Y_AXIS));
        
        JPanel hsa = new JPanel();
        JLabel lba = new JLabel("nhap a");
        txta = new JTextField(20);
        hsa.add(lba);
        hsa.add(txta);
        pnCenter.add(hsa);
        
        
        JPanel hsb = new JPanel();
        JLabel lbb = new JLabel("nhap b");
        txtb = new JTextField(20);
        hsb.add(lbb);
        hsb.add(txtb);
        pnCenter.add(hsb);
        
        JPanel chonpheptoan = new JPanel();
        Border line = BorderFactory.createLineBorder(Color.red);
        Border tieude = BorderFactory.createTitledBorder(line, "chon phep toan");
        chonpheptoan.setBorder(tieude);
        chonpheptoan.setLayout(new GridLayout(2,2));
        rdcong = new JRadioButton("cong");
        rdtru = new JRadioButton("tru");
        rdnhan = new JRadioButton("nhan");
        rdchia = new JRadioButton("chia");
        ButtonGroup group = new ButtonGroup();
        group.add(rdcong);
        group.add(rdtru);
        group.add(rdnhan);
        group.add(rdchia);
        
        chonpheptoan.add(rdcong);
        chonpheptoan.add(rdtru);
        chonpheptoan.add(rdnhan);
        chonpheptoan.add(rdchia);
        
        JPanel c = new JPanel();
        c.add(chonpheptoan);
        
        pnCenter.add(c);
        
        
        JPanel kq = new JPanel();
        JLabel lbkq = new JLabel("ket qua: ");
        txtkq = new JTextField(20);
        kq.add(lbkq);
        kq.add(txtkq);
        pnCenter.add(kq);
        
        
        
        JPanel pnFooter = new JPanel();
        JPanel bt1 = new JPanel();
        JPanel bt2 = new JPanel();
        JPanel bt3 = new JPanel();
        bt1.setBackground(Color.blue);
        bt2.setBackground(Color.red);
        bt3.setBackground(Color.yellow);
        
        pnFooter.add(bt1);
        pnFooter.add(bt2);
        pnFooter.add(bt3);
        
        //pnCenter.setBackground(Color.yellow);
       // pnLeft.setBackground(Color.BLUE);
        pnTop.setBackground(Color.RED);
        pnFooter.setBackground(Color.WHITE);
        
        con.add(pnCenter, BorderLayout.CENTER);
        con.add(pnLeft, BorderLayout.WEST);
        con.add(pnTop, BorderLayout.NORTH);
        con.add(pnFooter, BorderLayout.SOUTH);
        
        
    }

    private void xuLySuKien() {
        lbxoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               txta.setText(" ");
               txtb.setText(" ");
               txtkq.setText(" ");
               txta.requestFocus();
            }
        });{
        lbthoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "bạn có muốn thoát khỏi chương trình?","Warning",dialogButton);
                   if(dialogResult == JOptionPane.YES_OPTION)
                   {
                       System.exit(0);
                   }
                   else
                   {
                    JOptionPane.showConfirmDialog(null,"không thoát thì thôi","Warning",dialogResult);
                   }
            }
        });{
        lbgiai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              String hsa = txta.getText();
              try{
                  double a = Double.parseDouble(hsa);
              }
              
              catch(Exception ex){
                  ex.printStackTrace();
                  JOptionPane.showMessageDialog(null,"phai nhap so");
                  txta.requestFocus();
                  txta.selectAll();
              }
              String hsb = txtb.getText();
               try{
                    double b = Double.parseDouble(hsb);
              }
              
              catch(Exception ex){
                  ex.printStackTrace();
                  JOptionPane.showMessageDialog(null,"phai nhap so");
                  txtb.requestFocus();
                  txtb.selectAll();
              }
               int a = Integer.parseInt(hsa);
               int b = Integer.parseInt(hsb);
               int kq = 0;
              if(rdcong.isSelected())
              {
                  kq = a + b;
                  
              }
              else if(rdtru.isSelected())
              {
                  kq = a - b;
                 
              }
              else if(rdnhan.isSelected())
              {
                  kq = a * b;
                 
              }
              else 
              {
                  kq = a / b;
                 
              }
              txtkq.setText("" + (kq));  
            }
        });{
    }
    }
    
    }
}
}
