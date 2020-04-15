/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author ASUS
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Context ct1 = new Context(new Cong());
        System.out.println("75 + 12 = " + ct1.tinh(75, 12));
        
        Context ct2 = new Context(new Tru());
        System.out.println("54 - 78 = " + ct2.tinh(54, 78));
    }
}
