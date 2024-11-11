package Tuan7.Tuan7_Bai2;

public class Phong_Ban_Khoa {
    private String maPBK;
    private String tenPBK;
    //hàm khởi tạo 2 tham số
    public Phong_Ban_Khoa(String maPBK, String tenPBK) {
        this.maPBK = maPBK;
        this.tenPBK = tenPBK;
    }

        //các getter/setter
    public String getMaPBK() {
        return maPBK;
    }
    public void setMaPBK(String maPBK) {
        this.maPBK = maPBK;
    }
    public String getTenPBK() {
        return tenPBK;
    }
    public void setTenPBK(String tenPBK) {
        this.tenPBK = tenPBK;
    }

    @Override
    public String toString(){

        return "Ma PBK: " + maPBK + ",ten PBK: " + tenPBK;
    }
    
}
