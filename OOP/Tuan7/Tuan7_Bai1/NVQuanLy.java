package Tuan7.Tuan7_Bai1;

/**
 * NVQuanLy
 */
public class NVQuanLy extends NhanVien {
    private float phuCapChucVu;

    public NVQuanLy(String maNV, String tenNV, String trinhDo, float luongcb, float phuCapChucVu) {
        super(maNV, tenNV, trinhDo, luongcb);
        this.phuCapChucVu = phuCapChucVu;
    }
    

    @Override
    public float tinhluong(){
        return luongcb + phuCapChucVu;
    }
    
}