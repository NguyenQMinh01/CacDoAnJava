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
public class KhachHangNuocNgoai extends khachhang{
    private String quoctich;
    
    public KhachHangNuocNgoai()
    {
        super();
        this.quoctich = " ";
    }
    
    public KhachHangNuocNgoai(String maKH, String tenKH, String ngayraHD, int soluong, double dongia, String quoctich)
    {
       super(maKH, tenKH, ngayraHD,soluong,dongia);
       this.quoctich = quoctich;
    }
    
    public void nhap()
    {
        super.nhap();
        Scanner input = new Scanner(System.in);
        System.out.println("nhap quoc tich: ");
        quoctich = input.nextLine();
    }
    
    public void xuat()
    {
        super.xuat();
        System.out.println("quoc tich: "+ this.quoctich);
    }
    
    public double thanhtien()
    {
        double thanhtien = soluong * dongia;
        return thanhtien;
    }
}
