package lab5;

public class PhatTrienUD extends KhoaDPT{
    public PhatTrienUD(String mssv, String hoTen, int tongSTC) {
        super(mssv, hoTen, tongSTC);
    }

    public PhatTrienUD() {
        super();
    }


    @Override
    public double tinhHocPhi(){
        return tongSTC*480000;
    }

    @Override
    public void nhapThongTin(){
        super.nhapThongTin();
    }


    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.printf("Học phí: %.2f VND\n", tinhHocPhi());
    }
    

}
