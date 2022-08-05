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
public class NhanVienSX extends NhanVien{
    private int soSP;
    public NhanVienSX()
    {
        super();
        this.soSP = 10;
    }
    public NhanVienSX(String ten, int namvl, int soSP)
    {
        super(ten,namvl);
        this.soSP = soSP;
        
    }
    
    public void nhap()
    {
        super.nhap();
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so san pham: ");
        soSP = input.nextInt();
    }
    public void xuat()
    {
        super.xuat();
        System.out.println("so san pham la: " + this.soSP);
    }
    public double tinhluong()
    {
        double luong = super.tinhluong() + this.soSP * 2000;
        return luong;
    }
            
}
