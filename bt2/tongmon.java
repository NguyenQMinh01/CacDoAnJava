/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author E7440
 */
public class tongmon {
    private int TH, LT, DA;
    private monlythuyet[] MonLyThuyet;
    private monthuchanh[] MonThucHanh;
    private mondoan[] MonDoAn;
    
    public tongmon(int TH,int LT,int DA)
    {
        this.LT = LT;
        this.TH = TH;
        this.DA = DA;
        MonLyThuyet = new monlythuyet[this.LT];
        MonThucHanh = new monthuchanh[this.TH];
        MonDoAn = new mondoan[this.DA];
    }
    
    public void nhapsomon()
    {
        for( int i = 0; i< LT ; i++)
        {
            MonLyThuyet[i] = new monlythuyet();
            System.out.println("nhap so mon ly thuyet "+ (i+1));
            MonLyThuyet[i].nhap();
        }
        for( int i = 0; i< TH ; i++)
        {
            MonThucHanh[i] = new monthuchanh();
            System.out.println("nhap so mon thuc hanh "+ (i+1));
            MonThucHanh[i].nhap();
        }
        for( int i = 0; i< DA ; i++)
        {
            MonDoAn[i] = new mondoan();
            System.out.println("nhap so mon do an "+ (i+1));
            MonDoAn[i].nhap();
        }
    }
    
    public void xuatloaimon()
    {
        for(int i = 0; i< LT;  i++)
        {
            MonLyThuyet[i].xuat();
        }
        for(int i = 0; i< TH;  i++)
        {
            MonThucHanh[i].xuat();
        }
        for(int i = 0; i< DA;  i++)
        {
            MonDoAn[i].xuat();
        }
    }
    public double tinhdiemtong()
    {
        double diemLT = 0;
        for(int i =0 ; i < LT; i++)
        {
            diemLT = diemLT + MonLyThuyet[i].tinhdiem();
        }
        double diemTH = 0;
        for(int i =0 ; i < TH; i++)
        {
            diemTH = diemTH + MonThucHanh[i].tinhdiem();
        }
        double diemDA = 0;
        for(int i =0 ; i < DA; i++)
        {
            diemDA = diemDA + MonDoAn[i].tinhdiem();
        }
        
        double tongdiemcacmon = diemDA + diemTH + diemLT;
        System.out.println("diem ly thuyet: "+ diemLT);
        System.out.println("diem thuc hanh: "+ diemTH);
        System.out.println("diem do an: "+ diemDA);
        System.out.println("diem tong cac mon: "+ tongdiemcacmon);
        return 0;
    }
    
    
}
