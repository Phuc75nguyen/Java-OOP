package Tuan7.Tuan7_Bai2;

public class Nhanvien_CLC extends NhanVien {
    private String trinhDo;
    private String nganh;
    private String noiDaoTao;
    
    //constructor
    public Nhanvien_CLC(String ten, int namSinh, double luong, String ngayNhanViec, Phong_Ban_Khoa pBan_Khoa,
            String trinhDo, String nganh, String noiDaoTao) {
        super(ten, namSinh, luong, ngayNhanViec, pBan_Khoa);
        this.trinhDo = trinhDo;
        this.nganh = nganh;
        this.noiDaoTao = noiDaoTao;
    }


    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("trinh do:"+trinhDo);
        System.out.println("nganh nghe:"+ nganh);
        System.out.println("noi dao tao:"+ noiDaoTao);
    }

}
