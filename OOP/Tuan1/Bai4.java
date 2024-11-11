package Tuan1;

import java.util.*;
import java.lang.*;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap so dong cua ma tran: ");
		int m = sc.nextInt();
		System.out.print("Nhap so cot cua ma tran: ");
		int n = sc.nextInt();
		
		int[][] a = new int[m][n];
		
		int sum = 0;
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				a[i][j] = (int)(Math.random() * 51);
				sum += a[i][j];
			}
		}
		
		System.out.println("Ma tran da duoc sinh ngau nhien: ");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Tong cac phan tu trong ma tran la: " + sum);
	}
}
