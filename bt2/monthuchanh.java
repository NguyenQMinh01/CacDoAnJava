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
public class monthuchanh extends MonHoc{
    private float diemktral1;
    private float diemktral2;
    private float diemktral3;
    private float diemktral4;
    
    public monthuchanh()
    {
        super();
        this.diemktral1 = 1;
        this.diemktral2 = 2;
        this.diemktral3 = 3;
        this.diemktral4 = 4;
    }
    public monthuchanh(String mamon, String tenmon, int stc, float diemktral1, float diemktral2, float diemktral3, float diemktral4 )
    {
        super(mamon,tenmon, stc);
        this.diemktral1 = diemktral1;
        this.diemktral2 = diemktral2;
        this.diemktral3 = diemktral3;
        this.diemktral4 = diemktral4;
    }
    
    public void nhap()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("diem ktra lan 1: ");
        diemktral1 = input.nextFloat();
        System.out.println("diem ktra lan 2: ");
        diemktral1 = input.nextFloat();
        System.out.println("diem ktra lan 3: ");
        diemktral1 = input.nextFloat();
        System.out.println("diem ktra lan 4: ");
        diemktral1 = input.nextFloat();
        
    }
    
    public void xuat()
    {
        System.out.println("diem lan 1: "+ this.diemktral1+"diem lan 2"+ this.diemktral2 +"diem lan 3" + this.diemktral3 + " diem lan 4" + this.diemktral4);
    }
    
    public double tinhdiem()
    {
        double diem = (this.diemktral1 + this.diemktral2 + this.diemktral3 + this.diemktral4)/4;
        return diem;
    }
}
