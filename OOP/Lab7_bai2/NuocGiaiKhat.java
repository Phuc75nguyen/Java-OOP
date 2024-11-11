package Lab7_bai2;

import java.util.Scanner;

public abstract class NuocGiaiKhat {
    protected String maNuoc;
    protected String tenNuoc;
    protected String hsd;
    protected float trongLuong;

    //constructor
    public NuocGiaiKhat(String maNuoc, String tenNuoc, String hsd, float trongLuong) {
        this.maNuoc = maNuoc;
        this.tenNuoc = tenNuoc;
        this.hsd = hsd;
        this.trongLuong = trongLuong;
    }
    
    //setter/getter
    public String getMaNuoc() {
        return maNuoc;
    }


    public void setMaNuoc(String maNuoc) {
        this.maNuoc = maNuoc;
    }


    public String getTenNuoc() {
        return tenNuoc;
    }


    public void setTenNuoc(String tenNuoc) {
        this.tenNuoc = tenNuoc;
    }


    public String getHsd() {
        return hsd;
    }


    public void setHsd(String hsd) {
        this.hsd = hsd;
    }


    public float getTrongLuong() {
        return trongLuong;
    }


    public void setTrongLuong(float trongLuong) {
        this.trongLuong = trongLuong;
    }


    //phuong thuc tính giá tiền này sẽ được định nghĩa cụ thể trong các lớp của các loại nước cụ thể
    abstract double tinhGiaTien();

    //phuong thuc hien thi thong tin
    public void hienThiThongTin(){
        System.out.println("Ma cua loai nuoc la: " + maNuoc);
        System.out.println("Ten cua loai nuoc do la: " +tenNuoc);
        System.out.println("Khoi luong tinh cua loai nuoc la: " +trongLuong);
        System.out.println("Han su dung cua loai nuoc: " + hsd);
    }

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nuoc: " );
        maNuoc = sc.nextLine();


        System.out.println("Nhap ten nuoc: ");
        tenNuoc = sc.nextLine();


        System.out.println("Nhap trong luong: ");
        trongLuong = sc.nextFloat();

        System.out.println("Nhap han su dung cua nuoc giai khac: ");
        hsd = sc.nextLine();

    }

}
