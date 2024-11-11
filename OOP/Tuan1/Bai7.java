package Tuan1;

import java.util.Arrays;

public class Bai7 {
	public static void main(String[] args) {
		int[] numbers = {34, 11, 9, 76, 45, 56, 23, 66, 89, 30};
		
		System.out.println("Mang ban dau: " + Arrays.toString(numbers));
		
		Arrays.sort(numbers);
		
		System.out.println("Mang sau khi sap xep tang dan: " + Arrays.toString(numbers));
	}
}
