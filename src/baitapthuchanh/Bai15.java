/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapthuchanh;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author quoccuong
 */
public class Bai15 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n=scan.nextInt();
        System.out.println("S("+n+")="+S(n));
        
    }
    public static int S(int n){
      
       int t=1;
       for(int i=n;i>0;i--){
          t*=i;
       }
       return t;
    }
    public static int Sdequy(int n){
        if(n<0) return -1;
        if(n==0){
            return 1;
        }else{
            return n*Sdequy(n-1);
        }
    }
}
