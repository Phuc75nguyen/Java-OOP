package Tuan1;

import java.util.Scanner;

public class Bai8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap so luong ki tu: ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("Nhap ma ASCII:");
		for(int i=0; i<n; i++) {
			System.out.print("Ma ASCII thu " + (i+1) + ":");
			a[i] = sc.nextInt();
		}
		
		System.out.println("Dang ki tu cua mang: ");
		for(int c : a) {
			System.out.print((char) c + " ");
		}
		System.out.println();
		
		System.out.println("Ma ASCII cua cac ky tu: ");
		for(int c : a) {
			System.out.print(c + " ");
		}
	}
}
