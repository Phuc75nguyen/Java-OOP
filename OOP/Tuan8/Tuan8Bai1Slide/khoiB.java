package Tuan8.Tuan8Bai1Slide;

import java.util.Scanner;

public class khoiB extends ThiSinh {
    private double diemToan;
    private double diemHoa;
    private double deimSinh;

    public khoiB(String sbd, String hoTen, String diaChi, double uuTien, double diemToan, double diemHoa,
            double deimSinh) {
        super(sbd, hoTen, diaChi, uuTien);
        this.diemToan = diemToan;
        this.diemHoa = diemHoa;
        this.deimSinh = deimSinh;
    }

    @Override // phương thức nhập thông tin Thisinh, ở đây thêm vào các dòng nhập điểm
    public void nhapThongTin() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap diem mon Toan: ");
        diemToan = sc.nextDouble();
        System.out.println();

        System.out.print("Moi nhap diem mon Sinh Hoc: ");
        deimSinh = sc.nextDouble();
        System.out.println();

        System.out.print("Moi nhap diem mon Hoa Hoc: ");
        diemHoa = sc.nextDouble();
        System.out.println();

    }

    @Override // phương thức hienthithongtin, ở đây thêm vào các dòng code để hiển thị điểm
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Diem mon Toan la: " + diemToan);
        System.out.println("Diem mon Sinh Hoc la: " + deimSinh);
        System.out.println("Diem mon Hoa Hoc la: " + diemHoa);

    }

    @Override
    public double tinhDiem() {
        return diemToan + deimSinh + diemHoa + uuTien;
    }

}
