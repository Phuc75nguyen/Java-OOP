package Tuan4;

import java.util.Scanner;

public class demo {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tạo đối tượng nhân viên nv1 bằng constructor có tham số
        NhanVien nv1 = new NhanVien("NV001", "Nguyen Van A", 5000000, 1.5f);
        
        // Tạo đối tượng nhân viên nv2 bằng constructor mặc định và nhập thông tin từ bàn phím
        NhanVien nv2 = new NhanVien();
        nv2.nhap();
        
        // Tạo đối tượng nhân viên nv3 bằng constructor sao chép từ nv2
        NhanVien nv3 = new NhanVien(nv2);

        // Xuất thông tin nhân viên
        System.out.println("Thong tin nhan vien:");
        System.out.println(nv1.toString());
        System.out.println(nv2.toString());
        System.out.println(nv3.toString());

        // Thay đổi tên cho từng nhân viên (nv1, nv2, nv3)
        // Cho nv1
        System.out.println("Ban co muon doi ten cho nv1? (y/n): ");
        String choice = sc.nextLine();
        if (choice.equals("y")) {
            System.out.print("Nhap ten moi cho nv1: ");
            String newHoTen = sc.nextLine();
            nv1.setHoTen(newHoTen);
            System.out.println("Thong tin sau khi thay doi ten của nhan vien nv1:");
            System.out.println(nv1.toString());
        }

        // Cho nv2
        System.out.println("Ban co muon doi ten cho nv2? (y/n): ");
        choice = sc.nextLine();
        if (choice.equals("y")) {
            System.out.print("Nhap ten moi cho nv2: ");
            String newHoTen = sc.nextLine();
            nv2.setHoTen(newHoTen);
            System.out.println("Thong tin sau khi thay doi ten cua nhan vien nv2:");
            System.out.println(nv2.toString());
        }
        
        // Cho nv3
        System.out.println("Ban co muon doi ten cho nv3? (y/n): ");
        choice = sc.nextLine();
        if (choice.equals("y")) {
            System.out.print("Nhap ten moi cho nv3: ");
            String newHoTen = sc.nextLine();
            nv3.setHoTen(newHoTen);
            System.out.println("Nhap he so luong moi");
            float newHsl = sc.nextFloat();
            nv3.setHsl(newHsl);
            System.out.println("Thong tin sau khi thay doi ten cua nhan vien nv3:");
            System.out.println(nv3.toString());
        }

        // Tìm nhân viên có hệ số lương cao nhất
        float maxHeSo = Math.max(Math.max(nv1.getHsl(), nv2.getHsl()), nv3.getHsl());
        if (nv1.getHsl() == maxHeSo) {
            System.out.println("Nhan vien có he so luong cao nhat:\n" + nv1);
        } else if (nv2.getHsl() == maxHeSo) {
            System.out.println("Nhan vien co he so luong cao nhat:\n" + nv2);
        } else {
            System.out.println("Nhan vien co he so luong cao nhat:\n" + nv3);
        }

        // Nhập lương cơ bản cho nhân viên
       Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        NhanVien[] danhSachNhanVien = new NhanVien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho nhan vien thu " + (i + 1) + ":");
            danhSachNhanVien[i] = new NhanVien();
            danhSachNhanVien[i].nhap();
        }

        System.out.println("Danh sach nhan vien va luong cua ho:");
        for (int i = 0; i < n; i++) {
            System.out.println(danhSachNhanVien[i] + ", Luong: " + danhSachNhanVien[i].tinhLuong());
        }

        // In số lượng nhân viên
        NhanVien.inSLNV();
    }
}
