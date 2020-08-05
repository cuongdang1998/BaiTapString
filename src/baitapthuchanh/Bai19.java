/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapthuchanh;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author quoccuong
 */
public class Bai19 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n=scan.nextInt();
        
        
        if(!songuyento(n)){
            System.out.println("Số "+n+ " không là số nguyên tố");
        }else{
            System.out.println("Số "+n+ " là số nguyên tố");
        }
    }  
    public static boolean songuyento(int n){
        if(n<2) return false;
        int check =(int) sqrt(n);
        System.out.println(check);
        for(int i=2;i<=check;i++){
            if(n%i==0){
                return false;
            }
        }
       return true;
    }
}
