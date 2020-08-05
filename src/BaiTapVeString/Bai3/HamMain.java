/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapVeString.Bai3;

/**
 *
 * @author quoccuong
 */
public class HamMain {
    public static void main(String[] args) {
        Bai3 b3=new Bai3();
        b3.chuoi="23++3--34+-4-+3";
        System.out.println(b3.ChuanHoa(b3.chuoi));
        String chuanhoa=b3.ChuanHoa(b3.chuoi);
        System.out.println(b3.Tinh(chuanhoa));
        
        
    }
}
