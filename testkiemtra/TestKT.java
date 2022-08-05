/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testkiemtra;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author E7440
 */
public class TestKT extends JFrame {

    private JTextField tfcsc, tftt, tfcsm, tfdm, tftttdm, tfttndm, tfthanhtien, tfVAT, tftongcong;
    private JButton bttinh, bttt, btxoa, btthoat;
    int dem =0;
    public TestKT() {
        initComponents();
        xuLiSuKien();
    }

    private void initComponents() {
        this.setTitle("Phiếu Tính Tiền Nước");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        Container con = getContentPane();
        con.setLayout(new BorderLayout());

        JPanel tieude = new JPanel();
        tieude.setLayout(new FlowLayout());
        JLabel td = new JLabel("Phiếu Tính Tiền Nước");

        td.setBackground(Color.BLACK);
        td.setFont(new Font("Verdana", Font.BOLD, 30));
        tieude.add(td);
        con.add(tieude);

        JPanel center = new JPanel();
        center.setLayout(new BoxLayout(center, BoxLayout.Y_AXIS));
        center.setPreferredSize(new Dimension(900, 0));

        JPanel nhap = new JPanel();
        nhap.setLayout(new GridLayout(2, 2));

        JPanel csc1 = new JPanel();

        JLabel csc = new JLabel("Chỉ số cũ");
        tfcsc = new JTextField(5);

        JLabel csm = new JLabel("Chỉ số mới");
        tfcsm = new JTextField(5);
        csc1.add(csc);
        csc1.add(tfcsc);
        csc1.add(csm);
        csc1.add(tfcsm);

        JPanel tt1 = new JPanel();
        JLabel tt = new JLabel("tiêu thụ");
        tftt = new JTextField(5);
        tftt.setEnabled(false);

        JLabel dm = new JLabel("định mức");
        tfdm = new JTextField(6);
        tt1.add(tt);
        tt1.add(tftt);
        tt1.add(dm);
        tt1.add(tfdm);

        nhap.add(csc1);

        nhap.add(tt1);

        JPanel nhap2 = new JPanel();
        nhap2.setLayout(new GridLayout(2, 1));
        JPanel tt2 = new JPanel();
        JLabel lbtttdm = new JLabel("tiêu thu trong định mức");
        tftttdm = new JTextField(12);
        tt2.add(lbtttdm);
        tt2.add(tftttdm);
        nhap2.add(tt2);
        JPanel tt3 = new JPanel();
        JLabel lbttndm = new JLabel("tiêu thụ ngoài định mức");
        tfttndm = new JTextField(12);
        tt3.add(lbttndm);
        tt3.add(tfttndm);

        nhap2.add(tt3);

        center.add(nhap);
        center.add(nhap2);
        con.add(center);

        JPanel tong = new JPanel();
        tong.setLayout(new BoxLayout(tong, BoxLayout.Y_AXIS));

        Border line = BorderFactory.createLineBorder(Color.BLUE);
        tong.setBorder(line);

        JPanel thanhtien1 = new JPanel();
        thanhtien1.setLayout(new BoxLayout(thanhtien1, BoxLayout.Y_AXIS));
        JLabel lbthanhtien = new JLabel("thành tiền");
        lbthanhtien.setAlignmentX(CENTER_ALIGNMENT);

        JPanel tf = new JPanel();
        tfthanhtien = new JTextField(15);
        tfthanhtien.setEnabled(false);
        tf.add(tfthanhtien);
        thanhtien1.add(lbthanhtien);
        thanhtien1.add(tf);

        JPanel VAT = new JPanel();
        VAT.setLayout(new BoxLayout(VAT, BoxLayout.Y_AXIS));
        JLabel lbVAT = new JLabel("VAT");
        lbVAT.setAlignmentX(CENTER_ALIGNMENT);
        JPanel tf1 = new JPanel();
        tfVAT = new JTextField(15);
        tfVAT.setEnabled(false);
        tf1.add(tfVAT);
        VAT.add(lbVAT);
        VAT.add(tf1);

        JPanel tongcong = new JPanel();
        tongcong.setLayout(new BoxLayout(tongcong, BoxLayout.Y_AXIS));
        JLabel lbTongcong = new JLabel("Tổng cộng");
        lbTongcong.setAlignmentX(CENTER_ALIGNMENT);
        JPanel tf2 = new JPanel();
        tftongcong = new JTextField(15);
        tftongcong.setEnabled(false);
        tf2.add(tftongcong);
        tongcong.add(lbTongcong);
        tongcong.add(tf2);

        tong.add(thanhtien1);

        tong.add(VAT);

        tong.add(tongcong);

        con.add(tong);

        JPanel footer = new JPanel();
        footer.setLayout(new BoxLayout(footer, BoxLayout.X_AXIS));

        JPanel tinh = new JPanel();
        tinh.setLayout(new FlowLayout());
        bttinh = new JButton(" Tính ");
        tinh.add(bttinh);

        JPanel thongtin = new JPanel();
        thongtin.setLayout(new FlowLayout());
        bttt = new JButton("Thông tin");
        thongtin.add(bttt);

        JPanel xoa = new JPanel();
        xoa.setLayout(new FlowLayout());
        btxoa = new JButton(" xóa ");
        xoa.add(btxoa);

        JPanel thoat = new JPanel();
        thoat.setLayout(new FlowLayout());
        btthoat = new JButton(" Thoát ");
        thoat.add(btthoat);
        footer.add(tinh);

        footer.add(thongtin);

        footer.add(xoa);

        footer.add(thoat);

        con.add(tieude, BorderLayout.NORTH);
        con.add(center, BorderLayout.CENTER);
        con.add(tong, BorderLayout.EAST);
        con.add(footer, BorderLayout.SOUTH);

    }

    private void xuLiSuKien() {
        bttinh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dem++;
                String dm = tfdm.getText();
                String csc = tfcsc.getText();
                try {
                    double a = Double.parseDouble(csc);
                    if (a < 0) {
                        JOptionPane.showMessageDialog(null, "phai lon hon 0 ");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "phai nhap so ");
                    tfcsc.setText("");
                    tfcsc.selectAll();
                }

                String csm = tfcsm.getText();
                try {
                    double a = Double.parseDouble(csc);
                    double b = Double.parseDouble(csm);
                    if (b < 0) {
                        JOptionPane.showMessageDialog(null, "phai lon hon 0");
                        tfcsc.requestFocus();
                        tfcsc.selectAll();
                    } else if (b < a) {
                        JOptionPane.showMessageDialog(null, "csm phai be hon csc");
                        tfcsm.setText("");
                        tfcsc.requestFocus();
                        tfcsc.selectAll();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();;
                    JOptionPane.showMessageDialog(null, "phai nhap so");
                    tfcsm.setText("");
                    tfcsc.requestFocus();;
                    tfcsc.selectAll();;
                }
                int c = Integer.parseInt(dm);
                int a,b;
                a = Integer.parseInt(tfcsc.getText());
                b = Integer.parseInt(tfcsm.getText());
                int kq, kq1,kq2;
                double kq3,kq4,kq5;
                kq = b - a;
                tftt.setText(kq+ "");
                
                a = Integer.parseInt(tftt.getText());
                b = Integer.parseInt(tfdm.getText());
                if(a > b){
                    tftttdm.setText(""+ a);
                    tfttndm.setText(""+ (a - b));
                }
                else
                {
                    tftttdm.setText(""+ a);
                    tfttndm.setText("0");
                }
                
                kq1 = Integer.parseInt(tftttdm.getText());
                kq2 = Integer.parseInt(tfttndm.getText());
                kq3 = (6500*kq1 + 12000* kq2);
                tfthanhtien.setText(""+ kq3);
                
                kq4 = kq3+ kq3 * 0.1;
                tfVAT.setText(""+ kq4);
                
                kq5 = kq3 + kq4;
                tftongcong.setText(""+ kq5);
            }
            

        });

        btxoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              
                    tfcsc.setText("");
                    tfcsm.setText("");
                    tftt.setText("");
                    tfdm.setText("");
                    tftongcong.setText("");
                    tftttdm.setText("");
                    tfttndm.setText("");
                    tfthanhtien.setText("");
                    tfVAT.setText("");
                    tfcsc.requestFocus();
                }
        });
        btthoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int a = JOptionPane.YES_NO_CANCEL_OPTION;
                int b = JOptionPane.showConfirmDialog(null,"bạn có muốn thoát không?","Warning",a);
                if(b == JOptionPane.YES_OPTION )
                {
                    System.exit(0);
                }
                
            }
        });
        bttt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               JOptionPane.showMessageDialog(null,"hoten- mssv" + dem ,"thong tin",1);
            }
        });
        
        
        

    }
;
}
