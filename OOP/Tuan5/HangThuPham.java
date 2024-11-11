package Tuan5;

import java.util.Scanner;

public class HangThuPham extends HangHoa{

    private int ngaySX;
    private int ngayHH;

    
    public int getNgaySX() {
        return ngaySX;
    }


    public void setNgaySX(int ngaySX) {
        this.ngaySX = ngaySX;
    }


    public int getNgayHH() {
        return ngayHH;
    }


    public void setNgayHH(int ngayHH) {
        this.ngayHH = ngayHH;
    }


    //constructor khong tham so
    public HangThuPham() {
    }


    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay San xuat:");
        ngaySX = sc.nextInt();

        System.out.println("Nhap ngay het hang:");
        ngayHH = sc.nextInt();

    }


    public void xuat(){

        super.xuat();
        System.out.println("Ngay san xuat la: " + ngaySX);
        System.out.println("Ngay het han la:" +  ngayHH);
    }
    
}
