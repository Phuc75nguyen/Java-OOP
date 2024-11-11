package Tuan6;

import java.util.Scanner;

public class ConNguoi {
	private String hoTen;
	private int namSinh;
	
	public ConNguoi(String hoTen, int namSinh) {
		this.hoTen = hoTen;
		this.namSinh = namSinh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.println("Nhap nam sinh: ");
		namSinh = sc.nextInt();
	}
	
	public void display() {
		System.out.println("Ho ten: " + hoTen);
		System.out.println("Nam sinh: " + namSinh);
	}
}
