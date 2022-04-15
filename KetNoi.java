/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucPham;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HoaiAnh
 */
public class KetNoi {
       /* public static void main(String[] args) {
        Connection con = null;
        String dB_url = "jdbc:jtds:sqlsever://DESKTOP-DT03IGN:1433/QLThucPham;instance=SQLEXPRESS;user=sa;password=2734";
        try{
            con = DriverManager.getConnection(dB_url);
            System.out.println("Kết nối thành công");
        }catch(SQLException e){
            System.out.println("Lỗi!!");
            e.printStackTrace();
        }
    }*/
        private Connection con = null;

    public KetNoi() {

    String url = "net.sourceforge.jtds.jdbc.Driver";

    try {

        Class.forName(url);

        String dbUrl = "jdbc:jtds:sqlserver://DESKTOP-DT03IGN:1433/QLThucPham;instance=SQLEXPRESS;user=sa;password=2734";

        con = DriverManager.getConnection(dbUrl);

        } catch (ClassNotFoundException ex) {

        Logger.getLogger(KetNoi.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {

        Logger.getLogger(KetNoi.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    public static void main(String[] args) {

        KetNoi kn = new KetNoi();
    }

    }

