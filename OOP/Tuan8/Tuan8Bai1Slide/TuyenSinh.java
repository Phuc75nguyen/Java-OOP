package Tuan8.Tuan8Bai1Slide;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class TuyenSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThiSinh> dsThiSinh = new ArrayList<>();

        // Sử dụng while để duyệt qua và chọn chức năng theo đề bài
        boolean tiepTuc = true;

        while (tiepTuc) {
            System.out.println("Moi ban chon chuc nang: ");
            System.out.println("1. Nhap thong tin Thi Sinh");
            System.out.println("2. Hien thi thong tin Thi Sinh");
            System.out.println("3. Tim kien Thi sinh theo so bao danh");
            System.out.println("4. Tim kiem Thi sinh theo khoi thi");
            System.out.println("5. Sap xep Thi sinh theo so bao danh");
            System.out.println("6. Tong so Sinh vien thi theo khoi");
            System.out.println("7. Ket thu chuong trinh!");
            int luaChon = sc.nextInt();

            switch (luaChon) {
                case 1: // Nhập khối thi cho Thí sinh
                    System.out.println("Chon khoi thi: 1. Khoi A,  2.Khoi B,  3.Khoi C");
                    int khoi = sc.nextInt();
                    ThiSinh thiSinh = null;

                    sc.nextLine();// bỏ dòng bị thừa
                    System.out.print("Nhap so bao danh Thi sinh: ");
                    String sbd = sc.nextLine();

                    System.out.print("Nhap ho va Ten Thi sinh: ");
                    String hoTen = sc.nextLine();

                    System.out.print("Nhap dia chi cua Thi Sinh: ");
                    String diaChi = sc.nextLine();

                    System.out.print("Nhap diem uu tien cua Thi Sinh: ");
                    double uuTien = sc.nextDouble();

                    switch (khoi) {
                        case 1:
                            thiSinh = new khoiA(sbd, hoTen, diaChi, uuTien, 0, 0, 0);
                            break;
                        case 2:
                            thiSinh = new khoiB(sbd, hoTen, diaChi, uuTien, 0, 0, 0);
                            break;

                        case 3:
                            thiSinh = new khoiC(sbd, hoTen, diaChi, uuTien, 0, 0, 0);
                            break;
                        default:
                            System.out.println("Ban chon Khoi thi khong hop le!");
                            continue;
                    }

                    thiSinh.nhapThongTin();
                    dsThiSinh.add(thiSinh);
                    break;

                case 2: // in ra tổng điểm cho Thí Sinh
                    for (ThiSinh ts : dsThiSinh) {
                        ts.hienThiThongTin();
                        System.out.println("Tong diem la: " + ts.tinhDiem());

                    }
                    break;

                case 3: // xử lý tìm số báo danh thí sinh
                    System.out.println("Nhap so bao danh can tim: ");
                    String sbdCanTim = sc.next();
                    boolean timThay = false; // ban đầu là chưa tìm thấy

                    // vòng for này có logic như sau: duyệt tất cá thí sinh trong ds thi sinh
                    // nếu tìm đc thí sinh có số báo danh đúng với người cần tìm thì hiển thị thông
                    // tin thí sinh đó
                    // đổi biến tìm thấy thành đúng và ngưng khối lệnh
                    for (ThiSinh ts : dsThiSinh) {
                        if (ts.getSbd().equals(sbdCanTim)) {
                            ts.hienThiThongTin();
                            timThay = true;
                            break;

                        }
                    }
                    // nếu không có số báo danh nào hợp lệ thì in ra dòng thông báo không tìm thấy
                    if (!timThay) {
                        System.out.println("Khong co so bao danh hop le!");

                    }
                    break;

                case 4: // Block code xử lý việc tìm khối thi của thí sinh

                    System.out.println("Nhap khoi thi ban can tim: 1.Khoi A,  2.Khoi B,  3.Khoi C");
                    int khoiCanTim = sc.nextInt();
                    // vòng for này có logic như sau: duyệt tất các các thí sinh trong danh sách thí
                    // sinh
                    // nếu khối cần tìm ứng với các điều kiện đúng trong lệnh if thì in ra thông tin
                    // thí sinh ở khối đó
                    // instanceof trong java: là một toán tử được sử dụng để kiểm tra xem đối tượng
                    // này có
                    // phải là instance của một class hay interface nào đó hay không, kết quả trả về
                    // là true hoặc false
                    for (ThiSinh ts : dsThiSinh) {
                        if ((khoiCanTim == 1 && ts instanceof khoiA ||
                                khoiCanTim == 2 && ts instanceof khoiB || khoiCanTim == 3 && ts instanceof khoiC)) {

                            ts.hienThiThongTin();
                        }
                    }
                    break;

                case 5: // block code này dùng để săp xếp thí sinh theo số báo danh
                //logic block code được hiểu nôm na như sau
                //Collections trong java: 1 lớp (thư viện) có sẵn, dùng để làm việc với set(), list(), queue().
                //trong đấy, ta có các phương thức như sắp xếp, đảo ngược, tìm kiếm, các thao tác với db
                //Comparaor là một interface cũng có sẵn trong java
                //dùng để so sánh 2 đối tượng mà không thay đổi giá trị bản chất của đối tượng đó
                    Collections.sort(dsThiSinh, new Comparator<ThiSinh>() {
                        @Override
                        public int compare(ThiSinh ts1, ThiSinh ts2) {
                            return ts1.getSbd().compareTo(ts2.getSbd());
                            // phương thức so sánh này sẽ trả về số âm nếu t1<ts2, 0 nếu bằng nhau, dương nếu ts1>ts2
                        }

                    });
                    System.out.println("Danh sach Thi sinh da duoc sap xep lai!");
                    break;
                    
                case 6: //block code in ra tổng số sinh viên theo khối thi
                    // cho các biến đếm số thí sinh trong các khối thi ban đầu = 0
                    int soTSKhoiA =0, soTSKhoiB = 0, soTSKhoiC =0; 

                    //duyện qua các thí sinh có trong danh sách thí sinh
                    for(ThiSinh ts : dsThiSinh){
                        //nếu ts thuộc khoiA thì ++ và tương tự với khoiB,C

                        if(ts instanceof khoiA) soTSKhoiA++;
                        else if(ts instanceof khoiB) soTSKhoiB++;
                        else if(ts instanceof khoiC) soTSKhoiC++;
                    }
                    //in kết quả vừa duyệt xong
                    System.out.println("Tong so Thi sinh cua khoi A la: " + soTSKhoiA);
                    System.out.println("Tong so Thi sinh cua khoi B la: " + soTSKhoiB);
                    System.out.println("Tong so Thi sinh cua khoi C la: " + soTSKhoiC);
                    break;

                case 7:
                tiepTuc = false;
                break;

                default:
                System.out.println("Khong co chuc nang hop le!");
                    break;
            }

        }

    }
}
