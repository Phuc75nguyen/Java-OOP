package Tuan6;

import java.util.Scanner;

public class HocVien extends ConNguoi{
	private double diem1, diem2, diem3;
	
	public HocVien(String hoTen, int namSinh, double diem1, double diem2, double diem3) {
		super(hoTen, namSinh);
		this.diem1 = diem1;
		this.diem2 = diem2;
		this.diem3 = diem3;
	}

	public double getDiem1() {
		return diem1;
	}

	public void setDiem1(double diem1) {
		this.diem1 = diem1;
	}

	public double getDiem2() {
		return diem2;
	}

	public void setDiem2(double diem2) {
		this.diem2 = diem2;
	}

	public double getDiem3() {
		return diem3;
	}

	public void setDiem3(double diem3) {
		this.diem3 = diem3;
	}
	
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.println("Nhap diem 1: ");
		diem1 = sc.nextDouble();
		System.out.println("Nhap diem 2: ");
		diem2 = sc.nextDouble();
		System.out.println("Nhap diem 3: ");
		diem3 = sc.nextDouble();
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Diem 1: " + diem1);
		System.out.println("Diem 2: " + diem2);
		System.out.println("Diem 3: " + diem3);
	}
}
