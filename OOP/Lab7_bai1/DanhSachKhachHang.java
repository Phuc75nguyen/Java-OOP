package Lab7_bai1;

import java.util.*;;

/**
 * DanhSachKhachHang
 */
public class DanhSachKhachHang {
    private ArrayList<Khach_Hang> DanhSachKhachHang = new ArrayList<>();
    private HashMap<String, Tai_Khoan> taikhoanMap = new HashMap<>();
    private int maKhachHangTuDong = 1;

    // phuong thuc them khach hang
    public void themKhachHang(Khach_Hang kh) {
        DanhSachKhachHang.add(kh);

    }

    // phuong thuc nhap danh sach khach hang

    public void nhapDSKH() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong khach hang can them: ");
        int soLuong = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap thong tin khach hang thu: " + (i + 1) + ":");
            String maKH = "KH" + maKhachHangTuDong++;

            System.out.println("Ho va Ten KH: ");
            String hoTen = sc.nextLine();

            String soCCCD;
            while (true) {
                System.out.println("So CCCD: ");
                soCCCD = sc.nextLine();
                if (kiemtraTrung(soCCCD)) {
                    System.out.println("So CCCD bi trung. Moi nhap lai!");
                } else {
                    break;
                }
            }

            System.out.println("Nhap so dien thoai: ");
            String soDT = sc.nextLine();

            System.out.println("Nhap dia chi: ");
            String diaChi = sc.nextLine();

            // Nhap danh sach tai khoan khach hang
            ArrayList<Tai_Khoan> dsTKhoan = new ArrayList<>();
            System.out.println("Nhap so luong tai khoan cua khach hang: ");
            int soLuongTk = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < soLuongTk; j++) {
                System.out.println("Nhap thong tin tai khoan thu " + (j + 1) + ":");

                String soTK;
                while (true) {
                    System.out.print("So tai khoan: ");
                    soTK = sc.nextLine();
                    if (taikhoanMap.containsKey(soTK)) {
                        System.out.println("So tai khoan da ton tai! Nhap lai.");
                    } else {
                        break;
                    }
                }

                System.out.print("Loai tai khoan: ");
                String loaiTK = sc.nextLine();

                System.out.print("So du: ");
                double soDu = sc.nextDouble();
                sc.nextLine();

                Tai_Khoan tk = new Tai_Khoan(soTK, loaiTK, soDu);
                dsTKhoan.add(tk);
                taikhoanMap.put(soTK, tk); // Map soTK voi doi tuong Tai_Khoan
            }

            // Tao khach hang voi du lieu duoc nhap
            Khach_Hang kh = new Khach_Hang(maKH, hoTen, soCCCD, soDT, diaChi, dsTKhoan);
            themKhachHang(kh); // Them khach hang vao danh sach
        }
        System.out.println("Da them danh sach khach hang thanh cong!");
    }

    // phuong thuc kiem tra so cccd trung?
    public boolean kiemtraTrung(String soCCCD) {
        for (Khach_Hang kh : DanhSachKhachHang) {
            if (kh.getSoCCCD().equals(soCCCD)) {
                return true;

            }
        }
        return false;
    }

    // phuong thuc tim khach hang theo soCCCD
    public Khach_Hang timKH_theo_CCCD(String soCCCD) {
        for (Khach_Hang kh : DanhSachKhachHang) {
            if (kh.getSoCCCD().equals(soCCCD)) {
                return kh;
            }

        }
        return null;
    }

    // tim tai khoan theo so tai khoan
    public Tai_Khoan timTK_theoSTK(String soTK) {
        return taikhoanMap.get(soTK);
    }

    // phuong thuc thay doi so su
    /*
     * lay so tai khoan
     * neu so tai khoan ton tai
     * cap nhat so du moi
     * neu stk khong ton tai "khong tim thay"
     */

    public void thaydoiSoDu(String soTK, double soDuMoi) {
        Tai_Khoan tk = taikhoanMap.get(soTK);
        if (tk != null) {
            tk.setSoDu(soDuMoi);
            System.out.println("Cap nhat so du thanh cong!");

        } else {
            System.out.println("Khong tim thay so tai khoan thich hop!");
        }
    }

    // phuong thuc xoa tai khoan
    /*
     * Duyệt qua danh sách khách hàng để tìm tài khoản có số tài khoản trùng `soTK`
     * Xóa tài khoản nếu tìm thấy trong danh sách tài khoản của từng khách hàng
     * Đồng thời, xóa tài khoản khỏi `taikhoanMap` nếu `soTK` tồn tại
     */
    public void xoaTK(String soTK) {
        for (Khach_Hang kh : DanhSachKhachHang) {
            kh.getDsTaiKhoan().removeIf(tk -> tk.getSoTK().equals(soTK));
        }
        taikhoanMap.remove(soTK);
        System.out.println("Tai khoan da duoc xoa thanh cong!");
    }

    // sắp xếp khách hàng
    /*
     * Sắp xếp danh sách khách hàng theo thứ tự tăng dần của họ tên
     * Sau đó, với mỗi khách hàng trong danh sách, sắp xếp danh sách tài khoản của
     * khách hàng đó theo thứ tự giảm dần của số dư
     */
    public void sapxepKhachHang() {
        Collections.sort(DanhSachKhachHang, Comparator.comparing(Khach_Hang::getHoTen));
        for (Khach_Hang kh : DanhSachKhachHang) {
            Collections.sort(kh.getDsTaiKhoan(), (tk1, tk2) -> Double.compare(tk1.getSoDu(), tk2.getSoDu()));
            // sắp xếp danh sách tài khoản DsTaiKhoan của từng khách hàng kh theo thứ tự
            // giảm dần của số dư (soDu)
        }
        System.out.println("Danh sach da duoc sap xep thanh cong!");
    }

    // hien thi khach hang
    public void hienThiKH() {
        for (Khach_Hang kh : DanhSachKhachHang) {
            System.out.println(kh);
        }
    }

}