/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

/**
 *
 * @author quoccuong
 */
public class Bai4 {
    public String themvaodau(String s,String canthem){
        return ""+canthem+s;
    }
    public String chuanHoa(String a, int maxlength){
        if(a.length()==maxlength){
            return a;
        }else{
            int l=maxlength-a.length();
            for(int i=0;i<l;i++){
                a="0"+a;
            }
            return a;
        }
    }
    public void tinhTong(String a, String b){
        int maxlength;
        if(a.length()>=b.length()){
            maxlength=a.length();
        }else{
            maxlength=b.length();
        }
        a=chuanHoa(a,maxlength);
        b=chuanHoa(b,maxlength);
        
        
        //System.out.println(a+" "+ b);
        String kq="";
        int nho=0;
        int tinh=0;
        
        for(int i=maxlength-1;i>=0;i--){
            
            tinh=(int)(a.charAt(i)-48)+(int)(b.charAt(i)-48)+nho;
            System.out.println((a.charAt(i)-48)+" "+(b.charAt(i)-48));
            System.out.println(tinh);
            if(tinh<10){
                nho=0;
                kq=themvaodau(kq,tinh+"");
            }else{
                nho=1;
                kq=themvaodau(kq,(tinh-10)+"");
            }
        }
        System.out.println(kq);
    }
    public boolean isLarger(String a, String b){
        if(a.length()>b.length()){
            return true;
        }else if(a.length()<b.length()) {
            return false;
        }else{
            if(a.compareTo(b)>0){
                 return true;
            }else if(a.compareTo(b)<0){
                return false;
            }else{
                return true;
            }
        }
    }
    public void tinhHieu2(String a, String b){
        if(isLarger(a,b)){
            
            System.out.println(tinh(a,b)); 
        }else {
            //System.out.println(a+"<"+b);
            System.out.println("-"+tinh(b,a));
        }
    }
    public String tinh(String a, String b){
        int maxlength=Integer.max(a.length(),b.length());
        
        a=chuanHoa(a,maxlength);
        b=chuanHoa(b,maxlength);

        System.out.println(a);
        System.out.println(b);
            //System.out.println(a+" "+ b);
        String kq="";
        int nho=0;
        int tinh=0;
        for(int i=maxlength-1;i>=0;i--){
            tinh=(int)(a.charAt(i)-48)-((int)(b.charAt(i)-48)+nho);
            System.out.println((a.charAt(i)-48)+" - "+(b.charAt(i)-48));
            System.out.println(tinh);
            if(tinh<0){
                nho=1;
                kq=themvaodau(kq,tinh+10+"");
            }else{
                nho=0;
                kq=themvaodau(kq,tinh+"");
            }
        }
        while(kq.charAt(0)=='0'){
            kq=kq.replaceAll("[0]", "");
        }
        return kq;
    }
    
}
