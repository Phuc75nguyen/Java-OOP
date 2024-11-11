package Tuan7.Tuan7_Bai2;

public class NhanVien extends Nguoi {
    private double luong;
    private String ngayNhanViec;
    protected Phong_Ban_Khoa pBan_Khoa;

    //constructor
    public NhanVien(String ten, int namSinh, double luong, String ngayNhanViec, Phong_Ban_Khoa pBan_Khoa) {
        super(ten, namSinh);
        this.luong = luong;
        this.ngayNhanViec = ngayNhanViec;
        this.pBan_Khoa = pBan_Khoa;
    }

    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println(" Luong:" + String.format("%.0f", luong));

        System.out.println("ngay lam viec : " +ngayNhanViec);

        System.out.println("Phong ban khoa:" + pBan_Khoa);

        //pBan_Khoa.hienThiThongTinPBK();

    }
    
}
