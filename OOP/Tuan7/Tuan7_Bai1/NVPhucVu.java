package Tuan7.Tuan7_Bai1;

public class NVPhucVu extends NhanVien  {

   public NVPhucVu(String maNV, String tenNV, String trinhDo, float luongcb){

    super(maNV, tenNV, trinhDo, luongcb);

   }


    @Override
    public float tinhluong(){
        return luongcb;
    }
}
