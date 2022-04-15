/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucPham;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HoaiAnh
 */
public class JDBCConnection {
    public Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://DESKTOP-DT03IGN:1433; databaseName = QLThucPham";
            String user = "sa";
            String pass= "2734";
            conn = DriverManager.getConnection(url, user, pass);
            if (conn != null){
                System.out.println("Kết nối thành công");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return conn;
    }
}
