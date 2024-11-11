package Tuan7.Tuan7_Bai2;

public class SinhVien extends Nguoi {
    private double diem1, diem2, diem3;

   

    public SinhVien(String ten, int namSinh, double diem1, double diem2, double diem3) {
        super(ten, namSinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }



    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("diem 1:" + diem1);
        System.out.println("diem 2:" + diem2);
        System.out.println("diem 3:" + diem3);
    }
    
}
