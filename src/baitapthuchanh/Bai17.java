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
public class Bai17 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n=scan.nextInt();
        int tong=0; int tich=1;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                tong+=i;
                tich*=i;
            }
        }
        System.out.println("Tổng: "+tong);
        System.out.println("Tích: "+ tich);
        
    }
}
