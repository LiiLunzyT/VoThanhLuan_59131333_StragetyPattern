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
public class GioHang {
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> dsHH;

    public GioHang() {
    }

    public GioHang(IThanhToan hinhThucTT, ArrayList<HangHoa> dsHH) {
        this.hinhThucTT = hinhThucTT;
        this.dsHH = dsHH;
    }
    
    public double thanhToan() {
        int tong = 0;
        for( HangHoa hh : dsHH) {
            System.out.println("\tTên: " + hh.getTenHH());
            System.out.println("\tGiá: " + hh.getGia());
            System.out.println("\tMô tả: " + hh.getMoTa());
            tong += hh.getGia();
        }
        return hinhThucTT.thanhToan(tong);
    }

    public IThanhToan getHinhThucTT() {
        return hinhThucTT;
    }

    public ArrayList<HangHoa> getDsHH() {
        return dsHH;
    }

    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }

    public void setDsHH(ArrayList<HangHoa> dsHH) {
        this.dsHH = dsHH;
    }
}
