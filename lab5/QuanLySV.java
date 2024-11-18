package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLySV {

    private ArrayList<KhoaDPT> khoaDPT = new ArrayList<>();

    // hàm nhập sinh viên
    public void nhapSinhVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn loại sinh viên: 1. Phát triển ứng dụng, 2. Thiết kế");
        int chon = sc.nextInt();
        KhoaDPT sv;
        if (chon == 1) {
            sv = new PhatTrienUD();
        } else {
            sv = new KhoaTK();
        }
        sv.nhapThongTin();
        khoaDPT.add(sv);

    }

    // hàm xuất dssinh viên
    public void xuatDSSV(){
        for (KhoaDPT sv : khoaDPT) {
            sv.hienThiThongTin();
            System.out.println("***********************");

        }
    }

    // hàm nhập danh sách sinh viên
    public void nhapDanhSachSinhVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên cần thêm: ");
        int soLuong = sc.nextInt();
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
            nhapSinhVien();
        }
    }
    
    // ham xuatDSSVtheoHocPhi
    public void xuatDSSVTheoHocPhi(double min, double max) {
        for (KhoaDPT sv : khoaDPT) {
            if (sv.tinhHocPhi() >= min && sv.tinhHocPhi() <= max) {
                sv.hienThiThongTin();
                System.out.println("---------------------");
            }
        }
    }
 
    // hàm timKiemTheoTen
    public void timKiemTheoTen(String ten) {
        boolean timThay = false;
        for (KhoaDPT sv : khoaDPT) {
            if (sv.hoTen.toLowerCase().contains(ten.toLowerCase())) {
                sv.hienThiThongTin();
                System.out.println("---------------------");
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Không tìm thấy sinh viên nào có tên chứa: " + ten);
        }
    }
    
    // hàm sapXepTheoTenVaMSSV
     public void sapXepTheoTenVaMSSV() {
        Collections.sort(khoaDPT, new Comparator<KhoaDPT>() {
            @Override
            public int compare(KhoaDPT sv1, KhoaDPT sv2) {
                int compareTen = sv1.hoTen.compareToIgnoreCase(sv2.hoTen);
                if (compareTen == 0) {
                    return sv1.mssv.compareToIgnoreCase(sv2.mssv);
                }
                return compareTen;
            }
        });
    }

}
