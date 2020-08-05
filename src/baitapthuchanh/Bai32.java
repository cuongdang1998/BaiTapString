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
public class Bai32 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Nhập d: ");
        int d=scan.nextInt();
        System.out.println("Nhập r: ");
        int r=scan.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=d;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
