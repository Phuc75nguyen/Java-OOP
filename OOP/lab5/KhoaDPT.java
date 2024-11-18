package lab5;

import java.util.Scanner;

public abstract class KhoaDPT {
    protected String mssv;
    protected String hoTen;
    protected int tongSTC;

    // constructor
    public KhoaDPT(String mssv, String hoTen, int tongSTC) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.tongSTC = tongSTC;
    }

    // constructor ko tham sô
    public KhoaDPT() {
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTongSTC() {
        return tongSTC;
    }

    public void setTongSTC(int tongSTC) {
        this.tongSTC = tongSTC;
    }

    // phuong thuc tru tuong
    public abstract double tinhHocPhi();

    // ham nhap
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap ho va ten: " );
        hoTen = sc.nextLine();
        sc.nextLine();

        System.out.println("Moi ban nhap Ma so sinh vien: " );
        mssv = sc.nextLine();
        sc.nextLine();

        System.out.println("Moi ban nhap tong so tin chi: ");
        tongSTC = sc.nextInt();
        sc.nextLine();

    }

    //ham xuat
    public void hienThiThongTin(){
        System.out.println("Ma so sinh vien  la: " + mssv);
        System.out.println("Ho ten sinh vien  la: " + hoTen);
        System.out.println("Tong so tinh chi la  la: " +tongSTC);

    }

}
