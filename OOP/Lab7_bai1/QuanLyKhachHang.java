package Lab7_bai1;
import java.util.*;

public class QuanLyKhachHang {
    public static void main(String[] args) {
        DanhSachKhachHang dsKhachHang = new DanhSachKhachHang();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("========= MENU QUAN LY KHACH HANG =========");
            System.out.println("1. NHAP DANH SACH KHACH HANG");
            System.out.println("2. XUAT DANH SACH KHACH HANG");
            System.out.println("3. TIM KH THEO SO CCCD");
            System.out.println("4. TIM KH THEO SO TK");
            System.out.println("5. THAY DOI TIEN TRONG SO TK");
            System.out.println("6. XOA KHACH HANG THEO SO TAI KHOAN");
            System.out.println("7. SAP XEP KHACH HANG THEO HO TEN VA SO DU");
            System.out.println("0. EXIT");
            System.out.print("CHON CHUC NANG: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Gọi phương thức để nhập danh sách khách hàng
                    dsKhachHang.nhapDSKH();
                case 2:
                    // Gọi phương thức để xuất danh sách khách hàng
                    dsKhachHang.hienThiKH();
                    break;
                case 3:
                    // Tìm khách hàng theo số CCCD
                    System.out.print("Nhap so CCCD can tim: ");
                    String cccd = sc.next();
                    dsKhachHang.timKH_theo_CCCD(cccd);
                    break;
                case 4:
                    // Tìm khách hàng theo số tài khoản
                    System.out.print("Nhap so tai khoan can tim: ");
                    String soTK = sc.next();
                    dsKhachHang.timTK_theoSTK(soTK);
                    break;
                case 5:
                    // Thay đổi số dư theo số tài khoản
                    System.out.print("Nhap so tai khoan can thay doi so du: ");
                    String soTKThayDoi = sc.next();
                    System.out.print("Nhap so du moi: ");
                    double soDuMoi = sc.nextDouble();
                    dsKhachHang.thaydoiSoDu(soTKThayDoi, soDuMoi);
                    break;
                case 6:
                    // Xóa tài khoản của khách hàng theo số tài khoản
                    System.out.print("Nhap so tai khoan can xoa: ");
                    String soTKXoa = sc.next();
                    dsKhachHang.xoaTK(soTKXoa);
                    break;
                case 7:
                    // Sắp xếp danh sách khách hàng
                    dsKhachHang.sapxepKhachHang();
                    break;
                case 0:
                    System.out.println("Da thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai!.");
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
