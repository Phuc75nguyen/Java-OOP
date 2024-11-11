package Tuan8.Tuan8Bai1;
import java.util.Scanner;
public class HinhTron implements Hinh {
    private float bankinh;

    @Override
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ban kinh cua hinh tron: ");
        bankinh = sc.nextFloat();

    }

    @Override
    public void Xuat(){
        System.out.println("Ban kinh cua hinh Tron = " + bankinh);

     }

     @Override
     public double tinhDienTich(){
        return bankinh*bankinh*pi;
    
    }
}
