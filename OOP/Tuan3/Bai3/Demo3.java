package Tuan3.Bai3;


import java.util.Scanner;


public class Demo3 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap toa do diem A:");
        int x1 = ip.nextInt();
        int y1 = ip.nextInt();
        Coordinate A = new Coordinate(x1,y1);
        System.out.println("Nhap toa do diem B: ");
        int x2 = ip.nextInt();
        int y2 = ip.nextInt();
        Coordinate B = new Coordinate(x2,y2);
        System.out.println("Tong cua 2 diem: ");
        Coordinate T = new Coordinate();
        T = T.tong(A, B);
        T.display();
        System.out.println("Doi xung diem A: ");
        Coordinate a = new Coordinate();
        a = a.doiXung(A);
        a.display();
        System.out.println("Doi xung diem B: ");
        Coordinate b = new Coordinate();
        b = b.doiXung(B);
        b.display();
    }   
}