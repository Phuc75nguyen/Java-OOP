package Tuan7.Tuan7_Bai2;

public class Giao_vien extends Nhanvien_CLC {

    private double thuLaoGD;

    public Giao_vien(String ten, int namSinh, double luong, String ngayNhanViec, Phong_Ban_Khoa pBan_Khoa,
            String trinhDo, String nganh, String noiDaoTao, double thuLaoGD) {
        super(ten, namSinh, luong, ngayNhanViec, pBan_Khoa, trinhDo, nganh, noiDaoTao);
        this.thuLaoGD = thuLaoGD;
    }

    @Override
    public void hienThiThongTin(){

        super.hienThiThongTin();

        System.out.println("Thu lao Giao Duc:" + thuLaoGD);
    }

    
}
