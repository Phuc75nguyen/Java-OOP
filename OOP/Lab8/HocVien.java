package Lab8;

import java.util.Scanner;

public class HocVien extends ConNguoi {
    private double diem1;
    private double diem2;
    private double diem3;
    public HocVien(String hoTen, String namSinh, double diem1, double diem2, double diem3) {
        super(hoTen, namSinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    public double getDiem1() {
        return diem1;
    }
    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }
    public double getDiem2() {
        return diem2;
    }
    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }
    public double getDiem3() {
        return diem3;
    }
    public void setDiem3(double diem3) {
        this.diem3 = diem3;
    }


    @Override
    public void nhapThongTin(){
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem1: ");
        diem1 = sc.nextDouble();


        System.out.println("Nhap diem2: ");
        diem2 = sc.nextDouble();

        System.out.println("Nhap diem3: ");
        diem3 = sc.nextDouble();

    }

    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Diem 1 la: " +diem1);
        System.out.println("Diem 1 la: " +diem2);
        System.out.println("Diem 1 la: " +diem3);
        
    }
    
}
