package Tuan5;

import java.util.Scanner;

public class HangDienMay extends HangHoa{
    private int baoHanh;
    private int dienAp;
    private int congSuat;
    public int getBaoHanh() {
        return baoHanh;
    }
    public void setBaoHanh(int baoHanh) {
        this.baoHanh = baoHanh;
    }
    public int getDienAp() {
        return dienAp;
    }
    public void setDienAp(int dienAp) {
        this.dienAp = dienAp;
    }
    public int getCongSuat() {
        return congSuat;
    }
    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }
    public HangDienMay(String maHang, String ten, long dongia, int baoHanh, int dienAp, int congSuat) {
        super(maHang, ten, dongia);
        this.baoHanh = baoHanh;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }
    public HangDienMay(int baoHanh, int dienAp, int congSuat) {
        this.baoHanh = baoHanh;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }
    
    public HangDienMay(){

    }



public void nhap(){

        super.nhap();

        Scanner sc = new Scanner(System.in);
     

        System.out.print("Nhap thoi gian bao hanh: ");
        baoHanh = Integer.parseInt(sc.nextLine());
        
        System.out.println("Nhap dien ap:");
        dienAp = sc.nextInt();


        System.out.println("Nhap cong suat:");
        congSuat = sc.nextInt();

        
    }

public void xuat(){
    super.xuat();
    System.out.println("Thoi gian bao hanh la:" + baoHanh);
    System.out.println("Dien ap cua san pham la:" + dienAp);
    System.out.println("Cong suat la:" +congSuat);
}

}
