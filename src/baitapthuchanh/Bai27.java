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
public class Bai27 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n=scan.nextInt();
        if(n>0){
            for(int i=1;i<n;i++){
                if(i%2!=0){
                    if(i==7||i==21||i==41){
                        continue;
                    }
                    System.out.println(i);
                }
            }
        }
       
    }
}
