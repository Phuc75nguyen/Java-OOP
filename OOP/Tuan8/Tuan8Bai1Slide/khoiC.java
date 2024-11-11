package Tuan8.Tuan8Bai1Slide;

import java.util.Scanner;

public class khoiC extends ThiSinh {
    private double diemVan;
    private double diemSu;
    private double diemDia;

    public khoiC(String sbd, String hoTen, String diaChi, double uuTien, double diemVan, double diemSu,
            double diemDia) {
        super(sbd, hoTen, diaChi, uuTien);
        this.diemVan = diemVan;
        this.diemSu = diemSu;
        this.diemDia = diemDia;
    }

    @Override // phương thức nhập thông tin Thisinh, ở đây thêm vào các dòng nhập điểm
    public void nhapThongTin() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap diem mon Ngu Van: ");
        diemVan = sc.nextDouble();
        System.out.println();

        System.out.print("Moi nhap diem mon Lich Su: ");
        diemSu = sc.nextDouble();
        System.out.println();

        System.out.print("Moi nhap diem mon Dia Ly: ");
        diemDia = sc.nextDouble();
        System.out.println();

    }

    @Override // phương thức hienthithongtin, ở đây thêm vào các dòng code để hiển thị điểm
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Diem mon Ngu Van la: " + diemVan);
        System.out.println("Diem mon Lich Su la: " + diemSu);
        System.out.println("Diem mon Dia Ly la: " + diemDia);

    }

    @Override
    public double tinhDiem() {
        return diemVan + diemSu + diemDia + uuTien;
    }

}
