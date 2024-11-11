package Lap7_Hashset;

import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Month;

// Lớp trừu tượng cho nước giải khát
abstract class NuocGiaiKhat {
    protected String maNuoc;
    protected String tenNuoc;
    protected LocalDate hanSuDung;
    protected int trongLuong;

    public NuocGiaiKhat(String maNuoc, String tenNuoc, LocalDate hanSuDung, int trongLuong) {
        this.maNuoc = maNuoc;
        this.tenNuoc = tenNuoc;
        this.hanSuDung = hanSuDung;
        this.trongLuong = trongLuong;
    }

    public String getMaNuoc() {
        return maNuoc;
    }

    public String getTenNuoc() {
        return tenNuoc;
    }

    public LocalDate getHanSuDung() {
    return hanSuDung;
}

    public int getTrongLuong() {
        return trongLuong;
    }

    public void setMaNuoc(String maNuoc) {
        this.maNuoc = maNuoc;
    }

    public void setTenNuoc(String tenNuoc) {
        this.tenNuoc = tenNuoc;
    }

    public void setHanSuDung(LocalDate hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    public void setTrongLuong(int trongLuong) {
        this.trongLuong = trongLuong;
    }
    
    public abstract double tinhGiaTien();

    @Override
     public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Ma nuoc: " + maNuoc + ", Ten nuoc: " + tenNuoc + 
               ", Han su dung: " + hanSuDung.format(formatter) + 
               ", Trong luong: " + trongLuong + "ml";
    }
}

// Lớp cho nước ngọt
class NuocNgot extends NuocGiaiKhat {
    private double doNgot; // Độ ngọt

  public NuocNgot(String maNuoc, String tenNuoc, LocalDate hanSuDung, int trongLuong, double doNgot) {
        super(maNuoc, tenNuoc, hanSuDung, trongLuong);
        this.doNgot = doNgot;
    }

    @Override
    public double tinhGiaTien() {
        return getTrongLuong() * 300; // Tính giá tiền
    }

    @Override
    public String toString() {
        return "Nuoc Ngot: " + getMaNuoc() + 
               ", Ten: " + getTenNuoc() + 
               ", Han su dung: " + getHanSuDung().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + 
               ", Trong luong: " + getTrongLuong() + "ml" + 
               ", Do ngot: " + doNgot + 
               ", Gia: " + tinhGiaTien() + " VND";
    }

    // Getter và Setter cho độ ngọt
    public double getDoNgot() {
        return doNgot;
    }

    public void setDoNgot(double doNgot) {
        this.doNgot = doNgot;
    }
}


class NuocCoGas extends NuocGiaiKhat {
    private String xuatXu;
    private static final double TI_GIA_CHAU_A = 0.95;
    private static final double TI_GIA_CHAU_AU = 1.5;

    public NuocCoGas(String maNuoc, String tenNuoc, LocalDate hanSuDung, int trongLuong, String xuatXu) {
        super(maNuoc, tenNuoc, hanSuDung, trongLuong);
        this.xuatXu = xuatXu;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }
    

    @Override
    public double tinhGiaTien() {
        double tiGia = xuatXu.equals("Chau A") ? TI_GIA_CHAU_A : TI_GIA_CHAU_AU;
        return trongLuong * 200 * tiGia;
    }

    

    @Override
    public String toString() {
        return super.toString() + ", Xuat xu: " + xuatXu + ", Gia tien: " + tinhGiaTien()+"VND";
    }
}

public class LabT7_Bai4 {
       public static void main(String[] args) {
        QuanLyNuocGiaiKhat quanLy = new QuanLyNuocGiaiKhat();
        quanLy.menu();  
    }
}

class QuanLyNuocGiaiKhat {
    private Set<NuocGiaiKhat> danhSachNuocGiaiKhat = new HashSet<>();
    private static int maNuocNgotCounter = 1;
    private static int maNuocCoGasCounter = 1;
    private Scanner scanner = new Scanner(System.in);
    private boolean exit = false;

    public void menu() {
        do {
            System.out.println("1. Nhap nuoc ngot");
            System.out.println("2. Nhap nuoc co gas");
            System.out.println("3. Xuat danh sach nuoc ngot");
            System.out.println("4. Xuat danh sach nuoc co gas");
            System.out.println("5. Tinh tong gia tien nuoc ngot");
            System.out.println("6. Tinh tong gia tien nuoc co gas");
            System.out.println("7. Tim kiem nuoc giai khat theo han su dung");
            System.out.println("8. Tim kiem nuoc giai khat con it hon 8 ngay nua het han");
            System.out.println("9. Sua thong tin nuoc giai khat theo ma");
            System.out.println("10. Tim nuoc co gas het han thang 10/2024");
            System.out.println("11. Tim nuoc co gas xuat xu Chau A va trong luong >= 1000ml");
            System.out.println("12. Tim nuoc giai khat theo ten");
            System.out.println("13. Dem so luong va tong tien nuoc xuat xu Chau A");
            System.out.println("14. Xoa nuoc giai khat theo ma");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1 -> nhapNuocNgot(scanner);
                case 2 -> nhapNuocCoGas(scanner);
                case 3 -> xuatDanhSachNuocNgot();
                case 4 -> xuatDanhSachNuocCoGas();
                case 5 -> tinhTongGiaNuocNgot();
                case 6 -> tinhTongGiaNuocCoGas();
                case 7 -> timKiemNuocTheoHanSuDung(scanner);
                case 8 -> timKiemNuocCon8Ngay(scanner);
                case 9 -> suaThongTinNuoc(scanner);
                case 10 -> timNuocCoGasHetHanThang10_2024();
                case 11 -> timNuocCoGasChauA_TrongLuongLonHon1000ml();
                case 12 -> timNuocTheoTen(scanner);
                case 13 -> demVaTinhTongTienNuocChauA();
                case 14 -> xoaNuocGiaiKhat(scanner);
                case 0 -> exit = true;
                default -> System.out.println("Lua chon khong hop le.");
            }
        } while (!exit);
    }
    

    private void nhapNuocNgot(Scanner scanner) {
    System.out.print("Nhap ten nuoc: ");
    String tenNuoc = scanner.nextLine();

    // Nhập hạn sử dụng mà không kiểm tra tính hợp lệ
    System.out.print("Nhap han su dung (dd/MM/yyyy): ");
    LocalDate hanSuDung = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    System.out.print("Nhap trong luong (ml): ");
    int trongLuong = scanner.nextInt();
    System.out.print("Nhap do ngot: ");
    double doNgot = scanner.nextDouble();
    scanner.nextLine(); // Clear buffer

    String maNuoc = "NN" + String.format("%03d", maNuocNgotCounter++);
    NuocNgot nuocNgot = new NuocNgot(maNuoc, tenNuoc, hanSuDung, trongLuong, doNgot);

    danhSachNuocGiaiKhat.add(nuocNgot);
    System.out.println("Da them nuoc ngot: " + nuocNgot);
}

private void nhapNuocCoGas(Scanner scanner) {
    System.out.print("Nhap ten nuoc: ");
    String tenNuoc = scanner.nextLine();

    // Nhập hạn sử dụng mà không kiểm tra tính hợp lệ
    System.out.print("Nhap han su dung (dd/MM/yyyy): ");
    LocalDate hanSuDung = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    System.out.print("Nhap trong luong (ml): ");
    int trongLuong = scanner.nextInt();
    scanner.nextLine(); // Clear buffer

    System.out.print("Nhap xuat xu (Chau A/Chau Au): ");
    String xuatXu = scanner.nextLine();
    while (!xuatXu.equalsIgnoreCase("Chau A") && !xuatXu.equalsIgnoreCase("Chau Au")) {
        System.out.print("Xuat xu khong hop le. Vui long nhap lai (Chau A/Chau Au): ");
        xuatXu = scanner.nextLine();
    }

    String maNuoc = "NG" + String.format("%03d", maNuocCoGasCounter++);
    NuocCoGas nuocCoGas = new NuocCoGas(maNuoc, tenNuoc, hanSuDung, trongLuong, xuatXu);
    danhSachNuocGiaiKhat.add(nuocCoGas);
    System.out.println("Da them nuoc co gas: " + nuocCoGas);
}

     private void xuatDanhSachNuocNgot() {
        System.out.println("Danh sach nuoc ngot:");
        for (NuocGiaiKhat nuoc : danhSachNuocGiaiKhat) {
            if (nuoc instanceof NuocNgot) {
                System.out.println(nuoc);
            }
        }
    }

     
    private void xuatDanhSachNuocCoGas() {
        System.out.println("Danh sach nuoc co gas:");
        for (NuocGiaiKhat nuoc : danhSachNuocGiaiKhat) {
            if (nuoc instanceof NuocCoGas) {
                System.out.println(nuoc);
            }
        }
    }

    private void tinhTongGiaNuocNgot() {
        double tongGia = 0;
        for (NuocGiaiKhat nuoc : danhSachNuocGiaiKhat) {
            if (nuoc instanceof NuocNgot) {
                tongGia += nuoc.tinhGiaTien();
            }
        }
        System.out.println("Tong gia tien nuoc ngot: " + tongGia+"VND");
    }

    private void tinhTongGiaNuocCoGas() {
        double tongGia = 0;
        for (NuocGiaiKhat nuoc : danhSachNuocGiaiKhat) {
            if (nuoc instanceof NuocCoGas) {
                tongGia += nuoc.tinhGiaTien();
            }
        }
        System.out.println("Tong gia tien nuoc co gas: " + tongGia+"VND");
    }

    private void timKiemNuocTheoHanSuDung(Scanner scanner) {
    System.out.print("Nhap ngay han su dung (dd/MM/yyyy): ");
    LocalDate ngayNhap = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    System.out.println("Danh sach nuoc giai khat het han su dung vao ngay " + ngayNhap.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ":");

    boolean coNuocGiaiKhat = false; // Biến cờ để kiểm tra có sản phẩm nào thỏa mãn không
    for (NuocGiaiKhat nuoc : danhSachNuocGiaiKhat) {
        LocalDate hanSuDungNuoc = nuoc.getHanSuDung(); // Gọi phương thức getHanSuDung
        if (hanSuDungNuoc.isEqual(ngayNhap)) { // Kiểm tra xem nước có hết hạn vào ngày nhập không
            System.out.println(nuoc); // In thông tin nước
            coNuocGiaiKhat = true; // Nếu có sản phẩm, cập nhật biến cờ
        }
    }

    if (!coNuocGiaiKhat) {
        System.out.println("Khong tim thay nuoc giai khat het han su dung vao ngay " + ngayNhap.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ".");
    }
}



    private void suaThongTinNuoc(Scanner scanner) {
        System.out.print("Nhap ma nuoc can sua: ");
        String maNuoc = scanner.nextLine();
        for (NuocGiaiKhat nuoc : danhSachNuocGiaiKhat) {
            if (nuoc.getMaNuoc().equals(maNuoc)) {
                System.out.print("Nhap ten nuoc moi: ");
                nuoc.setTenNuoc(scanner.nextLine());
                System.out.print("Nhap han su dung moi (dd/MM/yyyy): ");
                nuoc.setHanSuDung(LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                System.out.print("Nhap trong luong moi (ml): ");
                nuoc.setTrongLuong(scanner.nextInt());
                scanner.nextLine(); // Clear buffer
                System.out.println("Da cap nhat thong tin: " + nuoc);
                return;
            }
        }
        System.out.println("Khong tim thay nuoc co ma: " + maNuoc);
    }

    private void timNuocCoGasHetHanThang10_2024() {
        System.out.println("Danh sach nuoc co gas het han thang 10/2024:");
        boolean found = false;
        for (NuocGiaiKhat nuoc : danhSachNuocGiaiKhat) {
            if (nuoc instanceof NuocCoGas && nuoc.getHanSuDung().getYear() == 2024 && nuoc.getHanSuDung().getMonth() == Month.OCTOBER) {
                System.out.println(nuoc);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay nuoc co gas het han thang 10/2024.");
        }
    }

    private void timNuocCoGasChauA_TrongLuongLonHon1000ml() {
        System.out.println("Danh sach nuoc co gas xuat xu Chau A va trong luong >= 1000ml:");
        boolean found = false;
        for (NuocGiaiKhat nuoc : danhSachNuocGiaiKhat) {
            if (nuoc instanceof NuocCoGas && ((NuocCoGas) nuoc).getXuatXu().equals("Chau A") && nuoc.getTrongLuong() >= 1000) {
                System.out.println(nuoc);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay nuoc co gas xuat xu Chau A va trong luong >= 1000ml.");
        }
    }

    private void timNuocTheoTen(Scanner scanner) {
        System.out.print("Nhap ten nuoc can tim: ");
        String tenNuoc = scanner.nextLine();
        boolean found = false;
        for (NuocGiaiKhat nuoc : danhSachNuocGiaiKhat) {
            if (nuoc.getTenNuoc().equalsIgnoreCase(tenNuoc)) {
                System.out.println(nuoc);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay nuoc co ten: " + tenNuoc);
        }
    }

    private void demVaTinhTongTienNuocChauA() {
        int count = 0;
        double tongTien = 0;
        for (NuocGiaiKhat nuoc : danhSachNuocGiaiKhat) {
            if (nuoc instanceof NuocCoGas && ((NuocCoGas) nuoc).getXuatXu().equals("Chau A")) {
                count++;
                tongTien += nuoc.tinhGiaTien();
            }
        }
        System.out.println("So luong nuoc giai khat xuat xu Chau A: " + count);
        System.out.println("Tong gia tien: " + tongTien);
    }

    private void xoaNuocGiaiKhat(Scanner scanner) {
        System.out.print("Nhap ma nuoc can xoa: ");
        String maNuoc = scanner.nextLine();
        boolean found = false;
        Iterator<NuocGiaiKhat> iterator = danhSachNuocGiaiKhat.iterator();
        while (iterator.hasNext()) {
            NuocGiaiKhat nuoc = iterator.next();
            if (nuoc.getMaNuoc().equals(maNuoc)) {
                iterator.remove();
                found = true;
                System.out.println("Da xoa nuoc giai khat co ma: " + maNuoc);
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay nuoc giai khat co ma: " + maNuoc);
        }
    }

    private void timKiemNuocCon8Ngay(Scanner scanner) {
    System.out.print("Nhap ngay hien tai (dd/MM/yyyy): ");
    LocalDate today = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    LocalDate endDate = today.plusDays(8);

    System.out.println("Danh sach nuoc giai khat con it hon 8 ngay nua la het han su dung:");
    boolean found = false;

    for (NuocGiaiKhat nuoc : danhSachNuocGiaiKhat) {
        if (nuoc.getHanSuDung().isAfter(today) && nuoc.getHanSuDung().isBefore(endDate)) {
            System.out.println(nuoc);
            found = true;
        }
    }

    if (!found) {
        System.out.println("Khong tim thay nuoc giai khat con it hon 8 ngay nua la het han su dung.");
    }
}

}
