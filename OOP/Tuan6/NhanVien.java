package Tuan6;

import java.util.Scanner;

public class NhanVien extends ConNguoi{
	private double luong;
	private String ngayNhanViec;
	PBK pbk;
	
	public NhanVien(String hoTen, int namSinh, double luong, String ngayNhanVien, PBK pbk) {
		super(hoTen, namSinh);
		this.luong = luong;
		this.ngayNhanViec = ngayNhanViec;
		pbk = new PBK();
	}

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}

	public String getNgayNhanViec() {
		return ngayNhanViec;
	}

	public void setNgayNhanViec(String ngayNhanViec) {
		this.ngayNhanViec = ngayNhanViec;
	}

	public PBK getPbk() {
		return pbk;
	}

	public void setPbk(PBK pbk) {
		this.pbk = pbk;
	}
	
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.println("Nhap luong: ");
		luong = sc.nextDouble();
		System.out.println("Nhap ngay nhan viec: ");
		ngayNhanViec = sc.nextLine();
		pbk.input();
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Luong cua nhan vien: " + luong);
		System.out.println("Ngay nhan viec: " + ngayNhanViec);
		pbk.display();
	}
}
