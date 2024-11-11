package Lab7_bai1;

public class Tai_Khoan {
    private String soTK;
    private String loaiTK;
    private double soDu;
    
    //Constructor
    public Tai_Khoan(String soTK, String loaiTK, double soDu) {
        this.soTK = soTK;
        this.loaiTK = loaiTK;
        this.soDu = soDu;
    }
    
    //getter/setter
    public String getSoTK() {
        return soTK;
    }

    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }

    public String getLoaiTK() {
        return loaiTK;
    }

    public void setLoaiTK(String loaiTK) {
        this.loaiTK = loaiTK;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    //tạo hàm xuất toString
    @Override
    public String toString(){
        return "So TK: " + soTK + ", Loai TK: " + loaiTK + ",So Du: " + soDu;
    }
    
    
}
