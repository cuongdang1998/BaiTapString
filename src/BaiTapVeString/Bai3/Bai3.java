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
public class Bai3 {
    String chuoi;
    Bai3(){
        
    }
    Bai3(String chuoi){
        this.chuoi=chuoi;
    }
    public String ChuanHoa(String s){
       
       chuoi=chuoi.replaceAll("\\-\\+", "\\-").replaceAll("\\+\\-", "\\-");
       chuoi=chuoi.replaceAll("\\-\\-", "\\-\\0\\-").replaceAll("\\+\\+", "\\+\\0\\+");
       return chuoi;
    }
   
    public int LaySoDau(String s){
        return 0;
    }
    public int Tinh(String s){
       
       String [] so=s.split("[+-]");
       String [] toantu=s.split("[0-9]+");
       int tinh=Integer.parseInt(so[0]);
       for(int i=1;i<toantu.length;i++){
           if(toantu[i].equals("+")){
               tinh+=Integer.parseInt(so[i]);
           }else{
               tinh-=Integer.parseInt(so[i]);
           }
       }
       return tinh;
    }
   

}
