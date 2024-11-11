package Tuan7.Tuan7_Bai1;

public class NVNghienCuu extends NhanVien {
    private float phuCapDocHai;

    public NVNghienCuu(String maNV, String tenNV, String trinhDo, float luongcb, float phuCapDocHai) {
        super(maNV, tenNV, trinhDo, luongcb);
        this.phuCapDocHai = phuCapDocHai;
    }
    
    @Override
    public float tinhluong(){
        return luongcb + phuCapDocHai;
    }

    
}
