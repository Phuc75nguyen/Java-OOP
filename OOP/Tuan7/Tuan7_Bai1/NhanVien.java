package Tuan7.Tuan7_Bai1;

abstract class NhanVien{
    protected String maNV;
    protected String tenNV;
    protected String trinhDo;
    protected float luongcb;

    
    public NhanVien(String maNV, String tenNV, String trinhDo, float luongcb) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.trinhDo = trinhDo;
        this.luongcb = luongcb;
    }

    public abstract float tinhluong();


    public String getMaNV() {
        return maNV;
    }


    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }


    public String getTenNV() {
        return tenNV;
    }


    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }


    public String getTrinhDo() {
        return trinhDo;
    }


    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }


    public float getLuongcb() {
        return luongcb;
    }


    public void setLuongcb(float luongcb) {
        this.luongcb = luongcb;
    }

    
    public void hienThiThongTin(){
        
        System.out.println("Mã nhân viên:" +maNV);
        System.out.println("Họ tên nhân viên:" + tenNV);
        System.out.println("Trình độ nhân viên:" +  trinhDo);
        System.out.println("Lương cơ bản nhân viên:" +luongcb);

    }

}