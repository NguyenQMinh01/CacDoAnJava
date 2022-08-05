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
public class monlythuyet extends MonHoc{
    private float TL;
    private float GK;
    private float CK;
    
    public monlythuyet()
    {
        super();
        this.CK = 5;
        this.GK = 6;
        this.CK = 7;
    }
    
    public monlythuyet(String mamon, String tenmon, int stc, float TL, float GK, float ck)
    {
        super(mamon, tenmon, stc);
        this.TL = TL;
        this.GK = GK;
        this.CK = CK;
        
    }
    
    public void nhap()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap diem tieu luan: ");
        TL = input.nextFloat();
        System.out.println("nhap diem giua ki: ");
        GK = input.nextFloat();
        System.out.println("nhap diem cuoi ki: ");
        CK = input.nextFloat();
    }
    
    public void xuat()
    {
        System.out.println("diem TL: " + this.TL + " diem giua ki: " + this.GK +"diem cuoi ki"+ this.CK);
    }
    public double tinhdiem()
    {
        double diem = this.TL * 0.2 + this.GK * 0.3 + this.CK * 0.5;
        return diem;
    }
    
}
