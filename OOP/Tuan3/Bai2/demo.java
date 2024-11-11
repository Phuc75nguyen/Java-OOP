package Tuan3.Bai2;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Create fraction object p1 without parameters
        Fraction p1 = new Fraction();
        System.out.println("Enter fraction p1: ");
        // Call the inputFraction() method to input the fraction
        p1.inputFraction();
        System.out.println("Fraction p1: ");
        p1.printFraction();
        
        // Create fraction object p2 = 4/16 using constructor with two parameters
        Fraction p2 = new Fraction(4, 16);
        System.out.println("Fraction p2: ");
        p2.printFraction();
        
        // Create fraction object p3 with values entered from keyboard using constructor with two parameters
        System.out.println("Enter fraction p3:");
        System.out.print("Enter numerator for p3: ");
        int t = sc.nextInt();
        System.out.print("Enter denominator for p3: ");
        int m = sc.nextInt();
        Fraction p3 = new Fraction(t, m);
        System.out.println("Fraction p3:");
        p3.printFraction();
        
        // Add fractions p1 and p3, output the result
        Fraction sum = p1.add(p3);
        System.out.println("Sum of p1 + p3:");
        sum.printFraction();
        
        // Create fraction object p4 as a copy of the sum result
        Fraction p4 = new Fraction(sum);
        System.out.println("Fraction p4:");
        p4.printFraction();
        
        // Multiply p4 with p2, output the result
        Fraction product = p4.multiply(p2);
        System.out.println("Product of p4 * p2: ");
        product.printFraction();
        
        // Subtract p1 with p3, output the result
        Fraction difference = p1.subtract(p3);
        System.out.println("Difference of p1 - p3:");
        difference.printFraction();
        
        // Divide p1 by p3, output the result
        Fraction quotient = p1.divide(p3);
        System.out.println("Quotient of p1 / p3:");
        quotient.printFraction();
    }
}
