/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.Scanner;

/**
 *
 * @author E7440
 */
public class NhanVien {
    protected int nhanvien;
    protected String ten;
    protected int namvl;
    protected static double lcb = 1490000;
     public NhanVien()
     {
         this.ten = " ";
         this.namvl = 2020;
         
     }
     
     public NhanVien(String ten, int namvl)
     {
         this.ten = ten;
         this.namvl = namvl;
     }
     
     public void nhap()
     {
         Scanner input = new Scanner(System.in);
         System.out.println("nhap ho ten nhan vien: ");
         ten = input.nextLine();
         System.out.println("nhap nam vao lam: ");
         namvl = input.nextInt();
         
     }
     
     public void xuat()
     {
         System.out.println("ho ten: "+ this.ten +"\nnam vao lam: "+ this.namvl + "\n luong co ban" + this.lcb);
     }
     public double tinhluong()
     {
         return NhanVien.lcb;
     }
}
