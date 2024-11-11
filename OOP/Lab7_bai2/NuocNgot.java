package Lab7_bai2;

import java.util.Scanner;

/**
 * NuocNgot
 */
public class NuocNgot extends NuocGiaiKhat {
    private float doNgot;

    // constructor co tham so
    public NuocNgot(String maNuoc, String tenNuoc, String hsd, float trongLuong, float doNgot) {
        super(maNuoc, tenNuoc, hsd, trongLuong);
        this.doNgot = doNgot;
    }

    // phuong thuc tinh gia tien nuoc ngot
    @Override
    public double tinhGiaTien() {
        return trongLuong * 300;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Do ngot la: " + doNgot);
    }

    @Override
    public void nhapThongTin(){
    super.nhapThongTin();
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap do ngot: ");
    doNgot = sc.nextFloat();

    }

}