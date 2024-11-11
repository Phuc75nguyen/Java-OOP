package Tuan8.Tuan8Bai1Slide;

import java.util.Scanner;

public class khoiA extends ThiSinh {
    private double diemToan;
    private double diemLy;
    private double diemHoa;
 
    public khoiA(String sbd, String hoTen, String diaChi, double uuTien, double diemToan, double diemLy,
            double diemHoa) {
        super(sbd, hoTen, diaChi, uuTien);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    @Override // phương thức nhập thông tin Thisinh, ở đây thêm vào các dòng nhập điểm
    public void nhapThongTin() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap diem mon Toan: ");
        diemToan = sc.nextDouble();
        System.out.println();

        System.out.print("Moi nhap diem mon Vat Ly: ");
        diemLy = sc.nextDouble();
        System.out.println();

        System.out.print("Moi nhap diem mon Hoa Hoc: ");
        diemHoa = sc.nextDouble();
        System.out.println();

    }
    @Override // phương thức hienthithongtin, ở đây thêm vào các dòng code để hiển thị điểm
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Diem mon Toan la: " + diemToan);
        System.out.println("Diem mon Vat Ly la: " + diemLy);
        System.out.println("Diem mon Hoa Hoc la: " + diemHoa);

    }

    @Override
    public double tinhDiem() {
        return diemToan + diemLy + diemHoa + uuTien;
    }

}
