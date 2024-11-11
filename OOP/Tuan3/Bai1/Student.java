package Tuan3.Bai1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
	private String hoTen;
	private double dtb;
	
	public Student(String hoTen, double dtb) {
		this.hoTen = hoTen;
		this.dtb = dtb;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getDtb() {
		return dtb;
	}
	public void setDtb(double dtb) {
		this.dtb = dtb;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.print("Nhap diem trung binh: ");
		dtb = sc.nextDouble();
	}
	
	public void output() {
		System.out.println("Ho ten: " + hoTen + ", Diem trung binh: " + dtb);
	}
	
	
}

class DSHocSinh{
	private ArrayList<Student> ds;
	
	public DSHocSinh() {
		ds = new ArrayList<>();
	}
	
	public void nhapDanhSach() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong hoc sinh: ");
		int soLuong = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<soLuong; i++) {
			System.out.println("Nhap diem cho hoc sinh thu " + (i + 1));
			System.out.print("Ho ten: ");
			String hoTen = sc.nextLine();
			System.out.print("Diem trung binh: ");
			double dtb = sc.nextDouble();
			sc.nextLine();
			ds.add(new Student(hoTen, dtb));
		}
	}
	
	public void inDanhSach() {
		System.out.println("Danh sach hoc sinh: ");
		for(Student hs : ds) {
			hs.output();
		}
	}
	
	public void sapXepGiamDan() {
		Collections.sort(ds, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return Double.compare(s2.getDtb(), s1.getDtb());
			}
		});
	}



	public static void main(String[] args) {
		DSHocSinh ds = new DSHocSinh();
		
		ds.nhapDanhSach();
		ds.sapXepGiamDan();
		ds.inDanhSach();
	}
}