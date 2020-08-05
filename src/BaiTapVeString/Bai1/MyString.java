/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapVeString.Bai1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author quoccuong
 */
public class MyString {
    private String chuoi;
//    int n;
//    public void add(int n){
//        n++;
//        System.out.println(n);
//    }
    MyString(){
        
    }
    MyString(String chuoi){
        this.chuoi=chuoi;
    }
    public int tongma(String chuoi){
        char[] mangkt= chuoi.toCharArray();
        int tong=0;
        for(char kytu:mangkt){
            tong+=(int) kytu;
        }
        return tong;
    }
    public int tongso(String chuoi){
        int tong=0;
        char[] mangkt= chuoi.toCharArray();
        for(char kytu:mangkt){
            int tinh=(int) kytu;
            if(tinh>=49&&tinh<=57){
                tong+=tinh-48;
            }
        }
        return tong;
    }
    public String SapXepMaTang(String chuoi){
        char[] mangkt= chuoi.toCharArray();
        int [] l=new int[chuoi.length()];
        for(int i=0;i<mangkt.length;i++){
            int tinh=(int) mangkt[i];
            l[i]=tinh;
        }
        Arrays.sort(l);
        String kq="";
        for(int i=0;i<l.length;i++){
            kq+=(char) l[i];
        }
        return kq;
    }
    public String TimKyTuHoa(String chuoi){
        char[] mangkt= chuoi.toCharArray();
        String kq="";
        for(char kytu:mangkt){
            int tinh=(int) kytu;
            if(tinh>=65&&tinh<=90){
                kq+=(char) tinh;
            }
        }
        return kq;
    }
    public boolean isDoiXung(String chuoi){
        char[] mangkt= chuoi.toCharArray();
        int dodai=(int) mangkt.length/2;
        for(int i=0;i<dodai;i++){
            System.out.println(chuoi.charAt(i)+ " - "+chuoi.charAt(mangkt.length-1-i));
            if(chuoi.charAt(i)!=chuoi.charAt(mangkt.length-1-i)){
                return false;
            }
        }
        return true;
    }
    //
    public boolean isDoiXung2(String chuoi){
        return new StringBuilder(chuoi).reverse().equals(chuoi);
        
    }
    public String vietHoa(String chuoi){
        String [] mangchuoi=chuoi.split("[ ]+");
        String kq="";
        for(String s:mangchuoi){
            kq+= s.substring(0, 1).toUpperCase()+s.substring(1)+" ";
        }
        return kq;
    }
    public String removeSpace(String s){
        while(s.contains("  ")){
            s=s.replace("  ", " ");
           
        }
        return s.trim();
    }
//    public String vietHoa2(String chuoi){
//        
//        return kq;
//    }
    public String daoNguocChuTungTu(String chuoi){
        String kq="";
        String [] mangchuoi=chuoi.split("[ ]+");
        for(String s:mangchuoi){
            for(int i=s.length()-1;i>=0;i--){
                kq+=s.charAt(i);
            }
            kq+=" ";
        }
        return kq;
    }
    public String xoaDauUnicode(String chuoi){
        String kq="";
        
        return kq;
    }
    public int tongsotrongchuoi(String chuoi){
        
        String temp = "0";  
        int sum = 0;  
        for(int i = 0; i < chuoi.length(); i++)  
        {  
            char ch = chuoi.charAt(i); 
            if (Character.isDigit(ch))  
                temp += ch;  
            else
            {  
                sum += Integer.parseInt(temp);  
                temp = "0";  
            }  
        }   
        return sum + Integer.parseInt(temp); 
    }
    public int tongsotrongchuoi2(String s){
        int tong=0;
        String tem="";
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            if(Character.isDigit(c1)){
                tem+=c1;
               for(int j=i+1;j<s.length();j++){
                   char c2=s.charAt(i);
                   if(Character.isDigit(c2)){
                       tem+=c2;
                   }else{
                       i=j;
                       break;
                   }
               }
               tong+=Integer.parseInt(tem);
            }
              
        }
        return tong;
    }

// Getter setter
    public String getChuoi() {
        return chuoi;
    }


    public void setChuoi(String chuoi) {
        this.chuoi = chuoi;
    }
}
