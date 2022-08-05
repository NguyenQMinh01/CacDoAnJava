/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author E7440
 */
public class congTyABC {
    private int NVVP, NVSX, NVQL;
    private nhanvienVP[] dsNVVP;
    private NhanVienSX[] dsNVSX;
    private NhanVienQL[] dsNVQL;
    public congTyABC(int NVVP, int NVSX,int NVQL)
    {
        this.NVVP = NVVP;
        this.NVSX = NVSX;
        this.NVQL = NVQL;
        dsNVVP = new nhanvienVP[this.NVVP];
        dsNVSX = new NhanVienSX[this.NVSX];
        dsNVQL = new NhanVienQL[this.NVQL];
        
    }
    
    public void nhapthongtinVN()
    {
        for(int i = 0; i < NVVP ; i++)
        {
            dsNVVP[i] = new nhanvienVP();
            System.out.println("so nhan vien van phong la: "+ (i+1));
            dsNVVP[i].nhap();
        }
        for(int i = 0; i < NVSX ; i++)
        {
            dsNVSX[i] = new NhanVienSX();
            System.out.println("so nhan vien SX la: "+ (i+1));
            dsNVSX[i].nhap();
        }
        for(int i = 0; i < NVQL ; i++)
        {
            dsNVQL[i] = new NhanVienQL();
            System.out.println("so nhan vien QL la: "+ (i+1));
            dsNVQL[i].nhap();
        }
        
    }
    public void xuatthongtin()
    {
        System.out.println("danh sach nhan vien van phong: ");
        for(int i = 0; i< NVVP; i++)
        {
            dsNVVP[i].xuat();
        }
        System.out.println("danh sach nhan vien sx: ");
        for(int i = 0; i< NVSX; i++)
        {
            dsNVSX[i].xuat();
        }
        System.out.println("danh sach nhan vien QL: ");
        for(int i = 0; i< NVQL; i++)
        {
            dsNVQL[i].xuat();
        }
        
    }
    public double tinhluong(){
         double luongNVVP = 0;
        for (int i = 0; i < NVVP; i ++)
                luongNVVP = luongNVVP + dsNVVP[i].tinhluong();
        //NVSX
        double luongNVSX = 0;
        for (int i = 0; i < NVSX; i++)
                luongNVSX = luongNVSX + dsNVSX[i].tinhluong();
        //NVQL
        double luongNVQL = 0;
        for (int i = 0; i < NVQL; i++)
                luongNVQL = luongNVQL + dsNVQL[i].tinhluong();
        double tongLuong = luongNVVP + luongNVSX + luongNVQL;
        System.out.println("Luong cua NVVP: " + luongNVVP);
        System.out.println("Luong cua NVSX: " + luongNVSX);
        System.out.println("Luong cua NVQL: " + luongNVQL);
        System.out.println("Tong luong: " + tongLuong);
        return 0;
    }
}
