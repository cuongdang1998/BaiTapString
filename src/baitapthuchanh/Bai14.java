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
public class Bai14 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Nhập x: ");
        int x=scan.nextInt();
        System.out.print("Nhập n: ");
        int n=scan.nextInt();
        System.out.println("T("+x+","+n+")="+T(x,n));
        
    }
    public static int T(int x, int n){
      
       int t=0;
       for(int i=1;i<=n;i++){
          t+=pow(x,2*i+1);
       }
       return t;
    } 
}
