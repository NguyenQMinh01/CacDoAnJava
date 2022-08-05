/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4;

import java.util.Scanner;

/**
 *
 * @author E7440
 */
public class KhachHangVN extends khachhang{
    private String doituong;
    private double dinhmuc;
    
    public KhachHangVN()
    {
        super();
        this.doituong = "";
        this.dinhmuc = 50;
    }
    
    public KhachHangVN(String maKH, String tenKH, String ngayraHD, int soluong, double dongia, String doituong, double dinhmuc)
    {
        super(maKH, tenKH, ngayraHD,soluong,dongia);
        this.doituong = doituong;
        this.dinhmuc = dinhmuc;
    }
    
    public void nhap()
    {
        super.nhap();
        Scanner input = new Scanner(System.in);
        System.out.println("nhap doi tuong: ");
        doituong = input.nextLine();
        System.out.println("nhap dinh muc: ");
        dinhmuc = input.nextDouble();
    }
    
    public void xuat()
    {
        super.xuat();
        System.out.println("doi tuong: "+ this.doituong);
        System.out.println("dinh muc: "+ this.dinhmuc);
    }
    
    public double thanhtien()
    {
           double thanhtien;
           if(soluong <= dinhmuc)
           {
               thanhtien = soluong * dongia;
           }
           else
           {
               thanhtien = soluong * dongia + dinhmuc + (soluong - dinhmuc) * dongia * 2.5;
           }
           
           return thanhtien;
    }
           
}
