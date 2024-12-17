
package com.mycompany.giaodien_qlsach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KetNoiCSDL {
    public static Connection layKetNoi() {
        Connection ketNoi = null;
        String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSACH; encrypt=true;trustServerCertificate=true";
        String userName = "sa";
        String password = "123";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            ketNoi = DriverManager.getConnection(url, userName, password);
            System.out.println("Ket noi CSDL thanh cong");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Khong ket noi duoc voi CSDL");
        }
        return ketNoi;
    }

    public static void main(String[] args) {
        // Test the connection
        layKetNoi();
    }
}
