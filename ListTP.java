/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucPham;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author HoaiAnh
 */
public class ListTP {
    List<ThucPham> lTP = new ArrayList<>();
    public int add(ThucPham tp){
        lTP.add(tp);
        return 1;
    }
}
