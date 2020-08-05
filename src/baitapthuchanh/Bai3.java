/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapthuchanh;

import static java.lang.Math.pow;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author quoccuong
 */
public class Bai3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       
        System.out.print("Nhập n: ");
        int n=scan.nextInt();
        if(n>=7){
            System.out.println("S("+n+")="+Sdequy(n));
        }else{
            System.out.println("Bạn phải nhập n>=7");
        }
    }
    public static double S(int n){
       double t=0d;
       for(int i=1;i<=n;i++){
           t+= (double)1/i*1.0;
       }
       return  t;
    }
    public static double Sdequy(int n){
        if(n<=0){
            return 0;
        }else{
            return (double)1/n*1.0+Sdequy(n-1);
        }
    }
    
}
