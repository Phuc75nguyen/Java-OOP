package Tuan1;

import java.util.*;

public class Bai10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap so hang cua ma tran: ");
		int soHang = sc.nextInt();
		System.out.print("Nhap so cot cua ma tran: ");
		int soCot = sc.nextInt();
		
		int [][] maTran = new int[soHang][soCot];
		
		System.out.println("Nhap cac phan tu cua ma tran: ");
		for(int i=0; i<soHang; i++) {
			for(int j=0; j< soCot; j++) {
				System.out.print("Nhap phan tu [" + i + "][" + j + "]:");
				maTran[i][j] = sc.nextInt();
			}
		}
		System.out.print("Nhap hang thu k (bat dau tu 0): ");
		int k = sc.nextInt();
		
		if(k<0 || k >= soHang) {
			System.out.println("Hang thu k khong hop le!");
		} else {
			int tong = 0;
			for(int j=0; j<soCot; j++) {
				tong += maTran[k][j];
			}
			System.out.println("Tong cua hang thu " + k + " la: " + tong);
		}
	}
}
