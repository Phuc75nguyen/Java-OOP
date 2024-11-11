package Tuan8.Tuan8Bai1Slide;

import java.util.Scanner;

public abstract class ThiSinh {
    protected String sbd;
    protected String hoTen;
    protected String diaChi;
    protected double uuTien;
    //constructor
    public ThiSinh(String sbd, String hoTen, String diaChi, double uuTien) {
        this.sbd = sbd;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.uuTien = uuTien;
    }
    public String getSbd() {
        return sbd;
    }
    public void setSbd(String sbd) {
        this.sbd = sbd;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public double getUuTien() {
        return uuTien;
    }
    public void setUuTien(double uuTien) {
        this.uuTien = uuTien;
    }
    
    //Phương thức trừu tượng để tính điểm, các lớp con kế thừa sẽ override và định nghĩa cụ thể
    public abstract double tinhDiem();


    //Phương thức nhập thông tin cho thí sinh
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so bao danh cho thi sinh:");
        sbd = sc.nextLine();
        System.out.println();

        System.out.print("Nhap ho va ten cho thi sinh:");
        hoTen = sc.nextLine();
        System.out.println();

        System.out.print("Nhap dia chi cho thi sinh:");
        diaChi = sc.nextLine();
        System.out.println();

        System.out.print("Nhap diem uu tien cho thi sinh:");
        uuTien = sc.nextDouble();
        System.out.println();

    }

    //phương thức hiển thị thông tin cho thí sinh
    public void hienThiThongTin(){
        System.out.println("So bao danh cua thi sinh: " +sbd);
        System.out.println("Ho va Ten cua thi sinh: " + hoTen);
        System.out.println("Dia chi cua thi sinh: " + diaChi);
        System.out.println("Diem uu tien cua thi sinh: " + uuTien);
    }

    
}