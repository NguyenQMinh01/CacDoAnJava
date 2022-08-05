/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

import java.util.Scanner;

/**
 *
 * @author E7440
 */
public class mondoan extends MonHoc{
    private float diemGVHD;
    private float diemGVPB;
    
    public mondoan()
    {
        super();
        this.diemGVHD = 9;
        this.diemGVPB = 7;
    }
    
    public mondoan(String mamon, String tenmon, int stc, float diemGVHD,  float diemGVPB)
    {
        super(mamon, tenmon, stc);
        this.diemGVHD = diemGVHD;
        this.diemGVPB = diemGVPB;
    }
    
    public void nhap()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("diem GVHD: ");
        diemGVHD = input.nextFloat();
        System.out.println("diem GVPB: ");
        diemGVPB = input.nextFloat();
    }
    
    public void xuat()
    {
        System.out.println("diem GVHD" + this.diemGVHD +"diem GVPB" + this.diemGVPB);
    }
    
    public double tinhdiem()
    {
        double diem = (this.diemGVHD + this.diemGVPB)/2;
        return diem;
    }
}
