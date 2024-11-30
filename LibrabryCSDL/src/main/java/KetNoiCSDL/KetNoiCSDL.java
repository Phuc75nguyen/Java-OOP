package KetNoiCSDL;

import java.sql.Connection; // Đảm bảo import đúng gói
import java.sql.DriverManager;
import java.sql.SQLException;

public class KetNoiCSDL {

    public static Connection layKetNOi() {
        Connection ketNoi = null;
        String URL = "jdbc:sqlserver://localhost:1433; encrypt=true; trustServerCertificate=true";
        String userName = "sa";
        String password = "123";

        try {
            // Tải driver JDBC
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            // Kết nối tới cơ sở dữ liệu
            ketNoi = DriverManager.getConnection(URL, userName, password);
            System.out.println("Ket noi CSDL thanh cong!");
        } catch (ClassNotFoundException e) {
            System.out.println("Khong tim thay Driver " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Khong ket noi duoc voi CSDL: " + e.getMessage());
        }

        return ketNoi;
    }

    public static void main(String[] args) {
    layKetNOi();
      
    }
}
