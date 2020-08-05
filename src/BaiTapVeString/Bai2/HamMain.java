/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapVeString.Bai2;

/**
 *
 * @author quoccuong
 */
public class HamMain {
    public static void main(String[] args) {
        String s="()(()(()))";
        Bai2 b2=new Bai2();
        if(b2.CheckNgoacHL(s)){
            System.out.println("Ngoac hop le");
        }else{
            System.out.println("Ngoac khong hop le");
        }
        
    }
}
