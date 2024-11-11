package Tuan7.Tuan7_Bai2;

public class mainDemo {
    public static void main(String[] args) {
        // khoi tao cac doi tuong

        //Nhap 1 hoc vien:
        SinhVien mySinhVien = new SinhVien("Nguyen Tan Phuc", 2003, 9.8, 9.5, 9.0);

        //Khoi tao phong ban khoa
        Phong_Ban_Khoa myPhongBanKhoa = new Phong_Ban_Khoa("IT01", "CNTT01");
        Phong_Ban_Khoa myPhongBanKhoa2 = new Phong_Ban_Khoa("Data Science", "Big data");

        // Nhap mot  nhan vien quan ly
        Nhanvien_QL myNhanvien_QL = new Nhanvien_QL("Nguyen Phuc Tan", 2003, 50000000, "20/10/2024",myPhongBanKhoa , 200000);


        //Nhap 1 giao vien
        Giao_vien myGiao_vien = new Giao_vien("Nguyen Phuc", 2003, 200500, "2022", myPhongBanKhoa2, 
        "Dai hoc", "IT_DataScience", "PTITHCM_Q1", 150000);



        // hien thi tat ca thong tin cua cac doi tuong tren:

        System.out.println("Thong tin cua sinh vien");
        mySinhVien.hienThiThongTin();
        System.out.println();

        System.out.println("Thong tin cua nhan vien quan ly");
        myNhanvien_QL.hienThiThongTin();
        System.out.println();


        System.out.println("Thong tin cua Giao Vien");
        myGiao_vien.hienThiThongTin();
        System.out.println();

    }


    
}
