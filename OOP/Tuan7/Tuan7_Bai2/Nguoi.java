package Tuan7.Tuan7_Bai2;

public abstract class Nguoi {
    protected String ten;
    protected int namSinh;

    //constructor
    public Nguoi(String ten, int namSinh) {
        this.ten = ten;
        this.namSinh = namSinh;
    }

    //các getter và setter
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public int getNamSinh() {
        return namSinh;
    }
    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }


    //public abstract 

    public void hienThiThongTin(){
        System.out.println("Ho va ten:" + ten);
        System.out.println("nam sinh:" + namSinh);

    }
    
}
