/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapthuchanh;

import static baitapthuchanh.Bai22.BSCNN;
import java.util.Scanner;

/**
 *
 * @author quoccuong
 */
public class Bai23 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a=scan.nextInt();
        System.out.print("Nhập b: ");
        int b=scan.nextInt();
        if(a==0&& b==0){
            System.out.println("Phương trình có vô số nghiệm");
        }else if(a==0 && b!=0){
            System.out.println("Phương trình vô nghiệm");
        }else{
            System.out.println("Phương trình có nghiệm là:"+ -b/a);
        }
    }
}
