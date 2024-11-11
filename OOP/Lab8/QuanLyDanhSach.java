package Lab8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class QuanLyDanhSach {
    private ArrayList<HocVien> hocVien = new ArrayList<>();
    private ArrayList<NhanVien> nhanVien = new ArrayList<>();

    // phuong thuc nhap hocVien
    public void nhapHocVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong hoc Vien: ");
        int soLuongHV = 0;

        try {
            soLuongHV = sc.nextInt();
            sc.nextLine();

        } catch (InputMismatchException e) {

            System.out.println("Loi! Vui long nhap lai mot so nguyen!");
            sc.nextLine();
            return;

        }

        for (int i = 0; i < soLuongHV; i++) {
            HocVien hv = new HocVien(null, null, i, i, i);
            hv.nhapThongTin();

            while (hv.getDiem1() < 0 || hv.getDiem1() > 10 || hv.getDiem2() < 0 || hv.getDiem2() > 10
                    || hv.getDiem3() < 0 || hv.getDiem3() > 10) {
                System.out.println("Diem khong hop le. Nhap lai.");
                hv.nhapThongTin();
            }

            hocVien.add(hv);
        }

    }

    // phuong thuc xuat hocVien
    public void xuatHocVien() {
        System.out.println("Danh sach Hoc Vien la: ");
        for (HocVien hv : hocVien) {
            hv.hienThiThongTin();
            System.out.println("Tong diem la: " + (hv.getDiem1() + hv.getDiem2() + hv.getDiem3()));
        }
    }

    // phuong thuc nhap nhanVien
    public void nhapNhanVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong nhan vien: ");
        int soLuong = 0;

        try {
            soLuong = sc.nextInt();
            sc.nextLine(); // Bỏ qua dòng xuống
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Vui lòng nhập một số nguyên.");
            sc.nextLine(); // Bỏ qua dòng lỗi
            return;
        }

        for (int i = 0; i < soLuong; i++) {
            NhanVien nv = new NhanVien(null, null, soLuong, null, null);
            nv.nhapThongTin();

            try {
                while (nv.getLuong() < 0) {
                    System.out.println("Luong khong hop le. Nhap lai.");
                    nv.nhapThongTin();
                }
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Vui lòng nhập số hợp lệ cho lương.");
                sc.nextLine();
            }

            nhanVien.add(nv);
        }
    }

    // phuong thuc xuat nhnVien
    public void xuatNhanVien() {
        System.out.println("Danh sach Nhan Vien la: ");
        for (NhanVien nv : nhanVien) {
            nv.hienThiThongTin();
        }
    }

    // ham tim học viên có điểm cao nhất
    public void timHocVienDiemCaoNhat() {
        HocVien diemHocVienMax = Collections.max(hocVien,
                Comparator.comparingDouble(hv -> hv.getDiem1() + hv.getDiem2() + hv.getDiem3()));
        System.out.println("Hoc vien co diem cao nhat la:");
        diemHocVienMax.hienThiThongTin();
    }

    // hàm xuất học viên có điểm đạt
    public void xuatHocVienDat() {
        System.out.println("Hoc vien hoc dat la:");
        for (HocVien hv : hocVien) {
            if (hv.getDiem1() >= 4 && hv.getDiem2() >= 4 && hv.getDiem3() >= 4
                    && (hv.getDiem1() + hv.getDiem2() + hv.getDiem3()) >= 15) {
                hv.hienThiThongTin();
            }
        }

    }

    // hàm timNhanVienTheoPhongBan
    public void timNhanVienTheoPhongBan(String phongBan) {
        System.out.println("Danh sach nhan vien thuoc phong ban " + phongBan + ":");
        for (NhanVien nv : nhanVien) {
            if (nv.getPbk().equalsIgnoreCase(phongBan)) {
                nv.hienThiThongTin();
            }
        }
    }
    

    // hàm tính tổng lương CNtt
    public void tongLuongPhongCNTT() {
        double tongLuong = 0;
        for (NhanVien nv : nhanVien) {
            if (nv.getPbk().equalsIgnoreCase("CNTT")) {
                tongLuong += nv.getLuong();

            }
        }
        System.out.println("Tong luong phong cong nghe thong tin la:" + tongLuong);

    }

    // hàm timNhanVienTheoThangNam
    public void timNhanVienTheoThangNam(String thangNam) {
        try {
            if (!thangNam.matches("\\d{2}/\\d{4}")) { // Kiểm tra định dạng mm/yyyy
                throw new IllegalArgumentException("Dinh dang thang nam khong hop le. Vui long nhap theo mm/yyyy.");
            }

            System.out.println("Danh sach nhan vien nhan viec vao thang nam " + thangNam + ":");
            for (NhanVien nv : nhanVien) {
                if (nv.getNgayNhanViec().contains(thangNam)) {
                    nv.hienThiThongTin();
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    // hàm timNhanVienSinhNam2000
    public void timNhanVienSinhNam2000() {
        System.out.println("Danh sach nhan vien sinh nam 2000:");
        for (NhanVien nv : nhanVien) {
            if (nv.getNamSinh().endsWith("2000")) {
                nv.hienThiThongTin();
            }

        }

    }

    // hàm sapXepNhanVienTheoNgayNhanViec
    public void sapXepNhanVienTheoNgayNhanViec() {
        nhanVien.sort((nv1, nv2) -> {
            String[] date1 = nv1.getNgayNhanViec().split("/");
            String[] date2 = nv2.getNgayNhanViec().split("/");

            int yearComparison = date1[2].compareTo(date2[2]);
            if (yearComparison != 0) {
                return yearComparison;
            }
            int monthComparison = date1[0].compareTo(date2[0]);
            if (monthComparison != 0) {
                return monthComparison;
            }
            return date1[1].compareTo(date2[1]);
        });
        System.out.println("Danh sach nhan vien sau khi sap xep theo ngay nhan viec:");
        for (NhanVien nv : nhanVien) {
            nv.hienThiThongTin();
        }
    }

    // hàm sapXepHocVienTheoTongDiem
    public void sapXepHocVienTheoTongDiem() {
        hocVien.sort((hv1, hv2) -> {
            double tongDiem1 = hv1.getDiem1() + hv1.getDiem2() + hv1.getDiem3();
            double tongDiem2 = hv2.getDiem1() + hv2.getDiem2() + hv2.getDiem3();
            return Double.compare(tongDiem2, tongDiem1); // Sắp xếp giảm dần theo tổng điểm
        });
        System.out.println("Danh sach hoc vien sau khi sap xep theo tong diem:");
        for (HocVien hv : hocVien) {
            hv.hienThiThongTin();
        }
    }

}
