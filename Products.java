/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucPham;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author HoaiAnh
 */
public class Products {
    private Connection con;
    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url = "jdbc:sqlserver://DESKTOP-DT03IGN:1433; databaseName = QLThucPham";
    String user = "sa";
    String password= "2734";

    public Products() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public boolean addThucPham(ThucPham tp){
        String sql = "insert into ThucPham"+ "values(?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tp.getMaSP_06());
            ps.setString(2, tp.getTenSP_06());
            ps.setString(3, tp.getNsx_06());
            ps.setInt(4, tp.getSoLuong_06());
            ps.setFloat(5, tp.getGiaBan_06());
            
            //return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public ArrayList<ThucPham> getListPro(){
        String sql = "Select * From ThucPham";
        ArrayList<ThucPham> list = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ThucPham tp = new ThucPham() {};
                tp.setMaSP_06(rs.getString(1));
                tp.setTenSP_06(rs.getString(2));
                tp.setNsx_06(rs.getString(3));
                tp.setSoLuong_06(rs.getInt(4));
                tp.setGiaBan_06(rs.getFloat(5));
                
                list.add(tp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
}
