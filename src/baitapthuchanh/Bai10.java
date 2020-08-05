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
public class Bai10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Nhập x: ");
        int x=scan.nextInt();
        System.out.print("Nhập n: ");
        int n=scan.nextInt();
        System.out.println("T("+x+","+n+")="+pow(x,n));
        
    }
    public static int T(int x, int n){
      
       return (int) pow(x,n);
    } 
    
}
