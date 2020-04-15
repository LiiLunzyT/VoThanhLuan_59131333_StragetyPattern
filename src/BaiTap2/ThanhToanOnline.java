/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author ASUS
 */
public class ThanhToanOnline implements IThanhToan {

    @Override
    public double thanhToan(int tienHang) {
        return tienHang * ( tienHang < 1000000 ? 0.95 : 0.93 );
    }
    
}
