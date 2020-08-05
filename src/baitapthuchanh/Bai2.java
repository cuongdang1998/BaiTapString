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
public class Bai2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n=scan.nextInt();
        if(n>=5 && n<=20){
            System.out.println("S("+n+")="+S(n));
        }else{
            System.out.println("Bạn phải nhập n>=5 và n<=20");
        }
    }
    public static int S(int n){
       int t=0;
       for(int i=1;i<=n;i++){
           t+=pow(i,2);
       }
       return t;
    }
    public static int Sdequy(int n){
        if(n<=0){
            return 0;
        }else{
            return (int) (pow(n,2)+pow(Sdequy(n-1),2));
        }
    }
    
}
