/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

/**
 *
 * @author ASUS
 */
public class QuanLySinhVien {
    ArrayList<SinhVien> dsSV;
    ISoSanh soSanh;

    public QuanLySinhVien() {
    }

    public QuanLySinhVien(ArrayList<SinhVien> dsSV, ISoSanh soSanh) {
        this.dsSV = dsSV;
        this.soSanh = soSanh;
    }
    
    public void sapXep() {
        int len = dsSV.size();
        for( int i = 0; i < len - 1; i++ ) {
            for ( int j = i+1; j < len; j++ ) {
                SinhVien sv1 = dsSV.get(i);
                SinhVien sv2 = dsSV.get(j);
                if( soSanh.soSanh(sv1, sv2) == 1) {
                    dsSV.set(i, sv2);
                    dsSV.set(j, sv1);
                }
            }
        }
    }
    
    public void inDS() {
        for( SinhVien sv : dsSV ) {
            String pattern = "dd-MM-yyyy";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String date = simpleDateFormat.format(sv.getNgaySinh());
            
            System.out.println("Tên: " + sv.getHoTen());
            System.out.println("Ngày sinh: " + date);
            System.out.println("Điểm Trung bình: " + sv.getDiemTB());
        }
    }

    public ArrayList<SinhVien> getDsSV() {
        return dsSV;
    }

    public ISoSanh getSoSanh() {
        return soSanh;
    }

    public void setDsSV(ArrayList<SinhVien> dsSV) {
        this.dsSV = dsSV;
    }

    public void setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
    }
    
}
