package Tuan6;

public class Main {
	 public static void main(String[] args) {
	        // Create a student
	        HocVien hocVien = new HocVien("Nguyen Van A", 2003, 9.5, 8.5, 9.9);
	        
	        // Create a department
	        PBK pbk = new PBK("PB01", "Phòng Công Nghệ");

	        // Create two employees
	        NhanVien nhanVien1 = new NhanVien("Tran Thi B", 1985, 15000000, "01/01/2020", pbk);
	        NhanVien nhanVien2 = new NhanVien("Le Van C", 1990, 12000000, "15/02/2021", pbk);

	        // Display information
	        System.out.println("Thông tin học viên:");
	        hocVien.display();

	        System.out.println("\nThông tin nhân viên 1:");
	        nhanVien1.display();

	        System.out.println("\nThông tin nhân viên 2:");
	        nhanVien2.display();
	    }
}
