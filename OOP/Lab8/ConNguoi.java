package Lab8;

import java.util.Scanner;

public abstract class ConNguoi {

    protected String hoTen;
    protected String namSinh;

    // constructor co tham so
    public ConNguoi(String hoTen, String namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public ConNguoi() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va Ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        namSinh = sc.nextLine();
    }

    public void hienThiThongTin(){
        System.out.println("Ho va ten la: " +hoTen);
        System.out.println("Nam sinh la: "+namSinh);

    }

}
