/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapthuchanh;

import java.util.Scanner;

/**
 *
 * @author quoccuong
 */
public class Bai22 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n=scan.nextInt();
        System.out.print("Nhập m: ");
        int m=scan.nextInt();
         System.out.println("BSCNN là:"+BSCNN(n,m));
        
    }
    public static int UCLNDeQuy(int n, int m){
      if(m==0) return n;
      return UCLNDeQuy(m,n%m);
    } 
    public static int UCLN(int n, int m){
        int t1=n;
        int t2=m;
        while(t1!=t2){
            if(t1>t2){
                t1=t1-t2;
            }else{
                t2=t2-t1;
            }
        }
        return t1;
    }
    public static int BSCNN(int n, int m){
        return n*m/UCLNDeQuy(n,m);
    }
}
