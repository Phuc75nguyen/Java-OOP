package Lab7_bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList_NuocGiaiKhat danhSachNuocGiaiKhat = new ArrayList_NuocGiaiKhat();
        Scanner sc = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Nhap nuoc giai khat");
            System.out.println("2. Hien thi danh sach nuoc giai khat");
            System.out.println("3. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            luaChon = sc.nextInt();

            switch (luaChon) {
                case 1:
                    danhSachNuocGiaiKhat.nhapNuocGiaiKhat();
                    break;
                case 2:
                    danhSachNuocGiaiKhat.hienThiDanhSach();
                    break;
                case 3:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        } while (luaChon != 3);

        sc.close();
    }
}
