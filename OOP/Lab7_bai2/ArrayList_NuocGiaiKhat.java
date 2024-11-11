package Lab7_bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_NuocGiaiKhat {
    private ArrayList<NuocGiaiKhat> danhSachNuocGiaiKhat = new ArrayList<>();
    private int maNuocNgotCount = 1;
    private int maNuocCoGasCount = 1;

    // Phương thức nhập nước giải khát
    public void nhapNuocGiaiKhat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap loai nuoc (1-Nuoc Ngot, 2-Nuoc Co Gas): ");
        int loai = sc.nextInt();
        sc.nextLine();

        NuocGiaiKhat nuoc;
        if (loai == 1) {
            String maNuoc = "NN" + String.format("%03d", maNuocNgotCount++);
            nuoc = new NuocNgot(maNuoc, "", "", 0, 0); // Khởi tạo NuocNgot
        } else if (loai == 2) {
            String maNuoc = "NG" + String.format("%03d", maNuocCoGasCount++);
            nuoc = new NuocCoGas(maNuoc, "", "", 0, null); // Khởi tạo NuocCoGas
        } else {
            System.out.println("Loai nuoc khong hop le!");
            return;
        }

        // Gọi phương thức nhập của đối tượng, sẽ gọi phương thức nhapThongTin() từ lớp con
        nuoc.nhapThongTin();
        danhSachNuocGiaiKhat.add(nuoc);
        System.out.println("Da them nuoc giai khat thanh cong!");
    }

    // Phương thức hiển thị thông tin tất cả nước giải khát trong danh sách
    public void hienThiDanhSach() {
        if (danhSachNuocGiaiKhat.isEmpty()) {
            System.out.println("Danh sach nuoc giai khat trong!");
            return;
        }

        System.out.println("----- Danh sach nuoc giai khat -----");
        for (NuocGiaiKhat nuoc : danhSachNuocGiaiKhat) {
            nuoc.hienThiThongTin();
            System.out.println("-------------------");
        }
    }

    // Phương thức hiển thị giá tiền của từng loại nước giải khát
    public void hienThiGiaTien() {
        if (danhSachNuocGiaiKhat.isEmpty()) {
            System.out.println("Danh sach nuoc giai khat trong!");
            return;
        }

        System.out.println("----- Gia tien cua tung loai nuoc giai khat -----");
        for (NuocGiaiKhat nuoc : danhSachNuocGiaiKhat) {
            System.out.println("Loai nuoc: " + nuoc.getClass().getSimpleName());
            System.out.println("Ten nuoc: " + nuoc.getTenNuoc());
            System.out.println("Gia tien: " + nuoc.tinhGiaTien() + " VND");
            System.out.println("-----------------------------------------");
        }
    }

    // Các phương thức khác: tính tổng giá tiền, tìm kiếm, sắp xếp, v.v.
}
