package lab5;

import java.util.Scanner;

import Tuan3.Bai2.demo;

public class KhoaTK extends KhoaDPT{
    protected int monKiNang;

    public KhoaTK(String mssv, String hoTen, int tongSTC,int monKiNang) {
        super(mssv, hoTen, tongSTC);
        this.monKiNang = monKiNang;
    }

    public KhoaTK() {
    }

    public int getMonKiNang() {
        return monKiNang;
    }

    public void setMonKiNang(int monKiNang) {
        this.monKiNang = monKiNang;
    }

    @Override
    public double tinhHocPhi(){
        return (tongSTC + monKiNang)*500000;
    }

    @Override
    public void nhapThongTin(){
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap mon ki nang: ");
        monKiNang = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Mon ki nang la: " + monKiNang);
        System.out.printf("Số môn kỹ năng: %d - Học phí: %.2f VND\n", monKiNang, tinhHocPhi());
    }
    
}
