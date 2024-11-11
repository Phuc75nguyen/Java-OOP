package Tuan3.Bai1;


import java.util.Arrays;
import java.util.Scanner;

class Mang {
	private int size;
	private int[] arr;
	
	public void set(int size, int[] arr) {
		this.size = size;
		this.arr = arr;
	}
	
	public Mang() {
		
	}
	
	public int[] get() {
		return arr;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap kich thuoc cua mang: ");
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("Nhap cac phan tu cua mang: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	public void output() {
		System.out.println("Cac phan tu cua mang: " + Arrays.toString(arr));
	}
	
	public double averageOddNumbers() {
		int sum = 0, count = 0;
		for(int num : arr) {
			if(num % 2 != 0) {
				sum += num;
				count++;
			}
		}
		return count == 0 ? 0 : (double) sum / count;
	}
	
	public int max() {
		int max = arr[0];
		for(int num : arr) {
			if(num > max) {
				max = num;
			}
		}
		return max;
	}
	
	public void sort() {
		Arrays.sort(arr);
	}



	public static void main(String[] args) {
		Mang mang = new Mang();
		
		mang.input();
		mang.output();
		double avgOdd = mang.averageOddNumbers();
		System.out.println("Trung binh cac so le trong mang: " + avgOdd);
		
		int max = mang.max();
		System.out.println("Phan tu lon nhat cua mang: " + max);
		
		mang.sort();
		System.out.println("Mang sau khi sap xep theo thu tu tang dan: ");
		mang.output();
	}
}