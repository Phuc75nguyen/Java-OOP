package Lab7_bai1;

import java.util.ArrayList;

/**
 * Khach_Hang
 * 
 * Mã khách hàng, họ tên, số CCCD, số điện thoại, địa chỉ, danh sách tài khoản
 * của khách.
 */
public class Khach_Hang {
    private String maKH;
    private String hoTen;
    private String soCCCD;
    private String soDT;
    private String diaChi;
    private ArrayList<Tai_Khoan> dsTaiKhoan = new ArrayList<>();

    // constructor
    public Khach_Hang(String maKH, String hoTen, String soCCCD, String soDT, String diaChi,
            ArrayList<Tai_Khoan> dsTaiKhoan) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.soCCCD = soCCCD;
        this.soDT = soDT;
        this.diaChi = diaChi;
        this.dsTaiKhoan = dsTaiKhoan;
    }

    // Các getter và setter
    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoCCCD() {
        return soCCCD;
    }

    public void setSoCCCD(String soCCCD) {
        this.soCCCD = soCCCD;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public ArrayList<Tai_Khoan> getDsTaiKhoan() {
        return dsTaiKhoan;
    }

    public void setDsTaiKhoan(ArrayList<Tai_Khoan> dsTaiKhoan) {
        this.dsTaiKhoan = dsTaiKhoan;
    }
    
    //phuong thuc them tai khoan
    public void addTaiKhoan(Tai_Khoan tai_Khoan){
        dsTaiKhoan.add(tai_Khoan);
        
    }

    //override phuong thuc toString
    @Override
    public String toString(){
        return "Mã khách hàng: " + maKH + ",họ tên: " + hoTen + ", số CCCD: " +soCCCD + ", số điện thoại: " + soDT + ", địa chi: "  + diaChi 
        +"\n" + dsTaiKhoan;
    }

    //

}