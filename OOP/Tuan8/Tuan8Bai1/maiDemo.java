package Tuan8.Tuan8Bai1;
import java.util.Scanner;

public class maiDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //nhap so luong hinh
        System.out.print("Nhap so luong hinh: ");
        int n = sc.nextInt();

        // Tạo mảng cho đối tượng Hinh
        Hinh[] dsHinh = new Hinh[n];

        // Duyệt để nhập thông tin cho từng hình
        for(int i =0; i <n; i++){
                System.out.print("Chon Hinh: (1: Hinh Vuong,  2: Hinh Chu Nhat,  3: Hinh Tron)");
              
                int chon = sc.nextInt();


            switch (chon) {
                case 1:
                dsHinh[i] = new HinhVuong();
                    
                    break;
                case 2:
                dsHinh[i] = new HinhChuNhat();
                break;

                case 3:
                dsHinh [i] = new HinhTron();
                break;

                default:
                System.out.print("Hinh ban lua chon khong hop le! ");
                System.out.println();
                    i--; //cho phép quay lai de nhap
                    continue;
            }
            dsHinh[i].Nhap(); //nhap vo thong tin cho cac doi tuong Hinh


        }
        //Xuat thong tin và tinh dien tich cho 3 hinh do:
        for(int i =0; i <n; i++){
            dsHinh[i].Xuat();
            System.out.print("Dien tich la: " + dsHinh[i].tinhDienTich());
            System.out.println();
        }
    }
}
