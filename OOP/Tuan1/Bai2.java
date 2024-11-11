package Tuan1;
import java.io.*;
import java.util.*;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Student ID:");
		String studentID = sc.nextLine();
		
		System.out.print("Enter your full name:");
		String studentName = sc.nextLine();
		
		System.out.print("Enter your age:");
		byte age = sc.nextByte();
		sc.nextLine();
		
		System.out.print("Enter your date of birth:");
		String doB = sc.nextLine();
		
		System.out.print("Enter your average mark:");
		float GPA = sc.nextFloat();
		
		System.out.println("Student ID: " + studentID);
		System.out.println("Full name: " + studentName);
		System.out.println("Age: " + age);
		System.out.println("Date of birth: " + doB);
		System.out.println("GPA: " + GPA);
	}
}
