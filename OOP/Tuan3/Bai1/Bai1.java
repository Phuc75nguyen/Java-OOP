package Tuan3.Bai1;



import java.util.Scanner;

class HocSinh {
	private String maSo;
	private String hoTen;
	private float dtb;
	
	public HocSinh(){
		
	}
	
	public String getMaSo() {
		return maSo;
	}
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public float getDtb() {
		return dtb;
	}
	public void setDtb(float dtb) {
		this.dtb = dtb;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so: ");
		maSo = sc.nextLine();
		System.out.print("Nhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.print("Nhap diem trung binh: ");
		dtb = sc.nextFloat();
	}
	
	public void output() {
		System.out.println("Ma so: " + maSo);
		System.out.println("Ho ten: " + hoTen);
		System.out.println("Diem trung binh: " + dtb);
		System.out.println("Xep loai: " + rank());
	}
	
	public String rank() {
		if (dtb >= 9) {
			return "Gioi";
		}
		else if (dtb >= 8) {
			return "Kha";
		}
		else if (dtb >= 5) {
			return "Trung binh";
		}
		else {
			return "Yeu";
		}
	}
}

public class Bai1 {
	public static void main(String[] args) {
		HocSinh hs = new HocSinh();
		hs.input();
		hs.output();
		hs.rank();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ho ten cua hoc sinh vua nhap: " + hs.getHoTen());
		
		String htmoi = " ";
		
		System.out.print("Nhap ho ten hoc sinh moi: ");
		htmoi = sc.nextLine();
		
		hs.setHoTen(htmoi);
		System.out.println("Ho ten cua hoc sinh sau khi sua: " + hs.getHoTen());
	}
}
