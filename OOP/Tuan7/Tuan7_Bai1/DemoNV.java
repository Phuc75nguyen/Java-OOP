package Tuan7.Tuan7_Bai1;

public class DemoNV {
    public static void main(String[] args) {
        //Khai báo các Đối tượng thuộc các lớp nhân viên;
    
        NVQuanLy nvQuanLy = new NVQuanLy("IT001", "Nguyễn Tấn Phúc", "Engineer", 500000, 20000);
        NVNghienCuu nvNghienCuu = new NVNghienCuu("IT011", "Nguyễn Phúc Tấn", "PhD", 45000, 3000);
        NVPhucVu nvPhucVu = new NVPhucVu("IT021", "Nguyễn Phương Thảo", "Cao Dang", 2000);


    
    //show thông tin của các loại nhân viên trên:
        System.out.println("Thông tin nhân viên Quản lý:");
        nvQuanLy.hienThiThongTin();
        System.out.println();


        System.out.println("Thông tin nhân viên Nghiên cứu:");
        nvNghienCuu.hienThiThongTin();
        System.out.println();

        
        System.out.println("Thông tin nhân viên Phục vụ:");
        nvPhucVu.hienThiThongTin();
        System.out.println();


    }





}
