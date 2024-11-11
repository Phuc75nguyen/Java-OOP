package Tuan1;

import java.util.*;

public class Bai9 {
	public static void main(String[] args) {
		long num1 = 1, num2 = 1;
		
		System.out.print(num1 + " " + num2 + " ");
		
		for(int i=3; i<=100; i++) {
			long n = num1 + num2;
			System.out.print(n + " ");
			
			num1 = num2;
			num2 = n;
		}
	}
}
