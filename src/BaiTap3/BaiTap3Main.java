/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;
import java.text.ParseException;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

/**
 *
 * @author ASUS
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        //  Định dạng kiểu Date
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        
        ArrayList<SinhVien> dsSV = new ArrayList<SinhVien>();
        dsSV.add(new SinhVien("Võ Thành Luân", dateFormat.parse("23-12-1999"), 9));
        dsSV.add(new SinhVien("Lâm Mai Huỳnh", dateFormat.parse("12-06-1999"), 7));
        dsSV.add(new SinhVien("Cao Quỳnh Anh", dateFormat.parse("14-02-1999"), 8));
        
        QuanLySinhVien qlsv = new QuanLySinhVien();
        qlsv.setDsSV(dsSV);
        
        System.out.println("========= Chưa sắp xếp ==========");
        qlsv.inDS();;
        
        qlsv.setSoSanh(new SoSanhTheoDiem());
        qlsv.sapXep();
        System.out.println("========= So Sánh theo Điểm ==========");
        qlsv.inDS();
        
        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        System.out.println("========= So Sánh theo Tên ==========");
        qlsv.inDS();
    }
    
}
