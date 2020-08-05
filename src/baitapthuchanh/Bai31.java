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
public class Bai31 {
   public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==1||j==1||i==n||j==i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
            
        }
        System.out.println("");
    } 
}
