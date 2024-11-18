package lab5;

import java.util.Scanner;

public class mainDemo {
    public static void main(String[] args) {
        QuanLySV quanLySV = new QuanLySV();
        Scanner sc = new Scanner(System.in);
        int luaChon;

        do {

            System.out.println("MENU:");
            System.out.println("1. Nhap sinh vien");
            System.out.println("2. Xuat danh sach sinh vien");
            System.out.println("3. Xuất DSSV có tiền học phí từ 10.000.000đ đến 15.000.000đ");
            System.out.println("4. Tìm kiếm SV theo tên");
            System.out.println("5. Sắp xếp DSSV theo thứ tự tăng dần theo tên, nếu cùng tên, sắp tăng theo mã.");
            System.out.println("6. Thoat chuong trinh!");
            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon) {
                case 1:
                    quanLySV.nhapSinhVien();
                    break;
                case 2:
                    quanLySV.xuatDSSV();
                    break;
                case 3:
                System.out.println("Nhập khoảng học phí (min max): ");
                    double min = sc.nextDouble();
                    double max = sc.nextDouble();
                    quanLySV.xuatDSSVTheoHocPhi(min, max);

                    break;
                case 4:
                    System.out.println("Nhập tên sinh viên cần tìm: ");
                    String ten = sc.nextLine();
                    quanLySV.timKiemTheoTen(ten);
                    break;
                case 5:
                    quanLySV.sapXepTheoTenVaMSSV();
                    System.out.println("Danh sach sinh vien da duoc sap xep!");
                    break;
                case 6:
                   System.out.println("Thoat chuong trinh");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (luaChon != 0);
        sc.close();
    }

}
