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
public class Bai2 {
    //public void replace
    public boolean CheckNgoacHL(String s){
        while(s.contains("()")){
            s=s.replace("()", "");
            System.out.println(s);
        }
        if(s.isEmpty()) return true;
        return false;
    }
}
