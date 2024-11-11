package Tuan3.Bai2;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    // No-argument constructor
    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    // Constructor with two parameters
    public Fraction(int num, int denom) {
        numerator = num;
        denominator = denom;
    }

    // Copy constructor (clone from another fraction)
    public Fraction(Fraction f) {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    // Input fraction from user
    public void inputFraction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator: ");
        numerator = sc.nextInt();
        System.out.println("Enter the denominator: ");
        denominator = sc.nextInt();
    }

    // Print the fraction
    public void printFraction() {
        System.out.println(numerator + "/" + denominator);
    }

    // Find greatest common divisor (gcd) using recursion
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    // Reduce the fraction to its simplest form
    public void simplify() {
        int gcdValue = gcd(numerator, denominator);
        numerator /= gcdValue;
        denominator /= gcdValue;

        // Ensure the denominator is always positive
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // Add two fractions
    // Add the current fraction with the fraction passed as parameter
    public Fraction add(Fraction f) {
        // Create a result fraction
        Fraction result = new Fraction();

        result.denominator = this.denominator * f.denominator;
        result.numerator = this.numerator * f.denominator + f.numerator * this.denominator;

        // Simplify the result fraction
        result.simplify();
        return result;
    }

    // Subtract two fractions
    public Fraction subtract(Fraction f) {
        Fraction result = new Fraction();

        result.denominator = this.denominator * f.denominator;
        result.numerator = this.numerator * f.denominator - f.numerator * this.denominator;

        // Simplify the result fraction
        result.simplify();
        return result;
    }

    // Multiply two fractions
    public Fraction multiply(Fraction f) {
        Fraction result = new Fraction();

        result.denominator = this.denominator * f.denominator;
        result.numerator = this.numerator * f.numerator;

        // Simplify the result fraction
        result.simplify();
        return result;
    }

    // Divide two fractions
    public Fraction divide(Fraction f) {
        Fraction result = new Fraction();

        result.denominator = this.denominator * f.numerator;
        result.numerator = this.numerator * f.denominator;

        // Simplify the result fraction
        result.simplify();
        return result;
    }
}
