/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangtinh;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author E7440
 */
public class kethuamangtinh {
    private int soNV;
    private NhanVien[] dsNV;
    
    public kethuamangtinh(int soNV){
        this.soNV = soNV;
        dsNV = new NhanVien[soNV];
    }
    
    public void nhap(){
        for (int i =0 ; i< soNV; i++){
            System.out.println("nhap thong tin cho nhan vien thu: "+ (i +1));
            System.out.println("cho biet loai nv: (1.NNVP, 2.NVSX, 3,NVQL): ");
            Scanner input = new Scanner(System.in);
            int loaiNV = input.nextInt();
            
            if(loaiNV == 1)
            {
                dsNV[i] = new nhanvienVP();
                dsNV[i].nhap();
            }
            else if(loaiNV == 2)
            {
                dsNV[i] = new NhanVienSX();
                dsNV[i].nhap();
            }
            else
            {
                dsNV[i] = new NhanVienQL();
                dsNV[i].nhap();
            }
        }
    }
    public void xuat()
        {
            System.out.println("danh sach nhan vien: ");
            for(int i = 0; i< soNV; i++)
            {
                dsNV[i].xuat();
            }
        }
    public int demSONV(){
        int dem  =0;
        for(int i =0; i< soNV; i++)
        {
            if(dsNV[i] instanceof nhanvienVP)
                dem++;
        }
        System.out.println("so nhna vien: " + dem);
        return dem;
    }
    
    public double tinhluong()
    {
        double tongluong  =0;
        for(int i=0; i< soNV; i++)
        {
            tongluong += dsNV[i].tinhluong();
        }
       System.out.println("tong luong:  "+ tongluong);
        return tongluong;
      
    }
   
    
}

