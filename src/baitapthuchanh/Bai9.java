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
public class Bai9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       
        System.out.print("Nhập n: ");
        int n=scan.nextInt();
        if(n>6){
            System.out.println("S("+n+")="+S(n));
        }else{
            System.out.println("Bạn phải nhập n>6");
        }
    }
    public static int S(int n){
       int t=1;
       for(int i=1;i<=n;i++){
           t*=i;
       }
       return t;
    } 
    public static int Sdequy(int n){
        if(n<=0){
            return 1;
        }else{
            return n*Sdequy(n-1);
        }
    }
}
