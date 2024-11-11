package Tuan3.Bai4;



import java.util.Scanner;


public class Demo4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tạo đối tượng nhân viên nv1 bằng constructor có tham số
        NhanVien nv1 = new NhanVien("NV001", "Nguyen Van A", 1.5f);
        
        // Tạo đối tượng nhân viên nv2 bằng constructor mặc định và nhập thông tin từ bàn phím
        NhanVien nv2 = new NhanVien();
        nv2.nhap();
        
        // Tạo đối tượng nhân viên nv3 bằng constructor sao chép từ nv2
        NhanVien nv3 = new NhanVien(nv2);

        // Xuất thông tin nhân viên
        System.out.println("Thông tin nhân viên:");
        System.out.println(nv1.toString());
        System.out.println(nv2.toString());
        System.out.println(nv3.toString());

        // Thay đổi tên cho từng nhân viên (nv1, nv2, nv3)
        // Cho nv1
        System.out.println("Bạn có muốn đổi tên cho nv1? (y/n): ");
        String choice = sc.nextLine();
        if (choice.equals("y")) {
            System.out.print("Nhập tên mới cho nv1: ");
            String newHoTen = sc.nextLine();
            nv1.setHoTen(newHoTen);
            System.out.println("Thông tin sau khi thay đổi tên của nhân viên nv1:");
            System.out.println(nv1.toString());
        }

        // Cho nv2
        System.out.println("Bạn có muốn đổi tên cho nv2? (y/n): ");
        choice = sc.nextLine();
        if (choice.equals("y")) {
            System.out.print("Nhập tên mới cho nv2: ");
            String newHoTen = sc.nextLine();
            nv2.setHoTen(newHoTen);
            System.out.println("Thông tin sau khi thay đổi tên của nhân viên nv2:");
            System.out.println(nv2.toString());
        }
        
        // Cho nv3
        System.out.println("Bạn có muốn đổi tên cho nv3? (y/n): ");
        choice = sc.nextLine();
        if (choice.equals("y")) {
            System.out.print("Nhập tên mới cho nv3: ");
            String newHoTen = sc.nextLine();
            nv3.setHoTen(newHoTen);
            System.out.println("Thông tin sau khi thay đổi tên của nhân viên nv3:");
            System.out.println(nv3.toString());
        }

        // Tìm nhân viên có hệ số lương cao nhất
        float maxHeSo = Math.max(Math.max(nv1.getHsl(), nv2.getHsl()), nv3.getHsl());
        if (nv1.getHsl() == maxHeSo) {
            System.out.println("Nhân viên có hệ số lương cao nhất:\n" + nv1);
        } else if (nv2.getHsl() == maxHeSo) {
            System.out.println("Nhân viên có hệ số lương cao nhất:\n" + nv2);
        } else {
            System.out.println("Nhân viên có hệ số lương cao nhất:\n" + nv3);
        }

        // Nhập lương cơ bản cho nhân viên
        System.out.print("Nhập lương cơ bản cho nhân viên: ");
        float luongCoBan = sc.nextFloat();
        nv1.setLcb(luongCoBan);
        nv2.setLcb(luongCoBan);
        nv3.setLcb(luongCoBan);

        // In danh sách nhân viên cùng với lương
        System.out.println("Danh sách nhân viên:");
        NhanVien[] danhSachNhanVien = {nv1, nv2, nv3};

        for (int i = 0; i < danhSachNhanVien.length; i++) {
            System.out.println(danhSachNhanVien[i] + " Lương: " + danhSachNhanVien[i].TinhLuong());
        }

        // In số lượng nhân viên
        NhanVien.inSLNV();
    }
}