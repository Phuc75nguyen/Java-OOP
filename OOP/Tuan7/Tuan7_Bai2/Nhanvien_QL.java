package Tuan7.Tuan7_Bai2;

public class Nhanvien_QL extends NhanVien {

    private double phuCapCV;

    // constructor

    public Nhanvien_QL(String ten, int namSinh, double luong, String ngayNhanViec, Phong_Ban_Khoa pBan_Khoa,
            double phuCapCV) {
        super(ten, namSinh, luong, ngayNhanViec, pBan_Khoa);
        this.phuCapCV = phuCapCV;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Phu cap cong viec:" + phuCapCV);
    }

}
