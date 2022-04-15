/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucPham;

import java.util.Date;

/**
 *
 * @author HoaiAnh
 */
public abstract class ThucPham {
    private String maSP_06;
    private String tenSP_06;
    private String nsx_06;
    private int soLuong_06;
    private float giaBan_06;
    
    public ThucPham() {
    }

    public ThucPham(String maSP_06, String tenSP_06, String nsx_06, int soLuong_06, float giaBan_06) {
        this.maSP_06 = maSP_06;
        this.tenSP_06 = tenSP_06;
        this.nsx_06 = nsx_06;
        this.soLuong_06 = soLuong_06;
        this.giaBan_06 = giaBan_06;
    }

    public String getMaSP_06() {
        return maSP_06;
    }

    public void setMaSP_06(String maSP_06) {
        this.maSP_06 = maSP_06;
    }

    public String getTenSP_06() {
        return tenSP_06;
    }

    public void setTenSP_06(String tenSP_06) {
        this.tenSP_06 = tenSP_06;
    }

    public String getNsx_06() {
        return nsx_06;
    }

    public void setNsx_06(String nsx_06) {
        this.nsx_06 = nsx_06;
    }

    public int getSoLuong_06() {
        return soLuong_06;
    }

    public void setSoLuong_06(int soLuong_06) {
        this.soLuong_06 = soLuong_06;
    }

    public float getGiaBan_06() {
        return giaBan_06;
    }

    public void setGiaBan_06(float giaBan_06) {
        this.giaBan_06 = giaBan_06;
    }

    
}
