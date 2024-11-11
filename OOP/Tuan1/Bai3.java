package Tuan1;

import java.util.*;

public class Bai3 {
	public static void main(String[] args) {
		int a[], n=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap so luong phan tu cua mang: ");
		n = sc.nextInt();
		
		a = new int[n];
		
		System.out.println("Nhap cac phan tu cua mang: ");
		for (int i=0; i<n; i++) {
			System.out.print("Phan tu thu " + (i+1) + ": ");
			a[i] = sc.nextInt();
		}
		
		int max = a[0];
		for(int i = 1; i < n; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		
		System.out.println("Phan tu lon nhat trong mang la: " + max);
	}
}
