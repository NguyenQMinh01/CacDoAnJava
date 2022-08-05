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
public class khachhang {
    protected String maKH, tenKH;
    protected String ngayraHD;
    protected int soluong;
    protected double dongia;
    
    public khachhang()
    {
        this.maKH = "";
        this.tenKH = "";
        this.ngayraHD = "";
        this.soluong = 5;
        this.dongia = 500;
    }
    
    public khachhang(String maKH, String tenKH, String ngayraHD, int soluong, double dongia )
    {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.ngayraHD = ngayraHD;
        this.soluong = soluong;
        this.dongia = dongia;
    }
    
    public void nhap()
    {
         Scanner input = new Scanner(System.in);
         System.out.println("nhap ma khach hang: ");
         maKH = input.nextLine();
         System.out.println("nhap ten khach hang: ");
         tenKH = input.nextLine();
         System.out.println("nhap nga ra hd: ");
         ngayraHD = input.nextLine();
         System.out.println("nhap so luong: ");
         soluong = input.nextInt();
         System.out.println("nhap don gia: ");
         dongia = input.nextInt();
         
    }
    
    public void xuat()
    {
        System.out.println("ma khach hang: "+ this.maKH);
        System.out.println("ten khach hang: "+ this.tenKH);
        System.out.println("ngay ra HD: "+ this.ngayraHD);
        System.out.println("so luong: "+ this.soluong);
        System.out.println("ngay ra HD : "+ this.dongia);
    }
    
    public double thanhtien()
    {
        return thanhtien();
    }
    
}
