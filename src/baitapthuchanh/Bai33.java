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
public class Bai33 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Nhập d: ");
        int d=scan.nextInt();
        System.out.println("Nhập r: ");
        int r=scan.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=d;j++){
                if(i==1||j==1||i==r||j==d){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
