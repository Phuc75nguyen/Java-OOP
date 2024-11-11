package Lab7_bai2;

import java.util.Scanner;

/**
 * NuocCoGas
 */
public class NuocCoGas extends NuocGiaiKhat {
    private Enum_xuatXu xuatXu;

    public NuocCoGas(String maNuoc, String tenNuoc, String hsd, float trongLuong, Enum_xuatXu xuatXu) {
        super(maNuoc, tenNuoc, hsd, trongLuong);
        this.xuatXu = xuatXu;
    }

    @Override
    public double tinhGiaTien() {
        return trongLuong * 200 * xuatXu.getTiGia();

    }



    @Override
    public void nhapThongTin(){
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        while (this.xuatXu == null) {
            System.out.println("Nhap xuat xu (CHAU_A hoac CHAU_AU): ");
            String xuatXuInput = sc.nextLine().toUpperCase();
            try{

                this.xuatXu = Enum_xuatXu.valueOf(xuatXuInput);//chuyển chuỗi xuat xu thành 1 enum

            }catch(IllegalArgumentException e){
                System.out.println("Xuat xu khong hop le!");

            }
            
        }
      
        

    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Xuat xu cua Nuoc co gas nay la: " + xuatXu);
        System.out.println("Ti gia cua xuat xu nay la: " + xuatXu.getTiGia());
    }
    


}