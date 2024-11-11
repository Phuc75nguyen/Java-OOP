package Tuan8.Tuan8Bai1;
import java.util.Scanner;
public class HinhChuNhat implements Hinh {
    private float dai;
    private float rong;


    @Override
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chieu dai hinh chu nhat: ");
        dai = sc.nextFloat();
        System.out.println();
        System.out.print("Nhap voa chieu rong hinh chu nhat: ");
        rong = sc.nextFloat();
        System.out.println();
    }
    
    @Override
    public void Xuat(){
        System.out.println("HCN co chieu dai = " + dai);
        System.out.println("HCN co chieu rong = " +rong);

    }

    @Override
    public double tinhDienTich(){
        return (dai + rong) * 2;
    }
}
