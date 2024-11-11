package Tuan8.Tuan8Bai1;
import java.util.Scanner;

public class HinhVuong implements Hinh {
        private float canh;
    @Override
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao canh hinh vuong:");
        canh = sc.nextFloat();
    }


    @Override
    public void Xuat(){
        System.out.println("Hinh vuong co canh = " + canh);

    }

    @Override
    public double tinhDienTich(){
        return canh*canh;
    }
}
