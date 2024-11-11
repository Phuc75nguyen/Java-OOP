package Tuan3.Bai4;
import java.util.Scanner;;

public class NhanVien {
    
// Khai báo các trường dữ liệu
private String maSo, hoTen;  // Mã số và họ tên của nhân viên
private float lcb;          // Lương cơ bản
private float hsl;          // Hệ số lương
private static int slnv;    // Số lượng nhân viên (biến static)

// Constructors
//Phuong thuc khoi tao mac đinh
public NhanVien() {
    slnv++;                
    this.maSo = "";
    this.hoTen = "";
    this.lcb = 0f;
    this.hsl = 0f;
}

//Phương thức khởi tạo 3 tham so
public NhanVien(String maSo, String hoTen, float hsl) {
    this.maSo = maSo;
    this.hoTen = hoTen;
    this.hsl = hsl;
    slnv++;                
}

//Phuong thuc khoi tao sao chep
public NhanVien(NhanVien nv) {
    this.maSo = nv.maSo;
    this.hoTen = nv.hoTen;
    this.hsl = nv.hsl;
    slnv++;                
}

// Getter và Setter cho các trường dữ liệu
public String getMaSo() {
    return maSo;
}

public void setMaSo(String maSo) {
    this.maSo = maSo;
}

public String getHoTen() {
    return hoTen;
}

public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
}

public float getLcb() {
    return lcb;
}

public void setLcb(float lcb) {
    this.lcb = lcb;
}

public float getHsl() {
    return hsl;
}

public void setHsl(float hsl) {
    this.hsl = hsl;
}

// Phương thức nhập thông tin từ bàn phím
public void nhap() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap thong tin nhan vien:");
    
    System.out.println("Nhap ma so: ");
    maSo = sc.nextLine();
    
    System.out.println("Nhap ho ten:");
    hoTen = sc.nextLine();
    
    System.out.println("Nhap he so luong:");
    hsl = sc.nextFloat();
}

// Phương thức mô tả thông tin của nhân viên
@Override
public String toString() {
    return (maSo + " " + hoTen + " " + hsl);
}

// Phương thức in số lượng nhân viên (là phương thức static)
static void inSLNV() {
    System.out.println("So luong nhan vien: " + slnv);
}

// Phương thức tính lương của nhân viên
public float TinhLuong() {
    return lcb * hsl;
}
}