/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapVeString.Bai1;

/**
 *
 * @author quoccuong
 */
public class HamMain {
    public static void add(int n){
        n++;
        System.out.println(n);
    }
    public static void main(String[] args) {
       String chuoi="dang23 cuon43g le2";
       MyString mstring=new MyString("dang23 cuon43g le2");
       
        System.out.println(mstring.tongma(mstring.getChuoi()));
        System.out.println(mstring.tongso(mstring.getChuoi()));
        System.out.println(mstring.SapXepMaTang(mstring.getChuoi()));
        System.out.println(mstring.TimKyTuHoa(mstring.getChuoi()));
        if(mstring.isDoiXung(mstring.getChuoi())){
            System.out.println("Là chuỗi đối xứng");
        }else{
            System.out.println("Không là chuỗi đối xứng");
        }
        System.out.println(mstring.vietHoa(mstring.getChuoi()));
        System.out.println(mstring.daoNguocChuTungTu(mstring.getChuoi()));
        System.out.println(mstring.tongsotrongchuoi(mstring.getChuoi()));
        //System.out.println(mstring.tongsotrongchuoi2(mstring.getChuoi()));
        
    }
}
