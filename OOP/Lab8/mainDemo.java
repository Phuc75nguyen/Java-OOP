package Lab8;

import java.util.Scanner;

public class mainDemo {
    public static void main(String[] args) {
        QuanLyDanhSach qlds = new QuanLyDanhSach();
        Scanner sc = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("MENU:");
            System.out.println("1. Nhap hoc vien");
            System.out.println("2. Xuat danh sach hoc vien");
            System.out.println("3. Nhap nhan vien");
            System.out.println("4. Xuat danh sach nhan vien");
            System.out.println("5. Tim hoc vien co tong diem cao nhat");
            System.out.println("6. Xuat hoc vien dat");
            System.out.println("7. Tim nhan vien theo phong ban");
            System.out.println("8. Tong luong phong CNTT");
            System.out.println("9. Tim nhan vien theo thang nam nhan viec");
            System.out.println("10. Tim nhan vien sinh nam 2000");
            System.out.println("11. Sap xep nhan vien theo ngay nhan viec");
            System.out.println("12. Sap xep hoc vien theo tong diem");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            luaChon = sc.nextInt();
            sc.nextLine(); 


            switch (luaChon) {
                case 1:
                     qlds.nhapHocVien();
                    break;
                case 2:
                    qlds.xuatHocVien();
                    break;
                case 3:
                     qlds.nhapNhanVien();
                    break;
                case 4:
                     qlds.xuatNhanVien();
                    break;
                case 5:
                    qlds.timHocVienDiemCaoNhat();
                    break;
                case 6:
                    qlds.xuatHocVienDat();
                    break;
                case 7:
                System.out.print("Nhap phong ban can tim: ");
                String phongBan = sc.nextLine();
                qlds.timNhanVienTheoPhongBan(phongBan); // Truyền phongBan làm tham số
                break;
            
                case 8:
                     qlds.tongLuongPhongCNTT();
                    break;
                case 9:
                    System.out.print("Nhap thang nam (mm/yyyy): ");
                    String thangNam = sc.nextLine();
                    qlds.timNhanVienTheoThangNam(thangNam);
                    break;
                case 10:
                     qlds.timNhanVienSinhNam2000();
                    break;
                case 11:
                    qlds.sapXepNhanVienTheoNgayNhanViec();
                    break;
                case 12:
                     qlds.sapXepHocVienTheoTongDiem();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (luaChon != 0);

        sc.close();
    }
}