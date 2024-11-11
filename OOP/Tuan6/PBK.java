package Tuan6;

import java.util.Scanner;

public class PBK {
	private String maPBK;
	private String tenPBK;
	
	public PBK() {
		
	}
	
	public PBK(String maPBK, String tenPBK) {
		this.maPBK = maPBK;
		this.tenPBK = tenPBK;
	}

	public String getMaPBK() {
		return maPBK;
	}

	public void setMaPBK(String maPBK) {
		this.maPBK = maPBK;
	}

	public String getTenPBK() {
		return tenPBK;
	}

	public void setTenPBK(String tenPBK) {
		this.tenPBK = tenPBK;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma PBK: ");
		maPBK = sc.nextLine();
		System.out.println("Nhap ten PBK: ");
		tenPBK = sc.nextLine();
	}
	
	public void display() {
		System.out.println("Ma phong ban khoa: " + maPBK);
		System.out.println("Ten phong ban khoa: " + tenPBK);
	}
}
