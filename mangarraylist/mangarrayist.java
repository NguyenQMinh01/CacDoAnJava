/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangarraylist;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author E7440
 */
public class mangarrayist {
    private int soNV;
    private ArrayList<NhanVien> dsNV;
    
    public mangarrayist(int soNV){
        this.soNV = soNV;
        dsNV = new ArrayList<NhanVien>();
    }


    public void nhap()
    {
        for(int i =0; i< soNV; i++)
        {
            System.out.println("nhap tt nhan vien thu: "+ (i+1));
            System.out.println("cho biet loai nv: (1.NNVP, 2.NVSX, 3,NVQL): ");
            Scanner input = new Scanner(System.in);
            int loaiNV = input.nextInt();
            
            if(loaiNV == 1)
            {
               nhanvienVP nv = new nhanvienVP();
               nv.nhap();
               dsNV.add(nv);
            }
            else if(loaiNV == 2)
            {
               NhanVienSX nv = new NhanVienSX();
               nv.nhap();
               dsNV.add(nv);
            }
            else
            {
                NhanVienQL nv = new NhanVienQL();
                nv.nhap();
                dsNV.add(nv);
            }
        }
    }
    public void xuat()
    {
        System.out.println("danh sach nhan vien");
        for(int i= 0; i< soNV; i++)
        {
            dsNV.get(i).xuat();
        }
    }
    
    public int demSONV(){
        int dem  =0;
        for(int i =0; i< soNV; i++)
        {
            if(dsNV.get(i) instanceof nhanvienVP)
                dem++;
        }
        System.out.println("so nhan vien VP: "+ dem);
        return dem;
    }
    public double tinhluong()
    {
        double tongluong =0;
        for(int i= 0;i< soNV; i++)
        {
            tongluong += dsNV.get(i).tinhluong();
        }
        System.out.println("tong luong: "+ tongluong);
        return tongluong;
    }
}
