package Tuan5;

import java.util.Scanner;

public class HangHoa{
protected String maHang;
protected String ten;
protected long dongia;

public HangHoa(String maHang, String ten, long dongia) {
    this.maHang = maHang;
    this.ten = ten;
    this.dongia = dongia;
}

public HangHoa(){
}

public String getMaHang() {
    return maHang;
}
public String getTen() {
    return ten;
}
public float getGia() {
    return dongia;
}
public void setMaHang(String maHang) {
    this.maHang = maHang;
}
public void setTen(String ten) {
    this.ten = ten;
}
public void setGia(long dongia) {
    this.dongia = dongia;
}



    public void nhap(){

    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap thong tin hang hoa:");
        
        System.out.print("Nhap ma so hang hoa: ");
        maHang = sc.nextLine();
        
        System.out.print("Nhap ten hang hoa:");
        ten = sc.nextLine();
        
        System.out.print("Nhap don gia: ");
        dongia = Long.parseLong(sc.nextLine());
    }


    public void xuat() {
        System.out.println("Thong tin hang hoa:");
        System.out.println("Ma hang: " + maHang);
        System.out.println("Ten: " + ten);
        System.out.println("Don gia: " + dongia);
    }
    
}



