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
public class Bai1 {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Nhập n");
        int n = scan.nextInt();
        if(n>3 && n<50){
            System.out.println("S(n)= "+ SDeQuy(n));
        }else{
            System.out.println("Bạn phải nhập n> 3 và n <50");
        }
        
    }
    public static int SDeQuy(int n){
        if(n<=0){
            return 0;
        }else{
            return n+ SDeQuy(n-1);
        }
    }
    public static int S(int n){
        int tong=0;
        for(int i=1;i<=n;i++){
            tong+=i;
        }
        return tong;
    }
}
