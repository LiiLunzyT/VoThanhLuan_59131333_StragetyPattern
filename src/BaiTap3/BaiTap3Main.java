/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<SinhVien> dsSV = new ArrayList();
        dsSV.add(new SinhVien("Võ Thành Luân", new Date(1999, 12, 23), 9));
        dsSV.add(new SinhVien("Lâm Mai Huỳnh", new Date(1999, 12, 23), 7));
        dsSV.add(new SinhVien("Cao Quỳnh Anh", new Date(1999, 12, 23), 8));
        
        QuanLySinhVien qlsv = new QuanLySinhVien();
        qlsv.setDsSV(dsSV);
        qlsv.setSoSanh(new SoSanhTheoDiem());
        qlsv.sapXep();
        System.out.println("========= So Sánh theo Điểm ==========");
        qlsv.inDS();;
        
        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        System.out.println("========= So Sánh theo Tên ==========");
        qlsv.inDS();
    }
    
}
