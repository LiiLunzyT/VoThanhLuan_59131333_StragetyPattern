/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<HangHoa> hh1 = new ArrayList();
        hh1.add(new HangHoa("Laptop", 6000000, "Dell"));
        hh1.add(new HangHoa("Điện thoại", 3000000, "ASUS"));
        GioHang g1 = new GioHang(new ThanhToanOnline(), hh1);
        System.out.println("Giỏ hàng 1: " + g1.thanhToan() + "\n");
        
        ArrayList<HangHoa> hh2 = new ArrayList();
        hh2.add(new HangHoa("Trà sữa trân châu", 80000, "Size XL"));
        hh2.add(new HangHoa("Bánh tráng bơ", 50000, "2 hộp"));
        GioHang g2 = new GioHang(new ThanhToanCOD(), hh2);
        System.out.println("Giỏ hàng 2: " + g2.thanhToan());
    }
}
