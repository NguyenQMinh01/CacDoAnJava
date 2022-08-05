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
public class MonHoc {
    protected String mamon;
    protected String tenmon;
    protected int stc;
    public MonHoc()
    {
        this.mamon = " ";
        this.tenmon = " ";
        this.stc = 0;
    }
    public MonHoc(String mamon, String tenmon, int stc)
    {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.stc = stc;
    }
    public void nhap()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap ma mon hoc: ");
        mamon = input.nextLine();
        System.out.println("nhap ten mon hoc: ");
        tenmon = input.nextLine();
        System.out.println("nhap so tin chi: ");
        stc = input.nextInt();
    }
    
    public void xuat()
    {
        
        System.out.println("ma mon hoc: "+ this.mamon + "ten mon hoc: "+ this.tenmon +"so tin chi: "+ this.stc );
    }
}
