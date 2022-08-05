/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author E7440
 */
public class mangArray {
    private int soKH;
    private ArrayList<khachhang> dsKH;
    
    public mangArray(int soKH)
    {
        this.soKH = soKH;
        dsKH = new ArrayList<khachhang>();
    }
    
    public void nhap()
    {
        for(int i =0; i< soKH; i++)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("nhap danh sach khach hang thu: "+ (i+1));
            System.out.println("chon loai khach hang (1.Khach Hang Vn, 2.khach hang nươc ngoai): ");
            int loaiKH = input.nextInt();
            
            if(loaiKH == 1)
            {
                KhachHangVN kh = new KhachHangVN();
                kh.nhap();;
                dsKH.add(kh);
            }
            else
            {
               KhachHangNuocNgoai kh = new KhachHangNuocNgoai();
               kh.nhap();;
               dsKH.add(kh); 
            }
        }
    }
    
    public void xuat()
    {
        System.out.println("danh sach khach hang: ");
        for(int i =0; i< soKH; i++)
        {
            dsKH.get(i).xuat();
        }
    }
    
    public double thanhtien()
    {
        double thanhtien = 0;
        for(int i =0; i< soKH; i++)
        {
            thanhtien += dsKH.get(i).thanhtien();
        }
        System.out.println("tong thanh tien: "+ thanhtien);
        return thanhtien;
    }

}
/**
 *
 * @author E7440
 */

