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
public class NhanVienQL extends NhanVien{
    private double hesotrucvu;
    private double thuong;
    public NhanVienQL ()
    {
       super();
       this.hesotrucvu = 6;
       this.thuong = 40;
    }
    
    public NhanVienQL(String ten, int namvl, double hesotrucvu, double thuong)
    {
        super(ten, namvl);
        this.hesotrucvu = this.hesotrucvu;
        this.thuong = thuong;
    }
    
    public void nhap()
    {
        super.nhap();
        Scanner input = new Scanner(System.in);
        System.out.println("nhap he so truc vu: ");
        hesotrucvu = input.nextDouble();
        System.out.println("\nnhap thuong: ");
        thuong = input.nextDouble();
    }
    public void xuat()
    {
        super.xuat();
        System.out.println("he so truc vu : "+ this.hesotrucvu + " thuong "+ this.thuong);
    }
    
    public double tinhluong()
    {
        double luong = super.tinhluong() * this.hesotrucvu + this.thuong;
        return luong;
    }
}
