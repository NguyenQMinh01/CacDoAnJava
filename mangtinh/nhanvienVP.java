/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangtinh;

import java.util.Scanner;

/**
 *
 * @author E7440
 */
public class nhanvienVP extends NhanVien {
    private int songayLV;
    private double trocap;
    
    public nhanvienVP()
    {
        super();
        this.songayLV = 5;
        this.trocap = 500;
    }
    
    public nhanvienVP(String ten,int namvl,int songayLV, double trocap)
    {
        super(ten,namvl);
        this.songayLV = this.songayLV;
        this.trocap = this.trocap;
    }
    
    public void nhap()
    {
        super.nhap();
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so ngay vl: ");
        songayLV = input.nextInt();
        System.out.println("nhap tro cap: ");
        trocap = input.nextDouble();
    }
    
    public void xuat()
    {
        super.xuat();
        System.out.println("so ngya lam viec: "+ this.songayLV + "\n tro cap: " + this.trocap);
    }
    
    
    public double tinhluong()
    {
        double luong = super.tinhluong() + this.songayLV*100000 + this.trocap;
        return luong;
    }
}
