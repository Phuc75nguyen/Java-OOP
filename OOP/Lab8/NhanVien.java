package Lab8;

import java.util.Scanner;

public class NhanVien extends ConNguoi {
    private double luong;
    private String ngayNhanViec;
    private String pbk;

    public NhanVien(String hoTen, String namSinh, double luong, String ngayNhanViec, String pbk) {
        super(hoTen, namSinh);
        this.luong = luong;
        this.ngayNhanViec = ngayNhanViec;
        this.pbk = pbk;
    }

    public NhanVien() {
        super();
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getNgayNhanViec() {
        return ngayNhanViec;
    }

    public void setNgayNhanViec(String ngayNhanViec) {
        this.ngayNhanViec = ngayNhanViec;
    }

    public String getPbk() {
        return pbk;
    }

    public void setPbk(String pbk) {
        this.pbk = pbk;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);

        // Nhập lương và kiểm tra xem có là số nguyên dương không
        while (true) {
            System.out.println("Nhap luong: ");
            try {
                luong = sc.nextDouble();
                if (luong <= 0) {
                    System.out.println("Lương phải là số dương. Vui lòng nhập lại.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Lỗi: Vui lòng nhập số hợp lệ cho lương.");
                sc.nextLine(); // Bỏ qua dòng lỗi để tránh lặp vô hạn
            }
        }

        // Nhập ngày nhận việc
        sc.nextLine();
        System.out.println("Nhap ngay nhan viec (mm/dd/yyyy): ");
        ngayNhanViec = sc.nextLine();

        // Nhập phòng ban khoa và kiểm tra
        String[] validPbk = { "CNTT", "KHMT", "KINH_TE", "VIEN_THONG" };
        while (true) {
            System.out.println("Nhap Phong ban khoa (CNTT, KHMT, KINH_TE, VIEN_THONG): ");
            pbk = sc.nextLine().toUpperCase();

            boolean isValid = false;
            for (String valid : validPbk) {
                if (pbk.equals(valid)) {
                    isValid = true;
                    break;
                }
            }

            if (isValid) {
                break;
            } else {
                System.out
                        .println("Phong ban khoa khong hop le. Vui long chon trong: CNTT, KHMT, KINH_TE, VIEN_THONG.");
            }
        }
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Luong la: " + luong);
        System.out.println("Ngay nhan viec la: " + ngayNhanViec);
        System.out.println("Phong ban khoa la: " + pbk);
    }
}
